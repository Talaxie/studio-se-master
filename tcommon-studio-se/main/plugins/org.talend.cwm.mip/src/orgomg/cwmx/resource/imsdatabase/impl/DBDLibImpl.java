/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.PackageImpl;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.DBDLib;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DBD Lib</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDLibImpl#getDbd <em>Dbd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBDLibImpl extends PackageImpl implements DBDLib {

    /**
     * The cached value of the '{@link #getDbd() <em>Dbd</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDbd()
     * @generated
     * @ordered
     */
    protected EList<DBD> dbd;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DBDLibImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.DBD_LIB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DBD> getDbd() {
        if (dbd == null) {
            dbd = new EObjectWithInverseResolvingEList.ManyInverse<DBD>(DBD.class, this, ImsdatabasePackage.DBD_LIB__DBD,
                    ImsdatabasePackage.DBD__LIBRARY);
        }
        return dbd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.DBD_LIB__DBD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDbd()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.DBD_LIB__DBD:
            return ((InternalEList<?>) getDbd()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.DBD_LIB__DBD:
            return getDbd();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ImsdatabasePackage.DBD_LIB__DBD:
            getDbd().clear();
            getDbd().addAll((Collection<? extends DBD>) newValue);
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
        case ImsdatabasePackage.DBD_LIB__DBD:
            getDbd().clear();
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
        case ImsdatabasePackage.DBD_LIB__DBD:
            return dbd != null && !dbd.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DBDLibImpl
