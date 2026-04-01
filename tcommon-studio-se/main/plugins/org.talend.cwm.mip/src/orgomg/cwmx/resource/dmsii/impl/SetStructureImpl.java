/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.objectmodel.core.impl.StructuralFeatureImpl;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.SetStructure;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Set Structure</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.SetStructureImpl#getDuplicates <em>Duplicates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetStructureImpl extends StructuralFeatureImpl implements SetStructure {

    /**
     * The default value of the '{@link #getDuplicates() <em>Duplicates</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDuplicates()
     * @generated
     * @ordered
     */
    protected static final String DUPLICATES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDuplicates() <em>Duplicates</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDuplicates()
     * @generated
     * @ordered
     */
    protected String duplicates = DUPLICATES_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SetStructureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.SET_STRUCTURE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDuplicates() {
        return duplicates;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDuplicates(String newDuplicates) {
        String oldDuplicates = duplicates;
        duplicates = newDuplicates;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.SET_STRUCTURE__DUPLICATES, oldDuplicates,
                    duplicates));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmsiiPackage.SET_STRUCTURE__DUPLICATES:
            return getDuplicates();
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
        case DmsiiPackage.SET_STRUCTURE__DUPLICATES:
            setDuplicates((String) newValue);
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
        case DmsiiPackage.SET_STRUCTURE__DUPLICATES:
            setDuplicates(DUPLICATES_EDEFAULT);
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
        case DmsiiPackage.SET_STRUCTURE__DUPLICATES:
            return DUPLICATES_EDEFAULT == null ? duplicates != null : !DUPLICATES_EDEFAULT.equals(duplicates);
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
        result.append(" (duplicates: ");
        result.append(duplicates);
        result.append(')');
        return result.toString();
    }

} // SetStructureImpl
