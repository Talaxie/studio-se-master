/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType;
import orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ModelType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Dataset</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this object type are used to hold attributes for the DATASET and AREA macro statements.
 * 
 * DATASET and AREA macro statements describe the physical storage of the DBD in MVS datasets that are connected to an application by use of DD Statements in the JCL.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDd1name <em>Dd1name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDevice <em>Device</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getModel <em>Model</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDd2name <em>Dd2name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSize1 <em>Size1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSize2 <em>Size2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength1 <em>Record Length1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength2 <em>Record Length2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor1 <em>Blocking Factor1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor2 <em>Blocking Factor2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDatasetLabel <em>Dataset Label</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getFreeBlockFrequency <em>Free Block Frequency</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getFreeSpacePercentage <em>Free Space Percentage</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordFormat <em>Record Format</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getScanCylinders <em>Scan Cylinders</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSearchAlgorithm <em>Search Algorithm</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRoot <em>Root</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRootOverflow <em>Root Overflow</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getUow <em>Uow</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getUowOverflow <em>Uow Overflow</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends ModelElement {

    /**
     * Returns the value of the '<em><b>Dd1name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Name of
     * the primary or input dataset <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dd1name</em>' attribute.
     * @see #setDd1name(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Dd1name()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDd1name();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getDd1name
     * <em>Dd1name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Dd1name</em>' attribute.
     * @see #getDd1name()
     * @generated
     */
    void setDd1name(String value);

    /**
     * Returns the value of the '<em><b>Device</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is the DEVICE specified on the DATASET statement. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Device</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType
     * @see #setDevice(DeviceType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Device()
     * @model
     * @generated
     */
    DeviceType getDevice();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getDevice
     * <em>Device</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Device</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType
     * @see #getDevice()
     * @generated
     */
    void setDevice(DeviceType value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.ModelType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the model part of the DEVICE attribute on the DATASET
     * statement. The value is not relevant for most device types. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Model</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ModelType
     * @see #setModel(ModelType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Model()
     * @model
     * @generated
     */
    ModelType getModel();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getModel <em>Model</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ModelType
     * @see #getModel()
     * @generated
     */
    void setModel(ModelType value);

    /**
     * Returns the value of the '<em><b>Dd2name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Name of
     * overflow or output dataset. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dd2name</em>' attribute.
     * @see #setDd2name(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Dd2name()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDd2name();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getDd2name
     * <em>Dd2name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Dd2name</em>' attribute.
     * @see #getDd2name()
     * @generated
     */
    void setDd2name(String value);

    /**
     * Returns the value of the '<em><b>Size1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Size of
     * area or primary or input dataset. For DEDB databases, valid values are:
     * 512, 1024, 2048, 4096, 8192, 12288, 16384, 20480, 24576, 28672, and the
     * Default value is 4096 <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Size1</em>' attribute.
     * @see #setSize1(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Size1()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getSize1();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSize1 <em>Size1</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Size1</em>' attribute.
     * @see #getSize1()
     * @generated
     */
    void setSize1(long value);

    /**
     * Returns the value of the '<em><b>Size2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Size of
     * overflow or output dataset <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Size2</em>' attribute.
     * @see #setSize2(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Size2()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getSize2();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSize2 <em>Size2</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Size2</em>' attribute.
     * @see #getSize2()
     * @generated
     */
    void setSize2(long value);

    /**
     * Returns the value of the '<em><b>Record Length1</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Record
     * length in primary or input dataset. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Record Length1</em>' attribute.
     * @see #setRecordLength1(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_RecordLength1()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRecordLength1();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength1 <em>Record Length1</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Record Length1</em>' attribute.
     * @see #getRecordLength1()
     * @generated
     */
    void setRecordLength1(long value);

    /**
     * Returns the value of the '<em><b>Record Length2</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Record
     * length in primary or input dataset. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Record Length2</em>' attribute.
     * @see #setRecordLength2(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_RecordLength2()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRecordLength2();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordLength2 <em>Record Length2</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Record Length2</em>' attribute.
     * @see #getRecordLength2()
     * @generated
     */
    void setRecordLength2(long value);

    /**
     * Returns the value of the '<em><b>Blocking Factor1</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Blocking factor in primary or input dataset <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Blocking Factor1</em>' attribute.
     * @see #setBlockingFactor1(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_BlockingFactor1()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getBlockingFactor1();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor1 <em>Blocking Factor1</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Blocking Factor1</em>' attribute.
     * @see #getBlockingFactor1()
     * @generated
     */
    void setBlockingFactor1(long value);

    /**
     * Returns the value of the '<em><b>Blocking Factor2</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Blocking factor in overflow or output dataset. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Blocking Factor2</em>' attribute.
     * @see #setBlockingFactor2(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_BlockingFactor2()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getBlockingFactor2();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getBlockingFactor2 <em>Blocking Factor2</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Blocking Factor2</em>' attribute.
     * @see #getBlockingFactor2()
     * @generated
     */
    void setBlockingFactor2(long value);

    /**
     * Returns the value of the '<em><b>Dataset Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a label used for reverse referencing of datasets in a
     * HDAM or HIDAM database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dataset Label</em>' attribute.
     * @see #setDatasetLabel(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_DatasetLabel()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDatasetLabel();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDatasetLabel <em>Dataset Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Dataset Label</em>' attribute.
     * @see #getDatasetLabel()
     * @generated
     */
    void setDatasetLabel(String value);

    /**
     * Returns the value of the '<em><b>Free Block Frequency</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> This attribute describes the frequency of free blocks
     * in the initial dataset layout. Valid Values are 0, 2-100, null <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Free Block Frequency</em>' attribute.
     * @see #setFreeBlockFrequency(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_FreeBlockFrequency()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getFreeBlockFrequency();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getFreeBlockFrequency <em>Free Block Frequency</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Free Block Frequency</em>' attribute.
     * @see #getFreeBlockFrequency()
     * @generated
     */
    void setFreeBlockFrequency(long value);

    /**
     * Returns the value of the '<em><b>Free Space Percentage</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> This attribute describes the percentage of free space
     * in the initial dataset layout. Valid Values are 0-99, null <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Free Space Percentage</em>' attribute.
     * @see #setFreeSpacePercentage(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_FreeSpacePercentage()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getFreeSpacePercentage();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getFreeSpacePercentage <em>Free Space Percentage</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Free Space Percentage</em>' attribute.
     * @see #getFreeSpacePercentage()
     * @generated
     */
    void setFreeSpacePercentage(long value);

    /**
     * Returns the value of the '<em><b>Record Format</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute describes the record format for a GSAM database. Valid Values
     * are F, FB, V, VB, U, null <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Record Format</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType
     * @see #setRecordFormat(RECFMType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_RecordFormat()
     * @model
     * @generated
     */
    RECFMType getRecordFormat();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRecordFormat <em>Record Format</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Record Format</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType
     * @see #getRecordFormat()
     * @generated
     */
    void setRecordFormat(RECFMType value);

    /**
     * Returns the value of the '<em><b>Scan Cylinders</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute describes the number of cylinders to be scanned to find space
     * for new data. Valid values are 0-255 <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Scan Cylinders</em>' attribute.
     * @see #setScanCylinders(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_ScanCylinders()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getScanCylinders();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getScanCylinders <em>Scan Cylinders</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Scan Cylinders</em>' attribute.
     * @see #getScanCylinders()
     * @generated
     */
    void setScanCylinders(long value);

    /**
     * Returns the value of the '<em><b>Search Algorithm</b></em>' attribute.
     * The literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies where should IMS look for space in which to put new
     * data. Valid Values are 0, 1, 2, null <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Search Algorithm</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType
     * @see #setSearchAlgorithm(AlgorithmType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_SearchAlgorithm()
     * @model
     * @generated
     */
    AlgorithmType getSearchAlgorithm();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getSearchAlgorithm <em>Search Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Search Algorithm</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType
     * @see #getSearchAlgorithm()
     * @generated
     */
    void setSearchAlgorithm(AlgorithmType value);

    /**
     * Returns the value of the '<em><b>Root</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds total space allocated to the root addressable part of the
     * AREA in terms of UOWs. A value of 0 represents a null value. Valid Values
     * are 0 or 2-32767 <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Root</em>' attribute.
     * @see #setRoot(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Root()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRoot();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRoot <em>Root</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Root</em>' attribute.
     * @see #getRoot()
     * @generated
     */
    void setRoot(long value);

    /**
     * Returns the value of the '<em><b>Root Overflow</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the amount of space reserved for independent overflow in
     * terms of units of work. A value of 0 represents a null value. Valid
     * values are 0 or 1-32767.
     * 
     * Constraints:
     * 
     * root and rootOverflow must be specified together. The value in
     * rootOverflow must be less than the value in root. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Root Overflow</em>' attribute.
     * @see #setRootOverflow(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_RootOverflow()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getRootOverflow();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getRootOverflow <em>Root Overflow</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Root Overflow</em>' attribute.
     * @see #getRootOverflow()
     * @generated
     */
    void setRootOverflow(long value);

    /**
     * Returns the value of the '<em><b>Uow</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the number of control intervals in a unit of work. A
     * value of 0 represents a null value. Valid values: 0 or 2-32767 <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Uow</em>' attribute.
     * @see #setUow(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Uow()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getUow();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getUow <em>Uow</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Uow</em>' attribute.
     * @see #getUow()
     * @generated
     */
    void setUow(long value);

    /**
     * Returns the value of the '<em><b>Uow Overflow</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the number of control intervals in overflow section of a
     * unit of work. A value of 0 represents a null value. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Uow Overflow</em>' attribute.
     * @see #setUowOverflow(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_UowOverflow()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getUowOverflow();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getUowOverflow <em>Uow Overflow</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Uow Overflow</em>' attribute.
     * @see #getUowOverflow()
     * @generated
     */
    void setUowOverflow(long value);

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getDataset <em>Dataset</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The DBD instance that owns this Dataset instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dbd</em>' container reference.
     * @see #setDbd(DBD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getDataset
     * @model opposite="dataset" required="true"
     * @generated
     */
    DBD getDbd();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDbd <em>Dbd</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Dbd</em>' container reference.
     * @see #getDbd()
     * @generated
     */
    void setDbd(DBD value);

    /**
     * Returns the value of the '<em><b>Segment</b></em>' reference list. The
     * list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDataset
     * <em>Dataset</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Segment whose physical data is stored in the physical
     * dataset represented by the DATASET statement. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Segment</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDataset_Segment()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDataset
     * @model opposite="dataset"
     * @generated
     */
    EList<SegmentComplex> getSegment();

} // Dataset
