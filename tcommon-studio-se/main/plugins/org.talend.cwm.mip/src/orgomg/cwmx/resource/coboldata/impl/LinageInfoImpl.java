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
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.COBOLItem;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.LinageInfo;
import orgomg.cwmx.resource.coboldata.LinageInfoType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Linage Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl#getValue <em>Value</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl#getCobolItem <em>Cobol Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.LinageInfoImpl#getCobolFD <em>Cobol FD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinageInfoImpl extends ModelElementImpl implements LinageInfo {

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final long VALUE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected long value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final LinageInfoType TYPE_EDEFAULT = LinageInfoType.LI_LINAGE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected LinageInfoType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCobolItem() <em>Cobol Item</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCobolItem()
     * @generated
     * @ordered
     */
    protected COBOLItem cobolItem;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected LinageInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.LINAGE_INFO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setValue(long newValue) {
        long oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.LINAGE_INFO__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LinageInfoType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType(LinageInfoType newType) {
        LinageInfoType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.LINAGE_INFO__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem getCobolItem() {
        if (cobolItem != null && cobolItem.eIsProxy()) {
            InternalEObject oldCobolItem = (InternalEObject) cobolItem;
            cobolItem = (COBOLItem) eResolveProxy(oldCobolItem);
            if (cobolItem != oldCobolItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.LINAGE_INFO__COBOL_ITEM,
                            oldCobolItem, cobolItem));
            }
        }
        return cobolItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem basicGetCobolItem() {
        return cobolItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCobolItem(COBOLItem newCobolItem, NotificationChain msgs) {
        COBOLItem oldCobolItem = cobolItem;
        cobolItem = newCobolItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoboldataPackage.LINAGE_INFO__COBOL_ITEM, oldCobolItem, newCobolItem);
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
    public void setCobolItem(COBOLItem newCobolItem) {
        if (newCobolItem != cobolItem) {
            NotificationChain msgs = null;
            if (cobolItem != null)
                msgs = ((InternalEObject) cobolItem).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__LINAGE_INFO,
                        COBOLItem.class, msgs);
            if (newCobolItem != null)
                msgs = ((InternalEObject) newCobolItem).eInverseAdd(this, CoboldataPackage.COBOL_ITEM__LINAGE_INFO,
                        COBOLItem.class, msgs);
            msgs = basicSetCobolItem(newCobolItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.LINAGE_INFO__COBOL_ITEM, newCobolItem,
                    newCobolItem));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLFD getCobolFD() {
        if (eContainerFeatureID() != CoboldataPackage.LINAGE_INFO__COBOL_FD)
            return null;
        return (COBOLFD) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCobolFD(COBOLFD newCobolFD, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newCobolFD, CoboldataPackage.LINAGE_INFO__COBOL_FD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCobolFD(COBOLFD newCobolFD) {
        if (newCobolFD != eInternalContainer()
                || (eContainerFeatureID() != CoboldataPackage.LINAGE_INFO__COBOL_FD && newCobolFD != null)) {
            if (EcoreUtil.isAncestor(this, newCobolFD))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCobolFD != null)
                msgs = ((InternalEObject) newCobolFD).eInverseAdd(this, CoboldataPackage.COBOLFD__LINAGE_INFO, COBOLFD.class,
                        msgs);
            msgs = basicSetCobolFD(newCobolFD, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.LINAGE_INFO__COBOL_FD, newCobolFD, newCobolFD));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.LINAGE_INFO__COBOL_ITEM:
            if (cobolItem != null)
                msgs = ((InternalEObject) cobolItem).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__LINAGE_INFO,
                        COBOLItem.class, msgs);
            return basicSetCobolItem((COBOLItem) otherEnd, msgs);
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetCobolFD((COBOLFD) otherEnd, msgs);
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
        case CoboldataPackage.LINAGE_INFO__COBOL_ITEM:
            return basicSetCobolItem(null, msgs);
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            return basicSetCobolFD(null, msgs);
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
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            return eInternalContainer().eInverseRemove(this, CoboldataPackage.COBOLFD__LINAGE_INFO, COBOLFD.class, msgs);
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
        case CoboldataPackage.LINAGE_INFO__VALUE:
            return getValue();
        case CoboldataPackage.LINAGE_INFO__TYPE:
            return getType();
        case CoboldataPackage.LINAGE_INFO__COBOL_ITEM:
            if (resolve)
                return getCobolItem();
            return basicGetCobolItem();
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            return getCobolFD();
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
        case CoboldataPackage.LINAGE_INFO__VALUE:
            setValue((Long) newValue);
            return;
        case CoboldataPackage.LINAGE_INFO__TYPE:
            setType((LinageInfoType) newValue);
            return;
        case CoboldataPackage.LINAGE_INFO__COBOL_ITEM:
            setCobolItem((COBOLItem) newValue);
            return;
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            setCobolFD((COBOLFD) newValue);
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
        case CoboldataPackage.LINAGE_INFO__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
        case CoboldataPackage.LINAGE_INFO__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case CoboldataPackage.LINAGE_INFO__COBOL_ITEM:
            setCobolItem((COBOLItem) null);
            return;
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            setCobolFD((COBOLFD) null);
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
        case CoboldataPackage.LINAGE_INFO__VALUE:
            return value != VALUE_EDEFAULT;
        case CoboldataPackage.LINAGE_INFO__TYPE:
            return type != TYPE_EDEFAULT;
        case CoboldataPackage.LINAGE_INFO__COBOL_ITEM:
            return cobolItem != null;
        case CoboldataPackage.LINAGE_INFO__COBOL_FD:
            return getCobolFD() != null;
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
        result.append(" (value: ");
        result.append(value);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} // LinageInfoImpl
