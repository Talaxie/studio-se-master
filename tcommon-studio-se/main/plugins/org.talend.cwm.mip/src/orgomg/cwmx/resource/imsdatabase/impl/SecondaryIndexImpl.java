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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.imsdatabase.Field;
import orgomg.cwmx.resource.imsdatabase.INDEX;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Secondary Index</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getExitRoutine <em>Exit Routine</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getSearchFields <em>Search Fields</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getDdataFields <em>Ddata Fields</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getSubseqFields <em>Subseq Fields</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SecondaryIndexImpl#getIndexSource <em>Index Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecondaryIndexImpl extends ModelElementImpl implements SecondaryIndex {

    /**
     * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getConstant()
     * @generated
     * @ordered
     */
    protected static final String CONSTANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getConstant()
     * @generated
     * @ordered
     */
    protected String constant = CONSTANT_EDEFAULT;

    /**
     * The default value of the '{@link #getExitRoutine() <em>Exit Routine</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExitRoutine()
     * @generated
     * @ordered
     */
    protected static final String EXIT_ROUTINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExitRoutine() <em>Exit Routine</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExitRoutine()
     * @generated
     * @ordered
     */
    protected String exitRoutine = EXIT_ROUTINE_EDEFAULT;

    /**
     * The default value of the '{@link #getNullValue() <em>Null Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNullValue()
     * @generated
     * @ordered
     */
    protected static final String NULL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNullValue()
     * @generated
     * @ordered
     */
    protected String nullValue = NULL_VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getIndex() <em>Index</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIndex()
     * @generated
     * @ordered
     */
    protected INDEX index;

    /**
     * The cached value of the '{@link #getSearchFields() <em>Search Fields</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSearchFields()
     * @generated
     * @ordered
     */
    protected EList<Field> searchFields;

    /**
     * The cached value of the '{@link #getDdataFields() <em>Ddata Fields</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDdataFields()
     * @generated
     * @ordered
     */
    protected EList<Field> ddataFields;

    /**
     * The cached value of the '{@link #getSubseqFields() <em>Subseq Fields</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSubseqFields()
     * @generated
     * @ordered
     */
    protected EList<Field> subseqFields;

    /**
     * The cached value of the '{@link #getIndexSource() <em>Index Source</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIndexSource()
     * @generated
     * @ordered
     */
    protected SegmentComplex indexSource;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SecondaryIndexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.SECONDARY_INDEX;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getConstant() {
        return constant;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConstant(String newConstant) {
        String oldConstant = constant;
        constant = newConstant;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SECONDARY_INDEX__CONSTANT, oldConstant,
                    constant));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getExitRoutine() {
        return exitRoutine;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExitRoutine(String newExitRoutine) {
        String oldExitRoutine = exitRoutine;
        exitRoutine = newExitRoutine;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SECONDARY_INDEX__EXIT_ROUTINE,
                    oldExitRoutine, exitRoutine));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNullValue(String newNullValue) {
        String oldNullValue = nullValue;
        nullValue = newNullValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SECONDARY_INDEX__NULL_VALUE, oldNullValue,
                    nullValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX getIndex() {
        if (index != null && index.eIsProxy()) {
            InternalEObject oldIndex = (InternalEObject) index;
            index = (INDEX) eResolveProxy(oldIndex);
            if (index != oldIndex) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SECONDARY_INDEX__INDEX,
                            oldIndex, index));
            }
        }
        return index;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public INDEX basicGetIndex() {
        return index;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIndex(INDEX newIndex, NotificationChain msgs) {
        INDEX oldIndex = index;
        index = newIndex;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.SECONDARY_INDEX__INDEX, oldIndex, newIndex);
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
    public void setIndex(INDEX newIndex) {
        if (newIndex != index) {
            NotificationChain msgs = null;
            if (index != null)
                msgs = ((InternalEObject) index).eInverseRemove(this, ImsdatabasePackage.INDEX__SECONDARY_TARGET, INDEX.class,
                        msgs);
            if (newIndex != null)
                msgs = ((InternalEObject) newIndex).eInverseAdd(this, ImsdatabasePackage.INDEX__SECONDARY_TARGET, INDEX.class,
                        msgs);
            msgs = basicSetIndex(newIndex, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SECONDARY_INDEX__INDEX, newIndex, newIndex));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex getSegment() {
        if (eContainerFeatureID() != ImsdatabasePackage.SECONDARY_INDEX__SEGMENT)
            return null;
        return (SegmentComplex) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSegment(SegmentComplex newSegment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newSegment, ImsdatabasePackage.SECONDARY_INDEX__SEGMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSegment(SegmentComplex newSegment) {
        if (newSegment != eInternalContainer()
                || (eContainerFeatureID() != ImsdatabasePackage.SECONDARY_INDEX__SEGMENT && newSegment != null)) {
            if (EcoreUtil.isAncestor(this, newSegment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSegment != null)
                msgs = ((InternalEObject) newSegment).eInverseAdd(this, ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX,
                        SegmentComplex.class, msgs);
            msgs = basicSetSegment(newSegment, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SECONDARY_INDEX__SEGMENT, newSegment,
                    newSegment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Field> getSearchFields() {
        if (searchFields == null) {
            searchFields = new EObjectWithInverseResolvingEList.ManyInverse<Field>(Field.class, this,
                    ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS, ImsdatabasePackage.FIELD__SEARCH_INDEX);
        }
        return searchFields;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Field> getDdataFields() {
        if (ddataFields == null) {
            ddataFields = new EObjectWithInverseResolvingEList.ManyInverse<Field>(Field.class, this,
                    ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS, ImsdatabasePackage.FIELD__DDATA_INDEX);
        }
        return ddataFields;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Field> getSubseqFields() {
        if (subseqFields == null) {
            subseqFields = new EObjectWithInverseResolvingEList.ManyInverse<Field>(Field.class, this,
                    ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS, ImsdatabasePackage.FIELD__SUBSEQ_INDEX);
        }
        return subseqFields;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex getIndexSource() {
        if (indexSource != null && indexSource.eIsProxy()) {
            InternalEObject oldIndexSource = (InternalEObject) indexSource;
            indexSource = (SegmentComplex) eResolveProxy(oldIndexSource);
            if (indexSource != oldIndexSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE,
                            oldIndexSource, indexSource));
            }
        }
        return indexSource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentComplex basicGetIndexSource() {
        return indexSource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIndexSource(SegmentComplex newIndexSource, NotificationChain msgs) {
        SegmentComplex oldIndexSource = indexSource;
        indexSource = newIndexSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE, oldIndexSource, newIndexSource);
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
    public void setIndexSource(SegmentComplex newIndexSource) {
        if (newIndexSource != indexSource) {
            NotificationChain msgs = null;
            if (indexSource != null)
                msgs = ((InternalEObject) indexSource).eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX,
                        SegmentComplex.class, msgs);
            if (newIndexSource != null)
                msgs = ((InternalEObject) newIndexSource).eInverseAdd(this, ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX,
                        SegmentComplex.class, msgs);
            msgs = basicSetIndexSource(newIndexSource, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE,
                    newIndexSource, newIndexSource));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX:
            if (index != null)
                msgs = ((InternalEObject) index).eInverseRemove(this, ImsdatabasePackage.INDEX__SECONDARY_TARGET, INDEX.class,
                        msgs);
            return basicSetIndex((INDEX) otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSegment((SegmentComplex) otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSearchFields()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDdataFields()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubseqFields()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE:
            if (indexSource != null)
                msgs = ((InternalEObject) indexSource).eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__SOURCED_INDEX,
                        SegmentComplex.class, msgs);
            return basicSetIndexSource((SegmentComplex) otherEnd, msgs);
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
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX:
            return basicSetIndex(null, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            return basicSetSegment(null, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS:
            return ((InternalEList<?>) getSearchFields()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS:
            return ((InternalEList<?>) getDdataFields()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS:
            return ((InternalEList<?>) getSubseqFields()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE:
            return basicSetIndexSource(null, msgs);
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
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.SEGMENT_COMPLEX__SECONDARY_INDEX,
                    SegmentComplex.class, msgs);
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
        case ImsdatabasePackage.SECONDARY_INDEX__CONSTANT:
            return getConstant();
        case ImsdatabasePackage.SECONDARY_INDEX__EXIT_ROUTINE:
            return getExitRoutine();
        case ImsdatabasePackage.SECONDARY_INDEX__NULL_VALUE:
            return getNullValue();
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX:
            if (resolve)
                return getIndex();
            return basicGetIndex();
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            return getSegment();
        case ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS:
            return getSearchFields();
        case ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS:
            return getDdataFields();
        case ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS:
            return getSubseqFields();
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE:
            if (resolve)
                return getIndexSource();
            return basicGetIndexSource();
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
        case ImsdatabasePackage.SECONDARY_INDEX__CONSTANT:
            setConstant((String) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__EXIT_ROUTINE:
            setExitRoutine((String) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__NULL_VALUE:
            setNullValue((String) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX:
            setIndex((INDEX) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            setSegment((SegmentComplex) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS:
            getSearchFields().clear();
            getSearchFields().addAll((Collection<? extends Field>) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS:
            getDdataFields().clear();
            getDdataFields().addAll((Collection<? extends Field>) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS:
            getSubseqFields().clear();
            getSubseqFields().addAll((Collection<? extends Field>) newValue);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE:
            setIndexSource((SegmentComplex) newValue);
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
        case ImsdatabasePackage.SECONDARY_INDEX__CONSTANT:
            setConstant(CONSTANT_EDEFAULT);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__EXIT_ROUTINE:
            setExitRoutine(EXIT_ROUTINE_EDEFAULT);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__NULL_VALUE:
            setNullValue(NULL_VALUE_EDEFAULT);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX:
            setIndex((INDEX) null);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            setSegment((SegmentComplex) null);
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS:
            getSearchFields().clear();
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS:
            getDdataFields().clear();
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS:
            getSubseqFields().clear();
            return;
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE:
            setIndexSource((SegmentComplex) null);
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
        case ImsdatabasePackage.SECONDARY_INDEX__CONSTANT:
            return CONSTANT_EDEFAULT == null ? constant != null : !CONSTANT_EDEFAULT.equals(constant);
        case ImsdatabasePackage.SECONDARY_INDEX__EXIT_ROUTINE:
            return EXIT_ROUTINE_EDEFAULT == null ? exitRoutine != null : !EXIT_ROUTINE_EDEFAULT.equals(exitRoutine);
        case ImsdatabasePackage.SECONDARY_INDEX__NULL_VALUE:
            return NULL_VALUE_EDEFAULT == null ? nullValue != null : !NULL_VALUE_EDEFAULT.equals(nullValue);
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX:
            return index != null;
        case ImsdatabasePackage.SECONDARY_INDEX__SEGMENT:
            return getSegment() != null;
        case ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS:
            return searchFields != null && !searchFields.isEmpty();
        case ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS:
            return ddataFields != null && !ddataFields.isEmpty();
        case ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS:
            return subseqFields != null && !subseqFields.isEmpty();
        case ImsdatabasePackage.SECONDARY_INDEX__INDEX_SOURCE:
            return indexSource != null;
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
        result.append(" (constant: ");
        result.append(constant);
        result.append(", exitRoutine: ");
        result.append(exitRoutine);
        result.append(", nullValue: ");
        result.append(nullValue);
        result.append(')');
        return result.toString();
    }

} // SecondaryIndexImpl
