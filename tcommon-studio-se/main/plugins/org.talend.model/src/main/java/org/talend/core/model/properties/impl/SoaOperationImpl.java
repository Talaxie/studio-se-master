/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SoaInputParameter;
import org.talend.core.model.properties.SoaOperation;
import org.talend.core.model.properties.SoaService;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soa Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getJobVersion <em>Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getLastScriptGenerationDate <em>Last Script Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#isApplyContextToChildren <em>Apply Context To Children</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getJvmParameters <em>Jvm Parameters</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getXms <em>Xms</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getXmx <em>Xmx</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getMinJobInstances <em>Min Job Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getMaxJobInstances <em>Max Job Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getIdleTTL_forAllInstances <em>Idle TTL for All Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getIdleTTL_forAdditionalInstances <em>Idle TTL for Additional Instances</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getQueueMaxSize <em>Queue Max Size</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getRequestInQueueTTL <em>Request In Queue TTL</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getReturnStyle <em>Return Style</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.SoaOperationImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoaOperationImpl extends EObjectImpl implements SoaOperation {

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProject()
     * @generated
     * @ordered
     */
    protected Project project;

    /**
     * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected String context = CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getJobVersion() <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobVersion()
     * @generated
     * @ordered
     */
    protected static final String JOB_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobVersion() <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobVersion()
     * @generated
     * @ordered
     */
    protected String jobVersion = JOB_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobName()
     * @generated
     * @ordered
     */
    protected static final String JOB_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobName()
     * @generated
     * @ordered
     */
    protected String jobName = JOB_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getLastScriptGenerationDate() <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLastScriptGenerationDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_SCRIPT_GENERATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastScriptGenerationDate() <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLastScriptGenerationDate()
     * @generated
     * @ordered
     */
    protected Date lastScriptGenerationDate = LAST_SCRIPT_GENERATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobId()
     * @generated
     * @ordered
     */
    protected static final String JOB_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobId() <em>Job Id</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getJobId()
     * @generated
     * @ordered
     */
    protected String jobId = JOB_ID_EDEFAULT;

    /**
     * The default value of the '{@link #isApplyContextToChildren() <em>Apply Context To Children</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isApplyContextToChildren()
     * @generated
     * @ordered
     */
    protected static final boolean APPLY_CONTEXT_TO_CHILDREN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isApplyContextToChildren() <em>Apply Context To Children</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isApplyContextToChildren()
     * @generated
     * @ordered
     */
    protected boolean applyContextToChildren = APPLY_CONTEXT_TO_CHILDREN_EDEFAULT;

    /**
     * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInputParameters()
     * @generated
     * @ordered
     */
    protected EList inputParameters;

    /**
     * The default value of the '{@link #getJvmParameters() <em>Jvm Parameters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJvmParameters()
     * @generated
     * @ordered
     */
    protected static final String JVM_PARAMETERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJvmParameters() <em>Jvm Parameters</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJvmParameters()
     * @generated
     * @ordered
     */
    protected String jvmParameters = JVM_PARAMETERS_EDEFAULT;

    /**
     * The default value of the '{@link #getXms() <em>Xms</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getXms()
     * @generated
     * @ordered
     */
    protected static final int XMS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getXms() <em>Xms</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getXms()
     * @generated
     * @ordered
     */
    protected int xms = XMS_EDEFAULT;

    /**
     * The default value of the '{@link #getXmx() <em>Xmx</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getXmx()
     * @generated
     * @ordered
     */
    protected static final int XMX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getXmx() <em>Xmx</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getXmx()
     * @generated
     * @ordered
     */
    protected int xmx = XMX_EDEFAULT;

    /**
     * The default value of the '{@link #getMinJobInstances() <em>Min Job Instances</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMinJobInstances()
     * @generated
     * @ordered
     */
    protected static final int MIN_JOB_INSTANCES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMinJobInstances() <em>Min Job Instances</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getMinJobInstances()
     * @generated
     * @ordered
     */
    protected int minJobInstances = MIN_JOB_INSTANCES_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxJobInstances() <em>Max Job Instances</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMaxJobInstances()
     * @generated
     * @ordered
     */
    protected static final int MAX_JOB_INSTANCES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxJobInstances() <em>Max Job Instances</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getMaxJobInstances()
     * @generated
     * @ordered
     */
    protected int maxJobInstances = MAX_JOB_INSTANCES_EDEFAULT;

    /**
     * The default value of the '{@link #getIdleTTL_forAllInstances() <em>Idle TTL for All Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIdleTTL_forAllInstances()
     * @generated
     * @ordered
     */
    protected static final int IDLE_TTL_FOR_ALL_INSTANCES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIdleTTL_forAllInstances() <em>Idle TTL for All Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIdleTTL_forAllInstances()
     * @generated
     * @ordered
     */
    protected int idleTTL_forAllInstances = IDLE_TTL_FOR_ALL_INSTANCES_EDEFAULT;

    /**
     * The default value of the '{@link #getIdleTTL_forAdditionalInstances() <em>Idle TTL for Additional Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIdleTTL_forAdditionalInstances()
     * @generated
     * @ordered
     */
    protected static final int IDLE_TTL_FOR_ADDITIONAL_INSTANCES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIdleTTL_forAdditionalInstances() <em>Idle TTL for Additional Instances</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIdleTTL_forAdditionalInstances()
     * @generated
     * @ordered
     */
    protected int idleTTL_forAdditionalInstances = IDLE_TTL_FOR_ADDITIONAL_INSTANCES_EDEFAULT;

    /**
     * The default value of the '{@link #getQueueMaxSize() <em>Queue Max Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQueueMaxSize()
     * @generated
     * @ordered
     */
    protected static final int QUEUE_MAX_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getQueueMaxSize() <em>Queue Max Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQueueMaxSize()
     * @generated
     * @ordered
     */
    protected int queueMaxSize = QUEUE_MAX_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getRequestInQueueTTL() <em>Request In Queue TTL</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRequestInQueueTTL()
     * @generated
     * @ordered
     */
    protected static final int REQUEST_IN_QUEUE_TTL_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRequestInQueueTTL() <em>Request In Queue TTL</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRequestInQueueTTL()
     * @generated
     * @ordered
     */
    protected int requestInQueueTTL = REQUEST_IN_QUEUE_TTL_EDEFAULT;

    /**
     * The default value of the '{@link #getReturnStyle() <em>Return Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnStyle()
     * @generated
     * @ordered
     */
    protected static final String RETURN_STYLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReturnStyle() <em>Return Style</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReturnStyle()
     * @generated
     * @ordered
     */
    protected String returnStyle = RETURN_STYLE_EDEFAULT;

    /**
     * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranch()
     * @generated
     * @ordered
     */
    protected static final String BRANCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranch()
     * @generated
     * @ordered
     */
    protected String branch = BRANCH_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SoaOperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.SOA_OPERATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Project getProject() {
        if (project != null && project.eIsProxy()) {
            InternalEObject oldProject = (InternalEObject)project;
            project = (Project)eResolveProxy(oldProject);
            if (project != oldProject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.SOA_OPERATION__PROJECT, oldProject, project));
            }
        }
        return project;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Project basicGetProject() {
        return project;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProject(Project newProject) {
        Project oldProject = project;
        project = newProject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__PROJECT, oldProject, project));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setContext(String newContext) {
        String oldContext = context;
        context = newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobVersion() {
        return jobVersion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobVersion(String newJobVersion) {
        String oldJobVersion = jobVersion;
        jobVersion = newJobVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__JOB_VERSION, oldJobVersion, jobVersion));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobName(String newJobName) {
        String oldJobName = jobName;
        jobName = newJobName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__JOB_NAME, oldJobName, jobName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getLastScriptGenerationDate() {
        return lastScriptGenerationDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLastScriptGenerationDate(Date newLastScriptGenerationDate) {
        Date oldLastScriptGenerationDate = lastScriptGenerationDate;
        lastScriptGenerationDate = newLastScriptGenerationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE, oldLastScriptGenerationDate, lastScriptGenerationDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJobId(String newJobId) {
        String oldJobId = jobId;
        jobId = newJobId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__JOB_ID, oldJobId, jobId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isApplyContextToChildren() {
        return applyContextToChildren;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setApplyContextToChildren(boolean newApplyContextToChildren) {
        boolean oldApplyContextToChildren = applyContextToChildren;
        applyContextToChildren = newApplyContextToChildren;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN, oldApplyContextToChildren, applyContextToChildren));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new EObjectContainmentEList(SoaInputParameter.class, this, PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS);
        }
        return inputParameters;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJvmParameters() {
        return jvmParameters;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJvmParameters(String newJvmParameters) {
        String oldJvmParameters = jvmParameters;
        jvmParameters = newJvmParameters;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__JVM_PARAMETERS, oldJvmParameters, jvmParameters));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getXms() {
        return xms;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setXms(int newXms) {
        int oldXms = xms;
        xms = newXms;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__XMS, oldXms, xms));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getXmx() {
        return xmx;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setXmx(int newXmx) {
        int oldXmx = xmx;
        xmx = newXmx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__XMX, oldXmx, xmx));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getMinJobInstances() {
        return minJobInstances;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinJobInstances(int newMinJobInstances) {
        int oldMinJobInstances = minJobInstances;
        minJobInstances = newMinJobInstances;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__MIN_JOB_INSTANCES, oldMinJobInstances, minJobInstances));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getMaxJobInstances() {
        return maxJobInstances;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaxJobInstances(int newMaxJobInstances) {
        int oldMaxJobInstances = maxJobInstances;
        maxJobInstances = newMaxJobInstances;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__MAX_JOB_INSTANCES, oldMaxJobInstances, maxJobInstances));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getIdleTTL_forAllInstances() {
        return idleTTL_forAllInstances;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdleTTL_forAllInstances(int newIdleTTL_forAllInstances) {
        int oldIdleTTL_forAllInstances = idleTTL_forAllInstances;
        idleTTL_forAllInstances = newIdleTTL_forAllInstances;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES, oldIdleTTL_forAllInstances, idleTTL_forAllInstances));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getIdleTTL_forAdditionalInstances() {
        return idleTTL_forAdditionalInstances;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIdleTTL_forAdditionalInstances(int newIdleTTL_forAdditionalInstances) {
        int oldIdleTTL_forAdditionalInstances = idleTTL_forAdditionalInstances;
        idleTTL_forAdditionalInstances = newIdleTTL_forAdditionalInstances;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES, oldIdleTTL_forAdditionalInstances, idleTTL_forAdditionalInstances));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getQueueMaxSize() {
        return queueMaxSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setQueueMaxSize(int newQueueMaxSize) {
        int oldQueueMaxSize = queueMaxSize;
        queueMaxSize = newQueueMaxSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__QUEUE_MAX_SIZE, oldQueueMaxSize, queueMaxSize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getRequestInQueueTTL() {
        return requestInQueueTTL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRequestInQueueTTL(int newRequestInQueueTTL) {
        int oldRequestInQueueTTL = requestInQueueTTL;
        requestInQueueTTL = newRequestInQueueTTL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__REQUEST_IN_QUEUE_TTL, oldRequestInQueueTTL, requestInQueueTTL));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SoaService getService() {
        if (eContainerFeatureID() != PropertiesPackage.SOA_OPERATION__SERVICE) return null;
        return (SoaService)eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetService(SoaService newService, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newService, PropertiesPackage.SOA_OPERATION__SERVICE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setService(SoaService newService) {
        if (newService != eInternalContainer() || (eContainerFeatureID() != PropertiesPackage.SOA_OPERATION__SERVICE && newService != null)) {
            if (EcoreUtil.isAncestor(this, newService))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newService != null)
                msgs = ((InternalEObject)newService).eInverseAdd(this, PropertiesPackage.SOA_SERVICE__OPERATIONS, SoaService.class, msgs);
            msgs = basicSetService(newService, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__SERVICE, newService, newService));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getReturnStyle() {
        return returnStyle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReturnStyle(String newReturnStyle) {
        String oldReturnStyle = returnStyle;
        returnStyle = newReturnStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__RETURN_STYLE, oldReturnStyle, returnStyle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBranch() {
        return branch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBranch(String newBranch) {
        String oldBranch = branch;
        branch = newBranch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.SOA_OPERATION__BRANCH, oldBranch, branch));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetService((SoaService)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS:
                return ((InternalEList)getInputParameters()).basicRemove(otherEnd, msgs);
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                return basicSetService(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                return eInternalContainer().eInverseRemove(this, PropertiesPackage.SOA_SERVICE__OPERATIONS, SoaService.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.SOA_OPERATION__ID:
                return new Integer(getId());
            case PropertiesPackage.SOA_OPERATION__LABEL:
                return getLabel();
            case PropertiesPackage.SOA_OPERATION__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.SOA_OPERATION__PROJECT:
                if (resolve) return getProject();
                return basicGetProject();
            case PropertiesPackage.SOA_OPERATION__CONTEXT:
                return getContext();
            case PropertiesPackage.SOA_OPERATION__JOB_VERSION:
                return getJobVersion();
            case PropertiesPackage.SOA_OPERATION__JOB_NAME:
                return getJobName();
            case PropertiesPackage.SOA_OPERATION__ACTIVE:
                return isActive() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE:
                return getLastScriptGenerationDate();
            case PropertiesPackage.SOA_OPERATION__JOB_ID:
                return getJobId();
            case PropertiesPackage.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN:
                return isApplyContextToChildren() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS:
                return getInputParameters();
            case PropertiesPackage.SOA_OPERATION__JVM_PARAMETERS:
                return getJvmParameters();
            case PropertiesPackage.SOA_OPERATION__XMS:
                return new Integer(getXms());
            case PropertiesPackage.SOA_OPERATION__XMX:
                return new Integer(getXmx());
            case PropertiesPackage.SOA_OPERATION__MIN_JOB_INSTANCES:
                return new Integer(getMinJobInstances());
            case PropertiesPackage.SOA_OPERATION__MAX_JOB_INSTANCES:
                return new Integer(getMaxJobInstances());
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES:
                return new Integer(getIdleTTL_forAllInstances());
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES:
                return new Integer(getIdleTTL_forAdditionalInstances());
            case PropertiesPackage.SOA_OPERATION__QUEUE_MAX_SIZE:
                return new Integer(getQueueMaxSize());
            case PropertiesPackage.SOA_OPERATION__REQUEST_IN_QUEUE_TTL:
                return new Integer(getRequestInQueueTTL());
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                return getService();
            case PropertiesPackage.SOA_OPERATION__RETURN_STYLE:
                return getReturnStyle();
            case PropertiesPackage.SOA_OPERATION__BRANCH:
                return getBranch();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.SOA_OPERATION__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__PROJECT:
                setProject((Project)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__CONTEXT:
                setContext((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__JOB_VERSION:
                setJobVersion((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__JOB_NAME:
                setJobName((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__ACTIVE:
                setActive(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE:
                setLastScriptGenerationDate((Date)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__JOB_ID:
                setJobId((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN:
                setApplyContextToChildren(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS:
                getInputParameters().clear();
                getInputParameters().addAll((Collection)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__JVM_PARAMETERS:
                setJvmParameters((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__XMS:
                setXms(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__XMX:
                setXmx(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__MIN_JOB_INSTANCES:
                setMinJobInstances(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__MAX_JOB_INSTANCES:
                setMaxJobInstances(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES:
                setIdleTTL_forAllInstances(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES:
                setIdleTTL_forAdditionalInstances(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__QUEUE_MAX_SIZE:
                setQueueMaxSize(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__REQUEST_IN_QUEUE_TTL:
                setRequestInQueueTTL(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                setService((SoaService)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__RETURN_STYLE:
                setReturnStyle((String)newValue);
                return;
            case PropertiesPackage.SOA_OPERATION__BRANCH:
                setBranch((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.SOA_OPERATION__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__PROJECT:
                setProject((Project)null);
                return;
            case PropertiesPackage.SOA_OPERATION__CONTEXT:
                setContext(CONTEXT_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__JOB_VERSION:
                setJobVersion(JOB_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__JOB_NAME:
                setJobName(JOB_NAME_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE:
                setLastScriptGenerationDate(LAST_SCRIPT_GENERATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__JOB_ID:
                setJobId(JOB_ID_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN:
                setApplyContextToChildren(APPLY_CONTEXT_TO_CHILDREN_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS:
                getInputParameters().clear();
                return;
            case PropertiesPackage.SOA_OPERATION__JVM_PARAMETERS:
                setJvmParameters(JVM_PARAMETERS_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__XMS:
                setXms(XMS_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__XMX:
                setXmx(XMX_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__MIN_JOB_INSTANCES:
                setMinJobInstances(MIN_JOB_INSTANCES_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__MAX_JOB_INSTANCES:
                setMaxJobInstances(MAX_JOB_INSTANCES_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES:
                setIdleTTL_forAllInstances(IDLE_TTL_FOR_ALL_INSTANCES_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES:
                setIdleTTL_forAdditionalInstances(IDLE_TTL_FOR_ADDITIONAL_INSTANCES_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__QUEUE_MAX_SIZE:
                setQueueMaxSize(QUEUE_MAX_SIZE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__REQUEST_IN_QUEUE_TTL:
                setRequestInQueueTTL(REQUEST_IN_QUEUE_TTL_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                setService((SoaService)null);
                return;
            case PropertiesPackage.SOA_OPERATION__RETURN_STYLE:
                setReturnStyle(RETURN_STYLE_EDEFAULT);
                return;
            case PropertiesPackage.SOA_OPERATION__BRANCH:
                setBranch(BRANCH_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.SOA_OPERATION__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.SOA_OPERATION__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.SOA_OPERATION__PROJECT:
                return project != null;
            case PropertiesPackage.SOA_OPERATION__CONTEXT:
                return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
            case PropertiesPackage.SOA_OPERATION__JOB_VERSION:
                return JOB_VERSION_EDEFAULT == null ? jobVersion != null : !JOB_VERSION_EDEFAULT.equals(jobVersion);
            case PropertiesPackage.SOA_OPERATION__JOB_NAME:
                return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
            case PropertiesPackage.SOA_OPERATION__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__LAST_SCRIPT_GENERATION_DATE:
                return LAST_SCRIPT_GENERATION_DATE_EDEFAULT == null ? lastScriptGenerationDate != null : !LAST_SCRIPT_GENERATION_DATE_EDEFAULT.equals(lastScriptGenerationDate);
            case PropertiesPackage.SOA_OPERATION__JOB_ID:
                return JOB_ID_EDEFAULT == null ? jobId != null : !JOB_ID_EDEFAULT.equals(jobId);
            case PropertiesPackage.SOA_OPERATION__APPLY_CONTEXT_TO_CHILDREN:
                return applyContextToChildren != APPLY_CONTEXT_TO_CHILDREN_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__INPUT_PARAMETERS:
                return inputParameters != null && !inputParameters.isEmpty();
            case PropertiesPackage.SOA_OPERATION__JVM_PARAMETERS:
                return JVM_PARAMETERS_EDEFAULT == null ? jvmParameters != null : !JVM_PARAMETERS_EDEFAULT.equals(jvmParameters);
            case PropertiesPackage.SOA_OPERATION__XMS:
                return xms != XMS_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__XMX:
                return xmx != XMX_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__MIN_JOB_INSTANCES:
                return minJobInstances != MIN_JOB_INSTANCES_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__MAX_JOB_INSTANCES:
                return maxJobInstances != MAX_JOB_INSTANCES_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ALL_INSTANCES:
                return idleTTL_forAllInstances != IDLE_TTL_FOR_ALL_INSTANCES_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__IDLE_TTL_FOR_ADDITIONAL_INSTANCES:
                return idleTTL_forAdditionalInstances != IDLE_TTL_FOR_ADDITIONAL_INSTANCES_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__QUEUE_MAX_SIZE:
                return queueMaxSize != QUEUE_MAX_SIZE_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__REQUEST_IN_QUEUE_TTL:
                return requestInQueueTTL != REQUEST_IN_QUEUE_TTL_EDEFAULT;
            case PropertiesPackage.SOA_OPERATION__SERVICE:
                return getService() != null;
            case PropertiesPackage.SOA_OPERATION__RETURN_STYLE:
                return RETURN_STYLE_EDEFAULT == null ? returnStyle != null : !RETURN_STYLE_EDEFAULT.equals(returnStyle);
            case PropertiesPackage.SOA_OPERATION__BRANCH:
                return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", label: ");
        result.append(label);
        result.append(", description: ");
        result.append(description);
        result.append(", context: ");
        result.append(context);
        result.append(", jobVersion: ");
        result.append(jobVersion);
        result.append(", jobName: ");
        result.append(jobName);
        result.append(", active: ");
        result.append(active);
        result.append(", lastScriptGenerationDate: ");
        result.append(lastScriptGenerationDate);
        result.append(", jobId: ");
        result.append(jobId);
        result.append(", applyContextToChildren: ");
        result.append(applyContextToChildren);
        result.append(", jvmParameters: ");
        result.append(jvmParameters);
        result.append(", xms: ");
        result.append(xms);
        result.append(", xmx: ");
        result.append(xmx);
        result.append(", minJobInstances: ");
        result.append(minJobInstances);
        result.append(", maxJobInstances: ");
        result.append(maxJobInstances);
        result.append(", idleTTL_forAllInstances: ");
        result.append(idleTTL_forAllInstances);
        result.append(", idleTTL_forAdditionalInstances: ");
        result.append(idleTTL_forAdditionalInstances);
        result.append(", queueMaxSize: ");
        result.append(queueMaxSize);
        result.append(", requestInQueueTTL: ");
        result.append(requestInQueueTTL);
        result.append(", returnStyle: ");
        result.append(returnStyle);
        result.append(", branch: ");
        result.append(branch);
        result.append(')');
        return result.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SoaOperationImpl other = (SoaOperationImpl) obj;
        if (this.id != other.id)
            return false;
        return true;
    }

} // SoaOperationImpl
