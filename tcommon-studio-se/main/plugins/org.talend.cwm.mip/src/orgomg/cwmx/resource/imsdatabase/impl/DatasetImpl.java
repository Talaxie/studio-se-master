/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;
import orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType;
import orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ModelType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dataset</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getDd1name <em>Dd1name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getModel <em>Model</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getDd2name <em>Dd2name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getSize1 <em>Size1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getSize2 <em>Size2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getRecordLength1 <em>Record Length1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getRecordLength2 <em>Record Length2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getBlockingFactor1 <em>Blocking Factor1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getBlockingFactor2 <em>Blocking Factor2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getDatasetLabel <em>Dataset Label</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getFreeBlockFrequency <em>Free Block Frequency</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getFreeSpacePercentage <em>Free Space Percentage</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getRecordFormat <em>Record Format</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getScanCylinders <em>Scan Cylinders</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getSearchAlgorithm <em>Search Algorithm</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getRootOverflow <em>Root Overflow</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getUow <em>Uow</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getUowOverflow <em>Uow Overflow</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DatasetImpl#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatasetImpl extends ModelElementImpl implements Dataset {

    /**
     * The default value of the '{@link #getDd1name() <em>Dd1name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDd1name()
     * @generated
     * @ordered
     */
    protected static final String DD1NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDd1name() <em>Dd1name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDd1name()
     * @generated
     * @ordered
     */
    protected String dd1name = DD1NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDevice()
     * @generated
     * @ordered
     */
    protected static final DeviceType DEVICE_EDEFAULT = DeviceType.IMSDT_2305;

    /**
     * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDevice()
     * @generated
     * @ordered
     */
    protected DeviceType device = DEVICE_EDEFAULT;

    /**
     * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected static final ModelType MODEL_EDEFAULT = ModelType.IMSDT_1;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected ModelType model = MODEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDd2name() <em>Dd2name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDd2name()
     * @generated
     * @ordered
     */
    protected static final String DD2NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDd2name() <em>Dd2name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDd2name()
     * @generated
     * @ordered
     */
    protected String dd2name = DD2NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSize1() <em>Size1</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSize1()
     * @generated
     * @ordered
     */
    protected static final long SIZE1_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSize1() <em>Size1</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSize1()
     * @generated
     * @ordered
     */
    protected long size1 = SIZE1_EDEFAULT;

    /**
     * The default value of the '{@link #getSize2() <em>Size2</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSize2()
     * @generated
     * @ordered
     */
    protected static final long SIZE2_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSize2() <em>Size2</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSize2()
     * @generated
     * @ordered
     */
    protected long size2 = SIZE2_EDEFAULT;

    /**
     * The default value of the '{@link #getRecordLength1() <em>Record Length1</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordLength1()
     * @generated
     * @ordered
     */
    protected static final long RECORD_LENGTH1_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRecordLength1() <em>Record Length1</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordLength1()
     * @generated
     * @ordered
     */
    protected long recordLength1 = RECORD_LENGTH1_EDEFAULT;

    /**
     * The default value of the '{@link #getRecordLength2() <em>Record Length2</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordLength2()
     * @generated
     * @ordered
     */
    protected static final long RECORD_LENGTH2_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRecordLength2() <em>Record Length2</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordLength2()
     * @generated
     * @ordered
     */
    protected long recordLength2 = RECORD_LENGTH2_EDEFAULT;

    /**
     * The default value of the '{@link #getBlockingFactor1() <em>Blocking Factor1</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlockingFactor1()
     * @generated
     * @ordered
     */
    protected static final long BLOCKING_FACTOR1_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getBlockingFactor1() <em>Blocking Factor1</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlockingFactor1()
     * @generated
     * @ordered
     */
    protected long blockingFactor1 = BLOCKING_FACTOR1_EDEFAULT;

    /**
     * The default value of the '{@link #getBlockingFactor2() <em>Blocking Factor2</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlockingFactor2()
     * @generated
     * @ordered
     */
    protected static final long BLOCKING_FACTOR2_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getBlockingFactor2() <em>Blocking Factor2</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBlockingFactor2()
     * @generated
     * @ordered
     */
    protected long blockingFactor2 = BLOCKING_FACTOR2_EDEFAULT;

    /**
     * The default value of the '{@link #getDatasetLabel() <em>Dataset Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDatasetLabel()
     * @generated
     * @ordered
     */
    protected static final String DATASET_LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDatasetLabel() <em>Dataset Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDatasetLabel()
     * @generated
     * @ordered
     */
    protected String datasetLabel = DATASET_LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getFreeBlockFrequency() <em>Free Block Frequency</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFreeBlockFrequency()
     * @generated
     * @ordered
     */
    protected static final long FREE_BLOCK_FREQUENCY_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getFreeBlockFrequency() <em>Free Block Frequency</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFreeBlockFrequency()
     * @generated
     * @ordered
     */
    protected long freeBlockFrequency = FREE_BLOCK_FREQUENCY_EDEFAULT;

    /**
     * The default value of the '{@link #getFreeSpacePercentage() <em>Free Space Percentage</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFreeSpacePercentage()
     * @generated
     * @ordered
     */
    protected static final long FREE_SPACE_PERCENTAGE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getFreeSpacePercentage() <em>Free Space Percentage</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFreeSpacePercentage()
     * @generated
     * @ordered
     */
    protected long freeSpacePercentage = FREE_SPACE_PERCENTAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getRecordFormat() <em>Record Format</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordFormat()
     * @generated
     * @ordered
     */
    protected static final RECFMType RECORD_FORMAT_EDEFAULT = RECFMType.IMSRF_F;

    /**
     * The cached value of the '{@link #getRecordFormat() <em>Record Format</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRecordFormat()
     * @generated
     * @ordered
     */
    protected RECFMType recordFormat = RECORD_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getScanCylinders() <em>Scan Cylinders</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getScanCylinders()
     * @generated
     * @ordered
     */
    protected static final long SCAN_CYLINDERS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getScanCylinders() <em>Scan Cylinders</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getScanCylinders()
     * @generated
     * @ordered
     */
    protected long scanCylinders = SCAN_CYLINDERS_EDEFAULT;

    /**
     * The default value of the '{@link #getSearchAlgorithm() <em>Search Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSearchAlgorithm()
     * @generated
     * @ordered
     */
    protected static final AlgorithmType SEARCH_ALGORITHM_EDEFAULT = AlgorithmType.IMSAT_0;

    /**
     * The cached value of the '{@link #getSearchAlgorithm() <em>Search Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSearchAlgorithm()
     * @generated
     * @ordered
     */
    protected AlgorithmType searchAlgorithm = SEARCH_ALGORITHM_EDEFAULT;

    /**
     * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected static final long ROOT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected long root = ROOT_EDEFAULT;

    /**
     * The default value of the '{@link #getRootOverflow() <em>Root Overflow</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRootOverflow()
     * @generated
     * @ordered
     */
    protected static final long ROOT_OVERFLOW_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRootOverflow() <em>Root Overflow</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRootOverflow()
     * @generated
     * @ordered
     */
    protected long rootOverflow = ROOT_OVERFLOW_EDEFAULT;

    /**
     * The default value of the '{@link #getUow() <em>Uow</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUow()
     * @generated
     * @ordered
     */
    protected static final long UOW_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getUow() <em>Uow</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUow()
     * @generated
     * @ordered
     */
    protected long uow = UOW_EDEFAULT;

    /**
     * The default value of the '{@link #getUowOverflow() <em>Uow Overflow</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUowOverflow()
     * @generated
     * @ordered
     */
    protected static final long UOW_OVERFLOW_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getUowOverflow() <em>Uow Overflow</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUowOverflow()
     * @generated
     * @ordered
     */
    protected long uowOverflow = UOW_OVERFLOW_EDEFAULT;

    /**
     * The cached value of the '{@link #getSegment() <em>Segment</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSegment()
     * @generated
     * @ordered
     */
    protected EList<SegmentComplex> segment;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DatasetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.DATASET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDd1name() {
        return dd1name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDd1name(String newDd1name) {
        String oldDd1name = dd1name;
        dd1name = newDd1name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__DD1NAME, oldDd1name, dd1name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDevice(DeviceType newDevice) {
        DeviceType oldDevice = device;
        device = newDevice == null ? DEVICE_EDEFAULT : newDevice;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__DEVICE, oldDevice, device));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModelType getModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ModelType newModel) {
        ModelType oldModel = model;
        model = newModel == null ? MODEL_EDEFAULT : newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDd2name() {
        return dd2name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDd2name(String newDd2name) {
        String oldDd2name = dd2name;
        dd2name = newDd2name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__DD2NAME, oldDd2name, dd2name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getSize1() {
        return size1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSize1(long newSize1) {
        long oldSize1 = size1;
        size1 = newSize1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__SIZE1, oldSize1, size1));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getSize2() {
        return size2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSize2(long newSize2) {
        long oldSize2 = size2;
        size2 = newSize2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__SIZE2, oldSize2, size2));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRecordLength1() {
        return recordLength1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRecordLength1(long newRecordLength1) {
        long oldRecordLength1 = recordLength1;
        recordLength1 = newRecordLength1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__RECORD_LENGTH1, oldRecordLength1,
                    recordLength1));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRecordLength2() {
        return recordLength2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRecordLength2(long newRecordLength2) {
        long oldRecordLength2 = recordLength2;
        recordLength2 = newRecordLength2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__RECORD_LENGTH2, oldRecordLength2,
                    recordLength2));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getBlockingFactor1() {
        return blockingFactor1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBlockingFactor1(long newBlockingFactor1) {
        long oldBlockingFactor1 = blockingFactor1;
        blockingFactor1 = newBlockingFactor1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__BLOCKING_FACTOR1,
                    oldBlockingFactor1, blockingFactor1));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getBlockingFactor2() {
        return blockingFactor2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBlockingFactor2(long newBlockingFactor2) {
        long oldBlockingFactor2 = blockingFactor2;
        blockingFactor2 = newBlockingFactor2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__BLOCKING_FACTOR2,
                    oldBlockingFactor2, blockingFactor2));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDatasetLabel() {
        return datasetLabel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDatasetLabel(String newDatasetLabel) {
        String oldDatasetLabel = datasetLabel;
        datasetLabel = newDatasetLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__DATASET_LABEL, oldDatasetLabel,
                    datasetLabel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getFreeBlockFrequency() {
        return freeBlockFrequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFreeBlockFrequency(long newFreeBlockFrequency) {
        long oldFreeBlockFrequency = freeBlockFrequency;
        freeBlockFrequency = newFreeBlockFrequency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__FREE_BLOCK_FREQUENCY,
                    oldFreeBlockFrequency, freeBlockFrequency));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getFreeSpacePercentage() {
        return freeSpacePercentage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFreeSpacePercentage(long newFreeSpacePercentage) {
        long oldFreeSpacePercentage = freeSpacePercentage;
        freeSpacePercentage = newFreeSpacePercentage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__FREE_SPACE_PERCENTAGE,
                    oldFreeSpacePercentage, freeSpacePercentage));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RECFMType getRecordFormat() {
        return recordFormat;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRecordFormat(RECFMType newRecordFormat) {
        RECFMType oldRecordFormat = recordFormat;
        recordFormat = newRecordFormat == null ? RECORD_FORMAT_EDEFAULT : newRecordFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__RECORD_FORMAT, oldRecordFormat,
                    recordFormat));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getScanCylinders() {
        return scanCylinders;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setScanCylinders(long newScanCylinders) {
        long oldScanCylinders = scanCylinders;
        scanCylinders = newScanCylinders;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__SCAN_CYLINDERS, oldScanCylinders,
                    scanCylinders));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AlgorithmType getSearchAlgorithm() {
        return searchAlgorithm;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSearchAlgorithm(AlgorithmType newSearchAlgorithm) {
        AlgorithmType oldSearchAlgorithm = searchAlgorithm;
        searchAlgorithm = newSearchAlgorithm == null ? SEARCH_ALGORITHM_EDEFAULT : newSearchAlgorithm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__SEARCH_ALGORITHM,
                    oldSearchAlgorithm, searchAlgorithm));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRoot() {
        return root;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRoot(long newRoot) {
        long oldRoot = root;
        root = newRoot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__ROOT, oldRoot, root));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRootOverflow() {
        return rootOverflow;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRootOverflow(long newRootOverflow) {
        long oldRootOverflow = rootOverflow;
        rootOverflow = newRootOverflow;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__ROOT_OVERFLOW, oldRootOverflow,
                    rootOverflow));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getUow() {
        return uow;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUow(long newUow) {
        long oldUow = uow;
        uow = newUow;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__UOW, oldUow, uow));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getUowOverflow() {
        return uowOverflow;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUowOverflow(long newUowOverflow) {
        long oldUowOverflow = uowOverflow;
        uowOverflow = newUowOverflow;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__UOW_OVERFLOW, oldUowOverflow,
                    uowOverflow));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBD getDbd() {
        if (eContainerFeatureID() != ImsdatabasePackage.DATASET__DBD)
            return null;
        return (DBD) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDbd(DBD newDbd, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDbd, ImsdatabasePackage.DATASET__DBD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDbd(DBD newDbd) {
        if (newDbd != eInternalContainer() || (eContainerFeatureID() != ImsdatabasePackage.DATASET__DBD && newDbd != null)) {
            if (EcoreUtil.isAncestor(this, newDbd))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDbd != null)
                msgs = ((InternalEObject) newDbd).eInverseAdd(this, ImsdatabasePackage.DBD__DATASET, DBD.class, msgs);
            msgs = basicSetDbd(newDbd, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DATASET__DBD, newDbd, newDbd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SegmentComplex> getSegment() {
        if (segment == null) {
            segment = new EObjectWithInverseResolvingEList<SegmentComplex>(SegmentComplex.class, this,
                    ImsdatabasePackage.DATASET__SEGMENT, ImsdatabasePackage.SEGMENT_COMPLEX__DATASET);
        }
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.DATASET__DBD:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDbd((DBD) otherEnd, msgs);
        case ImsdatabasePackage.DATASET__SEGMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSegment()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.DATASET__DBD:
            return basicSetDbd(null, msgs);
        case ImsdatabasePackage.DATASET__SEGMENT:
            return ((InternalEList<?>) getSegment()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.DATASET__DBD:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.DBD__DATASET, DBD.class, msgs);
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
        case ImsdatabasePackage.DATASET__DD1NAME:
            return getDd1name();
        case ImsdatabasePackage.DATASET__DEVICE:
            return getDevice();
        case ImsdatabasePackage.DATASET__MODEL:
            return getModel();
        case ImsdatabasePackage.DATASET__DD2NAME:
            return getDd2name();
        case ImsdatabasePackage.DATASET__SIZE1:
            return getSize1();
        case ImsdatabasePackage.DATASET__SIZE2:
            return getSize2();
        case ImsdatabasePackage.DATASET__RECORD_LENGTH1:
            return getRecordLength1();
        case ImsdatabasePackage.DATASET__RECORD_LENGTH2:
            return getRecordLength2();
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR1:
            return getBlockingFactor1();
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR2:
            return getBlockingFactor2();
        case ImsdatabasePackage.DATASET__DATASET_LABEL:
            return getDatasetLabel();
        case ImsdatabasePackage.DATASET__FREE_BLOCK_FREQUENCY:
            return getFreeBlockFrequency();
        case ImsdatabasePackage.DATASET__FREE_SPACE_PERCENTAGE:
            return getFreeSpacePercentage();
        case ImsdatabasePackage.DATASET__RECORD_FORMAT:
            return getRecordFormat();
        case ImsdatabasePackage.DATASET__SCAN_CYLINDERS:
            return getScanCylinders();
        case ImsdatabasePackage.DATASET__SEARCH_ALGORITHM:
            return getSearchAlgorithm();
        case ImsdatabasePackage.DATASET__ROOT:
            return getRoot();
        case ImsdatabasePackage.DATASET__ROOT_OVERFLOW:
            return getRootOverflow();
        case ImsdatabasePackage.DATASET__UOW:
            return getUow();
        case ImsdatabasePackage.DATASET__UOW_OVERFLOW:
            return getUowOverflow();
        case ImsdatabasePackage.DATASET__DBD:
            return getDbd();
        case ImsdatabasePackage.DATASET__SEGMENT:
            return getSegment();
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
        case ImsdatabasePackage.DATASET__DD1NAME:
            setDd1name((String) newValue);
            return;
        case ImsdatabasePackage.DATASET__DEVICE:
            setDevice((DeviceType) newValue);
            return;
        case ImsdatabasePackage.DATASET__MODEL:
            setModel((ModelType) newValue);
            return;
        case ImsdatabasePackage.DATASET__DD2NAME:
            setDd2name((String) newValue);
            return;
        case ImsdatabasePackage.DATASET__SIZE1:
            setSize1((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__SIZE2:
            setSize2((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__RECORD_LENGTH1:
            setRecordLength1((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__RECORD_LENGTH2:
            setRecordLength2((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR1:
            setBlockingFactor1((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR2:
            setBlockingFactor2((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__DATASET_LABEL:
            setDatasetLabel((String) newValue);
            return;
        case ImsdatabasePackage.DATASET__FREE_BLOCK_FREQUENCY:
            setFreeBlockFrequency((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__FREE_SPACE_PERCENTAGE:
            setFreeSpacePercentage((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__RECORD_FORMAT:
            setRecordFormat((RECFMType) newValue);
            return;
        case ImsdatabasePackage.DATASET__SCAN_CYLINDERS:
            setScanCylinders((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__SEARCH_ALGORITHM:
            setSearchAlgorithm((AlgorithmType) newValue);
            return;
        case ImsdatabasePackage.DATASET__ROOT:
            setRoot((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__ROOT_OVERFLOW:
            setRootOverflow((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__UOW:
            setUow((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__UOW_OVERFLOW:
            setUowOverflow((Long) newValue);
            return;
        case ImsdatabasePackage.DATASET__DBD:
            setDbd((DBD) newValue);
            return;
        case ImsdatabasePackage.DATASET__SEGMENT:
            getSegment().clear();
            getSegment().addAll((Collection<? extends SegmentComplex>) newValue);
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
        case ImsdatabasePackage.DATASET__DD1NAME:
            setDd1name(DD1NAME_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__DEVICE:
            setDevice(DEVICE_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__MODEL:
            setModel(MODEL_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__DD2NAME:
            setDd2name(DD2NAME_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__SIZE1:
            setSize1(SIZE1_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__SIZE2:
            setSize2(SIZE2_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__RECORD_LENGTH1:
            setRecordLength1(RECORD_LENGTH1_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__RECORD_LENGTH2:
            setRecordLength2(RECORD_LENGTH2_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR1:
            setBlockingFactor1(BLOCKING_FACTOR1_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR2:
            setBlockingFactor2(BLOCKING_FACTOR2_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__DATASET_LABEL:
            setDatasetLabel(DATASET_LABEL_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__FREE_BLOCK_FREQUENCY:
            setFreeBlockFrequency(FREE_BLOCK_FREQUENCY_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__FREE_SPACE_PERCENTAGE:
            setFreeSpacePercentage(FREE_SPACE_PERCENTAGE_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__RECORD_FORMAT:
            setRecordFormat(RECORD_FORMAT_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__SCAN_CYLINDERS:
            setScanCylinders(SCAN_CYLINDERS_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__SEARCH_ALGORITHM:
            setSearchAlgorithm(SEARCH_ALGORITHM_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__ROOT:
            setRoot(ROOT_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__ROOT_OVERFLOW:
            setRootOverflow(ROOT_OVERFLOW_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__UOW:
            setUow(UOW_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__UOW_OVERFLOW:
            setUowOverflow(UOW_OVERFLOW_EDEFAULT);
            return;
        case ImsdatabasePackage.DATASET__DBD:
            setDbd((DBD) null);
            return;
        case ImsdatabasePackage.DATASET__SEGMENT:
            getSegment().clear();
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
        case ImsdatabasePackage.DATASET__DD1NAME:
            return DD1NAME_EDEFAULT == null ? dd1name != null : !DD1NAME_EDEFAULT.equals(dd1name);
        case ImsdatabasePackage.DATASET__DEVICE:
            return device != DEVICE_EDEFAULT;
        case ImsdatabasePackage.DATASET__MODEL:
            return model != MODEL_EDEFAULT;
        case ImsdatabasePackage.DATASET__DD2NAME:
            return DD2NAME_EDEFAULT == null ? dd2name != null : !DD2NAME_EDEFAULT.equals(dd2name);
        case ImsdatabasePackage.DATASET__SIZE1:
            return size1 != SIZE1_EDEFAULT;
        case ImsdatabasePackage.DATASET__SIZE2:
            return size2 != SIZE2_EDEFAULT;
        case ImsdatabasePackage.DATASET__RECORD_LENGTH1:
            return recordLength1 != RECORD_LENGTH1_EDEFAULT;
        case ImsdatabasePackage.DATASET__RECORD_LENGTH2:
            return recordLength2 != RECORD_LENGTH2_EDEFAULT;
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR1:
            return blockingFactor1 != BLOCKING_FACTOR1_EDEFAULT;
        case ImsdatabasePackage.DATASET__BLOCKING_FACTOR2:
            return blockingFactor2 != BLOCKING_FACTOR2_EDEFAULT;
        case ImsdatabasePackage.DATASET__DATASET_LABEL:
            return DATASET_LABEL_EDEFAULT == null ? datasetLabel != null : !DATASET_LABEL_EDEFAULT.equals(datasetLabel);
        case ImsdatabasePackage.DATASET__FREE_BLOCK_FREQUENCY:
            return freeBlockFrequency != FREE_BLOCK_FREQUENCY_EDEFAULT;
        case ImsdatabasePackage.DATASET__FREE_SPACE_PERCENTAGE:
            return freeSpacePercentage != FREE_SPACE_PERCENTAGE_EDEFAULT;
        case ImsdatabasePackage.DATASET__RECORD_FORMAT:
            return recordFormat != RECORD_FORMAT_EDEFAULT;
        case ImsdatabasePackage.DATASET__SCAN_CYLINDERS:
            return scanCylinders != SCAN_CYLINDERS_EDEFAULT;
        case ImsdatabasePackage.DATASET__SEARCH_ALGORITHM:
            return searchAlgorithm != SEARCH_ALGORITHM_EDEFAULT;
        case ImsdatabasePackage.DATASET__ROOT:
            return root != ROOT_EDEFAULT;
        case ImsdatabasePackage.DATASET__ROOT_OVERFLOW:
            return rootOverflow != ROOT_OVERFLOW_EDEFAULT;
        case ImsdatabasePackage.DATASET__UOW:
            return uow != UOW_EDEFAULT;
        case ImsdatabasePackage.DATASET__UOW_OVERFLOW:
            return uowOverflow != UOW_OVERFLOW_EDEFAULT;
        case ImsdatabasePackage.DATASET__DBD:
            return getDbd() != null;
        case ImsdatabasePackage.DATASET__SEGMENT:
            return segment != null && !segment.isEmpty();
        }
        return super.eIsSet(featureID);
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
        result.append(" (dd1name: ");
        result.append(dd1name);
        result.append(", device: ");
        result.append(device);
        result.append(", model: ");
        result.append(model);
        result.append(", dd2name: ");
        result.append(dd2name);
        result.append(", size1: ");
        result.append(size1);
        result.append(", size2: ");
        result.append(size2);
        result.append(", recordLength1: ");
        result.append(recordLength1);
        result.append(", recordLength2: ");
        result.append(recordLength2);
        result.append(", blockingFactor1: ");
        result.append(blockingFactor1);
        result.append(", blockingFactor2: ");
        result.append(blockingFactor2);
        result.append(", datasetLabel: ");
        result.append(datasetLabel);
        result.append(", freeBlockFrequency: ");
        result.append(freeBlockFrequency);
        result.append(", freeSpacePercentage: ");
        result.append(freeSpacePercentage);
        result.append(", recordFormat: ");
        result.append(recordFormat);
        result.append(", scanCylinders: ");
        result.append(scanCylinders);
        result.append(", searchAlgorithm: ");
        result.append(searchAlgorithm);
        result.append(", root: ");
        result.append(root);
        result.append(", rootOverflow: ");
        result.append(rootOverflow);
        result.append(", uow: ");
        result.append(uow);
        result.append(", uowOverflow: ");
        result.append(uowOverflow);
        result.append(')');
        return result.toString();
    }

} // DatasetImpl
