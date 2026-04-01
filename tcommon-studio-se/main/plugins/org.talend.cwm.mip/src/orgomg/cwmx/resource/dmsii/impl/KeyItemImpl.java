/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.keysindexes.impl.IndexedFeatureImpl;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.KeyItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Key Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.KeyItemImpl#getCollation <em>Collation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyItemImpl extends IndexedFeatureImpl implements KeyItem {

    /**
     * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCollation()
     * @generated
     * @ordered
     */
    protected static final String COLLATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCollation()
     * @generated
     * @ordered
     */
    protected String collation = COLLATION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected KeyItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.KEY_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getCollation() {
        return collation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCollation(String newCollation) {
        String oldCollation = collation;
        collation = newCollation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.KEY_ITEM__COLLATION, oldCollation, collation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmsiiPackage.KEY_ITEM__COLLATION:
            return getCollation();
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
        case DmsiiPackage.KEY_ITEM__COLLATION:
            setCollation((String) newValue);
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
        case DmsiiPackage.KEY_ITEM__COLLATION:
            setCollation(COLLATION_EDEFAULT);
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
        case DmsiiPackage.KEY_ITEM__COLLATION:
            return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
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
        result.append(" (collation: ");
        result.append(collation);
        result.append(')');
        return result.toString();
    }

} // KeyItemImpl
