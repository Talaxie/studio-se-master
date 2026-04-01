/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.LCHILD;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;
import orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ParentType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RulesType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>LCHILD</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#isCounter <em>Counter</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getLcPointer <em>Lc Pointer</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#isLparentFlag <em>Lparent Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getLtwin <em>Ltwin</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getVirtualParent <em>Virtual Parent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getLparent <em>Lparent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getLchild <em>Lchild</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.LCHILDImpl#getPairedSegment <em>Paired Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LCHILDImpl extends ModelElementImpl implements LCHILD {

    /**
     * The default value of the '{@link #isCounter() <em>Counter</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCounter()
     * @generated
     * @ordered
     */
    protected static final boolean COUNTER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCounter() <em>Counter</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCounter()
     * @generated
     * @ordered
     */
    protected boolean counter = COUNTER_EDEFAULT;

    /**
     * The default value of the '{@link #getLcPointer() <em>Lc Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLcPointer()
     * @generated
     * @ordered
     */
    protected static final ChildPointerType LC_POINTER_EDEFAULT = ChildPointerType.IMSCP_SNGL;

    /**
     * The cached value of the '{@link #getLcPointer() <em>Lc Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLcPointer()
     * @generated
     * @ordered
     */
    protected ChildPointerType lcPointer = LC_POINTER_EDEFAULT;

    /**
     * The default value of the '{@link #isLparentFlag() <em>Lparent Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isLparentFlag()
     * @generated
     * @ordered
     */
    protected static final boolean LPARENT_FLAG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLparentFlag() <em>Lparent Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isLparentFlag()
     * @generated
     * @ordered
     */
    protected boolean lparentFlag = LPARENT_FLAG_EDEFAULT;

    /**
     * The default value of the '{@link #getLtwin() <em>Ltwin</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLtwin()
     * @generated
     * @ordered
     */
    protected static final LPointerType LTWIN_EDEFAULT = LPointerType.IMSLP_LTWIN;

    /**
     * The cached value of the '{@link #getLtwin() <em>Ltwin</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLtwin()
     * @generated
     * @ordered
     */
    protected LPointerType ltwin = LTWIN_EDEFAULT;

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
     * The default value of the '{@link #getVirtualParent() <em>Virtual Parent</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVirtualParent()
     * @generated
     * @ordered
     */
    protected static final ParentType VIRTUAL_PARENT_EDEFAULT = ParentType.IMS_VIRTUAL;

    /**
     * The cached value of the '{@link #getVirtualParent() <em>Virtual Parent</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVirtualParent()
     * @generated
     * @ordered
     */
    protected ParentType virtualParent = VIRTUAL_PARENT_EDEFAULT;

    /**
     * The cached value of the '{@link #getLchild() <em>Lchild</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLchild()
     * @generated
     * @ordered
     */
    protected SegmentComplex lchild;

    /**
     * The cached value of the '{@link #getPairedSegment() <em>Paired Segment</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPairedSegment()
     * @generated
     * @ordered
     */
    protected SegmentComplex pairedSegment;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected LCHILDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.LCHILD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isCounter() {
        return counter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCounter(boolean newCounter) {
        boolean oldCounter = counter;
        counter = newCounter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__COUNTER, oldCounter, counter));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ChildPointerType getLcPointer() {
        return lcPointer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLcPointer(ChildPointerType newLcPointer) {
        ChildPointerType oldLcPointer = lcPointer;
        lcPointer = newLcPointer == null ? LC_POINTER_EDEFAULT : newLcPointer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__LC_POINTER, oldLcPointer, lcPointer));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isLparentFlag() {
        return lparentFlag;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLparentFlag(boolean newLparentFlag) {
        boolean oldLparentFlag = lparentFlag;
        lparentFlag = newLparentFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__LPARENT_FLAG, oldLparentFlag,
                    lparentFlag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LPointerType getLtwin() {
        return ltwin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLtwin(LPointerType newLtwin) {
        LPointerType oldLtwin = ltwin;
        ltwin = newLtwin == null ? LTWIN_EDEFAULT : newLtwin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__LTWIN, oldLtwin, ltwin));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__RULES, oldRules, rules));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ParentType getVirtualParent() {
        return virtualParent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVirtualParent(ParentType newVirtualParent) {
        ParentType oldVirtualParent = virtualParent;
        virtualParent = newVirtualParent == null ? VIRTUAL_PARENT_EDEFAULT : newVirtualParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__VIRTUAL_PARENT, oldVirtualParent,
                    virtualParent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex getLparent() {
        if (eContainerFeatureID() != ImsdatabasePackage.LCHILD__LPARENT)
            return null;
        return (SegmentComplex) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLparent(SegmentComplex newLparent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newLparent, ImsdatabasePackage.LCHILD__LPARENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLparent(SegmentComplex newLparent) {
        if (newLparent != eInternalContainer()
                || (eContainerFeatureID() != ImsdatabasePackage.LCHILD__LPARENT && newLparent != null)) {
            if (EcoreUtil.isAncestor(this, newLparent))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLparent != null)
                msgs = ((InternalEObject) newLparent).eInverseAdd(this, ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD,
                        SegmentComplex.class, msgs);
            msgs = basicSetLparent(newLparent, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__LPARENT, newLparent, newLparent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex getLchild() {
        if (lchild != null && lchild.eIsProxy()) {
            InternalEObject oldLchild = (InternalEObject) lchild;
            lchild = (SegmentComplex) eResolveProxy(oldLchild);
            if (lchild != oldLchild) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.LCHILD__LCHILD, oldLchild,
                            lchild));
            }
        }
        return lchild;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex basicGetLchild() {
        return lchild;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLchild(SegmentComplex newLchild, NotificationChain msgs) {
        SegmentComplex oldLchild = lchild;
        lchild = newLchild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__LCHILD,
                    oldLchild, newLchild);
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
    public void setLchild(SegmentComplex newLchild) {
        if (newLchild != lchild) {
            NotificationChain msgs = null;
            if (lchild != null)
                msgs = ((InternalEObject) lchild).eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT,
                        SegmentComplex.class, msgs);
            if (newLchild != null)
                msgs = ((InternalEObject) newLchild).eInverseAdd(this, ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT,
                        SegmentComplex.class, msgs);
            msgs = basicSetLchild(newLchild, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__LCHILD, newLchild, newLchild));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex getPairedSegment() {
        if (pairedSegment != null && pairedSegment.eIsProxy()) {
            InternalEObject oldPairedSegment = (InternalEObject) pairedSegment;
            pairedSegment = (SegmentComplex) eResolveProxy(oldPairedSegment);
            if (pairedSegment != oldPairedSegment) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.LCHILD__PAIRED_SEGMENT,
                            oldPairedSegment, pairedSegment));
            }
        }
        return pairedSegment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex basicGetPairedSegment() {
        return pairedSegment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPairedSegment(SegmentComplex newPairedSegment, NotificationChain msgs) {
        SegmentComplex oldPairedSegment = pairedSegment;
        pairedSegment = newPairedSegment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.LCHILD__PAIRED_SEGMENT, oldPairedSegment, newPairedSegment);
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
    public void setPairedSegment(SegmentComplex newPairedSegment) {
        if (newPairedSegment != pairedSegment) {
            NotificationChain msgs = null;
            if (pairedSegment != null)
                msgs = ((InternalEObject) pairedSegment).eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD,
                        SegmentComplex.class, msgs);
            if (newPairedSegment != null)
                msgs = ((InternalEObject) newPairedSegment).eInverseAdd(this, ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD,
                        SegmentComplex.class, msgs);
            msgs = basicSetPairedSegment(newPairedSegment, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.LCHILD__PAIRED_SEGMENT, newPairedSegment,
                    newPairedSegment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.LCHILD__LPARENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetLparent((SegmentComplex) otherEnd, msgs);
        case ImsdatabasePackage.LCHILD__LCHILD:
            if (lchild != null)
                msgs = ((InternalEObject) lchild).eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT,
                        SegmentComplex.class, msgs);
            return basicSetLchild((SegmentComplex) otherEnd, msgs);
        case ImsdatabasePackage.LCHILD__PAIRED_SEGMENT:
            if (pairedSegment != null)
                msgs = ((InternalEObject) pairedSegment).eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD,
                        SegmentComplex.class, msgs);
            return basicSetPairedSegment((SegmentComplex) otherEnd, msgs);
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
        case ImsdatabasePackage.LCHILD__LPARENT:
            return basicSetLparent(null, msgs);
        case ImsdatabasePackage.LCHILD__LCHILD:
            return basicSetLchild(null, msgs);
        case ImsdatabasePackage.LCHILD__PAIRED_SEGMENT:
            return basicSetPairedSegment(null, msgs);
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
        case ImsdatabasePackage.LCHILD__LPARENT:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD, SegmentComplex.class,
                    msgs);
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
        case ImsdatabasePackage.LCHILD__COUNTER:
            return isCounter();
        case ImsdatabasePackage.LCHILD__LC_POINTER:
            return getLcPointer();
        case ImsdatabasePackage.LCHILD__LPARENT_FLAG:
            return isLparentFlag();
        case ImsdatabasePackage.LCHILD__LTWIN:
            return getLtwin();
        case ImsdatabasePackage.LCHILD__RULES:
            return getRules();
        case ImsdatabasePackage.LCHILD__VIRTUAL_PARENT:
            return getVirtualParent();
        case ImsdatabasePackage.LCHILD__LPARENT:
            return getLparent();
        case ImsdatabasePackage.LCHILD__LCHILD:
            if (resolve)
                return getLchild();
            return basicGetLchild();
        case ImsdatabasePackage.LCHILD__PAIRED_SEGMENT:
            if (resolve)
                return getPairedSegment();
            return basicGetPairedSegment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ImsdatabasePackage.LCHILD__COUNTER:
            setCounter((Boolean) newValue);
            return;
        case ImsdatabasePackage.LCHILD__LC_POINTER:
            setLcPointer((ChildPointerType) newValue);
            return;
        case ImsdatabasePackage.LCHILD__LPARENT_FLAG:
            setLparentFlag((Boolean) newValue);
            return;
        case ImsdatabasePackage.LCHILD__LTWIN:
            setLtwin((LPointerType) newValue);
            return;
        case ImsdatabasePackage.LCHILD__RULES:
            setRules((RulesType) newValue);
            return;
        case ImsdatabasePackage.LCHILD__VIRTUAL_PARENT:
            setVirtualParent((ParentType) newValue);
            return;
        case ImsdatabasePackage.LCHILD__LPARENT:
            setLparent((SegmentComplex) newValue);
            return;
        case ImsdatabasePackage.LCHILD__LCHILD:
            setLchild((SegmentComplex) newValue);
            return;
        case ImsdatabasePackage.LCHILD__PAIRED_SEGMENT:
            setPairedSegment((SegmentComplex) newValue);
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
        case ImsdatabasePackage.LCHILD__COUNTER:
            setCounter(COUNTER_EDEFAULT);
            return;
        case ImsdatabasePackage.LCHILD__LC_POINTER:
            setLcPointer(LC_POINTER_EDEFAULT);
            return;
        case ImsdatabasePackage.LCHILD__LPARENT_FLAG:
            setLparentFlag(LPARENT_FLAG_EDEFAULT);
            return;
        case ImsdatabasePackage.LCHILD__LTWIN:
            setLtwin(LTWIN_EDEFAULT);
            return;
        case ImsdatabasePackage.LCHILD__RULES:
            setRules(RULES_EDEFAULT);
            return;
        case ImsdatabasePackage.LCHILD__VIRTUAL_PARENT:
            setVirtualParent(VIRTUAL_PARENT_EDEFAULT);
            return;
        case ImsdatabasePackage.LCHILD__LPARENT:
            setLparent((SegmentComplex) null);
            return;
        case ImsdatabasePackage.LCHILD__LCHILD:
            setLchild((SegmentComplex) null);
            return;
        case ImsdatabasePackage.LCHILD__PAIRED_SEGMENT:
            setPairedSegment((SegmentComplex) null);
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
        case ImsdatabasePackage.LCHILD__COUNTER:
            return counter != COUNTER_EDEFAULT;
        case ImsdatabasePackage.LCHILD__LC_POINTER:
            return lcPointer != LC_POINTER_EDEFAULT;
        case ImsdatabasePackage.LCHILD__LPARENT_FLAG:
            return lparentFlag != LPARENT_FLAG_EDEFAULT;
        case ImsdatabasePackage.LCHILD__LTWIN:
            return ltwin != LTWIN_EDEFAULT;
        case ImsdatabasePackage.LCHILD__RULES:
            return rules != RULES_EDEFAULT;
        case ImsdatabasePackage.LCHILD__VIRTUAL_PARENT:
            return virtualParent != VIRTUAL_PARENT_EDEFAULT;
        case ImsdatabasePackage.LCHILD__LPARENT:
            return getLparent() != null;
        case ImsdatabasePackage.LCHILD__LCHILD:
            return lchild != null;
        case ImsdatabasePackage.LCHILD__PAIRED_SEGMENT:
            return pairedSegment != null;
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
        result.append(" (counter: ");
        result.append(counter);
        result.append(", lcPointer: ");
        result.append(lcPointer);
        result.append(", lparentFlag: ");
        result.append(lparentFlag);
        result.append(", ltwin: ");
        result.append(ltwin);
        result.append(", rules: ");
        result.append(rules);
        result.append(", virtualParent: ");
        result.append(virtualParent);
        result.append(')');
        return result.toString();
    }

} // LCHILDImpl
