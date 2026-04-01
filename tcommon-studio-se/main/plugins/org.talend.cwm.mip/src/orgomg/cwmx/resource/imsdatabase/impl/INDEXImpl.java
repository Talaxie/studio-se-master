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
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmx.resource.imsdatabase.HIDAM;
import orgomg.cwmx.resource.imsdatabase.INDEX;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>INDEX</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#isDosCompatibility <em>Dos Compatibility</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#isProtect <em>Protect</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#getPrimaryTarget <em>Primary Target</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#getSecondaryTarget <em>Secondary Target</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#getSharingIndex <em>Sharing Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#getSharedIndex <em>Shared Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.INDEXImpl#getSequencedPCB <em>Sequenced PCB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class INDEXImpl extends AccessMethodImpl implements INDEX {

    /**
     * The default value of the '{@link #isDosCompatibility() <em>Dos Compatibility</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isDosCompatibility()
     * @generated
     * @ordered
     */
    protected static final boolean DOS_COMPATIBILITY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDosCompatibility() <em>Dos Compatibility</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isDosCompatibility()
     * @generated
     * @ordered
     */
    protected boolean dosCompatibility = DOS_COMPATIBILITY_EDEFAULT;

    /**
     * The default value of the '{@link #isProtect() <em>Protect</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isProtect()
     * @generated
     * @ordered
     */
    protected static final boolean PROTECT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isProtect() <em>Protect</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isProtect()
     * @generated
     * @ordered
     */
    protected boolean protect = PROTECT_EDEFAULT;

    /**
     * The cached value of the '{@link #getPrimaryTarget() <em>Primary Target</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPrimaryTarget()
     * @generated
     * @ordered
     */
    protected HIDAM primaryTarget;

    /**
     * The cached value of the '{@link #getSecondaryTarget() <em>Secondary Target</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSecondaryTarget()
     * @generated
     * @ordered
     */
    protected SecondaryIndex secondaryTarget;

    /**
     * The cached value of the '{@link #getSharingIndex() <em>Sharing Index</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSharingIndex()
     * @generated
     * @ordered
     */
    protected EList<INDEX> sharingIndex;

    /**
     * The cached value of the '{@link #getSharedIndex() <em>Shared Index</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSharedIndex()
     * @generated
     * @ordered
     */
    protected INDEX sharedIndex;

    /**
     * The cached value of the '{@link #getSequencedPCB() <em>Sequenced PCB</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSequencedPCB()
     * @generated
     * @ordered
     */
    protected EList<PCB> sequencedPCB;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected INDEXImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.INDEX;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isDosCompatibility() {
        return dosCompatibility;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDosCompatibility(boolean newDosCompatibility) {
        boolean oldDosCompatibility = dosCompatibility;
        dosCompatibility = newDosCompatibility;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.INDEX__DOS_COMPATIBILITY,
                    oldDosCompatibility, dosCompatibility));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isProtect() {
        return protect;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProtect(boolean newProtect) {
        boolean oldProtect = protect;
        protect = newProtect;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.INDEX__PROTECT, oldProtect, protect));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public HIDAM getPrimaryTarget() {
        if (primaryTarget != null && primaryTarget.eIsProxy()) {
            InternalEObject oldPrimaryTarget = (InternalEObject) primaryTarget;
            primaryTarget = (HIDAM) eResolveProxy(oldPrimaryTarget);
            if (primaryTarget != oldPrimaryTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.INDEX__PRIMARY_TARGET,
                            oldPrimaryTarget, primaryTarget));
            }
        }
        return primaryTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public HIDAM basicGetPrimaryTarget() {
        return primaryTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPrimaryTarget(HIDAM newPrimaryTarget, NotificationChain msgs) {
        HIDAM oldPrimaryTarget = primaryTarget;
        primaryTarget = newPrimaryTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.INDEX__PRIMARY_TARGET, oldPrimaryTarget, newPrimaryTarget);
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
    public void setPrimaryTarget(HIDAM newPrimaryTarget) {
        if (newPrimaryTarget != primaryTarget) {
            NotificationChain msgs = null;
            if (primaryTarget != null)
                msgs = ((InternalEObject) primaryTarget).eInverseRemove(this, ImsdatabasePackage.HIDAM__INDEX, HIDAM.class, msgs);
            if (newPrimaryTarget != null)
                msgs = ((InternalEObject) newPrimaryTarget).eInverseAdd(this, ImsdatabasePackage.HIDAM__INDEX, HIDAM.class, msgs);
            msgs = basicSetPrimaryTarget(newPrimaryTarget, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.INDEX__PRIMARY_TARGET, newPrimaryTarget,
                    newPrimaryTarget));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SecondaryIndex getSecondaryTarget() {
        if (secondaryTarget != null && secondaryTarget.eIsProxy()) {
            InternalEObject oldSecondaryTarget = (InternalEObject) secondaryTarget;
            secondaryTarget = (SecondaryIndex) eResolveProxy(oldSecondaryTarget);
            if (secondaryTarget != oldSecondaryTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.INDEX__SECONDARY_TARGET,
                            oldSecondaryTarget, secondaryTarget));
            }
        }
        return secondaryTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SecondaryIndex basicGetSecondaryTarget() {
        return secondaryTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecondaryTarget(SecondaryIndex newSecondaryTarget, NotificationChain msgs) {
        SecondaryIndex oldSecondaryTarget = secondaryTarget;
        secondaryTarget = newSecondaryTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.INDEX__SECONDARY_TARGET, oldSecondaryTarget, newSecondaryTarget);
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
    public void setSecondaryTarget(SecondaryIndex newSecondaryTarget) {
        if (newSecondaryTarget != secondaryTarget) {
            NotificationChain msgs = null;
            if (secondaryTarget != null)
                msgs = ((InternalEObject) secondaryTarget).eInverseRemove(this, ImsdatabasePackage.SECONDARY_INDEX__INDEX,
                        SecondaryIndex.class, msgs);
            if (newSecondaryTarget != null)
                msgs = ((InternalEObject) newSecondaryTarget).eInverseAdd(this, ImsdatabasePackage.SECONDARY_INDEX__INDEX,
                        SecondaryIndex.class, msgs);
            msgs = basicSetSecondaryTarget(newSecondaryTarget, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.INDEX__SECONDARY_TARGET, newSecondaryTarget,
                    newSecondaryTarget));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<INDEX> getSharingIndex() {
        if (sharingIndex == null) {
            sharingIndex = new EObjectWithInverseResolvingEList<INDEX>(INDEX.class, this,
                    ImsdatabasePackage.INDEX__SHARING_INDEX, ImsdatabasePackage.INDEX__SHARED_INDEX);
        }
        return sharingIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX getSharedIndex() {
        if (sharedIndex != null && sharedIndex.eIsProxy()) {
            InternalEObject oldSharedIndex = (InternalEObject) sharedIndex;
            sharedIndex = (INDEX) eResolveProxy(oldSharedIndex);
            if (sharedIndex != oldSharedIndex) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.INDEX__SHARED_INDEX,
                            oldSharedIndex, sharedIndex));
            }
        }
        return sharedIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX basicGetSharedIndex() {
        return sharedIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSharedIndex(INDEX newSharedIndex, NotificationChain msgs) {
        INDEX oldSharedIndex = sharedIndex;
        sharedIndex = newSharedIndex;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.INDEX__SHARED_INDEX, oldSharedIndex, newSharedIndex);
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
    public void setSharedIndex(INDEX newSharedIndex) {
        if (newSharedIndex != sharedIndex) {
            NotificationChain msgs = null;
            if (sharedIndex != null)
                msgs = ((InternalEObject) sharedIndex).eInverseRemove(this, ImsdatabasePackage.INDEX__SHARING_INDEX, INDEX.class,
                        msgs);
            if (newSharedIndex != null)
                msgs = ((InternalEObject) newSharedIndex).eInverseAdd(this, ImsdatabasePackage.INDEX__SHARING_INDEX, INDEX.class,
                        msgs);
            msgs = basicSetSharedIndex(newSharedIndex, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.INDEX__SHARED_INDEX, newSharedIndex,
                    newSharedIndex));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<PCB> getSequencedPCB() {
        if (sequencedPCB == null) {
            sequencedPCB = new EObjectWithInverseResolvingEList<PCB>(PCB.class, this, ImsdatabasePackage.INDEX__SEQUENCED_PCB,
                    ImsdatabasePackage.PCB__PROC_SEQ);
        }
        return sequencedPCB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.INDEX__PRIMARY_TARGET:
            if (primaryTarget != null)
                msgs = ((InternalEObject) primaryTarget).eInverseRemove(this, ImsdatabasePackage.HIDAM__INDEX, HIDAM.class, msgs);
            return basicSetPrimaryTarget((HIDAM) otherEnd, msgs);
        case ImsdatabasePackage.INDEX__SECONDARY_TARGET:
            if (secondaryTarget != null)
                msgs = ((InternalEObject) secondaryTarget).eInverseRemove(this, ImsdatabasePackage.SECONDARY_INDEX__INDEX,
                        SecondaryIndex.class, msgs);
            return basicSetSecondaryTarget((SecondaryIndex) otherEnd, msgs);
        case ImsdatabasePackage.INDEX__SHARING_INDEX:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSharingIndex()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.INDEX__SHARED_INDEX:
            if (sharedIndex != null)
                msgs = ((InternalEObject) sharedIndex).eInverseRemove(this, ImsdatabasePackage.INDEX__SHARING_INDEX, INDEX.class,
                        msgs);
            return basicSetSharedIndex((INDEX) otherEnd, msgs);
        case ImsdatabasePackage.INDEX__SEQUENCED_PCB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSequencedPCB()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.INDEX__PRIMARY_TARGET:
            return basicSetPrimaryTarget(null, msgs);
        case ImsdatabasePackage.INDEX__SECONDARY_TARGET:
            return basicSetSecondaryTarget(null, msgs);
        case ImsdatabasePackage.INDEX__SHARING_INDEX:
            return ((InternalEList<?>) getSharingIndex()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.INDEX__SHARED_INDEX:
            return basicSetSharedIndex(null, msgs);
        case ImsdatabasePackage.INDEX__SEQUENCED_PCB:
            return ((InternalEList<?>) getSequencedPCB()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.INDEX__DOS_COMPATIBILITY:
            return isDosCompatibility();
        case ImsdatabasePackage.INDEX__PROTECT:
            return isProtect();
        case ImsdatabasePackage.INDEX__PRIMARY_TARGET:
            if (resolve)
                return getPrimaryTarget();
            return basicGetPrimaryTarget();
        case ImsdatabasePackage.INDEX__SECONDARY_TARGET:
            if (resolve)
                return getSecondaryTarget();
            return basicGetSecondaryTarget();
        case ImsdatabasePackage.INDEX__SHARING_INDEX:
            return getSharingIndex();
        case ImsdatabasePackage.INDEX__SHARED_INDEX:
            if (resolve)
                return getSharedIndex();
            return basicGetSharedIndex();
        case ImsdatabasePackage.INDEX__SEQUENCED_PCB:
            return getSequencedPCB();
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
        case ImsdatabasePackage.INDEX__DOS_COMPATIBILITY:
            setDosCompatibility((Boolean) newValue);
            return;
        case ImsdatabasePackage.INDEX__PROTECT:
            setProtect((Boolean) newValue);
            return;
        case ImsdatabasePackage.INDEX__PRIMARY_TARGET:
            setPrimaryTarget((HIDAM) newValue);
            return;
        case ImsdatabasePackage.INDEX__SECONDARY_TARGET:
            setSecondaryTarget((SecondaryIndex) newValue);
            return;
        case ImsdatabasePackage.INDEX__SHARING_INDEX:
            getSharingIndex().clear();
            getSharingIndex().addAll((Collection<? extends INDEX>) newValue);
            return;
        case ImsdatabasePackage.INDEX__SHARED_INDEX:
            setSharedIndex((INDEX) newValue);
            return;
        case ImsdatabasePackage.INDEX__SEQUENCED_PCB:
            getSequencedPCB().clear();
            getSequencedPCB().addAll((Collection<? extends PCB>) newValue);
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
        case ImsdatabasePackage.INDEX__DOS_COMPATIBILITY:
            setDosCompatibility(DOS_COMPATIBILITY_EDEFAULT);
            return;
        case ImsdatabasePackage.INDEX__PROTECT:
            setProtect(PROTECT_EDEFAULT);
            return;
        case ImsdatabasePackage.INDEX__PRIMARY_TARGET:
            setPrimaryTarget((HIDAM) null);
            return;
        case ImsdatabasePackage.INDEX__SECONDARY_TARGET:
            setSecondaryTarget((SecondaryIndex) null);
            return;
        case ImsdatabasePackage.INDEX__SHARING_INDEX:
            getSharingIndex().clear();
            return;
        case ImsdatabasePackage.INDEX__SHARED_INDEX:
            setSharedIndex((INDEX) null);
            return;
        case ImsdatabasePackage.INDEX__SEQUENCED_PCB:
            getSequencedPCB().clear();
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
        case ImsdatabasePackage.INDEX__DOS_COMPATIBILITY:
            return dosCompatibility != DOS_COMPATIBILITY_EDEFAULT;
        case ImsdatabasePackage.INDEX__PROTECT:
            return protect != PROTECT_EDEFAULT;
        case ImsdatabasePackage.INDEX__PRIMARY_TARGET:
            return primaryTarget != null;
        case ImsdatabasePackage.INDEX__SECONDARY_TARGET:
            return secondaryTarget != null;
        case ImsdatabasePackage.INDEX__SHARING_INDEX:
            return sharingIndex != null && !sharingIndex.isEmpty();
        case ImsdatabasePackage.INDEX__SHARED_INDEX:
            return sharedIndex != null;
        case ImsdatabasePackage.INDEX__SEQUENCED_PCB:
            return sequencedPCB != null && !sequencedPCB.isEmpty();
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
        result.append(" (dosCompatibility: ");
        result.append(dosCompatibility);
        result.append(", protect: ");
        result.append(protect);
        result.append(')');
        return result.toString();
    }

} // INDEXImpl
