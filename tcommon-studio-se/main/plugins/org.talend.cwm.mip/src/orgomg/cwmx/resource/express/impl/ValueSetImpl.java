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
import orgomg.cwm.resource.multidimensional.impl.DimensionedObjectImpl;
import orgomg.cwmx.resource.express.Dimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.ValueSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Value Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.ValueSetImpl#isIsTemp <em>Is Temp</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.ValueSetImpl#getReferenceDimension <em>Reference Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSetImpl extends DimensionedObjectImpl implements ValueSet {

    /**
     * The default value of the '{@link #isIsTemp() <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTemp()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TEMP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsTemp() <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTemp()
     * @generated
     * @ordered
     */
    protected boolean isTemp = IS_TEMP_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferenceDimension() <em>Reference Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReferenceDimension()
     * @generated
     * @ordered
     */
    protected Dimension referenceDimension;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ValueSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.VALUE_SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsTemp() {
        return isTemp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsTemp(boolean newIsTemp) {
        boolean oldIsTemp = isTemp;
        isTemp = newIsTemp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.VALUE_SET__IS_TEMP, oldIsTemp, isTemp));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension getReferenceDimension() {
        if (referenceDimension != null && referenceDimension.eIsProxy()) {
            InternalEObject oldReferenceDimension = (InternalEObject) referenceDimension;
            referenceDimension = (Dimension) eResolveProxy(oldReferenceDimension);
            if (referenceDimension != oldReferenceDimension) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.VALUE_SET__REFERENCE_DIMENSION,
                            oldReferenceDimension, referenceDimension));
            }
        }
        return referenceDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension basicGetReferenceDimension() {
        return referenceDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferenceDimension(Dimension newReferenceDimension, NotificationChain msgs) {
        Dimension oldReferenceDimension = referenceDimension;
        referenceDimension = newReferenceDimension;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.VALUE_SET__REFERENCE_DIMENSION, oldReferenceDimension, newReferenceDimension);
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
    public void setReferenceDimension(Dimension newReferenceDimension) {
        if (newReferenceDimension != referenceDimension) {
            NotificationChain msgs = null;
            if (referenceDimension != null)
                msgs = ((InternalEObject) referenceDimension).eInverseRemove(this, ExpressPackage.DIMENSION__VALUE_SET,
                        Dimension.class, msgs);
            if (newReferenceDimension != null)
                msgs = ((InternalEObject) newReferenceDimension).eInverseAdd(this, ExpressPackage.DIMENSION__VALUE_SET,
                        Dimension.class, msgs);
            msgs = basicSetReferenceDimension(newReferenceDimension, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.VALUE_SET__REFERENCE_DIMENSION,
                    newReferenceDimension, newReferenceDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.VALUE_SET__REFERENCE_DIMENSION:
            if (referenceDimension != null)
                msgs = ((InternalEObject) referenceDimension).eInverseRemove(this, ExpressPackage.DIMENSION__VALUE_SET,
                        Dimension.class, msgs);
            return basicSetReferenceDimension((Dimension) otherEnd, msgs);
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
        case ExpressPackage.VALUE_SET__REFERENCE_DIMENSION:
            return basicSetReferenceDimension(null, msgs);
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
        case ExpressPackage.VALUE_SET__IS_TEMP:
            return isIsTemp();
        case ExpressPackage.VALUE_SET__REFERENCE_DIMENSION:
            if (resolve)
                return getReferenceDimension();
            return basicGetReferenceDimension();
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
        case ExpressPackage.VALUE_SET__IS_TEMP:
            setIsTemp((Boolean) newValue);
            return;
        case ExpressPackage.VALUE_SET__REFERENCE_DIMENSION:
            setReferenceDimension((Dimension) newValue);
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
        case ExpressPackage.VALUE_SET__IS_TEMP:
            setIsTemp(IS_TEMP_EDEFAULT);
            return;
        case ExpressPackage.VALUE_SET__REFERENCE_DIMENSION:
            setReferenceDimension((Dimension) null);
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
        case ExpressPackage.VALUE_SET__IS_TEMP:
            return isTemp != IS_TEMP_EDEFAULT;
        case ExpressPackage.VALUE_SET__REFERENCE_DIMENSION:
            return referenceDimension != null;
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
        result.append(" (isTemp: ");
        result.append(isTemp);
        result.append(')');
        return result.toString();
    }

} // ValueSetImpl
