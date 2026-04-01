/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Plan Part Job Prm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getExecutionPlanPart <em>Execution Plan Part</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#isOverride <em>Override</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getCustomValue <em>Custom Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getPartCustomValue <em>Part Custom Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm()
 * @model
 * @generated
 */
public interface ExecutionPlanPartJobPrm extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Execution Plan Part</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Plan Part</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Plan Part</em>' reference.
     * @see #setExecutionPlanPart(ExecutionPlanPart)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm_ExecutionPlanPart()
     * @model
     * @generated
     */
    ExecutionPlanPart getExecutionPlanPart();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getExecutionPlanPart <em>Execution Plan Part</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Plan Part</em>' reference.
     * @see #getExecutionPlanPart()
     * @generated
     */
    void setExecutionPlanPart(ExecutionPlanPart value);

    /**
     * Returns the value of the '<em><b>Override</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Override</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Override</em>' attribute.
     * @see #setOverride(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm_Override()
     * @model
     * @generated
     */
    boolean isOverride();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#isOverride <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Override</em>' attribute.
     * @see #isOverride()
     * @generated
     */
    void setOverride(boolean value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Custom Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Value</em>' attribute.
     * @see #setCustomValue(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm_CustomValue()
     * @model
     * @generated
     */
    String getCustomValue();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getCustomValue <em>Custom Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Value</em>' attribute.
     * @see #getCustomValue()
     * @generated
     */
    void setCustomValue(String value);

    /**
     * Returns the value of the '<em><b>Part Custom Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Part Custom Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Part Custom Value</em>' attribute.
     * @see #setPartCustomValue(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionPlanPartJobPrm_PartCustomValue()
     * @model
     * @generated
     */
    String getPartCustomValue();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionPlanPartJobPrm#getPartCustomValue <em>Part Custom Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Part Custom Value</em>' attribute.
     * @see #getPartCustomValue()
     * @generated
     */
    void setPartCustomValue(String value);

} // ExecutionPlanPartJobPrm
