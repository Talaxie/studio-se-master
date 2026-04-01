/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmx.resource.essbase.Dimension;
import orgomg.cwmx.resource.essbase.DimensionType;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Outline;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dimension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.DimensionImpl#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.DimensionImpl#isIsDense <em>Is Dense</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.DimensionImpl#getOutline <em>Outline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionImpl extends orgomg.cwm.resource.multidimensional.impl.DimensionImpl implements Dimension {

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final DimensionType TYPE_EDEFAULT = DimensionType.ESS_NONE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DimensionType type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsDense() <em>Is Dense</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsDense()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DENSE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDense() <em>Is Dense</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsDense()
     * @generated
     * @ordered
     */
    protected boolean isDense = IS_DENSE_EDEFAULT;

    /**
     * The cached value of the '{@link #getOutline() <em>Outline</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOutline()
     * @generated
     * @ordered
     */
    protected Outline outline;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DimensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EssbasePackage.Literals.DIMENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DimensionType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType(DimensionType newType) {
        DimensionType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.DIMENSION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDense() {
        return isDense;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsDense(boolean newIsDense) {
        boolean oldIsDense = isDense;
        isDense = newIsDense;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.DIMENSION__IS_DENSE, oldIsDense, isDense));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Outline getOutline() {
        if (outline != null && outline.eIsProxy()) {
            InternalEObject oldOutline = (InternalEObject) outline;
            outline = (Outline) eResolveProxy(oldOutline);
            if (outline != oldOutline) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EssbasePackage.DIMENSION__OUTLINE, oldOutline,
                            outline));
            }
        }
        return outline;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Outline basicGetOutline() {
        return outline;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutline(Outline newOutline, NotificationChain msgs) {
        Outline oldOutline = outline;
        outline = newOutline;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssbasePackage.DIMENSION__OUTLINE,
                    oldOutline, newOutline);
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
    public void setOutline(Outline newOutline) {
        if (newOutline != outline) {
            NotificationChain msgs = null;
            if (outline != null)
                msgs = ((InternalEObject) outline).eInverseRemove(this, EssbasePackage.OUTLINE__DIMENSION, Outline.class, msgs);
            if (newOutline != null)
                msgs = ((InternalEObject) newOutline).eInverseAdd(this, EssbasePackage.OUTLINE__DIMENSION, Outline.class, msgs);
            msgs = basicSetOutline(newOutline, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.DIMENSION__OUTLINE, newOutline, newOutline));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EssbasePackage.DIMENSION__OUTLINE:
            if (outline != null)
                msgs = ((InternalEObject) outline).eInverseRemove(this, EssbasePackage.OUTLINE__DIMENSION, Outline.class, msgs);
            return basicSetOutline((Outline) otherEnd, msgs);
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
        case EssbasePackage.DIMENSION__OUTLINE:
            return basicSetOutline(null, msgs);
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
        case EssbasePackage.DIMENSION__TYPE:
            return getType();
        case EssbasePackage.DIMENSION__IS_DENSE:
            return isIsDense();
        case EssbasePackage.DIMENSION__OUTLINE:
            if (resolve)
                return getOutline();
            return basicGetOutline();
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
        case EssbasePackage.DIMENSION__TYPE:
            setType((DimensionType) newValue);
            return;
        case EssbasePackage.DIMENSION__IS_DENSE:
            setIsDense((Boolean) newValue);
            return;
        case EssbasePackage.DIMENSION__OUTLINE:
            setOutline((Outline) newValue);
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
        case EssbasePackage.DIMENSION__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case EssbasePackage.DIMENSION__IS_DENSE:
            setIsDense(IS_DENSE_EDEFAULT);
            return;
        case EssbasePackage.DIMENSION__OUTLINE:
            setOutline((Outline) null);
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
        case EssbasePackage.DIMENSION__TYPE:
            return type != TYPE_EDEFAULT;
        case EssbasePackage.DIMENSION__IS_DENSE:
            return isDense != IS_DENSE_EDEFAULT;
        case EssbasePackage.DIMENSION__OUTLINE:
            return outline != null;
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
        result.append(" (type: ");
        result.append(type);
        result.append(", isDense: ");
        result.append(isDense);
        result.append(')');
        return result.toString();
    }

} // DimensionImpl
