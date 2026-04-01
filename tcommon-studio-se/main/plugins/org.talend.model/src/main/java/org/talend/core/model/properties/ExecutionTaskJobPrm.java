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
 * A representation of the model object '<em><b>Execution Task Job Prm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#isOverride <em>Override</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getExecutionTask <em>Execution Task</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm()
 * @model
 * @generated
 */
public interface ExecutionTaskJobPrm extends EObject {
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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

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
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_Override()
     * @model
     * @generated
     */
    boolean isOverride();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#isOverride <em>Override</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Override</em>' attribute.
     * @see #isOverride()
     * @generated
     */
    void setOverride(boolean value);

    /**
     * Returns the value of the '<em><b>Execution Task</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.ExecutionTask#getJobPrms <em>Job Prms</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Task</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Task</em>' container reference.
     * @see #setExecutionTask(ExecutionTask)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_ExecutionTask()
     * @see org.talend.core.model.properties.ExecutionTask#getJobPrms
     * @model opposite="jobPrms" transient="false"
     * @generated
     */
    ExecutionTask getExecutionTask();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getExecutionTask <em>Execution Task</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Task</em>' container reference.
     * @see #getExecutionTask()
     * @generated
     */
    void setExecutionTask(ExecutionTask value);

    /**
     * Returns the value of the '<em><b>Original Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Value</em>' attribute.
     * @see #setOriginalValue(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_OriginalValue()
     * @model
     * @generated
     */
    String getOriginalValue();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getOriginalValue <em>Original Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Value</em>' attribute.
     * @see #getOriginalValue()
     * @generated
     */
    void setOriginalValue(String value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Item Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item Type</em>' attribute.
     * @see #setItemType(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getExecutionTaskJobPrm_ItemType()
     * @model
     * @generated
     */
    String getItemType();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ExecutionTaskJobPrm#getItemType <em>Item Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Type</em>' attribute.
     * @see #getItemType()
     * @generated
     */
    void setItemType(String value);

} // ExecutionTaskJobPrm
