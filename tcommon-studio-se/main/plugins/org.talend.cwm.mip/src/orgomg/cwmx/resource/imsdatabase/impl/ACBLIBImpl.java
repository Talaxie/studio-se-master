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
import orgomg.cwmx.resource.imsdatabase.ACBLIB;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PSB;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ACBLIB</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ACBLIBImpl#getPsb <em>Psb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ACBLIBImpl#getDbd <em>Dbd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ACBLIBImpl extends PackageImpl implements ACBLIB {

    /**
     * The cached value of the '{@link #getPsb() <em>Psb</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPsb()
     * @generated
     * @ordered
     */
    protected EList<PSB> psb;

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
    protected ACBLIBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.ACBLIB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<PSB> getPsb() {
        if (psb == null) {
            psb = new EObjectWithInverseResolvingEList.ManyInverse<PSB>(PSB.class, this, ImsdatabasePackage.ACBLIB__PSB,
                    ImsdatabasePackage.PSB__ACBLIB);
        }
        return psb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DBD> getDbd() {
        if (dbd == null) {
            dbd = new EObjectWithInverseResolvingEList.ManyInverse<DBD>(DBD.class, this, ImsdatabasePackage.ACBLIB__DBD,
                    ImsdatabasePackage.DBD__ACBLIB);
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
        case ImsdatabasePackage.ACBLIB__PSB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPsb()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.ACBLIB__DBD:
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
        case ImsdatabasePackage.ACBLIB__PSB:
            return ((InternalEList<?>) getPsb()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.ACBLIB__DBD:
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
        case ImsdatabasePackage.ACBLIB__PSB:
            return getPsb();
        case ImsdatabasePackage.ACBLIB__DBD:
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
        case ImsdatabasePackage.ACBLIB__PSB:
            getPsb().clear();
            getPsb().addAll((Collection<? extends PSB>) newValue);
            return;
        case ImsdatabasePackage.ACBLIB__DBD:
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
        case ImsdatabasePackage.ACBLIB__PSB:
            getPsb().clear();
            return;
        case ImsdatabasePackage.ACBLIB__DBD:
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
        case ImsdatabasePackage.ACBLIB__PSB:
            return psb != null && !psb.isEmpty();
        case ImsdatabasePackage.ACBLIB__DBD:
            return dbd != null && !dbd.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ACBLIBImpl
