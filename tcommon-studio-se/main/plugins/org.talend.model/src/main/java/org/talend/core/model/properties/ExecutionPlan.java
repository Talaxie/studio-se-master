/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlan#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlan#getExecPlanParts <em>Exec Plan Parts</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlan#getExecPlanPrms <em>Exec Plan Prms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlan#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlan()
 * @model
 * @generated
 */
public interface ExecutionPlan extends ExecutionTriggerable {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlan_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlan#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Exec Plan Parts</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ExecutionPlanPart}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exec Plan Parts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exec Plan Parts</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlan_ExecPlanParts()
     * @model type="org.talend.core.model.properties.ExecutionPlanPart" containment="true" ordered="false"
     * @generated
     */
    EList getExecPlanParts();

    /**
     * Returns the value of the '<em><b>Exec Plan Prms</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.ExecutionPlanPrm}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exec Plan Prms</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exec Plan Prms</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlan_ExecPlanPrms()
     * @model type="org.talend.core.model.properties.ExecutionPlanPrm" containment="true" ordered="false"
     * @generated
     */
    EList getExecPlanPrms();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlan_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlan#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // ExecutionPlan
