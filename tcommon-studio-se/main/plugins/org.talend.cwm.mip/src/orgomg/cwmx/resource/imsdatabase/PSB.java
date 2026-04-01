/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.RecordFile;
import orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PSB</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents the root entity of a PSB user object. Within IMS, a PSB (Program Specification Block) is a series of PCB macro instructions that describe an application program?s I/O operations and its view and use of segments and fields in IMS databases. The types of PCBs are TP PCB which describes interactions with logical terminals, GSAM PCB which is based on a GSAM DBD used as an input or output dataset, and DB PCB which can relate to segments and fields in its base DBD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#isCompatibility <em>Compatibility</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getIoErrorOption <em>Io Error Option</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getIoaSize <em>Ioa Size</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getLanguage <em>Language</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getLockMaximum <em>Lock Maximum</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getMaximumQxCalls <em>Maximum Qx Calls</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#isOnlineImageCopy <em>Online Image Copy</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getSsaSize <em>Ssa Size</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#isWriteToOperator <em>Write To Operator</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getAcblib <em>Acblib</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getPcb <em>Pcb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PSB#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB()
 * @model
 * @generated
 */
public interface PSB extends RecordFile {

    /**
     * Returns the value of the '<em><b>Compatibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * value in this attribute provides for compatibility between BMP or MSG and
     * Batch-DL/I parameter lists. When TRUE, the PSB is always treated as if
     * there were an I/O PCB, no matter how it is used. When FALSE, the PSB has
     * an I/O PCB added only when run in a BMP or MSG region. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Compatibility</em>' attribute.
     * @see #setCompatibility(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_Compatibility()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isCompatibility();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#isCompatibility <em>Compatibility</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Compatibility</em>' attribute.
     * @see #isCompatibility()
     * @generated
     */
    void setCompatibility(boolean value);

    /**
     * Returns the value of the '<em><b>Io Error Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The value in this attribute represents the condition code returned to the
     * operating system when IMS/VS terminates normally and one or more input or
     * output errors occurred on any data base during the application program
     * execution. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Io Error Option</em>' attribute.
     * @see #setIoErrorOption(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_IoErrorOption()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getIoErrorOption();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#getIoErrorOption <em>Io Error Option</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Io Error Option</em>' attribute.
     * @see #getIoErrorOption()
     * @generated
     */
    void setIoErrorOption(long value);

    /**
     * Returns the value of the '<em><b>Ioa Size</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the size of the largest I/O area to be used by the
     * application program. The size specification is used to determine the
     * amount of main storage reserved in the PSB pool to hold the control
     * region?s copy of the user?s I/O area data during scheduling of this
     * application program. If this value is not specified, the ACB utility
     * program calculates a maximum I/O area size to be used as a default. The
     * size calculated is the total length of all sensitive segments in the
     * longest possible path call. The value specified is in bytes. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Ioa Size</em>' attribute.
     * @see #setIoaSize(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_IoaSize()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getIoaSize();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#getIoaSize <em>Ioa Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Ioa Size</em>' attribute.
     * @see #getIoaSize()
     * @generated
     */
    void setIoaSize(long value);

    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the language label used on the PSBGEN statement. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Language</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType
     * @see #setLanguage(PSBLanguageType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_Language()
     * @model
     * @generated
     */
    PSBLanguageType getLanguage();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#getLanguage
     * <em>Language</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Language</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(PSBLanguageType value);

    /**
     * Returns the value of the '<em><b>Lock Maximum</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * value in this attribute indicates the maximum number of locks an
     * application program can get at one time. The value is specified in units
     * of 1000. For example, a lockMaximum value of 5 indicates a maximum of
     * 5000 locks at one time. A value of 0 turns off the limit. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Lock Maximum</em>' attribute.
     * @see #setLockMaximum(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_LockMaximum()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getLockMaximum();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#getLockMaximum <em>Lock Maximum</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Lock Maximum</em>' attribute.
     * @see #getLockMaximum()
     * @generated
     */
    void setLockMaximum(long value);

