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
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.Renames;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Renames</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.RenamesImpl#getFirstField <em>First Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.RenamesImpl#getThruField <em>Thru Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamesImpl extends COBOLItemImpl implements Renames {

    /**
     * The cached value of the '{@link #getFirstField() <em>First Field</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFirstField()
     * @generated
     * @ordered
     */
    protected COBOLField firstField;

    /**
     * The cached value of the '{@link #getThruField() <em>Thru Field</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getThruField()
     * @generated
     * @ordered
     */
    protected COBOLField thruField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RenamesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.RENAMES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField getFirstField() {
        if (firstField != null && firstField.eIsProxy()) {
            InternalEObject oldFirstField = (InternalEObject) firstField;
            firstField = (COBOLField) eResolveProxy(oldFirstField);
            if (firstField != oldFirstField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.RENAMES__FIRST_FIELD,
                            oldFirstField, firstField));
            }
        }
        return firstField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField basicGetFirstField() {
        return firstField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFirstField(COBOLField newFirstField, NotificationChain msgs) {
        COBOLField oldFirstField = firstField;
        firstField = newFirstField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoboldataPackage.RENAMES__FIRST_FIELD,
                    oldFirstField, newFirstField);
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
    public void setFirstField(COBOLField newFirstField) {
        if (newFirstField != firstField) {
            NotificationChain msgs = null;
            if (firstField != null)
                msgs = ((InternalEObject) firstField).eInverseRemove(this, CoboldataPackage.COBOL_FIELD__FIRST_RENAMES,
                        COBOLField.class, msgs);
            if (newFirstField != null)
                msgs = ((InternalEObject) newFirstField).eInverseAdd(this, CoboldataPackage.COBOL_FIELD__FIRST_RENAMES,
                        COBOLField.class, msgs);
            msgs = basicSetFirstField(newFirstField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.RENAMES__FIRST_FIELD, newFirstField,
                    newFirstField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField getThruField() {
        if (thruField != null && thruField.eIsProxy()) {
            InternalEObject oldThruField = (InternalEObject) thruField;
            thruField = (COBOLField) eResolveProxy(oldThruField);
            if (thruField != oldThruField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.RENAMES__THRU_FIELD, oldThruField,
                            thruField));
            }
        }
        return thruField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField basicGetThruField() {
        return thruField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThruField(COBOLField newThruField, NotificationChain msgs) {
        COBOLField oldThruField = thruField;
        thruField = newThruField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoboldataPackage.RENAMES__THRU_FIELD,
                    oldThruField, newThruField);
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
    public void setThruField(COBOLField newThruField) {
        if (newThruField != thruField) {
            NotificationChain msgs = null;
            if (thruField != null)
                msgs = ((InternalEObject) thruField).eInverseRemove(this, CoboldataPackage.COBOL_FIELD__THRU_RENAMES,
                        COBOLField.class, msgs);
            if (newThruField != null)
                msgs = ((InternalEObject) newThruField).eInverseAdd(this, CoboldataPackage.COBOL_FIELD__THRU_RENAMES,
                        COBOLField.class, msgs);
            msgs = basicSetThruField(newThruField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.RENAMES__THRU_FIELD, newThruField,
                    newThruField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.RENAMES__FIRST_FIELD:
            if (firstField != null)
                msgs = ((InternalEObject) firstField).eInverseRemove(this, CoboldataPackage.COBOL_FIELD__FIRST_RENAMES,
                        COBOLField.class, msgs);
            return basicSetFirstField((COBOLField) otherEnd, msgs);
        case CoboldataPackage.RENAMES__THRU_FIELD:
            if (thruField != null)
                msgs = ((InternalEObject) thruField).eInverseRemove(this, CoboldataPackage.COBOL_FIELD__THRU_RENAMES,
                        COBOLField.class, msgs);
            return basicSetThruField((COBOLField) otherEnd, msgs);
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
        case CoboldataPackage.RENAMES__FIRST_FIELD:
            return basicSetFirstField(null, msgs);
        case CoboldataPackage.RENAMES__THRU_FIELD:
            return basicSetThruField(null, msgs);
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
        case CoboldataPackage.RENAMES__FIRST_FIELD:
            if (resolve)
                return getFirstField();
            return basicGetFirstField();
        case CoboldataPackage.RENAMES__THRU_FIELD:
            if (resolve)
                return getThruField();
            return basicGetThruField();
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
        case CoboldataPackage.RENAMES__FIRST_FIELD:
            setFirstField((COBOLField) newValue);
            return;
        case CoboldataPackage.RENAMES__THRU_FIELD:
            setThruField((COBOLField) newValue);
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
        case CoboldataPackage.RENAMES__FIRST_FIELD:
            setFirstField((COBOLField) null);
            return;
        case CoboldataPackage.RENAMES__THRU_FIELD:
            setThruField((COBOLField) null);
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
        case CoboldataPackage.RENAMES__FIRST_FIELD:
            return firstField != null;
        case CoboldataPackage.RENAMES__THRU_FIELD:
            return thruField != null;
        }
        return super.eIsSet(featureID);
    }

} // RenamesImpl
