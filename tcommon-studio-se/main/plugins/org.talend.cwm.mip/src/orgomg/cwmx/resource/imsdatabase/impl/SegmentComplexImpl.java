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
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.LCHILD;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;
import orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PointerType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Segment Complex</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getDeleteFlag <em>Delete Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getInsertFlag <em>Insert Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getReplaceFlag <em>Replace Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getSegmPointer <em>Segm Pointer</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getDsGroup <em>Ds Group</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getSecondaryIndex <em>Secondary Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getLchild <em>Lchild</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getSourcedIndex <em>Sourced Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getLparent <em>Lparent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getPairedLCHILD <em>Paired LCHILD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentComplexImpl#getDataset <em>Dataset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentComplexImpl extends SegmentImpl implements SegmentComplex {

    /**
     * The default value of the '{@link #getDeleteFlag() <em>Delete Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDeleteFlag()
     * @generated
     * @ordered
     */
    protected static final FlagsType DELETE_FLAG_EDEFAULT = FlagsType.IMSFT_P;

    /**
     * The cached value of the '{@link #getDeleteFlag() <em>Delete Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDeleteFlag()
     * @generated
     * @ordered
     */
    protected FlagsType deleteFlag = DELETE_FLAG_EDEFAULT;

    /**
     * The default value of the '{@link #getInsertFlag() <em>Insert Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInsertFlag()
     * @generated
     * @ordered
     */
    protected static final FlagsType INSERT_FLAG_EDEFAULT = FlagsType.IMSFT_P;

    /**
     * The cached value of the '{@link #getInsertFlag() <em>Insert Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInsertFlag()
     * @generated
     * @ordered
     */
    protected FlagsType insertFlag = INSERT_FLAG_EDEFAULT;

    /**
     * The default value of the '{@link #getReplaceFlag() <em>Replace Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReplaceFlag()
     * @generated
     * @ordered
     */
    protected static final FlagsType REPLACE_FLAG_EDEFAULT = FlagsType.IMSFT_P;

    /**
     * The cached value of the '{@link #getReplaceFlag() <em>Replace Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReplaceFlag()
     * @generated
     * @ordered
     */
    protected FlagsType replaceFlag = REPLACE_FLAG_EDEFAULT;

    /**
     * The default value of the '{@link #getSegmPointer() <em>Segm Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSegmPointer()
     * @generated
     * @ordered
     */
    protected static final PointerType SEGM_POINTER_EDEFAULT = PointerType.IMSPN_NOTWIN;

    /**
     * The cached value of the '{@link #getSegmPointer() <em>Segm Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSegmPointer()
     * @generated
     * @ordered
     */
    protected PointerType segmPointer = SEGM_POINTER_EDEFAULT;

    /**
     * The default value of the '{@link #getDsGroup() <em>Ds Group</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDsGroup()
     * @generated
     * @ordered
     */
    protected static final String DS_GROUP_EDEFAULT = "A";

    /**
     * The cached value of the '{@link #getDsGroup() <em>Ds Group</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDsGroup()
     * @generated
     * @ordered
     */
    protected String dsGroup = DS_GROUP_EDEFAULT;

    /**
     * The cached value of the '{@link #getSecondaryIndex()
     * <em>Secondary Index</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSecondaryIndex()
     * @generated
     * @ordered
     */
    protected EList<SecondaryIndex> secondaryIndex;

    /**
     * The cached value of the '{@link #getLchild() <em>Lchild</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLchild()
     * @generated
     * @ordered
     */
    protected EList<LCHILD> lchild;

    /**
     * The cached value of the '{@link #getSourcedIndex() <em>Sourced Index</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSourcedIndex()
     * @generated
     * @ordered
     */
    protected EList<SecondaryIndex> sourcedIndex;

    /**
     * The cached value of the '{@link #getLparent() <em>Lparent</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLparent()
     * @generated
     * @ordered
     */
    protected LCHILD lparent;

    /**
     * The cached value of the '{@link #getPairedLCHILD() <em>Paired LCHILD</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPairedLCHILD()
     * @generated
     * @ordered
     */
    protected LCHILD pairedLCHILD;

    /**
     * The cached value of the '{@link #getDataset() <em>Dataset</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDataset()
     * @generated
     * @ordered
     */
    protected Dataset dataset;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SegmentComplexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.SEGMENT_COMPLEX;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FlagsType getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDeleteFlag(FlagsType newDeleteFlag) {
        FlagsType oldDeleteFlag = deleteFlag;
        deleteFlag = newDeleteFlag == null ? DELETE_FLAG_EDEFAULT : newDeleteFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__DELETE_FLAG, oldDeleteFlag,
                    deleteFlag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FlagsType getInsertFlag() {
        return insertFlag;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setInsertFlag(FlagsType newInsertFlag) {
        FlagsType oldInsertFlag = insertFlag;
        insertFlag = newInsertFlag == null ? INSERT_FLAG_EDEFAULT : newInsertFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__INSERT_FLAG, oldInsertFlag,
                    insertFlag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FlagsType getReplaceFlag() {
        return replaceFlag;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReplaceFlag(FlagsType newReplaceFlag) {
        FlagsType oldReplaceFlag = replaceFlag;
        replaceFlag = newReplaceFlag == null ? REPLACE_FLAG_EDEFAULT : newReplaceFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__REPLACE_FLAG,
                    oldReplaceFlag, replaceFlag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PointerType getSegmPointer() {
        return segmPointer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSegmPointer(PointerType newSegmPointer) {
        PointerType oldSegmPointer = segmPointer;
        segmPointer = newSegmPointer == null ? SEGM_POINTER_EDEFAULT : newSegmPointer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__SEGM_POINTER,
                    oldSegmPointer, segmPointer));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDsGroup() {
        return dsGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDsGroup(String newDsGroup) {
        String oldDsGroup = dsGroup;
        dsGroup = newDsGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__DS_GROUP, oldDsGroup,
                    dsGroup));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SecondaryIndex> getSecondaryIndex() {
        if (secondaryIndex == null) {
            secondaryIndex = new EObjectContainmentWithInverseEList<SecondaryIndex>(SecondaryIndex.class, this,
                    ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX, ImsdatabasePackage.SECONDARY_INDEX__SEGMENT);
        }
        return secondaryIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<LCHILD> getLchild() {
        if (lchild == null) {
            lchild = new EObjectContainmentWithInverseEList<LCHILD>(LCHILD.class, this,
                    ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD, ImsdatabasePackage.LCHILD__LPARENT);
        }
        return lchild;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SecondaryIndex> getSourcedIndex() {
        if (sourcedIndex == null) {
            sourcedIndex = new EObjectWithInverseResolvingEList<SecondaryIndex>(SecondaryIndex.class, this,
                    ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX, ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE);
        }
        return sourcedIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LCHILD getLparent() {
        if (lparent != null && lparent.eIsProxy()) {
            InternalEObject oldLparent = (InternalEObject) lparent;
            lparent = (LCHILD) eResolveProxy(oldLparent);
            if (lparent != oldLparent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT,
                            oldLparent, lparent));
            }
        }
        return lparent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LCHILD basicGetLparent() {
        return lparent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLparent(LCHILD newLparent, NotificationChain msgs) {
        LCHILD oldLparent = lparent;
        lparent = newLparent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT, oldLparent, newLparent);
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
    public void setLparent(LCHILD newLparent) {
        if (newLparent != lparent) {
            NotificationChain msgs = null;
            if (lparent != null)
                msgs = ((InternalEObject) lparent).eInverseRemove(this, ImsdatabasePackage.LCHILD__LCHILD, LCHILD.class, msgs);
            if (newLparent != null)
                msgs = ((InternalEObject) newLparent).eInverseAdd(this, ImsdatabasePackage.LCHILD__LCHILD, LCHILD.class, msgs);
            msgs = basicSetLparent(newLparent, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT, newLparent,
                    newLparent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LCHILD getPairedLCHILD() {
        if (pairedLCHILD != null && pairedLCHILD.eIsProxy()) {
            InternalEObject oldPairedLCHILD = (InternalEObject) pairedLCHILD;
            pairedLCHILD = (LCHILD) eResolveProxy(oldPairedLCHILD);
            if (pairedLCHILD != oldPairedLCHILD) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD,
                            oldPairedLCHILD, pairedLCHILD));
            }
        }
        return pairedLCHILD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LCHILD basicGetPairedLCHILD() {
        return pairedLCHILD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPairedLCHILD(LCHILD newPairedLCHILD, NotificationChain msgs) {
        LCHILD oldPairedLCHILD = pairedLCHILD;
        pairedLCHILD = newPairedLCHILD;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD, oldPairedLCHILD, newPairedLCHILD);
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
    public void setPairedLCHILD(LCHILD newPairedLCHILD) {
        if (newPairedLCHILD != pairedLCHILD) {
            NotificationChain msgs = null;
            if (pairedLCHILD != null)
                msgs = ((InternalEObject) pairedLCHILD).eInverseRemove(this, ImsdatabasePackage.LCHILD__PAIRED_SEGMENT,
                        LCHILD.class, msgs);
            if (newPairedLCHILD != null)
                msgs = ((InternalEObject) newPairedLCHILD).eInverseAdd(this, ImsdatabasePackage.LCHILD__PAIRED_SEGMENT,
                        LCHILD.class, msgs);
            msgs = basicSetPairedLCHILD(newPairedLCHILD, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD,
                    newPairedLCHILD, newPairedLCHILD));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dataset getDataset() {
        if (dataset != null && dataset.eIsProxy()) {
            InternalEObject oldDataset = (InternalEObject) dataset;
            dataset = (Dataset) eResolveProxy(oldDataset);
            if (dataset != oldDataset) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SEGMENT_COMPLEX__DATASET,
                            oldDataset, dataset));
            }
        }
        return dataset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dataset basicGetDataset() {
        return dataset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataset(Dataset newDataset, NotificationChain msgs) {
        Dataset oldDataset = dataset;
        dataset = newDataset;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.SEGMENT_COMPLEX__DATASET, oldDataset, newDataset);
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
    public void setDataset(Dataset newDataset) {
        if (newDataset != dataset) {
            NotificationChain msgs = null;
            if (dataset != null)
                msgs = ((InternalEObject) dataset).eInverseRemove(this, ImsdatabasePackage.DATASET__SEGMENT, Dataset.class, msgs);
            if (newDataset != null)
                msgs = ((InternalEObject) newDataset).eInverseAdd(this, ImsdatabasePackage.DATASET__SEGMENT, Dataset.class, msgs);
            msgs = basicSetDataset(newDataset, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_COMPLEX__DATASET, newDataset,
                    newDataset));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSecondaryIndex()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLchild()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourcedIndex()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT:
            if (lparent != null)
                msgs = ((InternalEObject) lparent).eInverseRemove(this, ImsdatabasePackage.LCHILD__LCHILD, LCHILD.class, msgs);
            return basicSetLparent((LCHILD) otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD:
            if (pairedLCHILD != null)
                msgs = ((InternalEObject) pairedLCHILD).eInverseRemove(this, ImsdatabasePackage.LCHILD__PAIRED_SEGMENT,
                        LCHILD.class, msgs);
            return basicSetPairedLCHILD((LCHILD) otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__DATASET:
            if (dataset != null)
                msgs = ((InternalEObject) dataset).eInverseRemove(this, ImsdatabasePackage.DATASET__SEGMENT, Dataset.class, msgs);
            return basicSetDataset((Dataset) otherEnd, msgs);
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
        case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            return ((InternalEList<?>) getSecondaryIndex()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
            return ((InternalEList<?>) getLchild()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX:
            return ((InternalEList<?>) getSourcedIndex()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT:
            return basicSetLparent(null, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD:
            return basicSetPairedLCHILD(null, msgs);
        case ImsdatabasePackage.SEGMENT_COMPLEX__DATASET:
            return basicSetDataset(null, msgs);
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
        case ImsdatabasePackage.SEGMENT_COMPLEX__DELETE_FLAG:
            return getDeleteFlag();
        case ImsdatabasePackage.SEGMENT_COMPLEX__INSERT_FLAG:
            return getInsertFlag();
        case ImsdatabasePackage.SEGMENT_COMPLEX__REPLACE_FLAG:
            return getReplaceFlag();
        case ImsdatabasePackage.SEGMENT_COMPLEX__SEGM_POINTER:
            return getSegmPointer();
        case ImsdatabasePackage.SEGMENT_COMPLEX__DS_GROUP:
            return getDsGroup();
        case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            return getSecondaryIndex();
        case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
            return getLchild();
        case ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX:
            return getSourcedIndex();
        case ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT:
            if (resolve)
                return getLparent();
            return basicGetLparent();
        case ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD:
            if (resolve)
                return getPairedLCHILD();
            return basicGetPairedLCHILD();
        case ImsdatabasePackage.SEGMENT_COMPLEX__DATASET:
            if (resolve)
                return getDataset();
            return basicGetDataset();
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
        case ImsdatabasePackage.SEGMENT_COMPLEX__DELETE_FLAG:
            setDeleteFlag((FlagsType) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__INSERT_FLAG:
            setInsertFlag((FlagsType) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__REPLACE_FLAG:
            setReplaceFlag((FlagsType) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SEGM_POINTER:
            setSegmPointer((PointerType) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__DS_GROUP:
            setDsGroup((String) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            getSecondaryIndex().clear();
            getSecondaryIndex().addAll((Collection<? extends SecondaryIndex>) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
            getLchild().clear();
            getLchild().addAll((Collection<? extends LCHILD>) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX:
            getSourcedIndex().clear();
            getSourcedIndex().addAll((Collection<? extends SecondaryIndex>) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT:
            setLparent((LCHILD) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD:
            setPairedLCHILD((LCHILD) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__DATASET:
            setDataset((Dataset) newValue);
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
        case ImsdatabasePackage.SEGMENT_COMPLEX__DELETE_FLAG:
            setDeleteFlag(DELETE_FLAG_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__INSERT_FLAG:
            setInsertFlag(INSERT_FLAG_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__REPLACE_FLAG:
            setReplaceFlag(REPLACE_FLAG_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SEGM_POINTER:
            setSegmPointer(SEGM_POINTER_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__DS_GROUP:
            setDsGroup(DS_GROUP_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            getSecondaryIndex().clear();
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
            getLchild().clear();
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX:
            getSourcedIndex().clear();
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT:
            setLparent((LCHILD) null);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD:
            setPairedLCHILD((LCHILD) null);
            return;
        case ImsdatabasePackage.SEGMENT_COMPLEX__DATASET:
            setDataset((Dataset) null);
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
        case ImsdatabasePackage.SEGMENT_COMPLEX__DELETE_FLAG:
            return deleteFlag != DELETE_FLAG_EDEFAULT;
        case ImsdatabasePackage.SEGMENT_COMPLEX__INSERT_FLAG:
            return insertFlag != INSERT_FLAG_EDEFAULT;
        case ImsdatabasePackage.SEGMENT_COMPLEX__REPLACE_FLAG:
            return replaceFlag != REPLACE_FLAG_EDEFAULT;
        case ImsdatabasePackage.SEGMENT_COMPLEX__SEGM_POINTER:
            return segmPointer != SEGM_POINTER_EDEFAULT;
        case ImsdatabasePackage.SEGMENT_COMPLEX__DS_GROUP:
            return DS_GROUP_EDEFAULT == null ? dsGroup != null : !DS_GROUP_EDEFAULT.equals(dsGroup);
        case ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX:
            return secondaryIndex != null && !secondaryIndex.isEmpty();
        case ImsdatabasePackage.SEGMENT_COMPLEX__LCHILD:
            return lchild != null && !lchild.isEmpty();
        case ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX:
            return sourcedIndex != null && !sourcedIndex.isEmpty();
        case ImsdatabasePackage.SEGMENT_COMPLEX__LPARENT:
            return lparent != null;
        case ImsdatabasePackage.SEGMENT_COMPLEX__PAIRED_LCHILD:
            return pairedLCHILD != null;
        case ImsdatabasePackage.SEGMENT_COMPLEX__DATASET:
            return dataset != null;
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
        result.append(" (deleteFlag: ");
        result.append(deleteFlag);
        result.append(", insertFlag: ");
        result.append(insertFlag);
        result.append(", replaceFlag: ");
        result.append(replaceFlag);
        result.append(", segmPointer: ");
        result.append(segmPointer);
        result.append(", dsGroup: ");
        result.append(dsGroup);
        result.append(')');
        return result.toString();
    }

} // SegmentComplexImpl
