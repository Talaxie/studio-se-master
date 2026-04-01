/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;
import orgomg.cwm.resource.record.RecordDef;
import orgomg.cwm.resource.record.RecordFile;
import orgomg.cwm.resource.record.RecordPackage;
import orgomg.cwmx.resource.coboldata.AccessType;
import orgomg.cwmx.resource.coboldata.BlockKind;
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.COBOLItem;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.FileOrganization;
import orgomg.cwmx.resource.coboldata.FileSection;
import orgomg.cwmx.resource.coboldata.LabelKind;
import orgomg.cwmx.resource.coboldata.LinageInfo;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>COBOLFD</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getDataManager <em>Data Manager</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#isIsSelfDescribing <em>Is Self Describing</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getRecordDelimiter <em>Record Delimiter</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getSkipRecords <em>Skip Records</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getReserveAreas <em>Reserve Areas</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getCodeSetLit <em>Code Set Lit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getBlockSizeUnit <em>Block Size Unit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getMinBlocks <em>Min Blocks</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getMaxBlocks <em>Max Blocks</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getMinRecords <em>Min Records</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getMaxRecords <em>Max Records</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getLabelKind <em>Label Kind</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getPadLiteral <em>Pad Literal</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getStatusID <em>Status ID</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getLinageInfo <em>Linage Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getFileSection <em>File Section</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getPadField <em>Pad Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDImpl#getRelativeField <em>Relative Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COBOLFDImpl extends ClassImpl implements COBOLFD {

    /**
     * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getImportedElement()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> importedElement;

    /**
     * The cached value of the '{@link #getDataManager() <em>Data Manager</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDataManager()
     * @generated
     * @ordered
     */
    protected EList<DataManager> dataManager;

    /**
     * The default value of the '{@link #isIsSelfDescribing() <em>Is Self Describing</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsSelfDescribing()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SELF_DESCRIBING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSelfDescribing() <em>Is Self Describing</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsSelfDescribing()
     * @generated
     * @ordered
     */
    protected boolean isSelfDescribing = IS_SELF_DESCRIBING_EDEFAULT;

    /**
     * The default value of the '{@link #getRecordDelimiter() <em>Record Delimiter</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordDelimiter()
     * @generated
     * @ordered
     */
    protected static final long RECORD_DELIMITER_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRecordDelimiter() <em>Record Delimiter</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordDelimiter()
     * @generated
     * @ordered
     */
    protected long recordDelimiter = RECORD_DELIMITER_EDEFAULT;

    /**
     * The default value of the '{@link #getSkipRecords() <em>Skip Records</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSkipRecords()
     * @generated
     * @ordered
     */
    protected static final long SKIP_RECORDS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSkipRecords() <em>Skip Records</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSkipRecords()
     * @generated
     * @ordered
     */
    protected long skipRecords = SKIP_RECORDS_EDEFAULT;

    /**
     * The cached value of the '{@link #getRecord() <em>Record</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRecord()
     * @generated
     * @ordered
     */
    protected EList<RecordDef> record;

    /**
     * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected static final FileOrganization ORGANIZATION_EDEFAULT = FileOrganization.FO_UNSPECIFIED;

    /**
     * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected FileOrganization organization = ORGANIZATION_EDEFAULT;

    /**
     * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAccessMode()
     * @generated
     * @ordered
     */
    protected static final AccessType ACCESS_MODE_EDEFAULT = AccessType.AT_UNSPECIFIED;

    /**
     * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAccessMode()
     * @generated
     * @ordered
     */
    protected AccessType accessMode = ACCESS_MODE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsOptional()
     * @generated
     * @ordered
     */
    protected static final boolean IS_OPTIONAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsOptional()
     * @generated
     * @ordered
     */
    protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

    /**
     * The default value of the '{@link #getReserveAreas() <em>Reserve Areas</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReserveAreas()
     * @generated
     * @ordered
     */
    protected static final long RESERVE_AREAS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getReserveAreas() <em>Reserve Areas</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReserveAreas()
     * @generated
     * @ordered
     */
    protected long reserveAreas = RESERVE_AREAS_EDEFAULT;

    /**
     * The default value of the '{@link #getAssignTo() <em>Assign To</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssignTo()
     * @generated
     * @ordered
     */
    protected static final String ASSIGN_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAssignTo() <em>Assign To</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAssignTo()
     * @generated
     * @ordered
     */
    protected String assignTo = ASSIGN_TO_EDEFAULT;

    /**
     * The default value of the '{@link #getCodeSetLit() <em>Code Set Lit</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCodeSetLit()
     * @generated
     * @ordered
     */
    protected static final String CODE_SET_LIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCodeSetLit() <em>Code Set Lit</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCodeSetLit()
     * @generated
     * @ordered
     */
    protected String codeSetLit = CODE_SET_LIT_EDEFAULT;

    /**
     * The default value of the '{@link #getBlockSizeUnit() <em>Block Size Unit</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlockSizeUnit()
     * @generated
     * @ordered
     */
    protected static final BlockKind BLOCK_SIZE_UNIT_EDEFAULT = BlockKind.BK_RECORDS;

    /**
     * The cached value of the '{@link #getBlockSizeUnit() <em>Block Size Unit</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlockSizeUnit()
     * @generated
     * @ordered
     */
    protected BlockKind blockSizeUnit = BLOCK_SIZE_UNIT_EDEFAULT;

    /**
     * The default value of the '{@link #getMinBlocks() <em>Min Blocks</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMinBlocks()
     * @generated
     * @ordered
     */
    protected static final long MIN_BLOCKS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMinBlocks() <em>Min Blocks</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMinBlocks()
     * @generated
     * @ordered
     */
    protected long minBlocks = MIN_BLOCKS_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxBlocks() <em>Max Blocks</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxBlocks()
     * @generated
     * @ordered
     */
    protected static final long MAX_BLOCKS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaxBlocks() <em>Max Blocks</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxBlocks()
     * @generated
     * @ordered
     */
    protected long maxBlocks = MAX_BLOCKS_EDEFAULT;

    /**
     * The default value of the '{@link #getMinRecords() <em>Min Records</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMinRecords()
     * @generated
     * @ordered
     */
    protected static final long MIN_RECORDS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMinRecords() <em>Min Records</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMinRecords()
     * @generated
     * @ordered
     */
    protected long minRecords = MIN_RECORDS_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxRecords() <em>Max Records</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxRecords()
     * @generated
     * @ordered
     */
    protected static final long MAX_RECORDS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaxRecords() <em>Max Records</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMaxRecords()
     * @generated
     * @ordered
     */
    protected long maxRecords = MAX_RECORDS_EDEFAULT;

    /**
     * The default value of the '{@link #getLabelKind() <em>Label Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLabelKind()
     * @generated
     * @ordered
     */
    protected static final LabelKind LABEL_KIND_EDEFAULT = LabelKind.LK_UNSPECIFIED;

    /**
     * The cached value of the '{@link #getLabelKind() <em>Label Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLabelKind()
     * @generated
     * @ordered
     */
    protected LabelKind labelKind = LABEL_KIND_EDEFAULT;

    /**
     * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsExternal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXTERNAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsExternal()
     * @generated
     * @ordered
     */
    protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGlobal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GLOBAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGlobal()
     * @generated
     * @ordered
     */
    protected boolean isGlobal = IS_GLOBAL_EDEFAULT;

    /**
     * The default value of the '{@link #getPadLiteral() <em>Pad Literal</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPadLiteral()
     * @generated
     * @ordered
     */
    protected static final String PAD_LITERAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPadLiteral() <em>Pad Literal</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPadLiteral()
     * @generated
     * @ordered
     */
    protected String padLiteral = PAD_LITERAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getStatusID() <em>Status ID</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStatusID()
     * @generated
     * @ordered
     */
    protected COBOLItem statusID;

    /**
     * The cached value of the '{@link #getLinageInfo() <em>Linage Info</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLinageInfo()
     * @generated
     * @ordered
     */
    protected EList<LinageInfo> linageInfo;

    /**
     * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDependsOn()
     * @generated
     * @ordered
     */
    protected COBOLItem dependsOn;

    /**
     * The cached value of the '{@link #getPadField() <em>Pad Field</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPadField()
     * @generated
     * @ordered
     */
    protected COBOLItem padField;

    /**
     * The cached value of the '{@link #getRelativeField() <em>Relative Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRelativeField()
     * @generated
     * @ordered
     */
    protected COBOLItem relativeField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected COBOLFDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.COBOLFD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getImportedElement() {
        if (importedElement == null) {
            importedElement = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this,
                    CoboldataPackage.COBOLFD__IMPORTED_ELEMENT, CorePackage.MODEL_ELEMENT__IMPORTER);
        }
        return importedElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DataManager> getDataManager() {
        if (dataManager == null) {
            dataManager = new EObjectWithInverseResolvingEList.ManyInverse<DataManager>(DataManager.class, this,
                    CoboldataPackage.COBOLFD__DATA_MANAGER, SoftwaredeploymentPackage.DATA_MANAGER__DATA_PACKAGE);
        }
        return dataManager;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSelfDescribing() {
        return isSelfDescribing;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsSelfDescribing(boolean newIsSelfDescribing) {
        boolean oldIsSelfDescribing = isSelfDescribing;
        isSelfDescribing = newIsSelfDescribing;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING,
                    oldIsSelfDescribing, isSelfDescribing));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRecordDelimiter() {
        return recordDelimiter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRecordDelimiter(long newRecordDelimiter) {
        long oldRecordDelimiter = recordDelimiter;
        recordDelimiter = newRecordDelimiter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__RECORD_DELIMITER, oldRecordDelimiter,
                    recordDelimiter));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getSkipRecords() {
        return skipRecords;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSkipRecords(long newSkipRecords) {
        long oldSkipRecords = skipRecords;
        skipRecords = newSkipRecords;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__SKIP_RECORDS, oldSkipRecords,
                    skipRecords));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<RecordDef> getRecord() {
        if (record == null) {
            record = new EObjectWithInverseResolvingEList.ManyInverse<RecordDef>(RecordDef.class, this,
                    CoboldataPackage.COBOLFD__RECORD, RecordPackage.RECORD_DEF__FILE);
        }
        return record;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FileOrganization getOrganization() {
        return organization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOrganization(FileOrganization newOrganization) {
        FileOrganization oldOrganization = organization;
        organization = newOrganization == null ? ORGANIZATION_EDEFAULT : newOrganization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__ORGANIZATION, oldOrganization,
                    organization));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AccessType getAccessMode() {
        return accessMode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAccessMode(AccessType newAccessMode) {
        AccessType oldAccessMode = accessMode;
        accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__ACCESS_MODE, oldAccessMode,
                    accessMode));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOptional() {
        return isOptional;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsOptional(boolean newIsOptional) {
        boolean oldIsOptional = isOptional;
        isOptional = newIsOptional;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__IS_OPTIONAL, oldIsOptional,
                    isOptional));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getReserveAreas() {
        return reserveAreas;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReserveAreas(long newReserveAreas) {
        long oldReserveAreas = reserveAreas;
        reserveAreas = newReserveAreas;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__RESERVE_AREAS, oldReserveAreas,
                    reserveAreas));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAssignTo() {
        return assignTo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAssignTo(String newAssignTo) {
        String oldAssignTo = assignTo;
        assignTo = newAssignTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__ASSIGN_TO, oldAssignTo, assignTo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getCodeSetLit() {
        return codeSetLit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCodeSetLit(String newCodeSetLit) {
        String oldCodeSetLit = codeSetLit;
        codeSetLit = newCodeSetLit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__CODE_SET_LIT, oldCodeSetLit,
                    codeSetLit));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BlockKind getBlockSizeUnit() {
        return blockSizeUnit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBlockSizeUnit(BlockKind newBlockSizeUnit) {
        BlockKind oldBlockSizeUnit = blockSizeUnit;
        blockSizeUnit = newBlockSizeUnit == null ? BLOCK_SIZE_UNIT_EDEFAULT : newBlockSizeUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__BLOCK_SIZE_UNIT, oldBlockSizeUnit,
                    blockSizeUnit));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMinBlocks() {
        return minBlocks;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinBlocks(long newMinBlocks) {
        long oldMinBlocks = minBlocks;
        minBlocks = newMinBlocks;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__MIN_BLOCKS, oldMinBlocks, minBlocks));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMaxBlocks() {
        return maxBlocks;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaxBlocks(long newMaxBlocks) {
        long oldMaxBlocks = maxBlocks;
        maxBlocks = newMaxBlocks;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__MAX_BLOCKS, oldMaxBlocks, maxBlocks));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMinRecords() {
        return minRecords;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinRecords(long newMinRecords) {
        long oldMinRecords = minRecords;
        minRecords = newMinRecords;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__MIN_RECORDS, oldMinRecords,
                    minRecords));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMaxRecords() {
        return maxRecords;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaxRecords(long newMaxRecords) {
        long oldMaxRecords = maxRecords;
        maxRecords = newMaxRecords;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__MAX_RECORDS, oldMaxRecords,
                    maxRecords));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LabelKind getLabelKind() {
        return labelKind;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLabelKind(LabelKind newLabelKind) {
        LabelKind oldLabelKind = labelKind;
        labelKind = newLabelKind == null ? LABEL_KIND_EDEFAULT : newLabelKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__LABEL_KIND, oldLabelKind, labelKind));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExternal() {
        return isExternal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsExternal(boolean newIsExternal) {
        boolean oldIsExternal = isExternal;
        isExternal = newIsExternal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__IS_EXTERNAL, oldIsExternal,
                    isExternal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGlobal(boolean newIsGlobal) {
        boolean oldIsGlobal = isGlobal;
        isGlobal = newIsGlobal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__IS_GLOBAL, oldIsGlobal, isGlobal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPadLiteral() {
        return padLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPadLiteral(String newPadLiteral) {
        String oldPadLiteral = padLiteral;
        padLiteral = newPadLiteral;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__PAD_LITERAL, oldPadLiteral,
                    padLiteral));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem getStatusID() {
        if (statusID != null && statusID.eIsProxy()) {
            InternalEObject oldStatusID = (InternalEObject) statusID;
            statusID = (COBOLItem) eResolveProxy(oldStatusID);
            if (statusID != oldStatusID) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.COBOLFD__STATUS_ID, oldStatusID,
                            statusID));
            }
        }
        return statusID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem basicGetStatusID() {
        return statusID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatusID(COBOLItem newStatusID, NotificationChain msgs) {
        COBOLItem oldStatusID = statusID;
        statusID = newStatusID;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__STATUS_ID,
                    oldStatusID, newStatusID);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStatusID(COBOLItem newStatusID) {
        if (newStatusID != statusID) {
            NotificationChain msgs = null;
            if (statusID != null)
                msgs = ((InternalEObject) statusID).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__STATUS_FD, COBOLItem.class,
                        msgs);
            if (newStatusID != null)
                msgs = ((InternalEObject) newStatusID).eInverseAdd(this, CoboldataPackage.COBOL_ITEM__STATUS_FD, COBOLItem.class,
                        msgs);
            msgs = basicSetStatusID(newStatusID, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__STATUS_ID, newStatusID, newStatusID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<LinageInfo> getLinageInfo() {
        if (linageInfo == null) {
            linageInfo = new EObjectContainmentWithInverseEList<LinageInfo>(LinageInfo.class, this,
                    CoboldataPackage.COBOLFD__LINAGE_INFO, CoboldataPackage.LINAGE_INFO__COBOL_FD);
        }
        return linageInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FileSection getFileSection() {
        if (eContainerFeatureID() != CoboldataPackage.COBOLFD__FILE_SECTION)
            return null;
        return (FileSection) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFileSection(FileSection newFileSection, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newFileSection, CoboldataPackage.COBOLFD__FILE_SECTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileSection(FileSection newFileSection) {
        if (newFileSection != eInternalContainer()
                || (eContainerFeatureID() != CoboldataPackage.COBOLFD__FILE_SECTION && newFileSection != null)) {
            if (EcoreUtil.isAncestor(this, newFileSection))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newFileSection != null)
                msgs = ((InternalEObject) newFileSection).eInverseAdd(this, CoboldataPackage.FILE_SECTION__COBOL_FD,
                        FileSection.class, msgs);
            msgs = basicSetFileSection(newFileSection, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__FILE_SECTION, newFileSection,
                    newFileSection));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem getDependsOn() {
        if (dependsOn != null && dependsOn.eIsProxy()) {
            InternalEObject oldDependsOn = (InternalEObject) dependsOn;
            dependsOn = (COBOLItem) eResolveProxy(oldDependsOn);
            if (dependsOn != oldDependsOn) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.COBOLFD__DEPENDS_ON, oldDependsOn,
                            dependsOn));
            }
        }
        return dependsOn;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem basicGetDependsOn() {
        return dependsOn;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDependsOn(COBOLItem newDependsOn, NotificationChain msgs) {
        COBOLItem oldDependsOn = dependsOn;
        dependsOn = newDependsOn;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__DEPENDS_ON,
                    oldDependsOn, newDependsOn);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDependsOn(COBOLItem newDependsOn) {
        if (newDependsOn != dependsOn) {
            NotificationChain msgs = null;
            if (dependsOn != null)
                msgs = ((InternalEObject) dependsOn).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__DEPENDING_FD,
                        COBOLItem.class, msgs);
            if (newDependsOn != null)
                msgs = ((InternalEObject) newDependsOn).eInverseAdd(this, CoboldataPackage.COBOL_ITEM__DEPENDING_FD,
                        COBOLItem.class, msgs);
            msgs = basicSetDependsOn(newDependsOn, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__DEPENDS_ON, newDependsOn,
                    newDependsOn));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem getPadField() {
        if (padField != null && padField.eIsProxy()) {
            InternalEObject oldPadField = (InternalEObject) padField;
            padField = (COBOLItem) eResolveProxy(oldPadField);
            if (padField != oldPadField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.COBOLFD__PAD_FIELD, oldPadField,
                            padField));
            }
        }
        return padField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem basicGetPadField() {
        return padField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPadField(COBOLItem newPadField, NotificationChain msgs) {
        COBOLItem oldPadField = padField;
        padField = newPadField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__PAD_FIELD,
                    oldPadField, newPadField);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPadField(COBOLItem newPadField) {
        if (newPadField != padField) {
            NotificationChain msgs = null;
            if (padField != null)
                msgs = ((InternalEObject) padField).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__PADDED_FD, COBOLItem.class,
                        msgs);
            if (newPadField != null)
                msgs = ((InternalEObject) newPadField).eInverseAdd(this, CoboldataPackage.COBOL_ITEM__PADDED_FD, COBOLItem.class,
                        msgs);
            msgs = basicSetPadField(newPadField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__PAD_FIELD, newPadField, newPadField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem getRelativeField() {
        if (relativeField != null && relativeField.eIsProxy()) {
            InternalEObject oldRelativeField = (InternalEObject) relativeField;
            relativeField = (COBOLItem) eResolveProxy(oldRelativeField);
            if (relativeField != oldRelativeField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.COBOLFD__RELATIVE_FIELD,
                            oldRelativeField, relativeField));
            }
        }
        return relativeField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem basicGetRelativeField() {
        return relativeField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRelativeField(COBOLItem newRelativeField, NotificationChain msgs) {
        COBOLItem oldRelativeField = relativeField;
        relativeField = newRelativeField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoboldataPackage.COBOLFD__RELATIVE_FIELD, oldRelativeField, newRelativeField);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRelativeField(COBOLItem newRelativeField) {
        if (newRelativeField != relativeField) {
            NotificationChain msgs = null;
            if (relativeField != null)
                msgs = ((InternalEObject) relativeField).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__RELATIVE_FD,
                        COBOLItem.class, msgs);
            if (newRelativeField != null)
                msgs = ((InternalEObject) newRelativeField).eInverseAdd(this, CoboldataPackage.COBOL_ITEM__RELATIVE_FD,
                        COBOLItem.class, msgs);
            msgs = basicSetRelativeField(newRelativeField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD__RELATIVE_FIELD, newRelativeField,
                    newRelativeField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getImportedElement()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__DATA_MANAGER:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataManager()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__RECORD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRecord()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__STATUS_ID:
            if (statusID != null)
                msgs = ((InternalEObject) statusID).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__STATUS_FD, COBOLItem.class,
                        msgs);
            return basicSetStatusID((COBOLItem) otherEnd, msgs);
        case CoboldataPackage.COBOLFD__LINAGE_INFO:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinageInfo()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetFileSection((FileSection) otherEnd, msgs);
        case CoboldataPackage.COBOLFD__DEPENDS_ON:
            if (dependsOn != null)
                msgs = ((InternalEObject) dependsOn).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__DEPENDING_FD,
                        COBOLItem.class, msgs);
            return basicSetDependsOn((COBOLItem) otherEnd, msgs);
        case CoboldataPackage.COBOLFD__PAD_FIELD:
            if (padField != null)
                msgs = ((InternalEObject) padField).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__PADDED_FD, COBOLItem.class,
                        msgs);
            return basicSetPadField((COBOLItem) otherEnd, msgs);
        case CoboldataPackage.COBOLFD__RELATIVE_FIELD:
            if (relativeField != null)
                msgs = ((InternalEObject) relativeField).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__RELATIVE_FD,
                        COBOLItem.class, msgs);
            return basicSetRelativeField((COBOLItem) otherEnd, msgs);
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
        case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
            return ((InternalEList<?>) getImportedElement()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__DATA_MANAGER:
            return ((InternalEList<?>) getDataManager()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__RECORD:
            return ((InternalEList<?>) getRecord()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__STATUS_ID:
            return basicSetStatusID(null, msgs);
        case CoboldataPackage.COBOLFD__LINAGE_INFO:
            return ((InternalEList<?>) getLinageInfo()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            return basicSetFileSection(null, msgs);
        case CoboldataPackage.COBOLFD__DEPENDS_ON:
            return basicSetDependsOn(null, msgs);
        case CoboldataPackage.COBOLFD__PAD_FIELD:
            return basicSetPadField(null, msgs);
        case CoboldataPackage.COBOLFD__RELATIVE_FIELD:
            return basicSetRelativeField(null, msgs);
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
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            return eInternalContainer().eInverseRemove(this, CoboldataPackage.FILE_SECTION__COBOL_FD, FileSection.class, msgs);
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
        case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
            return getImportedElement();
        case CoboldataPackage.COBOLFD__DATA_MANAGER:
            return getDataManager();
        case CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING:
            return isIsSelfDescribing();
        case CoboldataPackage.COBOLFD__RECORD_DELIMITER:
            return getRecordDelimiter();
        case CoboldataPackage.COBOLFD__SKIP_RECORDS:
            return getSkipRecords();
        case CoboldataPackage.COBOLFD__RECORD:
            return getRecord();
        case CoboldataPackage.COBOLFD__ORGANIZATION:
            return getOrganization();
        case CoboldataPackage.COBOLFD__ACCESS_MODE:
            return getAccessMode();
        case CoboldataPackage.COBOLFD__IS_OPTIONAL:
            return isIsOptional();
        case CoboldataPackage.COBOLFD__RESERVE_AREAS:
            return getReserveAreas();
        case CoboldataPackage.COBOLFD__ASSIGN_TO:
            return getAssignTo();
        case CoboldataPackage.COBOLFD__CODE_SET_LIT:
            return getCodeSetLit();
        case CoboldataPackage.COBOLFD__BLOCK_SIZE_UNIT:
            return getBlockSizeUnit();
        case CoboldataPackage.COBOLFD__MIN_BLOCKS:
            return getMinBlocks();
        case CoboldataPackage.COBOLFD__MAX_BLOCKS:
            return getMaxBlocks();
        case CoboldataPackage.COBOLFD__MIN_RECORDS:
            return getMinRecords();
        case CoboldataPackage.COBOLFD__MAX_RECORDS:
            return getMaxRecords();
        case CoboldataPackage.COBOLFD__LABEL_KIND:
            return getLabelKind();
        case CoboldataPackage.COBOLFD__IS_EXTERNAL:
            return isIsExternal();
        case CoboldataPackage.COBOLFD__IS_GLOBAL:
            return isIsGlobal();
        case CoboldataPackage.COBOLFD__PAD_LITERAL:
            return getPadLiteral();
        case CoboldataPackage.COBOLFD__STATUS_ID:
            if (resolve)
                return getStatusID();
            return basicGetStatusID();
        case CoboldataPackage.COBOLFD__LINAGE_INFO:
            return getLinageInfo();
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            return getFileSection();
        case CoboldataPackage.COBOLFD__DEPENDS_ON:
            if (resolve)
                return getDependsOn();
            return basicGetDependsOn();
        case CoboldataPackage.COBOLFD__PAD_FIELD:
            if (resolve)
                return getPadField();
            return basicGetPadField();
        case CoboldataPackage.COBOLFD__RELATIVE_FIELD:
            if (resolve)
                return getRelativeField();
            return basicGetRelativeField();
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
        case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
            getImportedElement().clear();
            getImportedElement().addAll((Collection<? extends ModelElement>) newValue);
            return;
        case CoboldataPackage.COBOLFD__DATA_MANAGER:
            getDataManager().clear();
            getDataManager().addAll((Collection<? extends DataManager>) newValue);
            return;
        case CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING:
            setIsSelfDescribing((Boolean) newValue);
            return;
        case CoboldataPackage.COBOLFD__RECORD_DELIMITER:
            setRecordDelimiter((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__SKIP_RECORDS:
            setSkipRecords((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__RECORD:
            getRecord().clear();
            getRecord().addAll((Collection<? extends RecordDef>) newValue);
            return;
        case CoboldataPackage.COBOLFD__ORGANIZATION:
            setOrganization((FileOrganization) newValue);
            return;
        case CoboldataPackage.COBOLFD__ACCESS_MODE:
            setAccessMode((AccessType) newValue);
            return;
        case CoboldataPackage.COBOLFD__IS_OPTIONAL:
            setIsOptional((Boolean) newValue);
            return;
        case CoboldataPackage.COBOLFD__RESERVE_AREAS:
            setReserveAreas((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__ASSIGN_TO:
            setAssignTo((String) newValue);
            return;
        case CoboldataPackage.COBOLFD__CODE_SET_LIT:
            setCodeSetLit((String) newValue);
            return;
        case CoboldataPackage.COBOLFD__BLOCK_SIZE_UNIT:
            setBlockSizeUnit((BlockKind) newValue);
            return;
        case CoboldataPackage.COBOLFD__MIN_BLOCKS:
            setMinBlocks((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__MAX_BLOCKS:
            setMaxBlocks((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__MIN_RECORDS:
            setMinRecords((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__MAX_RECORDS:
            setMaxRecords((Long) newValue);
            return;
        case CoboldataPackage.COBOLFD__LABEL_KIND:
            setLabelKind((LabelKind) newValue);
            return;
        case CoboldataPackage.COBOLFD__IS_EXTERNAL:
            setIsExternal((Boolean) newValue);
            return;
        case CoboldataPackage.COBOLFD__IS_GLOBAL:
            setIsGlobal((Boolean) newValue);
            return;
        case CoboldataPackage.COBOLFD__PAD_LITERAL:
            setPadLiteral((String) newValue);
            return;
        case CoboldataPackage.COBOLFD__STATUS_ID:
            setStatusID((COBOLItem) newValue);
            return;
        case CoboldataPackage.COBOLFD__LINAGE_INFO:
            getLinageInfo().clear();
            getLinageInfo().addAll((Collection<? extends LinageInfo>) newValue);
            return;
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            setFileSection((FileSection) newValue);
            return;
        case CoboldataPackage.COBOLFD__DEPENDS_ON:
            setDependsOn((COBOLItem) newValue);
            return;
        case CoboldataPackage.COBOLFD__PAD_FIELD:
            setPadField((COBOLItem) newValue);
            return;
        case CoboldataPackage.COBOLFD__RELATIVE_FIELD:
            setRelativeField((COBOLItem) newValue);
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
        case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
            getImportedElement().clear();
            return;
        case CoboldataPackage.COBOLFD__DATA_MANAGER:
            getDataManager().clear();
            return;
        case CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING:
            setIsSelfDescribing(IS_SELF_DESCRIBING_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__RECORD_DELIMITER:
            setRecordDelimiter(RECORD_DELIMITER_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__SKIP_RECORDS:
            setSkipRecords(SKIP_RECORDS_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__RECORD:
            getRecord().clear();
            return;
        case CoboldataPackage.COBOLFD__ORGANIZATION:
            setOrganization(ORGANIZATION_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__ACCESS_MODE:
            setAccessMode(ACCESS_MODE_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__IS_OPTIONAL:
            setIsOptional(IS_OPTIONAL_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__RESERVE_AREAS:
            setReserveAreas(RESERVE_AREAS_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__ASSIGN_TO:
            setAssignTo(ASSIGN_TO_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__CODE_SET_LIT:
            setCodeSetLit(CODE_SET_LIT_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__BLOCK_SIZE_UNIT:
            setBlockSizeUnit(BLOCK_SIZE_UNIT_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__MIN_BLOCKS:
            setMinBlocks(MIN_BLOCKS_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__MAX_BLOCKS:
            setMaxBlocks(MAX_BLOCKS_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__MIN_RECORDS:
            setMinRecords(MIN_RECORDS_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__MAX_RECORDS:
            setMaxRecords(MAX_RECORDS_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__LABEL_KIND:
            setLabelKind(LABEL_KIND_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__IS_EXTERNAL:
            setIsExternal(IS_EXTERNAL_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__IS_GLOBAL:
            setIsGlobal(IS_GLOBAL_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__PAD_LITERAL:
            setPadLiteral(PAD_LITERAL_EDEFAULT);
            return;
        case CoboldataPackage.COBOLFD__STATUS_ID:
            setStatusID((COBOLItem) null);
            return;
        case CoboldataPackage.COBOLFD__LINAGE_INFO:
            getLinageInfo().clear();
            return;
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            setFileSection((FileSection) null);
            return;
        case CoboldataPackage.COBOLFD__DEPENDS_ON:
            setDependsOn((COBOLItem) null);
            return;
        case CoboldataPackage.COBOLFD__PAD_FIELD:
            setPadField((COBOLItem) null);
            return;
        case CoboldataPackage.COBOLFD__RELATIVE_FIELD:
            setRelativeField((COBOLItem) null);
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
        case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
            return importedElement != null && !importedElement.isEmpty();
        case CoboldataPackage.COBOLFD__DATA_MANAGER:
            return dataManager != null && !dataManager.isEmpty();
        case CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING:
            return isSelfDescribing != IS_SELF_DESCRIBING_EDEFAULT;
        case CoboldataPackage.COBOLFD__RECORD_DELIMITER:
            return recordDelimiter != RECORD_DELIMITER_EDEFAULT;
        case CoboldataPackage.COBOLFD__SKIP_RECORDS:
            return skipRecords != SKIP_RECORDS_EDEFAULT;
        case CoboldataPackage.COBOLFD__RECORD:
            return record != null && !record.isEmpty();
        case CoboldataPackage.COBOLFD__ORGANIZATION:
            return organization != ORGANIZATION_EDEFAULT;
        case CoboldataPackage.COBOLFD__ACCESS_MODE:
            return accessMode != ACCESS_MODE_EDEFAULT;
        case CoboldataPackage.COBOLFD__IS_OPTIONAL:
            return isOptional != IS_OPTIONAL_EDEFAULT;
        case CoboldataPackage.COBOLFD__RESERVE_AREAS:
            return reserveAreas != RESERVE_AREAS_EDEFAULT;
        case CoboldataPackage.COBOLFD__ASSIGN_TO:
            return ASSIGN_TO_EDEFAULT == null ? assignTo != null : !ASSIGN_TO_EDEFAULT.equals(assignTo);
        case CoboldataPackage.COBOLFD__CODE_SET_LIT:
            return CODE_SET_LIT_EDEFAULT == null ? codeSetLit != null : !CODE_SET_LIT_EDEFAULT.equals(codeSetLit);
        case CoboldataPackage.COBOLFD__BLOCK_SIZE_UNIT:
            return blockSizeUnit != BLOCK_SIZE_UNIT_EDEFAULT;
        case CoboldataPackage.COBOLFD__MIN_BLOCKS:
            return minBlocks != MIN_BLOCKS_EDEFAULT;
        case CoboldataPackage.COBOLFD__MAX_BLOCKS:
            return maxBlocks != MAX_BLOCKS_EDEFAULT;
        case CoboldataPackage.COBOLFD__MIN_RECORDS:
            return minRecords != MIN_RECORDS_EDEFAULT;
        case CoboldataPackage.COBOLFD__MAX_RECORDS:
            return maxRecords != MAX_RECORDS_EDEFAULT;
        case CoboldataPackage.COBOLFD__LABEL_KIND:
            return labelKind != LABEL_KIND_EDEFAULT;
        case CoboldataPackage.COBOLFD__IS_EXTERNAL:
            return isExternal != IS_EXTERNAL_EDEFAULT;
        case CoboldataPackage.COBOLFD__IS_GLOBAL:
            return isGlobal != IS_GLOBAL_EDEFAULT;
        case CoboldataPackage.COBOLFD__PAD_LITERAL:
            return PAD_LITERAL_EDEFAULT == null ? padLiteral != null : !PAD_LITERAL_EDEFAULT.equals(padLiteral);
        case CoboldataPackage.COBOLFD__STATUS_ID:
            return statusID != null;
        case CoboldataPackage.COBOLFD__LINAGE_INFO:
            return linageInfo != null && !linageInfo.isEmpty();
        case CoboldataPackage.COBOLFD__FILE_SECTION:
            return getFileSection() != null;
        case CoboldataPackage.COBOLFD__DEPENDS_ON:
            return dependsOn != null;
        case CoboldataPackage.COBOLFD__PAD_FIELD:
            return padField != null;
        case CoboldataPackage.COBOLFD__RELATIVE_FIELD:
            return relativeField != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == orgomg.cwm.objectmodel.core.Package.class) {
            switch (derivedFeatureID) {
            case CoboldataPackage.COBOLFD__IMPORTED_ELEMENT:
                return CorePackage.PACKAGE__IMPORTED_ELEMENT;
            case CoboldataPackage.COBOLFD__DATA_MANAGER:
                return CorePackage.PACKAGE__DATA_MANAGER;
            default:
                return -1;
            }
        }
        if (baseClass == RecordFile.class) {
            switch (derivedFeatureID) {
            case CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING:
                return RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING;
            case CoboldataPackage.COBOLFD__RECORD_DELIMITER:
                return RecordPackage.RECORD_FILE__RECORD_DELIMITER;
            case CoboldataPackage.COBOLFD__SKIP_RECORDS:
                return RecordPackage.RECORD_FILE__SKIP_RECORDS;
            case CoboldataPackage.COBOLFD__RECORD:
                return RecordPackage.RECORD_FILE__RECORD;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == orgomg.cwm.objectmodel.core.Package.class) {
            switch (baseFeatureID) {
            case CorePackage.PACKAGE__IMPORTED_ELEMENT:
                return CoboldataPackage.COBOLFD__IMPORTED_ELEMENT;
            case CorePackage.PACKAGE__DATA_MANAGER:
                return CoboldataPackage.COBOLFD__DATA_MANAGER;
            default:
                return -1;
            }
        }
        if (baseClass == RecordFile.class) {
            switch (baseFeatureID) {
            case RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING:
                return CoboldataPackage.COBOLFD__IS_SELF_DESCRIBING;
            case RecordPackage.RECORD_FILE__RECORD_DELIMITER:
                return CoboldataPackage.COBOLFD__RECORD_DELIMITER;
            case RecordPackage.RECORD_FILE__SKIP_RECORDS:
                return CoboldataPackage.COBOLFD__SKIP_RECORDS;
            case RecordPackage.RECORD_FILE__RECORD:
                return CoboldataPackage.COBOLFD__RECORD;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isSelfDescribing: ");
        result.append(isSelfDescribing);
        result.append(", recordDelimiter: ");
        result.append(recordDelimiter);
        result.append(", skipRecords: ");
        result.append(skipRecords);
        result.append(", organization: ");
        result.append(organization);
        result.append(", accessMode: ");
        result.append(accessMode);
        result.append(", isOptional: ");
        result.append(isOptional);
        result.append(", reserveAreas: ");
        result.append(reserveAreas);
        result.append(", assignTo: ");
        result.append(assignTo);
        result.append(", codeSetLit: ");
        result.append(codeSetLit);
        result.append(", blockSizeUnit: ");
        result.append(blockSizeUnit);
        result.append(", minBlocks: ");
        result.append(minBlocks);
        result.append(", maxBlocks: ");
        result.append(maxBlocks);
        result.append(", minRecords: ");
        result.append(minRecords);
        result.append(", maxRecords: ");
        result.append(maxRecords);
        result.append(", labelKind: ");
        result.append(labelKind);
        result.append(", isExternal: ");
        result.append(isExternal);
        result.append(", isGlobal: ");
        result.append(isGlobal);
        result.append(", padLiteral: ");
        result.append(padLiteral);
        result.append(')');
        return result.toString();
    }

} // COBOLFDImpl
