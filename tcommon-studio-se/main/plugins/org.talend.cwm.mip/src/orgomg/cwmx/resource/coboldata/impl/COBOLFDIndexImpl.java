/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.keysindexes.impl.IndexImpl;
import orgomg.cwmx.resource.coboldata.COBOLFDIndex;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>COBOLFD Index</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFDIndexImpl#isIsAlternate <em>Is Alternate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COBOLFDIndexImpl extends IndexImpl implements COBOLFDIndex {

    /**
     * The default value of the '{@link #isIsAlternate() <em>Is Alternate</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsAlternate()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ALTERNATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAlternate() <em>Is Alternate</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsAlternate()
     * @generated
     * @ordered
     */
    protected boolean isAlternate = IS_ALTERNATE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected COBOLFDIndexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.COBOLFD_INDEX;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAlternate() {
        return isAlternate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsAlternate(boolean newIsAlternate) {
        boolean oldIsAlternate = isAlternate;
        isAlternate = newIsAlternate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOLFD_INDEX__IS_ALTERNATE, oldIsAlternate,
                    isAlternate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case CoboldataPackage.COBOLFD_INDEX__IS_ALTERNATE:
            return isIsAlternate();
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
        case CoboldataPackage.COBOLFD_INDEX__IS_ALTERNATE:
            setIsAlternate((Boolean) newValue);
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
        case CoboldataPackage.COBOLFD_INDEX__IS_ALTERNATE:
            setIsAlternate(IS_ALTERNATE_EDEFAULT);
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
        case CoboldataPackage.COBOLFD_INDEX__IS_ALTERNATE:
            return isAlternate != IS_ALTERNATE_EDEFAULT;
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
        result.append(" (isAlternate: ");
        result.append(isAlternate);
        result.append(')');
        return result.toString();
    }

} // COBOLFDIndexImpl
