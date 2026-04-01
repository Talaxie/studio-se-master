/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.OccursKey;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Occurs Key</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl#getOccursKeyOf <em>Occurs Key Of</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.OccursKeyImpl#getOccursKeyField <em>Occurs Key Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccursKeyImpl extends ModelElementImpl implements OccursKey {

    /**
     * The default value of the '{@link #isIsAscending() <em>Is Ascending</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsAscending()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ASCENDING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAscending() <em>Is Ascending</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsAscending()
     * @generated
     * @ordered
     */
    protected boolean isAscending = IS_ASCENDING_EDEFAULT;

    /**
     * The cached value of the '{@link #getOccursKeyField() <em>Occurs Key Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOccursKeyField()
     * @generated
     * @ordered
     */
    protected COBOLField occursKeyField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected OccursKeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.OCCURS_KEY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAscending() {
        return isAscending;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsAscending(boolean newIsAscending) {
        boolean oldIsAscending = isAscending;
        isAscending = newIsAscending;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.OCCURS_KEY__IS_ASCENDING, oldIsAscending,
                    isAscending));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField getOccursKeyOf() {
        if (eContainerFeatureID() != CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF)
            return null;
        return (COBOLField) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOccursKeyOf(COBOLField newOccursKeyOf, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newOccursKeyOf, CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOccursKeyOf(COBOLField newOccursKeyOf) {
        if (newOccursKeyOf != eInternalContainer()
                || (eContainerFeatureID() != CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF && newOccursKeyOf != null)) {
            if (EcoreUtil.isAncestor(this, newOccursKeyOf))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOccursKeyOf != null)
                msgs = ((InternalEObject) newOccursKeyOf).eInverseAdd(this, CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO,
                        COBOLField.class, msgs);
            msgs = basicSetOccursKeyOf(newOccursKeyOf, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF, newOccursKeyOf,
                    newOccursKeyOf));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField getOccursKeyField() {
        if (occursKeyField != null && occursKeyField.eIsProxy()) {
            InternalEObject oldOccursKeyField = (InternalEObject) occursKeyField;
            occursKeyField = (COBOLField) eResolveProxy(oldOccursKeyField);
            if (occursKeyField != oldOccursKeyField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD,
                            oldOccursKeyField, occursKeyField));
            }
        }
        return occursKeyField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField basicGetOccursKeyField() {
        return occursKeyField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOccursKeyField(COBOLField newOccursKeyField, NotificationChain msgs) {
        COBOLField oldOccursKeyField = occursKeyField;
        occursKeyField = newOccursKeyField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD, oldOccursKeyField, newOccursKeyField);
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
    public void setOccursKeyField(COBOLField newOccursKeyField) {
        if (newOccursKeyField != occursKeyField) {
            NotificationChain msgs = null;
            if (occursKeyField != null)
                msgs = ((InternalEObject) occursKeyField).eInverseRemove(this,
                        CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO, COBOLField.class, msgs);
            if (newOccursKeyField != null)
                msgs = ((InternalEObject) newOccursKeyField).eInverseAdd(this,
                        CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO, COBOLField.class, msgs);
            msgs = basicSetOccursKeyField(newOccursKeyField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD,
                    newOccursKeyField, newOccursKeyField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOccursKeyOf((COBOLField) otherEnd, msgs);
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD:
            if (occursKeyField != null)
                msgs = ((InternalEObject) occursKeyField).eInverseRemove(this,
                        CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO, COBOLField.class, msgs);
            return basicSetOccursKeyField((COBOLField) otherEnd, msgs);
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
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            return basicSetOccursKeyOf(null, msgs);
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD:
            return basicSetOccursKeyField(null, msgs);
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
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            return eInternalContainer().eInverseRemove(this, CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO, COBOLField.class,
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
        case CoboldataPackage.OCCURS_KEY__IS_ASCENDING:
            return isIsAscending();
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            return getOccursKeyOf();
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD:
            if (resolve)
                return getOccursKeyField();
            return basicGetOccursKeyField();
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
        case CoboldataPackage.OCCURS_KEY__IS_ASCENDING:
            setIsAscending((Boolean) newValue);
            return;
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            setOccursKeyOf((COBOLField) newValue);
            return;
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD:
            setOccursKeyField((COBOLField) newValue);
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
        case CoboldataPackage.OCCURS_KEY__IS_ASCENDING:
            setIsAscending(IS_ASCENDING_EDEFAULT);
            return;
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            setOccursKeyOf((COBOLField) null);
            return;
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD:
            setOccursKeyField((COBOLField) null);
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
        case CoboldataPackage.OCCURS_KEY__IS_ASCENDING:
            return isAscending != IS_ASCENDING_EDEFAULT;
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF:
            return getOccursKeyOf() != null;
        case CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD:
            return occursKeyField != null;
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
        result.append(" (isAscending: ");
        result.append(isAscending);
        result.append(')');
        return result.toString();
    }

} // OccursKeyImpl
