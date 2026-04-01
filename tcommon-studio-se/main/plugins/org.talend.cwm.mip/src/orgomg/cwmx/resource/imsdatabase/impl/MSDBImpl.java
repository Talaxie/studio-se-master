/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.MSDB;
import orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>MSDB</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.MSDBImpl#getMsdbField <em>Msdb Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.MSDBImpl#getMsdbType <em>Msdb Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSDBImpl extends AccessMethodImpl implements MSDB {

    /**
     * The default value of the '{@link #getMsdbField() <em>Msdb Field</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMsdbField()
     * @generated
     * @ordered
     */
    protected static final String MSDB_FIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMsdbField() <em>Msdb Field</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMsdbField()
     * @generated
     * @ordered
     */
    protected String msdbField = MSDB_FIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getMsdbType() <em>Msdb Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMsdbType()
     * @generated
     * @ordered
     */
    protected static final MSDBtype MSDB_TYPE_EDEFAULT = MSDBtype.IMSMT_NO;

    /**
     * The cached value of the '{@link #getMsdbType() <em>Msdb Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMsdbType()
     * @generated
     * @ordered
     */
    protected MSDBtype msdbType = MSDB_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MSDBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.MSDB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getMsdbField() {
        return msdbField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMsdbField(String newMsdbField) {
        String oldMsdbField = msdbField;
        msdbField = newMsdbField;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.MSDB__MSDB_FIELD, oldMsdbField, msdbField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MSDBtype getMsdbType() {
        return msdbType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMsdbType(MSDBtype newMsdbType) {
        MSDBtype oldMsdbType = msdbType;
        msdbType = newMsdbType == null ? MSDB_TYPE_EDEFAULT : newMsdbType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.MSDB__MSDB_TYPE, oldMsdbType, msdbType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ImsdatabasePackage.MSDB__MSDB_FIELD:
            return getMsdbField();
        case ImsdatabasePackage.MSDB__MSDB_TYPE:
            return getMsdbType();
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
        case ImsdatabasePackage.MSDB__MSDB_FIELD:
            setMsdbField((String) newValue);
            return;
        case ImsdatabasePackage.MSDB__MSDB_TYPE:
            setMsdbType((MSDBtype) newValue);
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
        case ImsdatabasePackage.MSDB__MSDB_FIELD:
            setMsdbField(MSDB_FIELD_EDEFAULT);
            return;
        case ImsdatabasePackage.MSDB__MSDB_TYPE:
            setMsdbType(MSDB_TYPE_EDEFAULT);
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
        case ImsdatabasePackage.MSDB__MSDB_FIELD:
            return MSDB_FIELD_EDEFAULT == null ? msdbField != null : !MSDB_FIELD_EDEFAULT.equals(msdbField);
        case ImsdatabasePackage.MSDB__MSDB_TYPE:
            return msdbType != MSDB_TYPE_EDEFAULT;
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
        result.append(" (msdbField: ");
        result.append(msdbField);
        result.append(", msdbType: ");
        result.append(msdbType);
        result.append(')');
        return result.toString();
    }

} // MSDBImpl
