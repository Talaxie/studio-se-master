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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.record.impl.RecordDefImpl;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.Exit;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.SegmentLogical;
import orgomg.cwmx.resource.imsdatabase.SenSegment;
import orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RulesType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Segment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#isExitFlag <em>Exit Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getMaximumLength <em>Maximum Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getMinimumLength <em>Minimum Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getSubsetPointers <em>Subset Pointers</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#isDirectDependent <em>Direct Dependent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getPcPointer <em>Pc Pointer</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getLogical <em>Logical</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getSenseg <em>Senseg</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getChild <em>Child</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentImpl#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends RecordDefImpl implements Segment {

    /**
     * The default value of the '{@link #isExitFlag() <em>Exit Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isExitFlag()
     * @generated
     * @ordered
     */
    protected static final boolean EXIT_FLAG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExitFlag() <em>Exit Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isExitFlag()
     * @generated
     * @ordered
     */
    protected boolean exitFlag = EXIT_FLAG_EDEFAULT;

    /**
     * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected static final String FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected String frequency = FREQUENCY_EDEFAULT;

    /**
     * The default value of the '{@link #getMaximumLength() <em>Maximum Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMaximumLength()
     * @generated
     * @ordered
     */
    protected static final long MAXIMUM_LENGTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaximumLength() <em>Maximum Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMaximumLength()
     * @generated
     * @ordered
     */
    protected long maximumLength = MAXIMUM_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getMinimumLength() <em>Minimum Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMinimumLength()
     * @generated
     * @ordered
     */
    protected static final long MINIMUM_LENGTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMinimumLength() <em>Minimum Length</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMinimumLength()
     * @generated
     * @ordered
     */
    protected long minimumLength = MINIMUM_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getRules() <em>Rules</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected static final RulesType RULES_EDEFAULT = RulesType.IMSRT_FIRST;

    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected RulesType rules = RULES_EDEFAULT;

    /**
     * The default value of the '{@link #getSubsetPointers() <em>Subset Pointers</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSubsetPointers()
     * @generated
     * @ordered
     */
    protected static final String SUBSET_POINTERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubsetPointers() <em>Subset Pointers</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSubsetPointers()
     * @generated
     * @ordered
     */
    protected String subsetPointers = SUBSET_POINTERS_EDEFAULT;

    /**
     * The default value of the '{@link #isDirectDependent() <em>Direct Dependent</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isDirectDependent()
     * @generated
     * @ordered
     */
    protected static final boolean DIRECT_DEPENDENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDirectDependent() <em>Direct Dependent</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isDirectDependent()
     * @generated
     * @ordered
     */
    protected boolean directDependent = DIRECT_DEPENDENT_EDEFAULT;

    /**
     * The default value of the '{@link #getPcPointer() <em>Pc Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPcPointer()
     * @generated
     * @ordered
     */
    protected static final ChildPointerType PC_POINTER_EDEFAULT = ChildPointerType.IMSCP_SNGL;

    /**
     * The cached value of the '{@link #getPcPointer() <em>Pc Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPcPointer()
     * @generated
     * @ordered
     */
    protected ChildPointerType pcPointer = PC_POINTER_EDEFAULT;

    /**
     * The cached value of the '{@link #getLogical() <em>Logical</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLogical()
     * @generated
     * @ordered
     */
    protected EList<SegmentLogical> logical;

    /**
     * The cached value of the '{@link #getSenseg() <em>Senseg</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSenseg()
     * @generated
     * @ordered
     */
    protected EList<SenSegment> senseg;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected EList<Segment> child;

    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected Segment parent;

    /**
     * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExit()
     * @generated
     * @ordered
     */
    protected EList<Exit> exit;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.SEGMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isExitFlag() {
        return exitFlag;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExitFlag(boolean newExitFlag) {
        boolean oldExitFlag = exitFlag;
        exitFlag = newExitFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__EXIT_FLAG, oldExitFlag, exitFlag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFrequency(String newFrequency) {
        String oldFrequency = frequency;
        frequency = newFrequency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__FREQUENCY, oldFrequency, frequency));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMaximumLength() {
        return maximumLength;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumLength(long newMaximumLength) {
        long oldMaximumLength = maximumLength;
        maximumLength = newMaximumLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__MAXIMUM_LENGTH, oldMaximumLength,
                    maximumLength));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMinimumLength() {
        return minimumLength;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinimumLength(long newMinimumLength) {
        long oldMinimumLength = minimumLength;
        minimumLength = newMinimumLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__MINIMUM_LENGTH, oldMinimumLength,
                    minimumLength));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RulesType getRules() {
        return rules;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRules(RulesType newRules) {
        RulesType oldRules = rules;
        rules = newRules == null ? RULES_EDEFAULT : newRules;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__RULES, oldRules, rules));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getSubsetPointers() {
        return subsetPointers;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSubsetPointers(String newSubsetPointers) {
        String oldSubsetPointers = subsetPointers;
        subsetPointers = newSubsetPointers;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__SUBSET_POINTERS, oldSubsetPointers,
                    subsetPointers));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isDirectDependent() {
        return directDependent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDirectDependent(boolean newDirectDependent) {
        boolean oldDirectDependent = directDependent;
        directDependent = newDirectDependent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__DIRECT_DEPENDENT,
                    oldDirectDependent, directDependent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ChildPointerType getPcPointer() {
        return pcPointer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPcPointer(ChildPointerType newPcPointer) {
        ChildPointerType oldPcPointer = pcPointer;
        pcPointer = newPcPointer == null ? PC_POINTER_EDEFAULT : newPcPointer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__PC_POINTER, oldPcPointer, pcPointer));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SegmentLogical> getLogical() {
        if (logical == null) {
            logical = new EObjectWithInverseResolvingEList.ManyInverse<SegmentLogical>(SegmentLogical.class, this,
                    ImsdatabasePackage.SEGMENT__LOGICAL, ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL);
        }
        return logical;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBD getDbd() {
        if (eContainerFeatureID() != ImsdatabasePackage.SEGMENT__DBD)
            return null;
        return (DBD) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDbd(DBD newDbd, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDbd, ImsdatabasePackage.SEGMENT__DBD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDbd(DBD newDbd) {
        if (newDbd != eInternalContainer() || (eContainerFeatureID() != ImsdatabasePackage.SEGMENT__DBD && newDbd != null)) {
            if (EcoreUtil.isAncestor(this, newDbd))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDbd != null)
                msgs = ((InternalEObject) newDbd).eInverseAdd(this, ImsdatabasePackage.DBD__SEGMENT, DBD.class, msgs);
            msgs = basicSetDbd(newDbd, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__DBD, newDbd, newDbd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SenSegment> getSenseg() {
        if (senseg == null) {
            senseg = new EObjectWithInverseResolvingEList<SenSegment>(SenSegment.class, this, ImsdatabasePackage.SEGMENT__SENSEG,
                    ImsdatabasePackage.SEN_SEGMENT__SEGMENT);
        }
        return senseg;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Segment> getChild() {
        if (child == null) {
            child = new EObjectWithInverseResolvingEList<Segment>(Segment.class, this, ImsdatabasePackage.SEGMENT__CHILD,
                    ImsdatabasePackage.SEGMENT__PARENT);
        }
        return child;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject) parent;
            parent = (Segment) eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SEGMENT__PARENT, oldParent,
                            parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParent(Segment newParent, NotificationChain msgs) {
        Segment oldParent = parent;
        parent = newParent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__PARENT,
                    oldParent, newParent);
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
    public void setParent(Segment newParent) {
        if (newParent != parent) {
            NotificationChain msgs = null;
            if (parent != null)
                msgs = ((InternalEObject) parent).eInverseRemove(this, ImsdatabasePackage.SEGMENT__CHILD, Segment.class, msgs);
            if (newParent != null)
                msgs = ((InternalEObject) newParent).eInverseAdd(this, ImsdatabasePackage.SEGMENT__CHILD, Segment.class, msgs);
            msgs = basicSetParent(newParent, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT__PARENT, newParent, newParent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Exit> getExit() {
        if (exit == null) {
            exit = new EObjectContainmentWithInverseEList<Exit>(Exit.class, this, ImsdatabasePackage.SEGMENT__EXIT,
                    ImsdatabasePackage.EXIT__SEGMENT);
        }
        return exit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.SEGMENT__LOGICAL:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLogical()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__DBD:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDbd((DBD) otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__SENSEG:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSenseg()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__CHILD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getChild()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__PARENT:
            if (parent != null)
                msgs = ((InternalEObject) parent).eInverseRemove(this, ImsdatabasePackage.SEGMENT__CHILD, Segment.class, msgs);
            return basicSetParent((Segment) otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__EXIT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getExit()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.SEGMENT__LOGICAL:
            return ((InternalEList<?>) getLogical()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__DBD:
            return basicSetDbd(null, msgs);
        case ImsdatabasePackage.SEGMENT__SENSEG:
            return ((InternalEList<?>) getSenseg()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__CHILD:
            return ((InternalEList<?>) getChild()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT__PARENT:
            return basicSetParent(null, msgs);
        case ImsdatabasePackage.SEGMENT__EXIT:
            return ((InternalEList<?>) getExit()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.SEGMENT__DBD:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.DBD__SEGMENT, DBD.class, msgs);
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
        case ImsdatabasePackage.SEGMENT__EXIT_FLAG:
            return isExitFlag();
        case ImsdatabasePackage.SEGMENT__FREQUENCY:
            return getFrequency();
        case ImsdatabasePackage.SEGMENT__MAXIMUM_LENGTH:
            return getMaximumLength();
        case ImsdatabasePackage.SEGMENT__MINIMUM_LENGTH:
            return getMinimumLength();
        case ImsdatabasePackage.SEGMENT__RULES:
            return getRules();
        case ImsdatabasePackage.SEGMENT__SUBSET_POINTERS:
            return getSubsetPointers();
        case ImsdatabasePackage.SEGMENT__DIRECT_DEPENDENT:
            return isDirectDependent();
        case ImsdatabasePackage.SEGMENT__PC_POINTER:
            return getPcPointer();
        case ImsdatabasePackage.SEGMENT__LOGICAL:
            return getLogical();
        case ImsdatabasePackage.SEGMENT__DBD:
            return getDbd();
        case ImsdatabasePackage.SEGMENT__SENSEG:
            return getSenseg();
        case ImsdatabasePackage.SEGMENT__CHILD:
            return getChild();
        case ImsdatabasePackage.SEGMENT__PARENT:
            if (resolve)
                return getParent();
            return basicGetParent();
        case ImsdatabasePackage.SEGMENT__EXIT:
            return getExit();
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
        case ImsdatabasePackage.SEGMENT__EXIT_FLAG:
            setExitFlag((Boolean) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__FREQUENCY:
            setFrequency((String) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__MAXIMUM_LENGTH:
            setMaximumLength((Long) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__MINIMUM_LENGTH:
            setMinimumLength((Long) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__RULES:
            setRules((RulesType) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__SUBSET_POINTERS:
            setSubsetPointers((String) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__DIRECT_DEPENDENT:
            setDirectDependent((Boolean) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__PC_POINTER:
            setPcPointer((ChildPointerType) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__LOGICAL:
            getLogical().clear();
            getLogical().addAll((Collection<? extends SegmentLogical>) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__DBD:
            setDbd((DBD) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__SENSEG:
            getSenseg().clear();
            getSenseg().addAll((Collection<? extends SenSegment>) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__CHILD:
            getChild().clear();
            getChild().addAll((Collection<? extends Segment>) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__PARENT:
            setParent((Segment) newValue);
            return;
        case ImsdatabasePackage.SEGMENT__EXIT:
            getExit().clear();
            getExit().addAll((Collection<? extends Exit>) newValue);
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
        case ImsdatabasePackage.SEGMENT__EXIT_FLAG:
            setExitFlag(EXIT_FLAG_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__FREQUENCY:
            setFrequency(FREQUENCY_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__MAXIMUM_LENGTH:
            setMaximumLength(MAXIMUM_LENGTH_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__MINIMUM_LENGTH:
            setMinimumLength(MINIMUM_LENGTH_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__RULES:
            setRules(RULES_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__SUBSET_POINTERS:
            setSubsetPointers(SUBSET_POINTERS_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__DIRECT_DEPENDENT:
            setDirectDependent(DIRECT_DEPENDENT_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__PC_POINTER:
            setPcPointer(PC_POINTER_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT__LOGICAL:
            getLogical().clear();
            return;
        case ImsdatabasePackage.SEGMENT__DBD:
            setDbd((DBD) null);
            return;
        case ImsdatabasePackage.SEGMENT__SENSEG:
            getSenseg().clear();
            return;
        case ImsdatabasePackage.SEGMENT__CHILD:
            getChild().clear();
            return;
        case ImsdatabasePackage.SEGMENT__PARENT:
            setParent((Segment) null);
            return;
        case ImsdatabasePackage.SEGMENT__EXIT:
            getExit().clear();
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
        case ImsdatabasePackage.SEGMENT__EXIT_FLAG:
            return exitFlag != EXIT_FLAG_EDEFAULT;
        case ImsdatabasePackage.SEGMENT__FREQUENCY:
            return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
        case ImsdatabasePackage.SEGMENT__MAXIMUM_LENGTH:
            return maximumLength != MAXIMUM_LENGTH_EDEFAULT;
        case ImsdatabasePackage.SEGMENT__MINIMUM_LENGTH:
            return minimumLength != MINIMUM_LENGTH_EDEFAULT;
        case ImsdatabasePackage.SEGMENT__RULES:
            return rules != RULES_EDEFAULT;
        case ImsdatabasePackage.SEGMENT__SUBSET_POINTERS:
            return SUBSET_POINTERS_EDEFAULT == null ? subsetPointers != null : !SUBSET_POINTERS_EDEFAULT.equals(subsetPointers);
        case ImsdatabasePackage.SEGMENT__DIRECT_DEPENDENT:
            return directDependent != DIRECT_DEPENDENT_EDEFAULT;
        case ImsdatabasePackage.SEGMENT__PC_POINTER:
            return pcPointer != PC_POINTER_EDEFAULT;
        case ImsdatabasePackage.SEGMENT__LOGICAL:
            return logical != null && !logical.isEmpty();
        case ImsdatabasePackage.SEGMENT__DBD:
            return getDbd() != null;
        case ImsdatabasePackage.SEGMENT__SENSEG:
            return senseg != null && !senseg.isEmpty();
        case ImsdatabasePackage.SEGMENT__CHILD:
            return child != null && !child.isEmpty();
        case ImsdatabasePackage.SEGMENT__PARENT:
            return parent != null;
        case ImsdatabasePackage.SEGMENT__EXIT:
            return exit != null && !exit.isEmpty();
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
        result.append(" (exitFlag: ");
        result.append(exitFlag);
        result.append(", frequency: ");
        result.append(frequency);
        result.append(", maximumLength: ");
        result.append(maximumLength);
        result.append(", minimumLength: ");
        result.append(minimumLength);
        result.append(", rules: ");
        result.append(rules);
        result.append(", subsetPointers: ");
        result.append(subsetPointers);
        result.append(", directDependent: ");
        result.append(directDependent);
        result.append(", pcPointer: ");
        result.append(pcPointer);
        result.append(')');
        return result.toString();
    }

} // SegmentImpl
