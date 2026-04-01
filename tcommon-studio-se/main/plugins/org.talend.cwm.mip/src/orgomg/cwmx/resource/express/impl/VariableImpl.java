/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.resource.multidimensional.impl.DimensionedObjectImpl;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.VariableImpl#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.VariableImpl#getPageSpace <em>Page Space</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.VariableImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends DimensionedObjectImpl implements Variable {

    /**
     * The default value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStorageType()
     * @generated
     * @ordered
     */
    protected static final String STORAGE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStorageType()
     * @generated
     * @ordered
     */
    protected String storageType = STORAGE_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getPageSpace() <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPageSpace()
     * @generated
     * @ordered
     */
    protected static final String PAGE_SPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPageSpace() <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPageSpace()
     * @generated
     * @ordered
     */
    protected String pageSpace = PAGE_SPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected static final long WIDTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected long width = WIDTH_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected VariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.VARIABLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStorageType(String newStorageType) {
        String oldStorageType = storageType;
        storageType = newStorageType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.VARIABLE__STORAGE_TYPE, oldStorageType,
                    storageType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPageSpace() {
        return pageSpace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPageSpace(String newPageSpace) {
        String oldPageSpace = pageSpace;
        pageSpace = newPageSpace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.VARIABLE__PAGE_SPACE, oldPageSpace, pageSpace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getWidth() {
        return width;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setWidth(long newWidth) {
        long oldWidth = width;
        width = newWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.VARIABLE__WIDTH, oldWidth, width));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ExpressPackage.VARIABLE__STORAGE_TYPE:
            return getStorageType();
        case ExpressPackage.VARIABLE__PAGE_SPACE:
            return getPageSpace();
        case ExpressPackage.VARIABLE__WIDTH:
            return getWidth();
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
        case ExpressPackage.VARIABLE__STORAGE_TYPE:
            setStorageType((String) newValue);
            return;
        case ExpressPackage.VARIABLE__PAGE_SPACE:
            setPageSpace((String) newValue);
            return;
        case ExpressPackage.VARIABLE__WIDTH:
            setWidth((Long) newValue);
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
        case ExpressPackage.VARIABLE__STORAGE_TYPE:
            setStorageType(STORAGE_TYPE_EDEFAULT);
            return;
        case ExpressPackage.VARIABLE__PAGE_SPACE:
            setPageSpace(PAGE_SPACE_EDEFAULT);
            return;
        case ExpressPackage.VARIABLE__WIDTH:
            setWidth(WIDTH_EDEFAULT);
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
        case ExpressPackage.VARIABLE__STORAGE_TYPE:
            return STORAGE_TYPE_EDEFAULT == null ? storageType != null : !STORAGE_TYPE_EDEFAULT.equals(storageType);
        case ExpressPackage.VARIABLE__PAGE_SPACE:
            return PAGE_SPACE_EDEFAULT == null ? pageSpace != null : !PAGE_SPACE_EDEFAULT.equals(pageSpace);
        case ExpressPackage.VARIABLE__WIDTH:
            return width != WIDTH_EDEFAULT;
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
        result.append(" (storageType: ");
        result.append(storageType);
        result.append(", pageSpace: ");
        result.append(pageSpace);
        result.append(", width: ");
        result.append(width);
        result.append(')');
        return result.toString();
    }

} // VariableImpl
