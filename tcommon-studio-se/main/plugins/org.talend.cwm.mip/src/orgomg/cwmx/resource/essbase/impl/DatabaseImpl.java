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
import orgomg.cwm.resource.multidimensional.impl.SchemaImpl;
import orgomg.cwmx.resource.essbase.Database;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Outline;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.DatabaseImpl#isIsCurrency <em>Is Currency</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.DatabaseImpl#getOutline <em>Outline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends SchemaImpl implements Database {

    /**
     * The default value of the '{@link #isIsCurrency() <em>Is Currency</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsCurrency()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CURRENCY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsCurrency() <em>Is Currency</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsCurrency()
     * @generated
     * @ordered
     */
    protected boolean isCurrency = IS_CURRENCY_EDEFAULT;

    /**
     * The cached value of the '{@link #getOutline() <em>Outline</em>}' containment reference.
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
    protected DatabaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EssbasePackage.Literals.DATABASE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsCurrency() {
        return isCurrency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsCurrency(boolean newIsCurrency) {
        boolean oldIsCurrency = isCurrency;
        isCurrency = newIsCurrency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.DATABASE__IS_CURRENCY, oldIsCurrency, isCurrency));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Outline getOutline() {
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssbasePackage.DATABASE__OUTLINE,
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
                msgs = ((InternalEObject) outline).eInverseRemove(this, EssbasePackage.OUTLINE__DATABASE, Outline.class, msgs);
            if (newOutline != null)
                msgs = ((InternalEObject) newOutline).eInverseAdd(this, EssbasePackage.OUTLINE__DATABASE, Outline.class, msgs);
            msgs = basicSetOutline(newOutline, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.DATABASE__OUTLINE, newOutline, newOutline));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EssbasePackage.DATABASE__OUTLINE:
            if (outline != null)
                msgs = ((InternalEObject) outline).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - EssbasePackage.DATABASE__OUTLINE, null, msgs);
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
        case EssbasePackage.DATABASE__OUTLINE:
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
        case EssbasePackage.DATABASE__IS_CURRENCY:
            return isIsCurrency();
        case EssbasePackage.DATABASE__OUTLINE:
            return getOutline();
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
        case EssbasePackage.DATABASE__IS_CURRENCY:
            setIsCurrency((Boolean) newValue);
            return;
        case EssbasePackage.DATABASE__OUTLINE:
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
        case EssbasePackage.DATABASE__IS_CURRENCY:
            setIsCurrency(IS_CURRENCY_EDEFAULT);
            return;
        case EssbasePackage.DATABASE__OUTLINE:
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
        case EssbasePackage.DATABASE__IS_CURRENCY:
            return isCurrency != IS_CURRENCY_EDEFAULT;
        case EssbasePackage.DATABASE__OUTLINE:
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
        result.append(" (isCurrency: ");
        result.append(isCurrency);
        result.append(')');
        return result.toString();
    }

} // DatabaseImpl
