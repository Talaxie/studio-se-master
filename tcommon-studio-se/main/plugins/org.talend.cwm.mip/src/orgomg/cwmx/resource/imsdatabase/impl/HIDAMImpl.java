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
import orgomg.cwmx.resource.imsdatabase.HIDAM;
import orgomg.cwmx.resource.imsdatabase.INDEX;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>HIDAM</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.HIDAMImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HIDAMImpl extends AccessMethodImpl implements HIDAM {

    /**
     * The cached value of the '{@link #getIndex() <em>Index</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIndex()
     * @generated
     * @ordered
     */
    protected INDEX index;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected HIDAMImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.HIDAM;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImsdatabasePackage.HIDAM__INDEX, oldIndex, index));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.HIDAM__INDEX,
                    oldIndex, newIndex);
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
                msgs = ((InternalEObject) index)
                        .eInverseRemove(this, ImsdatabasePackage.INDEX__PRIMARY_TARGET, INDEX.class, msgs);
            if (newIndex != null)
                msgs = ((InternalEObject) newIndex)
                        .eInverseAdd(this, ImsdatabasePackage.INDEX__PRIMARY_TARGET, INDEX.class, msgs);
            msgs = basicSetIndex(newIndex, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.HIDAM__INDEX, newIndex, newIndex));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.HIDAM__INDEX:
            if (index != null)
                msgs = ((InternalEObject) index)
                        .eInverseRemove(this, ImsdatabasePackage.INDEX__PRIMARY_TARGET, INDEX.class, msgs);
            return basicSetIndex((INDEX) otherEnd, msgs);
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
        case ImsdatabasePackage.HIDAM__INDEX:
            return basicSetIndex(null, msgs);
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
        case ImsdatabasePackage.HIDAM__INDEX:
            if (resolve)
                return getIndex();
            return basicGetIndex();
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
        case ImsdatabasePackage.HIDAM__INDEX:
            setIndex((INDEX) newValue);
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
        case ImsdatabasePackage.HIDAM__INDEX:
            setIndex((INDEX) null);
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
        case ImsdatabasePackage.HIDAM__INDEX:
            return index != null;
        }
        return super.eIsSet(featureID);
    }

} // HIDAMImpl
