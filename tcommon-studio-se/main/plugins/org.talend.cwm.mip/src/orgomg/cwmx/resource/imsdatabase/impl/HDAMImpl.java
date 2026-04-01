/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmx.resource.imsdatabase.HDAM;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>HDAM</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl#getRmName <em>Rm Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl#getRelativeBlockNumber <em>Relative Block Number</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl#getRootAnchorPoints <em>Root Anchor Points</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.HDAMImpl#getRootMaxBytes <em>Root Max Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HDAMImpl extends AccessMethodImpl implements HDAM {

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
     * The default value of the '{@link #getRelativeBlockNumber() <em>Relative Block Number</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRelativeBlockNumber()
     * @generated
     * @ordered
     */
    protected static final long RELATIVE_BLOCK_NUMBER_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRelativeBlockNumber() <em>Relative Block Number</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRelativeBlockNumber()
     * @generated
     * @ordered
     */
    protected long relativeBlockNumber = RELATIVE_BLOCK_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getRootAnchorPoints() <em>Root Anchor Points</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRootAnchorPoints()
     * @generated
     * @ordered
     */
    protected static final long ROOT_ANCHOR_POINTS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRootAnchorPoints() <em>Root Anchor Points</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRootAnchorPoints()
     * @generated
     * @ordered
     */
    protected long rootAnchorPoints = ROOT_ANCHOR_POINTS_EDEFAULT;

    /**
     * The default value of the '{@link #getRootMaxBytes() <em>Root Max Bytes</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRootMaxBytes()
     * @generated
     * @ordered
     */
    protected static final long ROOT_MAX_BYTES_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRootMaxBytes() <em>Root Max Bytes</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRootMaxBytes()
     * @generated
     * @ordered
     */
    protected long rootMaxBytes = ROOT_MAX_BYTES_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected HDAMImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.HDAM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.HDAM__RM_NAME, oldRmName, rmName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRelativeBlockNumber() {
        return relativeBlockNumber;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRelativeBlockNumber(long newRelativeBlockNumber) {
        long oldRelativeBlockNumber = relativeBlockNumber;
        relativeBlockNumber = newRelativeBlockNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.HDAM__RELATIVE_BLOCK_NUMBER,
                    oldRelativeBlockNumber, relativeBlockNumber));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRootAnchorPoints() {
        return rootAnchorPoints;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRootAnchorPoints(long newRootAnchorPoints) {
        long oldRootAnchorPoints = rootAnchorPoints;
        rootAnchorPoints = newRootAnchorPoints;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.HDAM__ROOT_ANCHOR_POINTS,
                    oldRootAnchorPoints, rootAnchorPoints));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getRootMaxBytes() {
        return rootMaxBytes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setRootMaxBytes(long newRootMaxBytes) {
        long oldRootMaxBytes = rootMaxBytes;
        rootMaxBytes = newRootMaxBytes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.HDAM__ROOT_MAX_BYTES, oldRootMaxBytes,
                    rootMaxBytes));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ImsdatabasePackage.HDAM__RM_NAME:
            return getRmName();
        case ImsdatabasePackage.HDAM__RELATIVE_BLOCK_NUMBER:
            return getRelativeBlockNumber();
        case ImsdatabasePackage.HDAM__ROOT_ANCHOR_POINTS:
            return getRootAnchorPoints();
        case ImsdatabasePackage.HDAM__ROOT_MAX_BYTES:
            return getRootMaxBytes();
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
        case ImsdatabasePackage.HDAM__RM_NAME:
            setRmName((String) newValue);
            return;
        case ImsdatabasePackage.HDAM__RELATIVE_BLOCK_NUMBER:
            setRelativeBlockNumber((Long) newValue);
            return;
        case ImsdatabasePackage.HDAM__ROOT_ANCHOR_POINTS:
            setRootAnchorPoints((Long) newValue);
            return;
        case ImsdatabasePackage.HDAM__ROOT_MAX_BYTES:
            setRootMaxBytes((Long) newValue);
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
        case ImsdatabasePackage.HDAM__RM_NAME:
            setRmName(RM_NAME_EDEFAULT);
            return;
        case ImsdatabasePackage.HDAM__RELATIVE_BLOCK_NUMBER:
            setRelativeBlockNumber(RELATIVE_BLOCK_NUMBER_EDEFAULT);
            return;
        case ImsdatabasePackage.HDAM__ROOT_ANCHOR_POINTS:
            setRootAnchorPoints(ROOT_ANCHOR_POINTS_EDEFAULT);
            return;
        case ImsdatabasePackage.HDAM__ROOT_MAX_BYTES:
            setRootMaxBytes(ROOT_MAX_BYTES_EDEFAULT);
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
        case ImsdatabasePackage.HDAM__RM_NAME:
            return RM_NAME_EDEFAULT == null ? rmName != null : !RM_NAME_EDEFAULT.equals(rmName);
        case ImsdatabasePackage.HDAM__RELATIVE_BLOCK_NUMBER:
            return relativeBlockNumber != RELATIVE_BLOCK_NUMBER_EDEFAULT;
        case ImsdatabasePackage.HDAM__ROOT_ANCHOR_POINTS:
            return rootAnchorPoints != ROOT_ANCHOR_POINTS_EDEFAULT;
        case ImsdatabasePackage.HDAM__ROOT_MAX_BYTES:
            return rootMaxBytes != ROOT_MAX_BYTES_EDEFAULT;
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
        result.append(", relativeBlockNumber: ");
        result.append(relativeBlockNumber);
        result.append(", rootAnchorPoints: ");
        result.append(rootAnchorPoints);
        result.append(", rootMaxBytes: ");
        result.append(rootMaxBytes);
        result.append(')');
        return result.toString();
    }

} // HDAMImpl
