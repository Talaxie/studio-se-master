/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.objectmodel.core.impl.NamespaceImpl;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.InterchangePattern;
import orgomg.cwmmip.UnitOfInterchange;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unit Of Interchange</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmmip.impl.UnitOfInterchangeImpl#getInterchangePattern <em>Interchange Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitOfInterchangeImpl extends NamespaceImpl implements UnitOfInterchange {

    /**
     * The cached value of the '{@link #getInterchangePattern() <em>Interchange Pattern</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getInterchangePattern()
     * @generated
     * @ordered
     */
    protected InterchangePattern interchangePattern;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected UnitOfInterchangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CwmmipPackage.Literals.UNIT_OF_INTERCHANGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InterchangePattern getInterchangePattern() {
        if (interchangePattern != null && interchangePattern.eIsProxy()) {
            InternalEObject oldInterchangePattern = (InternalEObject) interchangePattern;
            interchangePattern = (InterchangePattern) eResolveProxy(oldInterchangePattern);
            if (interchangePattern != oldInterchangePattern) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN, oldInterchangePattern, interchangePattern));
            }
        }
        return interchangePattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InterchangePattern basicGetInterchangePattern() {
        return interchangePattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterchangePattern(InterchangePattern newInterchangePattern, NotificationChain msgs) {
        InterchangePattern oldInterchangePattern = interchangePattern;
        interchangePattern = newInterchangePattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN, oldInterchangePattern, newInterchangePattern);
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
    public void setInterchangePattern(InterchangePattern newInterchangePattern) {
        if (newInterchangePattern != interchangePattern) {
            NotificationChain msgs = null;
            if (interchangePattern != null)
                msgs = ((InternalEObject) interchangePattern).eInverseRemove(this,
                        CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE, InterchangePattern.class, msgs);
            if (newInterchangePattern != null)
                msgs = ((InternalEObject) newInterchangePattern).eInverseAdd(this,
                        CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE, InterchangePattern.class, msgs);
            msgs = basicSetInterchangePattern(newInterchangePattern, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN,
                    newInterchangePattern, newInterchangePattern));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN:
            if (interchangePattern != null)
                msgs = ((InternalEObject) interchangePattern).eInverseRemove(this,
                        CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE, InterchangePattern.class, msgs);
            return basicSetInterchangePattern((InterchangePattern) otherEnd, msgs);
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
        case CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN:
            return basicSetInterchangePattern(null, msgs);
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
        case CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN:
            if (resolve)
                return getInterchangePattern();
            return basicGetInterchangePattern();
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
        case CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN:
            setInterchangePattern((InterchangePattern) newValue);
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
        case CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN:
            setInterchangePattern((InterchangePattern) null);
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
        case CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN:
            return interchangePattern != null;
        }
        return super.eIsSet(featureID);
    }

} // UnitOfInterchangeImpl