    /**
     * Returns the value of the '<em><b>Maximum Qx Calls</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The value in this attribute represents the maximum number of data base
     * calls with Qx command codes which may be issued between synchronization
     * points. If this number is exceeded, the application program will abend.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Maximum Qx Calls</em>' attribute.
     * @see #setMaximumQxCalls(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_MaximumQxCalls()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMaximumQxCalls();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#getMaximumQxCalls <em>Maximum Qx Calls</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Maximum Qx Calls</em>' attribute.
     * @see #getMaximumQxCalls()
     * @generated
     */
    void setMaximumQxCalls(long value);

    /**
     * Returns the value of the '<em><b>Online Image Copy</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute specifies whether the user of this PSB is authorized to
     * execute the Online Data Base Image Copy utility or the Surveyor utility
     * feature run as a BMP against a data based named in this PSB. When TRUE,
     * use of the Online Image Copy and the Surveyor utility feature is allowed;
     * When FALSE, use of the Online Image copy and the Surveyor utility feature
     * is prohibited. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Online Image Copy</em>' attribute.
     * @see #setOnlineImageCopy(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_OnlineImageCopy()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isOnlineImageCopy();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#isOnlineImageCopy <em>Online Image Copy</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Online Image Copy</em>' attribute.
     * @see #isOnlineImageCopy()
     * @generated
     */
    void setOnlineImageCopy(boolean value);

    /**
     * Returns the value of the '<em><b>Ssa Size</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * value in this attribute represents the maximum total length of all SSAs
     * to be used by the application program. The size specification is used to
     * determine the amount of main storage reserved in the PSB pool to hold the
     * control region?s copy of the user?s SSA string during scheduling of this
     * application program. If not specified, the ACB utility program calculates
     * the maximum SSA size to be used as a default. The size calculated is the
     * maximum number of levels in any PCB within this PSB times 280. The value
     * specified is in bytes. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Ssa Size</em>' attribute.
     * @see #setSsaSize(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_SsaSize()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getSsaSize();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#getSsaSize <em>Ssa Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Ssa Size</em>' attribute.
     * @see #getSsaSize()
     * @generated
     */
    void setSsaSize(long value);

    /**
     * Returns the value of the '<em><b>Write To Operator</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attributes holds a subparameter of the IOEROPN parameter. It is tied
     * to the "write-to-operator-with-reply" function in the Utility Control
     * facility. When TRUE, a WTOR for the DFS0451A I/O error message is issued,
     * and DL/I waits for the operator to respond before continuing. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Write To Operator</em>' attribute.
     * @see #setWriteToOperator(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_WriteToOperator()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isWriteToOperator();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PSB#isWriteToOperator <em>Write To Operator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Write To Operator</em>' attribute.
     * @see #isWriteToOperator()
     * @generated
     */
    void setWriteToOperator(boolean value);

    /**
     * Returns the value of the '<em><b>Acblib</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.imsdatabase.ACBLIB}
     * . It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.ACBLIB#getPsb <em>Psb</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The ACBLIB(s) that use this PSB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Acblib</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_Acblib()
     * @see orgomg.cwmx.resource.imsdatabase.ACBLIB#getPsb
     * @model opposite="psb"
     * @generated
     */
    EList<ACBLIB> getAcblib();

    /**
     * Returns the value of the '<em><b>Pcb</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.PCB}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#getPsb <em>Psb</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * PCBs used by this PSB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Pcb</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_Pcb()
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getPsb
     * @model opposite="psb"
     * @generated
     */
    EList<PCB> getPcb();

    /**
     * Returns the value of the '<em><b>Library</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.imsdatabase.PSBLib}
     * . It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.PSBLib#getPsb <em>Psb</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The PSBLIB(s) in which this PSB is stored. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Library</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPSB_Library()
     * @see orgomg.cwmx.resource.imsdatabase.PSBLib#getPsb
     * @model opposite="psb"
     * @generated
     */
    EList<PSBLib> getLibrary();

} // PSB
