/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmx.resource.imsdatabase.DEDB;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DEDB</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl#getRmName <em>Rm Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DEDBImpl#isExtendedCall <em>Extended Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEDBImpl extends AccessMethodImpl implements DEDB {

    /**
     * The default value of the '{@link #getRmName() <em>Rm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRmName()
     * @generated
     * @ordered
     */
    protected static final String RM_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRmName() <em>Rm Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRmName()
     * @generated
     * @ordered
     */
    protected String rmName = RM_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStage()
     * @generated
     * @ordered
     */
    protected static final long STAGE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStage()
     * @generated
     * @ordered
     */
    protected long stage = STAGE_EDEFAULT;

    /**
     * The default value of the '{@link #isExtendedCall() <em>Extended Call</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isExtendedCall()
     * @generated
     * @ordered
     */
    protected static final boolean EXTENDED_CALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExtendedCall() <em>Extended Call</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isExtendedCall()
     * @generated
     * @ordered
     */
    protected boolean extendedCall = EXTENDED_CALL_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DEDBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.DEDB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getRmName() {
        return rmName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRmName(String newRmName) {
        String oldRmName = rmName;
        rmName = newRmName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DEDB__RM_NAME, oldRmName, rmName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getStage() {
        return stage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStage(long newStage) {
        long oldStage = stage;
        stage = newStage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DEDB__STAGE, oldStage, stage));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isExtendedCall() {
        return extendedCall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setExtendedCall(boolean newExtendedCall) {
        boolean oldExtendedCall = extendedCall;
        extendedCall = newExtendedCall;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DEDB__EXTENDED_CALL, oldExtendedCall,
                    extendedCall));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ImsdatabasePackage.DEDB__RM_NAME:
            return getRmName();
        case ImsdatabasePackage.DEDB__STAGE:
            return getStage();
        case ImsdatabasePackage.DEDB__EXTENDED_CALL:
            return isExtendedCall();
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
        case ImsdatabasePackage.DEDB__RM_NAME:
            setRmName((String) newValue);
            return;
        case ImsdatabasePackage.DEDB__STAGE:
            setStage((Long) newValue);
            return;
        case ImsdatabasePackage.DEDB__EXTENDED_CALL:
            setExtendedCall((Boolean) newValue);
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
        case ImsdatabasePackage.DEDB__RM_NAME:
            setRmName(RM_NAME_EDEFAULT);
            return;
        case ImsdatabasePackage.DEDB__STAGE:
            setStage(STAGE_EDEFAULT);
            return;
        case ImsdatabasePackage.DEDB__EXTENDED_CALL:
            setExtendedCall(EXTENDED_CALL_EDEFAULT);
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
        case ImsdatabasePackage.DEDB__RM_NAME:
            return RM_NAME_EDEFAULT == null ? rmName != null : !RM_NAME_EDEFAULT.equals(rmName);
        case ImsdatabasePackage.DEDB__STAGE:
            return stage != STAGE_EDEFAULT;
        case ImsdatabasePackage.DEDB__EXTENDED_CALL:
            return extendedCall != EXTENDED_CALL_EDEFAULT;
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
        result.append(" (rmName: ");
        result.append(rmName);
        result.append(", stage: ");
        result.append(stage);
        result.append(", extendedCall: ");
        result.append(extendedCall);
        result.append(')');
        return result.toString();
    }

} // DEDBImpl
