/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;
import orgomg.cwmx.resource.express.Dimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Worksheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Worksheet</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.WorksheetImpl#isIsTemp <em>Is Temp</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.WorksheetImpl#getColumnDimension <em>Column Dimension</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.WorksheetImpl#getRowDimension <em>Row Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorksheetImpl extends ClassImpl implements Worksheet {

    /**
     * The default value of the '{@link #isIsTemp() <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTemp()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TEMP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsTemp() <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTemp()
     * @generated
     * @ordered
     */
    protected boolean isTemp = IS_TEMP_EDEFAULT;

    /**
     * The cached value of the '{@link #getColumnDimension() <em>Column Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getColumnDimension()
     * @generated
     * @ordered
     */
    protected Dimension columnDimension;

    /**
     * The cached value of the '{@link #getRowDimension() <em>Row Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRowDimension()
     * @generated
     * @ordered
     */
    protected Dimension rowDimension;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected WorksheetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.WORKSHEET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsTemp() {
        return isTemp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsTemp(boolean newIsTemp) {
        boolean oldIsTemp = isTemp;
        isTemp = newIsTemp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.WORKSHEET__IS_TEMP, oldIsTemp, isTemp));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension getColumnDimension() {
        if (columnDimension != null && columnDimension.eIsProxy()) {
            InternalEObject oldColumnDimension = (InternalEObject) columnDimension;
            columnDimension = (Dimension) eResolveProxy(oldColumnDimension);
            if (columnDimension != oldColumnDimension) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.WORKSHEET__COLUMN_DIMENSION,
                            oldColumnDimension, columnDimension));
            }
        }
        return columnDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension basicGetColumnDimension() {
        return columnDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetColumnDimension(Dimension newColumnDimension, NotificationChain msgs) {
        Dimension oldColumnDimension = columnDimension;
        columnDimension = newColumnDimension;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.WORKSHEET__COLUMN_DIMENSION, oldColumnDimension, newColumnDimension);
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
    public void setColumnDimension(Dimension newColumnDimension) {
        if (newColumnDimension != columnDimension) {
            NotificationChain msgs = null;
            if (columnDimension != null)
                msgs = ((InternalEObject) columnDimension).eInverseRemove(this,
                        ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET, Dimension.class, msgs);
            if (newColumnDimension != null)
                msgs = ((InternalEObject) newColumnDimension).eInverseAdd(this,
                        ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET, Dimension.class, msgs);
            msgs = basicSetColumnDimension(newColumnDimension, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.WORKSHEET__COLUMN_DIMENSION, newColumnDimension,
                    newColumnDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension getRowDimension() {
        if (rowDimension != null && rowDimension.eIsProxy()) {
            InternalEObject oldRowDimension = (InternalEObject) rowDimension;
            rowDimension = (Dimension) eResolveProxy(oldRowDimension);
            if (rowDimension != oldRowDimension) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.WORKSHEET__ROW_DIMENSION,
                            oldRowDimension, rowDimension));
            }
        }
        return rowDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension basicGetRowDimension() {
        return rowDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRowDimension(Dimension newRowDimension, NotificationChain msgs) {
        Dimension oldRowDimension = rowDimension;
        rowDimension = newRowDimension;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.WORKSHEET__ROW_DIMENSION, oldRowDimension, newRowDimension);
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
    public void setRowDimension(Dimension newRowDimension) {
        if (newRowDimension != rowDimension) {
            NotificationChain msgs = null;
            if (rowDimension != null)
                msgs = ((InternalEObject) rowDimension).eInverseRemove(this,
                        ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET, Dimension.class, msgs);
            if (newRowDimension != null)
                msgs = ((InternalEObject) newRowDimension).eInverseAdd(this,
                        ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET, Dimension.class, msgs);
            msgs = basicSetRowDimension(newRowDimension, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.WORKSHEET__ROW_DIMENSION, newRowDimension,
                    newRowDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.WORKSHEET__COLUMN_DIMENSION:
            if (columnDimension != null)
                msgs = ((InternalEObject) columnDimension).eInverseRemove(this,
                        ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET, Dimension.class, msgs);
            return basicSetColumnDimension((Dimension) otherEnd, msgs);
        case ExpressPackage.WORKSHEET__ROW_DIMENSION:
            if (rowDimension != null)
                msgs = ((InternalEObject) rowDimension).eInverseRemove(this,
                        ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET, Dimension.class, msgs);
            return basicSetRowDimension((Dimension) otherEnd, msgs);
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
        case ExpressPackage.WORKSHEET__COLUMN_DIMENSION:
            return basicSetColumnDimension(null, msgs);
        case ExpressPackage.WORKSHEET__ROW_DIMENSION:
            return basicSetRowDimension(null, msgs);
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
        case ExpressPackage.WORKSHEET__IS_TEMP:
            return isIsTemp();
        case ExpressPackage.WORKSHEET__COLUMN_DIMENSION:
            if (resolve)
                return getColumnDimension();
            return basicGetColumnDimension();
        case ExpressPackage.WORKSHEET__ROW_DIMENSION:
            if (resolve)
                return getRowDimension();
            return basicGetRowDimension();
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
        case ExpressPackage.WORKSHEET__IS_TEMP:
            setIsTemp((Boolean) newValue);
            return;
        case ExpressPackage.WORKSHEET__COLUMN_DIMENSION:
            setColumnDimension((Dimension) newValue);
            return;
        case ExpressPackage.WORKSHEET__ROW_DIMENSION:
            setRowDimension((Dimension) newValue);
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
        case ExpressPackage.WORKSHEET__IS_TEMP:
            setIsTemp(IS_TEMP_EDEFAULT);
            return;
        case ExpressPackage.WORKSHEET__COLUMN_DIMENSION:
            setColumnDimension((Dimension) null);
            return;
        case ExpressPackage.WORKSHEET__ROW_DIMENSION:
            setRowDimension((Dimension) null);
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
        case ExpressPackage.WORKSHEET__IS_TEMP:
            return isTemp != IS_TEMP_EDEFAULT;
        case ExpressPackage.WORKSHEET__COLUMN_DIMENSION:
            return columnDimension != null;
        case ExpressPackage.WORKSHEET__ROW_DIMENSION:
            return rowDimension != null;
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
        result.append(" (isTemp: ");
        result.append(isTemp);
        result.append(')');
        return result.toString();
    }

} // WorksheetImpl
