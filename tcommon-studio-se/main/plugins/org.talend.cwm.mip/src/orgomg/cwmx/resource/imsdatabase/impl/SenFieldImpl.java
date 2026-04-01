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
import orgomg.cwm.resource.record.impl.FixedOffsetFieldImpl;
import orgomg.cwmx.resource.imsdatabase.Field;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.SenField;
import orgomg.cwmx.resource.imsdatabase.SenSegment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sen Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl#isReplace <em>Replace</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl#getSenSegment <em>Sen Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SenFieldImpl#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenFieldImpl extends FixedOffsetFieldImpl implements SenField {

    /**
     * The default value of the '{@link #isReplace() <em>Replace</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isReplace()
     * @generated
     * @ordered
     */
    protected static final boolean REPLACE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isReplace() <em>Replace</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isReplace()
     * @generated
     * @ordered
     */
    protected boolean replace = REPLACE_EDEFAULT;

    /**
     * The cached value of the '{@link #getField() <em>Field</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getField()
     * @generated
     * @ordered
     */
    protected Field field;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SenFieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.SEN_FIELD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isReplace() {
        return replace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReplace(boolean newReplace) {
        boolean oldReplace = replace;
        replace = newReplace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_FIELD__REPLACE, oldReplace, replace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SenSegment getSenSegment() {
        if (eContainerFeatureID() != ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT)
            return null;
        return (SenSegment) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSenSegment(SenSegment newSenSegment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newSenSegment, ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSenSegment(SenSegment newSenSegment) {
        if (newSenSegment != eInternalContainer()
                || (eContainerFeatureID() != ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT && newSenSegment != null)) {
            if (EcoreUtil.isAncestor(this, newSenSegment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSenSegment != null)
                msgs = ((InternalEObject) newSenSegment).eInverseAdd(this, ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD,
                        SenSegment.class, msgs);
            msgs = basicSetSenSegment(newSenSegment, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT, newSenSegment,
                    newSenSegment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Field getField() {
        if (field != null && field.eIsProxy()) {
            InternalEObject oldField = (InternalEObject) field;
            field = (Field) eResolveProxy(oldField);
            if (field != oldField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.SEN_FIELD__FIELD, oldField,
                            field));
            }
        }
        return field;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Field basicGetField() {
        return field;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetField(Field newField, NotificationChain msgs) {
        Field oldField = field;
        field = newField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_FIELD__FIELD,
                    oldField, newField);
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
    public void setField(Field newField) {
        if (newField != field) {
            NotificationChain msgs = null;
            if (field != null)
                msgs = ((InternalEObject) field).eInverseRemove(this, ImsdatabasePackage.FIELD__SEN_FIELD, Field.class, msgs);
            if (newField != null)
                msgs = ((InternalEObject) newField).eInverseAdd(this, ImsdatabasePackage.FIELD__SEN_FIELD, Field.class, msgs);
            msgs = basicSetField(newField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEN_FIELD__FIELD, newField, newField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSenSegment((SenSegment) otherEnd, msgs);
        case ImsdatabasePackage.SEN_FIELD__FIELD:
            if (field != null)
                msgs = ((InternalEObject) field).eInverseRemove(this, ImsdatabasePackage.FIELD__SEN_FIELD, Field.class, msgs);
            return basicSetField((Field) otherEnd, msgs);
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
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            return basicSetSenSegment(null, msgs);
        case ImsdatabasePackage.SEN_FIELD__FIELD:
            return basicSetField(null, msgs);
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
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.SEN_SEGMENT__SEN_FIELD, SenSegment.class, msgs);
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
        case ImsdatabasePackage.SEN_FIELD__REPLACE:
            return isReplace();
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            return getSenSegment();
        case ImsdatabasePackage.SEN_FIELD__FIELD:
            if (resolve)
                return getField();
            return basicGetField();
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
        case ImsdatabasePackage.SEN_FIELD__REPLACE:
            setReplace((Boolean) newValue);
            return;
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            setSenSegment((SenSegment) newValue);
            return;
        case ImsdatabasePackage.SEN_FIELD__FIELD:
            setField((Field) newValue);
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
        case ImsdatabasePackage.SEN_FIELD__REPLACE:
            setReplace(REPLACE_EDEFAULT);
            return;
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            setSenSegment((SenSegment) null);
            return;
        case ImsdatabasePackage.SEN_FIELD__FIELD:
            setField((Field) null);
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
        case ImsdatabasePackage.SEN_FIELD__REPLACE:
            return replace != REPLACE_EDEFAULT;
        case ImsdatabasePackage.SEN_FIELD__SEN_SEGMENT:
            return getSenSegment() != null;
        case ImsdatabasePackage.SEN_FIELD__FIELD:
            return field != null;
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
        result.append(" (replace: ");
        result.append(replace);
        result.append(')');
        return result.toString();
    }

} // SenFieldImpl
