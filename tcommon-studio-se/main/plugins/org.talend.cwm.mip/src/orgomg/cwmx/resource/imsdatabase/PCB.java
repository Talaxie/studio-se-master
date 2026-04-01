/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.RecordFile;
import orgomg.cwmx.resource.imsdatabase.imstypes.LTermType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PCBType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PCB</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PCB is a series of macro instructions contained in a PSB. PCBs which come in three varieties:
 * 
 *     TP (Teleprocessing) PCBs describe a connection to a terminal
 *     GSAM PCBs connect a PSB to a input or output file.
 *     DB PCBs connect a PSB to the data defined by a DBD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getPcbType <em>Pcb Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#isList <em>List</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getProcessingOptions <em>Processing Options</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getPositioning <em>Positioning</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#isSequentialBuffering <em>Sequential Buffering</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#isAlternateResponse <em>Alternate Response</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#isExpress <em>Express</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#isModify <em>Modify</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#isSameTerminal <em>Same Terminal</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getLtermName <em>Lterm Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getProcSeq <em>Proc Seq</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getPsb <em>Psb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.PCB#getSenSegment <em>Sen Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB()
 * @model
 * @generated
 */
public interface PCB extends RecordFile {

    /**
     * Returns the value of the '<em><b>Pcb Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.PCBType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * type of PCB - whether GSAM, DB or TP <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Pcb Type</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PCBType
     * @see #setPcbType(PCBType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_PcbType()
     * @model
     * @generated
     */
    PCBType getPcbType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getPcbType <em>Pcb Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Pcb Type</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PCBType
     * @see #getPcbType()
     * @generated
     */
    void setPcbType(PCBType value);

    /**
     * Returns the value of the '<em><b>List</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether a named PCB is included in the PCB list
     * passed to the application program at entry. TRUE includes the PCB in the
     * PCB list, FALSE excludes it from the PCB list. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>List</em>' attribute.
     * @see #setList(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_List()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isList();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#isList <em>List</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>List</em>' attribute.
     * @see #isList()
     * @generated
     */
    void setList(boolean value);

    /**
     * Returns the value of the '<em><b>Key Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * value specified in bytes of the longest concatenated key for a hierarchic
     * path of sensitive segments used by the application program in the logical
     * data structure. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Key Length</em>' attribute.
     * @see #setKeyLength(long)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_KeyLength()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getKeyLength();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getKeyLength <em>Key Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Key Length</em>' attribute.
     * @see #getKeyLength()
     * @generated
     */
    void setKeyLength(long value);

    /**
     * Returns the value of the '<em><b>Processing Options</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute holds a string that represents the processing options on
     * either the sensitive segments or the data set declared in this PCB and
     * which can be used in an associated application program. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Processing Options</em>' attribute.
     * @see #setProcessingOptions(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_ProcessingOptions()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getProcessingOptions();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getProcessingOptions <em>Processing Options</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Processing Options</em>' attribute.
     * @see #getProcessingOptions()
     * @generated
     */
    void setProcessingOptions(String value);

    /**
     * Returns the value of the '<em><b>Positioning</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether single or multiple positioning is desired for
     * the logical data structure. Single or multiple positioning provides a
     * functional variation in the call. Multiple positioning is not supported
     * by HSAM. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Positioning</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType
     * @see #setPositioning(PositioningType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_Positioning()
     * @model
     * @generated
     */
    PositioningType getPositioning();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getPositioning <em>Positioning</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Positioning</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType
     * @see #getPositioning()
     * @generated
     */
    void setPositioning(PositioningType value);

    /**
     * Returns the value of the '<em><b>Sequential Buffering</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The value in this attribute specifies if this PCB
     * will be buffered using sequential buffering (SB). True means the SB
     * should be activated conditionally (COND); False means that SB should not
     * be used for this DB PCB (NO). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Sequential Buffering</em>' attribute.
     * @see #setSequentialBuffering(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_SequentialBuffering()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isSequentialBuffering();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#isSequentialBuffering <em>Sequential Buffering</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Sequential Buffering</em>' attribute.
     * @see #isSequentialBuffering()
     * @generated
     */
    void setSequentialBuffering(boolean value);

    /**
     * Returns the value of the '<em><b>Alternate Response</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute specifies whether this PCB can be used instead of the I/O
     * PCB for responding to terminal in response mode, conversational mode, or
     * exclusive mode. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Alternate Response</em>' attribute.
     * @see #setAlternateResponse(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_AlternateResponse()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isAlternateResponse();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#isAlternateResponse <em>Alternate Response</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Alternate Response</em>' attribute.
     * @see #isAlternateResponse()
     * @generated
     */
    void setAlternateResponse(boolean value);

