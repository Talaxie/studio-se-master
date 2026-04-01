/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.RecordFile;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>COBOLFD</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents COBOL FD definitions. FDs describe files that are used in COBOL programs. 
 * 
 * The size of COBOLFD records may vary within a range bounded by the contents of the minRecords and maxRecords attributes and with a current size given by the field identified by the dependsOn reference. Two attributes and a reference are used to represent the necessary information. To illustrate the roles they play, the names of the attributes and the reference are substituted into the following COBOL syntax fragment:
 * 
 *    RECORD IS VARYING FROM minRecords TO maxRecords DEPENDING ON dependsOn
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getOrganization <em>Organization</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getReserveAreas <em>Reserve Areas</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getCodeSetLit <em>Code Set Lit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getBlockSizeUnit <em>Block Size Unit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMinBlocks <em>Min Blocks</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMaxBlocks <em>Max Blocks</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMinRecords <em>Min Records</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMaxRecords <em>Max Records</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getLabelKind <em>Label Kind</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadLiteral <em>Pad Literal</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getStatusID <em>Status ID</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getLinageInfo <em>Linage Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getFileSection <em>File Section</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadField <em>Pad Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFD#getRelativeField <em>Relative Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD()
 * @model
 * @generated
 */
public interface COBOLFD extends orgomg.cwm.objectmodel.core.Class, RecordFile {

    /**
     * Returns the value of the '<em><b>Organization</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.coboldata.FileOrganization}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the physical organization of the file. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Organization</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.FileOrganization
     * @see #setOrganization(FileOrganization)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_Organization()
     * @model
     * @generated
     */
    FileOrganization getOrganization();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getOrganization <em>Organization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Organization</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.FileOrganization
     * @see #getOrganization()
     * @generated
     */
    void setOrganization(FileOrganization value);

    /**
     * Returns the value of the '<em><b>Access Mode</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.coboldata.AccessType}. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> Contains the access
     * mode of the file. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Access Mode</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.AccessType
     * @see #setAccessMode(AccessType)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_AccessMode()
     * @model
     * @generated
     */
    AccessType getAccessMode();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getAccessMode <em>Access Mode</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Access Mode</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.AccessType
     * @see #getAccessMode()
     * @generated
     */
    void setAccessMode(AccessType value);

    /**
     * Returns the value of the '<em><b>Is Optional</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the file is optional at runtime. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Optional</em>' attribute.
     * @see #setIsOptional(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_IsOptional()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsOptional();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsOptional <em>Is Optional</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Optional</em>' attribute.
     * @see #isIsOptional()
     * @generated
     */
    void setIsOptional(boolean value);

    /**
     * Returns the value of the '<em><b>Reserve Areas</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the number of buffer areas reserved for the file. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Reserve Areas</em>' attribute.
     * @see #setReserveAreas(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_ReserveAreas()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getReserveAreas();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getReserveAreas <em>Reserve Areas</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Reserve Areas</em>' attribute.
     * @see #getReserveAreas()
     * @generated
     */
    void setReserveAreas(long value);

    /**
     * Returns the value of the '<em><b>Assign To</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the name of the storage medium the file is assigned to. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Assign To</em>' attribute.
     * @see #setAssignTo(String)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_AssignTo()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getAssignTo();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#getAssignTo
     * <em>Assign To</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Assign To</em>' attribute.
     * @see #getAssignTo()
     * @generated
     */
    void setAssignTo(String value);

    /**
     * Returns the value of the '<em><b>Code Set Lit</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the name of the code set. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Code Set Lit</em>' attribute.
     * @see #setCodeSetLit(String)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_CodeSetLit()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getCodeSetLit();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getCodeSetLit <em>Code Set Lit</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Code Set Lit</em>' attribute.
     * @see #getCodeSetLit()
     * @generated
     */
    void setCodeSetLit(String value);

    /**
     * Returns the value of the '<em><b>Block Size Unit</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.coboldata.BlockKind}. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Contains the unit type for
     * the contents of the minBlocks and maxBlocks fields. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Block Size Unit</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.BlockKind
     * @see #setBlockSizeUnit(BlockKind)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_BlockSizeUnit()
     * @model
     * @generated
     */
    BlockKind getBlockSizeUnit();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getBlockSizeUnit <em>Block Size Unit</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Block Size Unit</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.BlockKind
     * @see #getBlockSizeUnit()
     * @generated
     */
    void setBlockSizeUnit(BlockKind value);

    /**
     * Returns the value of the '<em><b>Min Blocks</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the minimum number of <units> per block, where <unit> is
     * specified by the blockSizeUnit attribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Min Blocks</em>' attribute.
     * @see #setMinBlocks(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_MinBlocks()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMinBlocks();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMinBlocks <em>Min Blocks</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Min Blocks</em>' attribute.
     * @see #getMinBlocks()
     * @generated
     */
    void setMinBlocks(long value);

    /**
     * Returns the value of the '<em><b>Max Blocks</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the maximum number of <units> per block, where <unit> is
     * specified by the blockSizeUnit attribute. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Max Blocks</em>' attribute.
     * @see #setMaxBlocks(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_MaxBlocks()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMaxBlocks();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMaxBlocks <em>Max Blocks</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Max Blocks</em>' attribute.
     * @see #getMaxBlocks()
     * @generated
     */
    void setMaxBlocks(long value);

    /**
     * Returns the value of the '<em><b>Min Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the minimum number of characters per record. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Min Records</em>' attribute.
     * @see #setMinRecords(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_MinRecords()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMinRecords();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMinRecords <em>Min Records</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Min Records</em>' attribute.
     * @see #getMinRecords()
     * @generated
     */
    void setMinRecords(long value);

