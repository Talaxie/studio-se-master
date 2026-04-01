/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.ItemInforType;
import org.talend.designer.core.model.utils.emf.talendfile.LogsType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.NoteType;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.RequiredType;
import org.talend.designer.core.model.utils.emf.talendfile.SubjobType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Process Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getDefaultContext <em>Default Context</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getRepositoryContextId <em>Repository Context Id</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getSubjob <em>Subjob</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getScreenshots <em>Screenshots</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getRoutinesDependencies <em>Routines Dependencies</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getJobType <em>Job Type</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl#getFramework <em>Framework</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessTypeImpl extends EObjectImpl implements ProcessType {

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
     * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequired()
     * @generated
     * @ordered
     */
    protected RequiredType required;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected EList context;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected ParametersType parameters;

    /**
     * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected EList node;

    /**
     * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getConnection()
     * @generated
     * @ordered
     */
    protected EList connection;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected EList note;

    /**
     * The cached value of the '{@link #getLogs() <em>Logs</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLogs()
     * @generated
     * @ordered
     */
    protected LogsType logs;

    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected String author = AUTHOR_EDEFAULT;

    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected String defaultContext = DEFAULT_CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected static final String PURPOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected String purpose = PURPOSE_EDEFAULT;

    /**
     * The default value of the '{@link #getRepositoryContextId() <em>Repository Context Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRepositoryContextId()
     * @generated
     * @ordered
     */
    protected static final String REPOSITORY_CONTEXT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRepositoryContextId() <em>Repository Context Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRepositoryContextId()
     * @generated
     * @ordered
     */
    protected String repositoryContextId = REPOSITORY_CONTEXT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final String STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected String status = STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubjob() <em>Subjob</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getSubjob()
     * @generated
     * @ordered
     */
    protected EList subjob;

    /**
     * The default value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getScreenshot()
     * @generated
     * @ordered
     */
    protected static final byte[] SCREENSHOT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getScreenshot()
     * @generated
     * @ordered
     */
    protected byte[] screenshot = SCREENSHOT_EDEFAULT;

    /**
     * The cached value of the '{@link #getScreenshots() <em>Screenshots</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScreenshots()
     * @generated
     * @ordered
     */
    protected EMap screenshots;

    /**
     * The cached value of the '{@link #getRoutinesDependencies() <em>Routines Dependencies</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRoutinesDependencies()
     * @generated
     * @ordered
     */
    protected EList routinesDependencies;

    /**
     * The default value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobType()
     * @generated
     * @ordered
     */
    protected static final String JOB_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobType()
     * @generated
     * @ordered
     */
    protected String jobType = JOB_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getFramework() <em>Framework</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFramework()
     * @generated
     * @ordered
     */
    protected static final String FRAMEWORK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFramework() <em>Framework</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFramework()
     * @generated
     * @ordered
     */
    protected String framework = FRAMEWORK_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ProcessTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.PROCESS_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RequiredType getRequired() {
        return required;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequired(RequiredType newRequired, NotificationChain msgs) {
        RequiredType oldRequired = required;
        required = newRequired;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__REQUIRED, oldRequired, newRequired);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRequired(RequiredType newRequired) {
        if (newRequired != required) {
            NotificationChain msgs = null;
            if (required != null)
                msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.PROCESS_TYPE__REQUIRED, null, msgs);
            if (newRequired != null)
                msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.PROCESS_TYPE__REQUIRED, null, msgs);
            msgs = basicSetRequired(newRequired, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__REQUIRED, newRequired, newRequired));
    }

    ArrayList contextDataStore = new ArrayList();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getContext() {
        if (context == null) {
            context = new EObjectContainmentEList(ContextType.class, this, TalendFilePackage.PROCESS_TYPE__CONTEXT);
        }
        return context;
    }

    public ArrayList getJobContextsComboValue() {
        return contextDataStore;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
        ParametersType oldParameters = parameters;
        parameters = newParameters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__PARAMETERS, oldParameters, newParameters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(ParametersType newParameters) {
        if (newParameters != parameters) {
            NotificationChain msgs = null;
            if (parameters != null)
                msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.PROCESS_TYPE__PARAMETERS, null, msgs);
            if (newParameters != null)
                msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.PROCESS_TYPE__PARAMETERS, null, msgs);
            msgs = basicSetParameters(newParameters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__PARAMETERS, newParameters, newParameters));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getNode() {
        if (node == null) {
            node = new EObjectContainmentEList(NodeType.class, this, TalendFilePackage.PROCESS_TYPE__NODE);
        }
        return node;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getConnection() {
        if (connection == null) {
            connection = new EObjectContainmentEList(ConnectionType.class, this, TalendFilePackage.PROCESS_TYPE__CONNECTION);
        }
        return connection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getNote() {
        if (note == null) {
            note = new EObjectContainmentEList(NoteType.class, this, TalendFilePackage.PROCESS_TYPE__NOTE);
        }
        return note;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getSubjob() {
        if (subjob == null) {
            subjob = new EObjectContainmentEList(SubjobType.class, this, TalendFilePackage.PROCESS_TYPE__SUBJOB);
        }
        return subjob;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public byte[] getScreenshot() {
        return screenshot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setScreenshot(byte[] newScreenshot) {
        byte[] oldScreenshot = screenshot;
        screenshot = newScreenshot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__SCREENSHOT, oldScreenshot, screenshot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap getScreenshots() {
        if (screenshots == null) {
            screenshots = new EcoreEMap(TalendFilePackage.Literals.SCREENSHOTS_MAP, ScreenshotsMapImpl.class, this, TalendFilePackage.PROCESS_TYPE__SCREENSHOTS);
        }
        return screenshots;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getRoutinesDependencies() {
        if (routinesDependencies == null) {
            routinesDependencies = new EObjectContainmentEList(ItemInforType.class, this, TalendFilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES);
        }
        return routinesDependencies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJobType(String newJobType) {
        String oldJobType = jobType;
        jobType = newJobType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__JOB_TYPE, oldJobType, jobType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFramework() {
        return framework;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFramework(String newFramework) {
        String oldFramework = framework;
        framework = newFramework;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__FRAMEWORK, oldFramework, framework));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LogsType getLogs() {
        return logs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLogs(LogsType newLogs, NotificationChain msgs) {
        LogsType oldLogs = logs;
        logs = newLogs;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__LOGS, oldLogs, newLogs);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLogs(LogsType newLogs) {
        if (newLogs != logs) {
            NotificationChain msgs = null;
            if (logs != null)
                msgs = ((InternalEObject)logs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.PROCESS_TYPE__LOGS, null, msgs);
            if (newLogs != null)
                msgs = ((InternalEObject)newLogs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.PROCESS_TYPE__LOGS, null, msgs);
            msgs = basicSetLogs(newLogs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__LOGS, newLogs, newLogs));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor) {
        String oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultContext() {
        return defaultContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultContext(String newDefaultContext) {
        String oldDefaultContext = defaultContext;
        defaultContext = newDefaultContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPurpose(String newPurpose) {
        String oldPurpose = purpose;
        purpose = newPurpose;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__PURPOSE, oldPurpose, purpose));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getRepositoryContextId() {
        return repositoryContextId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRepositoryContextId(String newRepositoryContextId) {
        String oldRepositoryContextId = repositoryContextId;
        repositoryContextId = newRepositoryContextId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID, oldRepositoryContextId, repositoryContextId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(String newStatus) {
        String oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.PROCESS_TYPE__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.PROCESS_TYPE__REQUIRED:
                return basicSetRequired(null, msgs);
            case TalendFilePackage.PROCESS_TYPE__CONTEXT:
                return ((InternalEList)getContext()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.PROCESS_TYPE__PARAMETERS:
                return basicSetParameters(null, msgs);
            case TalendFilePackage.PROCESS_TYPE__NODE:
                return ((InternalEList)getNode()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.PROCESS_TYPE__CONNECTION:
                return ((InternalEList)getConnection()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.PROCESS_TYPE__NOTE:
                return ((InternalEList)getNote()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.PROCESS_TYPE__LOGS:
                return basicSetLogs(null, msgs);
            case TalendFilePackage.PROCESS_TYPE__SUBJOB:
                return ((InternalEList)getSubjob()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOTS:
                return ((InternalEList)getScreenshots()).basicRemove(otherEnd, msgs);
            case TalendFilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                return ((InternalEList)getRoutinesDependencies()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.PROCESS_TYPE__DESCRIPTION:
                return getDescription();
            case TalendFilePackage.PROCESS_TYPE__REQUIRED:
                return getRequired();
            case TalendFilePackage.PROCESS_TYPE__CONTEXT:
                return getContext();
            case TalendFilePackage.PROCESS_TYPE__PARAMETERS:
                return getParameters();
            case TalendFilePackage.PROCESS_TYPE__NODE:
                return getNode();
            case TalendFilePackage.PROCESS_TYPE__CONNECTION:
                return getConnection();
            case TalendFilePackage.PROCESS_TYPE__NOTE:
                return getNote();
            case TalendFilePackage.PROCESS_TYPE__LOGS:
                return getLogs();
            case TalendFilePackage.PROCESS_TYPE__AUTHOR:
                return getAuthor();
            case TalendFilePackage.PROCESS_TYPE__COMMENT:
                return getComment();
            case TalendFilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                return getDefaultContext();
            case TalendFilePackage.PROCESS_TYPE__NAME:
                return getName();
            case TalendFilePackage.PROCESS_TYPE__PURPOSE:
                return getPurpose();
            case TalendFilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                return getRepositoryContextId();
            case TalendFilePackage.PROCESS_TYPE__STATUS:
                return getStatus();
            case TalendFilePackage.PROCESS_TYPE__VERSION:
                return getVersion();
            case TalendFilePackage.PROCESS_TYPE__SUBJOB:
                return getSubjob();
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOT:
                return getScreenshot();
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOTS:
                if (coreType) return getScreenshots();
                else return getScreenshots().map();
            case TalendFilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                return getRoutinesDependencies();
            case TalendFilePackage.PROCESS_TYPE__JOB_TYPE:
                return getJobType();
            case TalendFilePackage.PROCESS_TYPE__FRAMEWORK:
                return getFramework();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendFilePackage.PROCESS_TYPE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__REQUIRED:
                setRequired((RequiredType)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__CONTEXT:
                getContext().clear();
                getContext().addAll((Collection)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__PARAMETERS:
                setParameters((ParametersType)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__NODE:
                getNode().clear();
                getNode().addAll((Collection)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__CONNECTION:
                getConnection().clear();
                getConnection().addAll((Collection)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__NOTE:
                getNote().clear();
                getNote().addAll((Collection)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__LOGS:
                setLogs((LogsType)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__COMMENT:
                setComment((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                setDefaultContext((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__NAME:
                setName((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__PURPOSE:
                setPurpose((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                setRepositoryContextId((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__STATUS:
                setStatus((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__VERSION:
                setVersion((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__SUBJOB:
                getSubjob().clear();
                getSubjob().addAll((Collection)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOT:
                setScreenshot((byte[])newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOTS:
                ((EStructuralFeature.Setting)getScreenshots()).set(newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                getRoutinesDependencies().clear();
                getRoutinesDependencies().addAll((Collection)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__JOB_TYPE:
                setJobType((String)newValue);
                return;
            case TalendFilePackage.PROCESS_TYPE__FRAMEWORK:
                setFramework((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendFilePackage.PROCESS_TYPE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__REQUIRED:
                setRequired((RequiredType)null);
                return;
            case TalendFilePackage.PROCESS_TYPE__CONTEXT:
                getContext().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__PARAMETERS:
                setParameters((ParametersType)null);
                return;
            case TalendFilePackage.PROCESS_TYPE__NODE:
                getNode().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__CONNECTION:
                getConnection().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__NOTE:
                getNote().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__LOGS:
                setLogs((LogsType)null);
                return;
            case TalendFilePackage.PROCESS_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__COMMENT:
                setComment(COMMENT_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                setDefaultContext(DEFAULT_CONTEXT_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__PURPOSE:
                setPurpose(PURPOSE_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                setRepositoryContextId(REPOSITORY_CONTEXT_ID_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__SUBJOB:
                getSubjob().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOT:
                setScreenshot(SCREENSHOT_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOTS:
                getScreenshots().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                getRoutinesDependencies().clear();
                return;
            case TalendFilePackage.PROCESS_TYPE__JOB_TYPE:
                setJobType(JOB_TYPE_EDEFAULT);
                return;
            case TalendFilePackage.PROCESS_TYPE__FRAMEWORK:
                setFramework(FRAMEWORK_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendFilePackage.PROCESS_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TalendFilePackage.PROCESS_TYPE__REQUIRED:
                return required != null;
            case TalendFilePackage.PROCESS_TYPE__CONTEXT:
                return context != null && !context.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__PARAMETERS:
                return parameters != null;
            case TalendFilePackage.PROCESS_TYPE__NODE:
                return node != null && !node.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__CONNECTION:
                return connection != null && !connection.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__NOTE:
                return note != null && !note.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__LOGS:
                return logs != null;
            case TalendFilePackage.PROCESS_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case TalendFilePackage.PROCESS_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
            case TalendFilePackage.PROCESS_TYPE__DEFAULT_CONTEXT:
                return DEFAULT_CONTEXT_EDEFAULT == null ? defaultContext != null : !DEFAULT_CONTEXT_EDEFAULT.equals(defaultContext);
            case TalendFilePackage.PROCESS_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TalendFilePackage.PROCESS_TYPE__PURPOSE:
                return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
            case TalendFilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID:
                return REPOSITORY_CONTEXT_ID_EDEFAULT == null ? repositoryContextId != null : !REPOSITORY_CONTEXT_ID_EDEFAULT.equals(repositoryContextId);
            case TalendFilePackage.PROCESS_TYPE__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
            case TalendFilePackage.PROCESS_TYPE__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case TalendFilePackage.PROCESS_TYPE__SUBJOB:
                return subjob != null && !subjob.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOT:
                return SCREENSHOT_EDEFAULT == null ? screenshot != null : !SCREENSHOT_EDEFAULT.equals(screenshot);
            case TalendFilePackage.PROCESS_TYPE__SCREENSHOTS:
                return screenshots != null && !screenshots.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__ROUTINES_DEPENDENCIES:
                return routinesDependencies != null && !routinesDependencies.isEmpty();
            case TalendFilePackage.PROCESS_TYPE__JOB_TYPE:
                return JOB_TYPE_EDEFAULT == null ? jobType != null : !JOB_TYPE_EDEFAULT.equals(jobType);
            case TalendFilePackage.PROCESS_TYPE__FRAMEWORK:
                return FRAMEWORK_EDEFAULT == null ? framework != null : !FRAMEWORK_EDEFAULT.equals(framework);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (description: ");
        result.append(description);
        result.append(", author: ");
        result.append(author);
        result.append(", comment: ");
        result.append(comment);
        result.append(", defaultContext: ");
        result.append(defaultContext);
        result.append(", name: ");
        result.append(name);
        result.append(", purpose: ");
        result.append(purpose);
        result.append(", repositoryContextId: ");
        result.append(repositoryContextId);
        result.append(", status: ");
        result.append(status);
        result.append(", version: ");
        result.append(version);
        result.append(", screenshot: ");
        result.append(screenshot);
        result.append(", jobType: ");
        result.append(jobType);
        result.append(", framework: ");
        result.append(framework);
        result.append(')');
        return result.toString();
    }

} // ProcessTypeImpl
