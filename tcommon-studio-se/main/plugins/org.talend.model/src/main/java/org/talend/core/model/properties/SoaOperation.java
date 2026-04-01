/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Soa Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getJobVersion <em>Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getLastScriptGenerationDate <em>Last Script Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#isApplyContextToChildren <em>Apply Context To Children</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getJvmParameters <em>Jvm Parameters</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getXms <em>Xms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getXmx <em>Xmx</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getMinJobInstances <em>Min Job Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getMaxJobInstances <em>Max Job Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getIdleTTL_forAllInstances <em>Idle TTL for All Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getIdleTTL_forAdditionalInstances <em>Idle TTL for Additional Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getQueueMaxSize <em>Queue Max Size</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getRequestInQueueTTL <em>Request In Queue TTL</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getService <em>Service</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getReturnStyle <em>Return Style</em>}</li>
 *   <li>{@link org.talend.core.model.properties.SoaOperation#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation()
 * @model
 * @generated
 */
public interface SoaOperation extends EObject {

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Id()
     * @model id="true" required="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getId <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' reference.
     * @see #setProject(Project)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Project()
     * @model
     * @generated
     */
    Project getProject();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getProject <em>Project</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' reference.
     * @see #getProject()
     * @generated
     */
    void setProject(Project value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' attribute.
     * @see #setContext(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Context()
     * @model
     * @generated
     */
    String getContext();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getContext <em>Context</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' attribute.
     * @see #getContext()
     * @generated
     */
    void setContext(String value);

    /**
     * Returns the value of the '<em><b>Job Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Version</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Version</em>' attribute.
     * @see #setJobVersion(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_JobVersion()
     * @model
     * @generated
     */
    String getJobVersion();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getJobVersion <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Version</em>' attribute.
     * @see #getJobVersion()
     * @generated
     */
    void setJobVersion(String value);

    /**
     * Returns the value of the '<em><b>Job Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Name</em>' attribute.
     * @see #setJobName(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_JobName()
     * @model
     * @generated
     */
    String getJobName();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getJobName <em>Job Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Name</em>' attribute.
     * @see #getJobName()
     * @generated
     */
    void setJobName(String value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Active()
     * @model
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

    /**
     * Returns the value of the '<em><b>Last Script Generation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Script Generation Date</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Script Generation Date</em>' attribute.
     * @see #setLastScriptGenerationDate(Date)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_LastScriptGenerationDate()
     * @model
     * @generated
     */
    Date getLastScriptGenerationDate();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getLastScriptGenerationDate <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Script Generation Date</em>' attribute.
     * @see #getLastScriptGenerationDate()
     * @generated
     */
    void setLastScriptGenerationDate(Date value);

    /**
     * Returns the value of the '<em><b>Job Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job Id</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job Id</em>' attribute.
     * @see #setJobId(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_JobId()
     * @model
     * @generated
     */
    String getJobId();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getJobId <em>Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Job Id</em>' attribute.
     * @see #getJobId()
     * @generated
     */
    void setJobId(String value);

    /**
     * Returns the value of the '<em><b>Apply Context To Children</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Apply Context To Children</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Apply Context To Children</em>' attribute.
     * @see #setApplyContextToChildren(boolean)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_ApplyContextToChildren()
     * @model
     * @generated
     */
    boolean isApplyContextToChildren();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#isApplyContextToChildren <em>Apply Context To Children</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Apply Context To Children</em>' attribute.
     * @see #isApplyContextToChildren()
     * @generated
     */
    void setApplyContextToChildren(boolean value);

    /**
     * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.core.model.properties.SoaInputParameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Parameters</em>' containment reference list isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Parameters</em>' containment reference list.
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_InputParameters()
     * @model type="org.talend.core.model.properties.SoaInputParameter" containment="true" ordered="false"
     * @generated
     */
    EList getInputParameters();

    /**
     * Returns the value of the '<em><b>Jvm Parameters</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Jvm Parameters</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Jvm Parameters</em>' attribute.
     * @see #setJvmParameters(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_JvmParameters()
     * @model
     * @generated
     */
    String getJvmParameters();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getJvmParameters <em>Jvm Parameters</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Jvm Parameters</em>' attribute.
     * @see #getJvmParameters()
     * @generated
     */
    void setJvmParameters(String value);

    /**
     * Returns the value of the '<em><b>Xms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xms</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xms</em>' attribute.
     * @see #setXms(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Xms()
     * @model
     * @generated
     */
    int getXms();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getXms <em>Xms</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Xms</em>' attribute.
     * @see #getXms()
     * @generated
     */
    void setXms(int value);

    /**
     * Returns the value of the '<em><b>Xmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xmx</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xmx</em>' attribute.
     * @see #setXmx(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Xmx()
     * @model
     * @generated
     */
    int getXmx();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getXmx <em>Xmx</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Xmx</em>' attribute.
     * @see #getXmx()
     * @generated
     */
    void setXmx(int value);

    /**
     * Returns the value of the '<em><b>Min Job Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Job Instances</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Job Instances</em>' attribute.
     * @see #setMinJobInstances(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_MinJobInstances()
     * @model
     * @generated
     */
    int getMinJobInstances();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getMinJobInstances <em>Min Job Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Job Instances</em>' attribute.
     * @see #getMinJobInstances()
     * @generated
     */
    void setMinJobInstances(int value);

    /**
     * Returns the value of the '<em><b>Max Job Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Job Instances</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Job Instances</em>' attribute.
     * @see #setMaxJobInstances(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_MaxJobInstances()
     * @model
     * @generated
     */
    int getMaxJobInstances();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getMaxJobInstances <em>Max Job Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Job Instances</em>' attribute.
     * @see #getMaxJobInstances()
     * @generated
     */
    void setMaxJobInstances(int value);

    /**
     * Returns the value of the '<em><b>Idle TTL for All Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idle TTL for All Instances</em>' attribute isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idle TTL for All Instances</em>' attribute.
     * @see #setIdleTTL_forAllInstances(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_IdleTTL_forAllInstances()
     * @model
     * @generated
     */
    int getIdleTTL_forAllInstances();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getIdleTTL_forAllInstances <em>Idle TTL for All Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Idle TTL for All Instances</em>' attribute.
     * @see #getIdleTTL_forAllInstances()
     * @generated
     */
    void setIdleTTL_forAllInstances(int value);

    /**
     * Returns the value of the '<em><b>Idle TTL for Additional Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idle TTL for Additional Instances</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idle TTL for Additional Instances</em>' attribute.
     * @see #setIdleTTL_forAdditionalInstances(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_IdleTTL_forAdditionalInstances()
     * @model
     * @generated
     */
    int getIdleTTL_forAdditionalInstances();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getIdleTTL_forAdditionalInstances <em>Idle TTL for Additional Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Idle TTL for Additional Instances</em>' attribute.
     * @see #getIdleTTL_forAdditionalInstances()
     * @generated
     */
    void setIdleTTL_forAdditionalInstances(int value);

    /**
     * Returns the value of the '<em><b>Queue Max Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Queue Max Size</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Queue Max Size</em>' attribute.
     * @see #setQueueMaxSize(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_QueueMaxSize()
     * @model
     * @generated
     */
    int getQueueMaxSize();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getQueueMaxSize <em>Queue Max Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Queue Max Size</em>' attribute.
     * @see #getQueueMaxSize()
     * @generated
     */
    void setQueueMaxSize(int value);

    /**
     * Returns the value of the '<em><b>Request In Queue TTL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request In Queue TTL</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request In Queue TTL</em>' attribute.
     * @see #setRequestInQueueTTL(int)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_RequestInQueueTTL()
     * @model
     * @generated
     */
    int getRequestInQueueTTL();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getRequestInQueueTTL <em>Request In Queue TTL</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Request In Queue TTL</em>' attribute.
     * @see #getRequestInQueueTTL()
     * @generated
     */
    void setRequestInQueueTTL(int value);

    /**
     * Returns the value of the '<em><b>Service</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.SoaService#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service</em>' container reference.
     * @see #setService(SoaService)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Service()
     * @see org.talend.core.model.properties.SoaService#getOperations
     * @model opposite="operations" transient="false"
     * @generated
     */
    SoaService getService();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getService <em>Service</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Service</em>' container reference.
     * @see #getService()
     * @generated
     */
    void setService(SoaService value);

    /**
     * Returns the value of the '<em><b>Return Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Return Style</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Style</em>' attribute.
     * @see #setReturnStyle(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_ReturnStyle()
     * @model
     * @generated
     */
    String getReturnStyle();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getReturnStyle <em>Return Style</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Style</em>' attribute.
     * @see #getReturnStyle()
     * @generated
     */
    void setReturnStyle(String value);

    /**
     * Returns the value of the '<em><b>Branch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch</em>' attribute.
     * @see #setBranch(String)
     * @see org.talend.core.model.properties.PropertiesPackage#getSoaOperation_Branch()
     * @model
     * @generated
     */
    String getBranch();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SoaOperation#getBranch <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Branch</em>' attribute.
     * @see #getBranch()
     * @generated
     */
    void setBranch(String value);

} // SoaOperation
