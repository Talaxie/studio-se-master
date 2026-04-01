/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmx.resource.express.AliasDimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.SimpleDimension;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Alias Dimension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.AliasDimensionImpl#getBaseDimension <em>Base Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasDimensionImpl extends DimensionImpl implements AliasDimension {

    /**
     * The cached value of the '{@link #getBaseDimension() <em>Base Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBaseDimension()
     * @generated
     * @ordered
     */
    protected SimpleDimension baseDimension;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AliasDimensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.ALIAS_DIMENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SimpleDimension getBaseDimension() {
        if (baseDimension != null && baseDimension.eIsProxy()) {
            InternalEObject oldBaseDimension = (InternalEObject) baseDimension;
            baseDimension = (SimpleDimension) eResolveProxy(oldBaseDimension);
            if (baseDimension != oldBaseDimension) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION,
                            oldBaseDimension, baseDimension));
            }
        }
        return baseDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SimpleDimension basicGetBaseDimension() {
        return baseDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseDimension(SimpleDimension newBaseDimension, NotificationChain msgs) {
        SimpleDimension oldBaseDimension = baseDimension;
        baseDimension = newBaseDimension;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION, oldBaseDimension, newBaseDimension);
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
    public void setBaseDimension(SimpleDimension newBaseDimension) {
        if (newBaseDimension != baseDimension) {
            NotificationChain msgs = null;
            if (baseDimension != null)
                msgs = ((InternalEObject) baseDimension).eInverseRemove(this, ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION,
                        SimpleDimension.class, msgs);
            if (newBaseDimension != null)
                msgs = ((InternalEObject) newBaseDimension).eInverseAdd(this, ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION,
                        SimpleDimension.class, msgs);
            msgs = basicSetBaseDimension(newBaseDimension, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION,
                    newBaseDimension, newBaseDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION:
            if (baseDimension != null)
                msgs = ((InternalEObject) baseDimension).eInverseRemove(this, ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION,
                        SimpleDimension.class, msgs);
            return basicSetBaseDimension((SimpleDimension) otherEnd, msgs);
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
        case ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION:
            return basicSetBaseDimension(null, msgs);
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
        case ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION:
            if (resolve)
                return getBaseDimension();
            return basicGetBaseDimension();
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
        case ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION:
            setBaseDimension((SimpleDimension) newValue);
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
        case ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION:
            setBaseDimension((SimpleDimension) null);
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
        case ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION:
            return baseDimension != null;
        }
        return super.eIsSet(featureID);
    }

} // AliasDimensionImpl
