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
import orgomg.cwm.resource.record.impl.FixedOffsetFieldImpl;
import orgomg.cwmx.resource.imsdatabase.Field;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;
import orgomg.cwmx.resource.imsdatabase.SenField;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#isSequenceField <em>Sequence Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#isUniqueSequence <em>Unique Sequence</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#isGenerated <em>Generated</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#getSearchIndex <em>Search Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#getDdataIndex <em>Ddata Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#getSubseqIndex <em>Subseq Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.FieldImpl#getSenField <em>Sen Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends FixedOffsetFieldImpl implements Field {

    /**
     * The default value of the '{@link #isSequenceField() <em>Sequence Field</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSequenceField()
     * @generated
     * @ordered
     */
    protected static final boolean SEQUENCE_FIELD_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSequenceField() <em>Sequence Field</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSequenceField()
     * @generated
     * @ordered
     */
    protected boolean sequenceField = SEQUENCE_FIELD_EDEFAULT;

    /**
     * The default value of the '{@link #isUniqueSequence() <em>Unique Sequence</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isUniqueSequence()
     * @generated
     * @ordered
     */
    protected static final boolean UNIQUE_SEQUENCE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUniqueSequence() <em>Unique Sequence</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isUniqueSequence()
     * @generated
     * @ordered
     */
    protected boolean uniqueSequence = UNIQUE_SEQUENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFieldLength()
     * @generated
     * @ordered
     */
    protected static final long FIELD_LENGTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFieldLength()
     * @generated
     * @ordered
     */
    protected long fieldLength = FIELD_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isGenerated()
     * @generated
     * @ordered
     */
    protected static final boolean GENERATED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isGenerated()
     * @generated
     * @ordered
     */
    protected boolean generated = GENERATED_EDEFAULT;

    /**
     * The cached value of the '{@link #getSearchIndex() <em>Search Index</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSearchIndex()
     * @generated
     * @ordered
     */
    protected EList<SecondaryIndex> searchIndex;

    /**
     * The cached value of the '{@link #getDdataIndex() <em>Ddata Index</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDdataIndex()
     * @generated
     * @ordered
     */
    protected EList<SecondaryIndex> ddataIndex;

    /**
     * The cached value of the '{@link #getSubseqIndex() <em>Subseq Index</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSubseqIndex()
     * @generated
     * @ordered
     */
    protected EList<SecondaryIndex> subseqIndex;

    /**
     * The cached value of the '{@link #getSenField() <em>Sen Field</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSenField()
     * @generated
     * @ordered
     */
    protected EList<SenField> senField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected FieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.FIELD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSequenceField() {
        return sequenceField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSequenceField(boolean newSequenceField) {
        boolean oldSequenceField = sequenceField;
        sequenceField = newSequenceField;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.FIELD__SEQUENCE_FIELD, oldSequenceField,
                    sequenceField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isUniqueSequence() {
        return uniqueSequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUniqueSequence(boolean newUniqueSequence) {
        boolean oldUniqueSequence = uniqueSequence;
        uniqueSequence = newUniqueSequence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.FIELD__UNIQUE_SEQUENCE, oldUniqueSequence,
                    uniqueSequence));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getFieldLength() {
        return fieldLength;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFieldLength(long newFieldLength) {
        long oldFieldLength = fieldLength;
        fieldLength = newFieldLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.FIELD__FIELD_LENGTH, oldFieldLength,
                    fieldLength));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isGenerated() {
        return generated;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setGenerated(boolean newGenerated) {
        boolean oldGenerated = generated;
        generated = newGenerated;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.FIELD__GENERATED, oldGenerated, generated));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SecondaryIndex> getSearchIndex() {
        if (searchIndex == null) {
            searchIndex = new EObjectWithInverseResolvingEList.ManyInverse<SecondaryIndex>(SecondaryIndex.class, this,
                    ImsdatabasePackage.FIELD__SEARCH_INDEX, ImsdatabasePackage.SECONDARY_INDEX__SEARCH_FIELDS);
        }
        return searchIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SecondaryIndex> getDdataIndex() {
        if (ddataIndex == null) {
            ddataIndex = new EObjectWithInverseResolvingEList.ManyInverse<SecondaryIndex>(SecondaryIndex.class, this,
                    ImsdatabasePackage.FIELD__DDATA_INDEX, ImsdatabasePackage.SECONDARY_INDEX__DDATA_FIELDS);
        }
        return ddataIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SecondaryIndex> getSubseqIndex() {
        if (subseqIndex == null) {
            subseqIndex = new EObjectWithInverseResolvingEList.ManyInverse<SecondaryIndex>(SecondaryIndex.class, this,
                    ImsdatabasePackage.FIELD__SUBSEQ_INDEX, ImsdatabasePackage.SECONDARY_INDEX__SUBSEQ_FIELDS);
        }
        return subseqIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SenField> getSenField() {
        if (senField == null) {
            senField = new EObjectWithInverseResolvingEList<SenField>(SenField.class, this, ImsdatabasePackage.FIELD__SEN_FIELD,
                    ImsdatabasePackage.SEN_FIELD__FIELD);
        }
        return senField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.FIELD__SEARCH_INDEX:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSearchIndex()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.FIELD__DDATA_INDEX:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDdataIndex()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.FIELD__SUBSEQ_INDEX:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubseqIndex()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.FIELD__SEN_FIELD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSenField()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.FIELD__SEARCH_INDEX:
            return ((InternalEList<?>) getSearchIndex()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.FIELD__DDATA_INDEX:
            return ((InternalEList<?>) getDdataIndex()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.FIELD__SUBSEQ_INDEX:
            return ((InternalEList<?>) getSubseqIndex()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.FIELD__SEN_FIELD:
            return ((InternalEList<?>) getSenField()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.FIELD__SEQUENCE_FIELD:
            return isSequenceField();
        case ImsdatabasePackage.FIELD__UNIQUE_SEQUENCE:
            return isUniqueSequence();
        case ImsdatabasePackage.FIELD__FIELD_LENGTH:
            return getFieldLength();
        case ImsdatabasePackage.FIELD__GENERATED:
            return isGenerated();
        case ImsdatabasePackage.FIELD__SEARCH_INDEX:
            return getSearchIndex();
        case ImsdatabasePackage.FIELD__DDATA_INDEX:
            return getDdataIndex();
        case ImsdatabasePackage.FIELD__SUBSEQ_INDEX:
            return getSubseqIndex();
        case ImsdatabasePackage.FIELD__SEN_FIELD:
            return getSenField();
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
        case ImsdatabasePackage.FIELD__SEQUENCE_FIELD:
            setSequenceField((Boolean) newValue);
            return;
        case ImsdatabasePackage.FIELD__UNIQUE_SEQUENCE:
            setUniqueSequence((Boolean) newValue);
            return;
        case ImsdatabasePackage.FIELD__FIELD_LENGTH:
            setFieldLength((Long) newValue);
            return;
        case ImsdatabasePackage.FIELD__GENERATED:
            setGenerated((Boolean) newValue);
            return;
        case ImsdatabasePackage.FIELD__SEARCH_INDEX:
            getSearchIndex().clear();
            getSearchIndex().addAll((Collection<? extends SecondaryIndex>) newValue);
            return;
        case ImsdatabasePackage.FIELD__DDATA_INDEX:
            getDdataIndex().clear();
            getDdataIndex().addAll((Collection<? extends SecondaryIndex>) newValue);
            return;
        case ImsdatabasePackage.FIELD__SUBSEQ_INDEX:
            getSubseqIndex().clear();
            getSubseqIndex().addAll((Collection<? extends SecondaryIndex>) newValue);
            return;
        case ImsdatabasePackage.FIELD__SEN_FIELD:
            getSenField().clear();
            getSenField().addAll((Collection<? extends SenField>) newValue);
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
        case ImsdatabasePackage.FIELD__SEQUENCE_FIELD:
            setSequenceField(SEQUENCE_FIELD_EDEFAULT);
            return;
        case ImsdatabasePackage.FIELD__UNIQUE_SEQUENCE:
            setUniqueSequence(UNIQUE_SEQUENCE_EDEFAULT);
            return;
        case ImsdatabasePackage.FIELD__FIELD_LENGTH:
            setFieldLength(FIELD_LENGTH_EDEFAULT);
            return;
        case ImsdatabasePackage.FIELD__GENERATED:
            setGenerated(GENERATED_EDEFAULT);
            return;
        case ImsdatabasePackage.FIELD__SEARCH_INDEX:
            getSearchIndex().clear();
            return;
        case ImsdatabasePackage.FIELD__DDATA_INDEX:
            getDdataIndex().clear();
            return;
        case ImsdatabasePackage.FIELD__SUBSEQ_INDEX:
            getSubseqIndex().clear();
            return;
        case ImsdatabasePackage.FIELD__SEN_FIELD:
            getSenField().clear();
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
        case ImsdatabasePackage.FIELD__SEQUENCE_FIELD:
            return sequenceField != SEQUENCE_FIELD_EDEFAULT;
        case ImsdatabasePackage.FIELD__UNIQUE_SEQUENCE:
            return uniqueSequence != UNIQUE_SEQUENCE_EDEFAULT;
        case ImsdatabasePackage.FIELD__FIELD_LENGTH:
            return fieldLength != FIELD_LENGTH_EDEFAULT;
        case ImsdatabasePackage.FIELD__GENERATED:
            return generated != GENERATED_EDEFAULT;
        case ImsdatabasePackage.FIELD__SEARCH_INDEX:
            return searchIndex != null && !searchIndex.isEmpty();
        case ImsdatabasePackage.FIELD__DDATA_INDEX:
            return ddataIndex != null && !ddataIndex.isEmpty();
        case ImsdatabasePackage.FIELD__SUBSEQ_INDEX:
            return subseqIndex != null && !subseqIndex.isEmpty();
        case ImsdatabasePackage.FIELD__SEN_FIELD:
            return senField != null && !senField.isEmpty();
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
        result.append(" (sequenceField: ");
        result.append(sequenceField);
        result.append(", uniqueSequence: ");
        result.append(uniqueSequence);
        result.append(", fieldLength: ");
        result.append(fieldLength);
        result.append(", generated: ");
        result.append(generated);
        result.append(')');
        return result.toString();
    }

} // FieldImpl