    /**
     * Returns the value of the '<em><b>Express</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether messages from this alternate PCB are to be
     * sent (TRUE) or are to be backed out (FALSE) if the application program
     * should terminate abnormally. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Express</em>' attribute.
     * @see #setExpress(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_Express()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isExpress();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#isExpress <em>Express</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Express</em>' attribute.
     * @see #isExpress()
     * @generated
     */
    void setExpress(boolean value);

    /**
     * Returns the value of the '<em><b>Modify</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether the alternate PCB is modifiable. This feature
     * allows for the dynamic modification of the destination name associated
     * with this PCB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Modify</em>' attribute.
     * @see #setModify(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_Modify()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isModify();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#isModify <em>Modify</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Modify</em>' attribute.
     * @see #isModify()
     * @generated
     */
    void setModify(boolean value);

    /**
     * Returns the value of the '<em><b>Same Terminal</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether IMS should verify that the logical terminal
     * named in the response alternate PCB is assigned to the same physical
     * terminal as the logical terminal that originated the input message. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Same Terminal</em>' attribute.
     * @see #setSameTerminal(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_SameTerminal()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isSameTerminal();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#isSameTerminal <em>Same Terminal</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Same Terminal</em>' attribute.
     * @see #isSameTerminal()
     * @generated
     */
    void setSameTerminal(boolean value);

    /**
     * Returns the value of the '<em><b>Destination Type</b></em>' attribute.
     * The literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.LTermType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * attribute specifies whether the ltermName attribute signifies a logical
     * terminal (LTERM) or a transaction code (NAME). This attribute maps to the
     * LTERM or NAME keyword on the PCB macro statement. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Destination Type</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.LTermType
     * @see #setDestinationType(LTermType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_DestinationType()
     * @model
     * @generated
     */
    LTermType getDestinationType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getDestinationType <em>Destination Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Destination Type</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.LTermType
     * @see #getDestinationType()
     * @generated
     */
    void setDestinationType(LTermType value);

    /**
     * Returns the value of the '<em><b>Lterm Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies the name of the actual destination of the message and
     * is either a logical terminal name or a transaction-code name. When the
     * name is a transaction-code name, output messages to this PCB are queued
     * for input to the program used to process the transaction-code named by
     * the NAME attribute. The name must be specified in the user?s IMS/VS
     * system definition as a logical terminal name or transaction code. This
     * attribute maps to the LTERM/NAME keyword on the PCB macro statement. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Lterm Name</em>' attribute.
     * @see #setLtermName(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_LtermName()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getLtermName();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getLtermName <em>Lterm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Lterm Name</em>' attribute.
     * @see #getLtermName()
     * @generated
     */
    void setLtermName(String value);

    /**
     * Returns the value of the '<em><b>Proc Seq</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSequencedPCB <em>Sequenced PCB</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The secondary index that this PCB uses as a processing sequence.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Proc Seq</em>' reference.
     * @see #setProcSeq(INDEX)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_ProcSeq()
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSequencedPCB
     * @model opposite="sequencedPCB"
     * @generated
     */
    INDEX getProcSeq();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getProcSeq <em>Proc Seq</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Proc Seq</em>' reference.
     * @see #getProcSeq()
     * @generated
     */
    void setProcSeq(INDEX value);

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getPcb <em>Pcb</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The DBD
     * on which this PCB is based. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dbd</em>' reference.
     * @see #setDbd(DBD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getPcb
     * @model opposite="pcb"
     * @generated
     */
    DBD getDbd();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.PCB#getDbd <em>Dbd</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Dbd</em>' reference.
     * @see #getDbd()
     * @generated
     */
    void setDbd(DBD value);

    /**
     * Returns the value of the '<em><b>Psb</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.PSB}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.PSB#getPcb <em>Pcb</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * PSB(s) that use this PCB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Psb</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_Psb()
     * @see orgomg.cwmx.resource.imsdatabase.PSB#getPcb
     * @model opposite="pcb"
     * @generated
     */
    EList<PSB> getPsb();

    /**
     * Returns the value of the '<em><b>Sen Segment</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.SenSegment}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SenSegment#getPcb <em>Pcb</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The sensitive segments included in this PCB. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Sen Segment</em>' containment reference
     *         list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getPCB_SenSegment()
     * @see orgomg.cwmx.resource.imsdatabase.SenSegment#getPcb
     * @model opposite="pcb" containment="true"
     * @generated
     */
    EList<SenSegment> getSenSegment();

} // PCB