    /**
     * Returns the value of the '<em><b>Max Records</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the maximum number of characters per record. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Max Records</em>' attribute.
     * @see #setMaxRecords(long)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_MaxRecords()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMaxRecords();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getMaxRecords <em>Max Records</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Max Records</em>' attribute.
     * @see #getMaxRecords()
     * @generated
     */
    void setMaxRecords(long value);

    /**
     * Returns the value of the '<em><b>Label Kind</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.coboldata.LabelKind}. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> Contains the label kind of
     * the file. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Label Kind</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.LabelKind
     * @see #setLabelKind(LabelKind)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_LabelKind()
     * @model
     * @generated
     */
    LabelKind getLabelKind();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getLabelKind <em>Label Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Label Kind</em>' attribute.
     * @see orgomg.cwmx.resource.coboldata.LabelKind
     * @see #getLabelKind()
     * @generated
     */
    void setLabelKind(LabelKind value);

    /**
     * Returns the value of the '<em><b>Is External</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the file is external. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is External</em>' attribute.
     * @see #setIsExternal(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_IsExternal()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsExternal();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsExternal <em>Is External</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is External</em>' attribute.
     * @see #isIsExternal()
     * @generated
     */
    void setIsExternal(boolean value);

    /**
     * Returns the value of the '<em><b>Is Global</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the file is global. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Global</em>' attribute.
     * @see #setIsGlobal(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_IsGlobal()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGlobal();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#isIsGlobal
     * <em>Is Global</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Global</em>' attribute.
     * @see #isIsGlobal()
     * @generated
     */
    void setIsGlobal(boolean value);

    /**
     * Returns the value of the '<em><b>Pad Literal</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If not
     * an empty string, contains the pad character. If an empty string, the
     * padField reference may point to a COBOLField instance that contains the
     * pad character. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Pad Literal</em>' attribute.
     * @see #setPadLiteral(String)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_PadLiteral()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPadLiteral();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadLiteral <em>Pad Literal</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Pad Literal</em>' attribute.
     * @see #getPadLiteral()
     * @generated
     */
    void setPadLiteral(String value);

    /**
     * Returns the value of the '<em><b>Status ID</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLItem#getStatusFD
     * <em>Status FD</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the COBOLItem instance that contains the
     * status ID for this COBOLFD instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Status ID</em>' reference.
     * @see #setStatusID(COBOLItem)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_StatusID()
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getStatusFD
     * @model opposite="statusFD"
     * @generated
     */
    COBOLItem getStatusID();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#getStatusID
     * <em>Status ID</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Status ID</em>' reference.
     * @see #getStatusID()
     * @generated
     */
    void setStatusID(COBOLItem value);

    /**
     * Returns the value of the '<em><b>Linage Info</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.coboldata.LinageInfo}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolFD
     * <em>Cobol FD</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the LinageInfo instances for this COBOLFD
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Linage Info</em>' containment reference
     *         list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_LinageInfo()
     * @see orgomg.cwmx.resource.coboldata.LinageInfo#getCobolFD
     * @model opposite="cobolFD" containment="true" upper="4"
     * @generated
     */
    EList<LinageInfo> getLinageInfo();

    /**
     * Returns the value of the '<em><b>File Section</b></em>' container
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.FileSection#getCobolFD
     * <em>Cobol FD</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the FileSection instances that contain
     * this COBOLFD instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>File Section</em>' container reference.
     * @see #setFileSection(FileSection)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_FileSection()
     * @see orgomg.cwmx.resource.coboldata.FileSection#getCobolFD
     * @model opposite="cobolFD" required="true"
     * @generated
     */
    FileSection getFileSection();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getFileSection <em>File Section</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>File Section</em>' container reference.
     * @see #getFileSection()
     * @generated
     */
    void setFileSection(FileSection value);

    /**
     * Returns the value of the '<em><b>Depends On</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getDependingFD <em>Depending FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLItem instance that contains the current size of the COBOLFD instance?s records.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Depends On</em>' reference.
     * @see #setDependsOn(COBOLItem)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_DependsOn()
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getDependingFD
     * @model opposite="dependingFD"
     * @generated
     */
    COBOLItem getDependsOn();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getDependsOn <em>Depends On</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Depends On</em>' reference.
     * @see #getDependsOn()
     * @generated
     */
    void setDependsOn(COBOLItem value);

    /**
     * Returns the value of the '<em><b>Pad Field</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLItem#getPaddedFD
     * <em>Padded FD</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the COBOLField instance that contains the
     * pad character for this COBOLFD. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Pad Field</em>' reference.
     * @see #setPadField(COBOLItem)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_PadField()
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getPaddedFD
     * @model opposite="paddedFD"
     * @generated
     */
    COBOLItem getPadField();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadField
     * <em>Pad Field</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Pad Field</em>' reference.
     * @see #getPadField()
     * @generated
     */
    void setPadField(COBOLItem value);

    /**
     * Returns the value of the '<em><b>Relative Field</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLItem#getRelativeFD <em>Relative FD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLField instance containing the current relative record offset in the file represented by the COBOLFD instance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Relative Field</em>' reference.
     * @see #setRelativeField(COBOLItem)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFD_RelativeField()
     * @see orgomg.cwmx.resource.coboldata.COBOLItem#getRelativeFD
     * @model opposite="relativeFD"
     * @generated
     */
    COBOLItem getRelativeField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getRelativeField <em>Relative Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Relative Field</em>' reference.
     * @see #getRelativeField()
     * @generated
     */
    void setRelativeField(COBOLItem value);

} // COBOLFD
