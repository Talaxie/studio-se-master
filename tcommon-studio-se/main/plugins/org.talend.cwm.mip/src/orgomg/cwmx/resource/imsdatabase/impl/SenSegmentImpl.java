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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.record.impl.RecordDefImpl;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.SenField;
import orgomg.cwmx.resource.imsdatabase.SenSegment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sen Segment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl#getProcoptSENSEG <em>Procopt SENSEG</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl#getSubsetPointers <em>Subset Pointers</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl#getPcb <em>Pcb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl#getSenField <em>Sen Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenSegmentImpl#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenSegmentImpl extends RecordDefImpl implements SenSegment {

    /**
     * The default value of the '{@link #getProcoptSENSEG() <em>Procopt SENSEG</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProcoptSENSEG()
     * @generated
     * @ordered
     */
    protected static final String PROCOPT_SENSEG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcoptSENSEG() <em>Procopt SENSEG</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getProcoptSENSEG()
     * @generated
     * @ordered
     */
    protected String procoptSENSEG = PROCOPT_SENSEG_EDEFAULT;

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
     * The cached value of the '{@link #getSenField() <em>Sen Field</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSenField()
     * @generated
     * @ordered
     */
    protected EList<SenField> senField;

    /**
     * The cached value of the '{@link #getSegment() <em>Segment</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSegment()
     * @generated
     * @ordered
     */
    protected Segment segment;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SenSegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.SEN_SEGMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getProcoptSENSEG() {
        return procoptSENSEG;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setProcoptSENSEG(String newProcoptSENSEG) {
        String oldProcoptSENSEG = procoptSENSEG;
        procoptSENSEG = newProcoptSENSEG;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_SEGMENT__PROCOPT_SENSEG,
                    oldProcoptSENSEG, procoptSENSEG));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_SEGMENT__SUBSET_POINTERS,
                    oldSubsetPointers, subsetPointers));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PCB getPcb() {
        if (eContainerFeatureID() != ImsdatabasePackage.SEN_SEGMENT__PCB)
            return null;
        return (PCB) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPcb(PCB newPcb, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newPcb, ImsdatabasePackage.SEN_SEGMENT__PCB, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPcb(PCB newPcb) {
        if (newPcb != eInternalContainer() || (eContainerFeatureID() != ImsdatabasePackage.SEN_SEGMENT__PCB && newPcb != null)) {
            if (EcoreUtil.isAncestor(this, newPcb))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPcb != null)
                msgs = ((InternalEObject) newPcb).eInverseAdd(this, ImsdatabasePackage.PCB__SEN_SEGMENT, PCB.class, msgs);
            msgs = basicSetPcb(newPcb, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_SEGMENT__PCB, newPcb, newPcb));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SenField> getSenField() {
        if (senField == null) {
            senField = new EObjectContainmentWithInverseEList<SenField>(SenField.class, this,
                    ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD, ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT);
        }
        return senField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment getSegment() {
        if (segment != null && segment.eIsProxy()) {
            InternalEObject oldSegment = (InternalEObject) segment;
            segment = (Segment) eResolveProxy(oldSegment);
            if (segment != oldSegment) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SEN_SEGMENT__SEGMENT,
                            oldSegment, segment));
            }
        }
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment basicGetSegment() {
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSegment(Segment newSegment, NotificationChain msgs) {
        Segment oldSegment = segment;
        segment = newSegment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.SEN_SEGMENT__SEGMENT, oldSegment, newSegment);
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
    public void setSegment(Segment newSegment) {
        if (newSegment != segment) {
            NotificationChain msgs = null;
            if (segment != null)
                msgs = ((InternalEObject) segment).eInverseRemove(this, ImsdatabasePackage.SEGMENT__SENSEG, Segment.class, msgs);
            if (newSegment != null)
                msgs = ((InternalEObject) newSegment).eInverseAdd(this, ImsdatabasePackage.SEGMENT__SENSEG, Segment.class, msgs);
            msgs = basicSetSegment(newSegment, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_SEGMENT__SEGMENT, newSegment, newSegment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetPcb((PCB) otherEnd, msgs);
        case ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSenField()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEN_SEGMENT__SEGMENT:
            if (segment != null)
                msgs = ((InternalEObject) segment).eInverseRemove(this, ImsdatabasePackage.SEGMENT__SENSEG, Segment.class, msgs);
            return basicSetSegment((Segment) otherEnd, msgs);
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
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            return basicSetPcb(null, msgs);
        case ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD:
            return ((InternalEList<?>) getSenField()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEN_SEGMENT__SEGMENT:
            return basicSetSegment(null, msgs);
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
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.PCB__SEN_SEGMENT, PCB.class, msgs);
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
        case ImsdatabasePackage.SEN_SEGMENT__PROCOPT_SENSEG:
            return getProcoptSENSEG();
        case ImsdatabasePackage.SEN_SEGMENT__SUBSET_POINTERS:
            return getSubsetPointers();
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            return getPcb();
        case ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD:
            return getSenField();
        case ImsdatabasePackage.SEN_SEGMENT__SEGMENT:
            if (resolve)
                return getSegment();
            return basicGetSegment();
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
        case ImsdatabasePackage.SEN_SEGMENT__PROCOPT_SENSEG:
            setProcoptSENSEG((String) newValue);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__SUBSET_POINTERS:
            setSubsetPointers((String) newValue);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            setPcb((PCB) newValue);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD:
            getSenField().clear();
            getSenField().addAll((Collection<? extends SenField>) newValue);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__SEGMENT:
            setSegment((Segment) newValue);
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
        case ImsdatabasePackage.SEN_SEGMENT__PROCOPT_SENSEG:
            setProcoptSENSEG(PROCOPT_SENSEG_EDEFAULT);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__SUBSET_POINTERS:
            setSubsetPointers(SUBSET_POINTERS_EDEFAULT);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            setPcb((PCB) null);
            return;
        case ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD:
            getSenField().clear();
            return;
        case ImsdatabasePackage.SEN_SEGMENT__SEGMENT:
            setSegment((Segment) null);
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
        case ImsdatabasePackage.SEN_SEGMENT__PROCOPT_SENSEG:
            return PROCOPT_SENSEG_EDEFAULT == null ? procoptSENSEG != null : !PROCOPT_SENSEG_EDEFAULT.equals(procoptSENSEG);
        case ImsdatabasePackage.SEN_SEGMENT__SUBSET_POINTERS:
            return SUBSET_POINTERS_EDEFAULT == null ? subsetPointers != null : !SUBSET_POINTERS_EDEFAULT.equals(subsetPointers);
        case ImsdatabasePackage.SEN_SEGMENT__PCB:
            return getPcb() != null;
        case ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD:
            return senField != null && !senField.isEmpty();
        case ImsdatabasePackage.SEN_SEGMENT__SEGMENT:
            return segment != null;
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
        result.append(" (procoptSENSEG: ");
        result.append(procoptSENSEG);
        result.append(", subsetPointers: ");
        result.append(subsetPointers);
        result.append(')');
        return result.toString();
    }

} // SenSegmentImpl
