/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.ClassificationSettings;
import orgomg.cwm.analysis.datamining.CostMatrix;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cost Matrix</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CostMatrixImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostMatrixImpl extends ClassImpl implements CostMatrix {

    /**
     * The cached value of the '{@link #getSettings() <em>Settings</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSettings()
     * @generated
     * @ordered
     */
    protected EList<ClassificationSettings> settings;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CostMatrixImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.COST_MATRIX;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ClassificationSettings> getSettings() {
        if (settings == null) {
            settings = new EObjectWithInverseResolvingEList<ClassificationSettings>(ClassificationSettings.class, this,
                    DataminingPackage.COST_MATRIX__SETTINGS, DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX);
        }
        return settings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.COST_MATRIX__SETTINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSettings()).basicAdd(otherEnd, msgs);
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
        case DataminingPackage.COST_MATRIX__SETTINGS:
            return ((InternalEList<?>) getSettings()).basicRemove(otherEnd, msgs);
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
        case DataminingPackage.COST_MATRIX__SETTINGS:
            return getSettings();
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
        case DataminingPackage.COST_MATRIX__SETTINGS:
            getSettings().clear();
            getSettings().addAll((Collection<? extends ClassificationSettings>) newValue);
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
        case DataminingPackage.COST_MATRIX__SETTINGS:
            getSettings().clear();
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
        case DataminingPackage.COST_MATRIX__SETTINGS:
            return settings != null && !settings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // CostMatrixImpl
