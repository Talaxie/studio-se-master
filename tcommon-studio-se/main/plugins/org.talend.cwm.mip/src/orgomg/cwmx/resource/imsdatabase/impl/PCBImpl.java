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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.record.impl.RecordFileImpl;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.INDEX;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.PSB;
import orgomg.cwmx.resource.imsdatabase.SenSegment;
import orgomg.cwmx.resource.imsdatabase.imstypes.LTermType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PCBType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PCB</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getPcbType <em>Pcb Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#isList <em>List</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getProcessingOptions <em>Processing Options</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getPositioning <em>Positioning</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#isSequentialBuffering <em>Sequential Buffering</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#isAlternateResponse <em>Alternate Response</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#isExpress <em>Express</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#isModify <em>Modify</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#isSameTerminal <em>Same Terminal</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getLtermName <em>Lterm Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getProcSeq <em>Proc Seq</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getPsb <em>Psb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PCBImpl#getSenSegment <em>Sen Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PCBImpl extends RecordFileImpl implements PCB {

    /**
     * The default value of the '{@link #getPcbType() <em>Pcb Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPcbType()
     * @generated
     * @ordered
     */
    protected static final PCBType PCB_TYPE_EDEFAULT = PCBType.IMSPT_DB;

    /**
     * The cached value of the '{@link #getPcbType() <em>Pcb Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPcbType()
     * @generated
     * @ordered
     */
    protected PCBType pcbType = PCB_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isList() <em>List</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isList()
     * @generated
     * @ordered
     */
    protected static final boolean LIST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isList() <em>List</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isList()
     * @generated
     * @ordered
     */
    protected boolean list = LIST_EDEFAULT;

    /**
     * The default value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKeyLength()
     * @generated
     * @ordered
     */
    protected static final long KEY_LENGTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKeyLength()
     * @generated
     * @ordered
     */
    protected long keyLength = KEY_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getProcessingOptions() <em>Processing Options</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProcessingOptions()
     * @generated
     * @ordered
     */
    protected static final String PROCESSING_OPTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessingOptions() <em>Processing Options</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProcessingOptions()
     * @generated
     * @ordered
     */
    protected String processingOptions = PROCESSING_OPTIONS_EDEFAULT;

    /**
     * The default value of the '{@link #getPositioning() <em>Positioning</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPositioning()
     * @generated
     * @ordered
     */
    protected static final PositioningType POSITIONING_EDEFAULT = PositioningType.IMSPS_SINGLE;

    /**
     * The cached value of the '{@link #getPositioning() <em>Positioning</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPositioning()
     * @generated
     * @ordered
     */
    protected PositioningType positioning = POSITIONING_EDEFAULT;

    /**
     * The default value of the '{@link #isSequentialBuffering() <em>Sequential Buffering</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSequentialBuffering()
     * @generated
     * @ordered
     */
    protected static final boolean SEQUENTIAL_BUFFERING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSequentialBuffering() <em>Sequential Buffering</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSequentialBuffering()
     * @generated
     * @ordered
     */
    protected boolean sequentialBuffering = SEQUENTIAL_BUFFERING_EDEFAULT;

    /**
     * The default value of the '{@link #isAlternateResponse() <em>Alternate Response</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isAlternateResponse()
     * @generated
     * @ordered
     */
    protected static final boolean ALTERNATE_RESPONSE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAlternateResponse() <em>Alternate Response</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isAlternateResponse()
     * @generated
     * @ordered
     */
    protected boolean alternateResponse = ALTERNATE_RESPONSE_EDEFAULT;

    /**
     * The default value of the '{@link #isExpress() <em>Express</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isExpress()
     * @generated
     * @ordered
     */
    protected static final boolean EXPRESS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExpress() <em>Express</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isExpress()
     * @generated
     * @ordered
     */
    protected boolean express = EXPRESS_EDEFAULT;

    /**
     * The default value of the '{@link #isModify() <em>Modify</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isModify()
     * @generated
     * @ordered
     */
    protected static final boolean MODIFY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isModify() <em>Modify</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isModify()
     * @generated
     * @ordered
     */
    protected boolean modify = MODIFY_EDEFAULT;

    /**
     * The default value of the '{@link #isSameTerminal() <em>Same Terminal</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSameTerminal()
     * @generated
     * @ordered
     */
    protected static final boolean SAME_TERMINAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSameTerminal() <em>Same Terminal</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isSameTerminal()
     * @generated
     * @ordered
     */
    protected boolean sameTerminal = SAME_TERMINAL_EDEFAULT;

    /**
     * The default value of the '{@link #getDestinationType() <em>Destination Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDestinationType()
     * @generated
     * @ordered
     */
    protected static final LTermType DESTINATION_TYPE_EDEFAULT = LTermType.IMSTP_LTERM;

    /**
     * The cached value of the '{@link #getDestinationType() <em>Destination Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDestinationType()
     * @generated
     * @ordered
     */
    protected LTermType destinationType = DESTINATION_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getLtermName() <em>Lterm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLtermName()
     * @generated
     * @ordered
     */
    protected static final String LTERM_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLtermName() <em>Lterm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLtermName()
     * @generated
     * @ordered
     */
    protected String ltermName = LTERM_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getProcSeq() <em>Proc Seq</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getProcSeq()
     * @generated
     * @ordered
     */
    protected INDEX procSeq;

    /**
     * The cached value of the '{@link #getDbd() <em>Dbd</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDbd()
     * @generated
     * @ordered
     */
    protected DBD dbd;

    /**
     * The cached value of the '{@link #getPsb() <em>Psb</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPsb()
     * @generated
     * @ordered
     */
    protected EList<PSB> psb;

    /**
     * The cached value of the '{@link #getSenSegment() <em>Sen Segment</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSenSegment()
     * @generated
     * @ordered
     */
    protected EList<SenSegment> senSegment;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PCBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.PCB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PCBType getPcbType() {
        return pcbType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPcbType(PCBType newPcbType) {
        PCBType oldPcbType = pcbType;
        pcbType = newPcbType == null ? PCB_TYPE_EDEFAULT : newPcbType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__PCB_TYPE, oldPcbType, pcbType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isList() {
        return list;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setList(boolean newList) {
        boolean oldList = list;
        list = newList;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__LIST, oldList, list));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getKeyLength() {
        return keyLength;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKeyLength(long newKeyLength) {
        long oldKeyLength = keyLength;
        keyLength = newKeyLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__KEY_LENGTH, oldKeyLength, keyLength));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getProcessingOptions() {
        return processingOptions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProcessingOptions(String newProcessingOptions) {
        String oldProcessingOptions = processingOptions;
        processingOptions = newProcessingOptions;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__PROCESSING_OPTIONS,
                    oldProcessingOptions, processingOptions));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PositioningType getPositioning() {
        return positioning;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPositioning(PositioningType newPositioning) {
        PositioningType oldPositioning = positioning;
        positioning = newPositioning == null ? POSITIONING_EDEFAULT : newPositioning;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__POSITIONING, oldPositioning,
                    positioning));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSequentialBuffering() {
        return sequentialBuffering;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSequentialBuffering(boolean newSequentialBuffering) {
        boolean oldSequentialBuffering = sequentialBuffering;
        sequentialBuffering = newSequentialBuffering;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__SEQUENTIAL_BUFFERING,
                    oldSequentialBuffering, sequentialBuffering));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isAlternateResponse() {
        return alternateResponse;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAlternateResponse(boolean newAlternateResponse) {
        boolean oldAlternateResponse = alternateResponse;
        alternateResponse = newAlternateResponse;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__ALTERNATE_RESPONSE,
                    oldAlternateResponse, alternateResponse));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isExpress() {
        return express;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExpress(boolean newExpress) {
        boolean oldExpress = express;
        express = newExpress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__EXPRESS, oldExpress, express));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isModify() {
        return modify;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setModify(boolean newModify) {
        boolean oldModify = modify;
        modify = newModify;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__MODIFY, oldModify, modify));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSameTerminal() {
        return sameTerminal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSameTerminal(boolean newSameTerminal) {
        boolean oldSameTerminal = sameTerminal;
        sameTerminal = newSameTerminal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__SAME_TERMINAL, oldSameTerminal,
                    sameTerminal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LTermType getDestinationType() {
        return destinationType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDestinationType(LTermType newDestinationType) {
        LTermType oldDestinationType = destinationType;
        destinationType = newDestinationType == null ? DESTINATION_TYPE_EDEFAULT : newDestinationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__DESTINATION_TYPE, oldDestinationType,
                    destinationType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLtermName() {
        return ltermName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLtermName(String newLtermName) {
        String oldLtermName = ltermName;
        ltermName = newLtermName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__LTERM_NAME, oldLtermName, ltermName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX getProcSeq() {
        if (procSeq != null && procSeq.eIsProxy()) {
            InternalEObject oldProcSeq = (InternalEObject) procSeq;
            procSeq = (INDEX) eResolveProxy(oldProcSeq);
            if (procSeq != oldProcSeq) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.PCB__PROC_SEQ, oldProcSeq,
                            procSeq));
            }
        }
        return procSeq;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX basicGetProcSeq() {
        return procSeq;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcSeq(INDEX newProcSeq, NotificationChain msgs) {
        INDEX oldProcSeq = procSeq;
        procSeq = newProcSeq;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__PROC_SEQ,
                    oldProcSeq, newProcSeq);
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
    public void setProcSeq(INDEX newProcSeq) {
        if (newProcSeq != procSeq) {
            NotificationChain msgs = null;
            if (procSeq != null)
                msgs = ((InternalEObject) procSeq).eInverseRemove(this, ImsdatabasePackage.INDEX__SEQUENCED_PCB, INDEX.class,
                        msgs);
            if (newProcSeq != null)
                msgs = ((InternalEObject) newProcSeq).eInverseAdd(this, ImsdatabasePackage.INDEX__SEQUENCED_PCB, INDEX.class,
                        msgs);
            msgs = basicSetProcSeq(newProcSeq, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__PROC_SEQ, newProcSeq, newProcSeq));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBD getDbd() {
        if (dbd != null && dbd.eIsProxy()) {
            InternalEObject oldDbd = (InternalEObject) dbd;
            dbd = (DBD) eResolveProxy(oldDbd);
            if (dbd != oldDbd) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.PCB__DBD, oldDbd, dbd));
            }
        }
        return dbd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBD basicGetDbd() {
        return dbd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDbd(DBD newDbd, NotificationChain msgs) {
        DBD oldDbd = dbd;
        dbd = newDbd;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__DBD, oldDbd,
                    newDbd);
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
    public void setDbd(DBD newDbd) {
        if (newDbd != dbd) {
            NotificationChain msgs = null;
            if (dbd != null)
                msgs = ((InternalEObject) dbd).eInverseRemove(this, ImsdatabasePackage.DBD__PCB, DBD.class, msgs);
            if (newDbd != null)
                msgs = ((InternalEObject) newDbd).eInverseAdd(this, ImsdatabasePackage.DBD__PCB, DBD.class, msgs);
            msgs = basicSetDbd(newDbd, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PCB__DBD, newDbd, newDbd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<PSB> getPsb() {
        if (psb == null) {
            psb = new EObjectWithInverseResolvingEList.ManyInverse<PSB>(PSB.class, this, ImsdatabasePackage.PCB__PSB,
                    ImsdatabasePackage.PSB__PCB);
        }
        return psb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SenSegment> getSenSegment() {
        if (senSegment == null) {
            senSegment = new EObjectContainmentWithInverseEList<SenSegment>(SenSegment.class, this,
                    ImsdatabasePackage.PCB__SEN_SEGMENT, ImsdatabasePackage.SEN_SEGMENT__PCB);
        }
        return senSegment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.PCB__PROC_SEQ:
            if (procSeq != null)
                msgs = ((InternalEObject) procSeq).eInverseRemove(this, ImsdatabasePackage.INDEX__SEQUENCED_PCB, INDEX.class,
                        msgs);
            return basicSetProcSeq((INDEX) otherEnd, msgs);
        case ImsdatabasePackage.PCB__DBD:
            if (dbd != null)
                msgs = ((InternalEObject) dbd).eInverseRemove(this, ImsdatabasePackage.DBD__PCB, DBD.class, msgs);
            return basicSetDbd((DBD) otherEnd, msgs);
        case ImsdatabasePackage.PCB__PSB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPsb()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.PCB__SEN_SEGMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSenSegment()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.PCB__PROC_SEQ:
            return basicSetProcSeq(null, msgs);
        case ImsdatabasePackage.PCB__DBD:
            return basicSetDbd(null, msgs);
        case ImsdatabasePackage.PCB__PSB:
            return ((InternalEList<?>) getPsb()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.PCB__SEN_SEGMENT:
            return ((InternalEList<?>) getSenSegment()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ImsdatabasePackage.PCB__PCB_TYPE:
            return getPcbType();
        case ImsdatabasePackage.PCB__LIST:
            return isList();
        case ImsdatabasePackage.PCB__KEY_LENGTH:
            return getKeyLength();
        case ImsdatabasePackage.PCB__PROCESSING_OPTIONS:
            return getProcessingOptions();
        case ImsdatabasePackage.PCB__POSITIONING:
            return getPositioning();
        case ImsdatabasePackage.PCB__SEQUENTIAL_BUFFERING:
            return isSequentialBuffering();
        case ImsdatabasePackage.PCB__ALTERNATE_RESPONSE:
            return isAlternateResponse();
        case ImsdatabasePackage.PCB__EXPRESS:
            return isExpress();
        case ImsdatabasePackage.PCB__MODIFY:
            return isModify();
        case ImsdatabasePackage.PCB__SAME_TERMINAL:
            return isSameTerminal();
        case ImsdatabasePackage.PCB__DESTINATION_TYPE:
            return getDestinationType();
        case ImsdatabasePackage.PCB__LTERM_NAME:
            return getLtermName();
        case ImsdatabasePackage.PCB__PROC_SEQ:
            if (resolve)
                return getProcSeq();
            return basicGetProcSeq();
        case ImsdatabasePackage.PCB__DBD:
            if (resolve)
                return getDbd();
            return basicGetDbd();
        case ImsdatabasePackage.PCB__PSB:
            return getPsb();
        case ImsdatabasePackage.PCB__SEN_SEGMENT:
            return getSenSegment();
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
        case ImsdatabasePackage.PCB__PCB_TYPE:
            setPcbType((PCBType) newValue);
            return;
        case ImsdatabasePackage.PCB__LIST:
            setList((Boolean) newValue);
            return;
        case ImsdatabasePackage.PCB__KEY_LENGTH:
            setKeyLength((Long) newValue);
            return;
        case ImsdatabasePackage.PCB__PROCESSING_OPTIONS:
            setProcessingOptions((String) newValue);
            return;
        case ImsdatabasePackage.PCB__POSITIONING:
            setPositioning((PositioningType) newValue);
            return;
        case ImsdatabasePackage.PCB__SEQUENTIAL_BUFFERING:
            setSequentialBuffering((Boolean) newValue);
            return;
        case ImsdatabasePackage.PCB__ALTERNATE_RESPONSE:
            setAlternateResponse((Boolean) newValue);
            return;
        case ImsdatabasePackage.PCB__EXPRESS:
            setExpress((Boolean) newValue);
            return;
        case ImsdatabasePackage.PCB__MODIFY:
            setModify((Boolean) newValue);
            return;
        case ImsdatabasePackage.PCB__SAME_TERMINAL:
            setSameTerminal((Boolean) newValue);
            return;
        case ImsdatabasePackage.PCB__DESTINATION_TYPE:
            setDestinationType((LTermType) newValue);
            return;
        case ImsdatabasePackage.PCB__LTERM_NAME:
            setLtermName((String) newValue);
            return;
        case ImsdatabasePackage.PCB__PROC_SEQ:
            setProcSeq((INDEX) newValue);
            return;
        case ImsdatabasePackage.PCB__DBD:
            setDbd((DBD) newValue);
            return;
        case ImsdatabasePackage.PCB__PSB:
            getPsb().clear();
            getPsb().addAll((Collection<? extends PSB>) newValue);
            return;
        case ImsdatabasePackage.PCB__SEN_SEGMENT:
            getSenSegment().clear();
            getSenSegment().addAll((Collection<? extends SenSegment>) newValue);
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
        case ImsdatabasePackage.PCB__PCB_TYPE:
            setPcbType(PCB_TYPE_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__LIST:
            setList(LIST_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__KEY_LENGTH:
            setKeyLength(KEY_LENGTH_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__PROCESSING_OPTIONS:
            setProcessingOptions(PROCESSING_OPTIONS_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__POSITIONING:
            setPositioning(POSITIONING_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__SEQUENTIAL_BUFFERING:
            setSequentialBuffering(SEQUENTIAL_BUFFERING_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__ALTERNATE_RESPONSE:
            setAlternateResponse(ALTERNATE_RESPONSE_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__EXPRESS:
            setExpress(EXPRESS_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__MODIFY:
            setModify(MODIFY_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__SAME_TERMINAL:
            setSameTerminal(SAME_TERMINAL_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__DESTINATION_TYPE:
            setDestinationType(DESTINATION_TYPE_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__LTERM_NAME:
            setLtermName(LTERM_NAME_EDEFAULT);
            return;
        case ImsdatabasePackage.PCB__PROC_SEQ:
            setProcSeq((INDEX) null);
            return;
        case ImsdatabasePackage.PCB__DBD:
            setDbd((DBD) null);
            return;
        case ImsdatabasePackage.PCB__PSB:
            getPsb().clear();
            return;
        case ImsdatabasePackage.PCB__SEN_SEGMENT:
            getSenSegment().clear();
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
        case ImsdatabasePackage.PCB__PCB_TYPE:
            return pcbType != PCB_TYPE_EDEFAULT;
        case ImsdatabasePackage.PCB__LIST:
            return list != LIST_EDEFAULT;
        case ImsdatabasePackage.PCB__KEY_LENGTH:
            return keyLength != KEY_LENGTH_EDEFAULT;
        case ImsdatabasePackage.PCB__PROCESSING_OPTIONS:
            return PROCESSING_OPTIONS_EDEFAULT == null ? processingOptions != null : !PROCESSING_OPTIONS_EDEFAULT
                    .equals(processingOptions);
        case ImsdatabasePackage.PCB__POSITIONING:
            return positioning != POSITIONING_EDEFAULT;
        case ImsdatabasePackage.PCB__SEQUENTIAL_BUFFERING:
            return sequentialBuffering != SEQUENTIAL_BUFFERING_EDEFAULT;
        case ImsdatabasePackage.PCB__ALTERNATE_RESPONSE:
            return alternateResponse != ALTERNATE_RESPONSE_EDEFAULT;
        case ImsdatabasePackage.PCB__EXPRESS:
            return express != EXPRESS_EDEFAULT;
        case ImsdatabasePackage.PCB__MODIFY:
            return modify != MODIFY_EDEFAULT;
        case ImsdatabasePackage.PCB__SAME_TERMINAL:
            return sameTerminal != SAME_TERMINAL_EDEFAULT;
        case ImsdatabasePackage.PCB__DESTINATION_TYPE:
            return destinationType != DESTINATION_TYPE_EDEFAULT;
        case ImsdatabasePackage.PCB__LTERM_NAME:
            return LTERM_NAME_EDEFAULT == null ? ltermName != null : !LTERM_NAME_EDEFAULT.equals(ltermName);
        case ImsdatabasePackage.PCB__PROC_SEQ:
            return procSeq != null;
        case ImsdatabasePackage.PCB__DBD:
            return dbd != null;
        case ImsdatabasePackage.PCB__PSB:
            return psb != null && !psb.isEmpty();
        case ImsdatabasePackage.PCB__SEN_SEGMENT:
            return senSegment != null && !senSegment.isEmpty();
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
        result.append(" (pcbType: ");
        result.append(pcbType);
        result.append(", list: ");
        result.append(list);
        result.append(", keyLength: ");
        result.append(keyLength);
        result.append(", processingOptions: ");
        result.append(processingOptions);
        result.append(", positioning: ");
        result.append(positioning);
        result.append(", sequentialBuffering: ");
        result.append(sequentialBuffering);
        result.append(", alternateResponse: ");
        result.append(alternateResponse);
        result.append(", express: ");
        result.append(express);
        result.append(", modify: ");
        result.append(modify);
        result.append(", sameTerminal: ");
        result.append(sameTerminal);
        result.append(", destinationType: ");
        result.append(destinationType);
        result.append(", ltermName: ");
        result.append(ltermName);
        result.append(')');
        return result.toString();
    }

} // PCBImpl
