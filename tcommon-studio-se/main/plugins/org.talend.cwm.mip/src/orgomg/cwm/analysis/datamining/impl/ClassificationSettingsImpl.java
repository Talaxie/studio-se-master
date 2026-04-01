/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.analysis.datamining.ClassificationSettings;
import orgomg.cwm.analysis.datamining.CostMatrix;
import orgomg.cwm.analysis.datamining.DataminingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Classification Settings</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ClassificationSettingsImpl#getCostMatrix <em>Cost Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationSettingsImpl extends SupervisedMiningSettingsImpl implements ClassificationSettings {

    /**
     * The cached value of the '{@link #getCostMatrix() <em>Cost Matrix</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCostMatrix()
     * @generated
     * @ordered
     */
    protected CostMatrix costMatrix;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ClassificationSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.CLASSIFICATION_SETTINGS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CostMatrix getCostMatrix() {
        if (costMatrix != null && costMatrix.eIsProxy()) {
            InternalEObject oldCostMatrix = (InternalEObject) costMatrix;
            costMatrix = (CostMatrix) eResolveProxy(oldCostMatrix);
            if (costMatrix != oldCostMatrix) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX, oldCostMatrix, costMatrix));
            }
        }
        return costMatrix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CostMatrix basicGetCostMatrix() {
        return costMatrix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCostMatrix(CostMatrix newCostMatrix, NotificationChain msgs) {
        CostMatrix oldCostMatrix = costMatrix;
        costMatrix = newCostMatrix;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX, oldCostMatrix, newCostMatrix);
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
    public void setCostMatrix(CostMatrix newCostMatrix) {
        if (newCostMatrix != costMatrix) {
            NotificationChain msgs = null;
            if (costMatrix != null)
                msgs = ((InternalEObject) costMatrix).eInverseRemove(this, DataminingPackage.COST_MATRIX__SETTINGS,
                        CostMatrix.class, msgs);
            if (newCostMatrix != null)
                msgs = ((InternalEObject) newCostMatrix).eInverseAdd(this, DataminingPackage.COST_MATRIX__SETTINGS,
                        CostMatrix.class, msgs);
            msgs = basicSetCostMatrix(newCostMatrix, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX,
                    newCostMatrix, newCostMatrix));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX:
            if (costMatrix != null)
                msgs = ((InternalEObject) costMatrix).eInverseRemove(this, DataminingPackage.COST_MATRIX__SETTINGS,
                        CostMatrix.class, msgs);
            return basicSetCostMatrix((CostMatrix) otherEnd, msgs);
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
        case DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX:
            return basicSetCostMatrix(null, msgs);
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
        case DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX:
            if (resolve)
                return getCostMatrix();
            return basicGetCostMatrix();
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
        case DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX:
            setCostMatrix((CostMatrix) newValue);
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
        case DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX:
            setCostMatrix((CostMatrix) null);
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
        case DataminingPackage.CLASSIFICATION_SETTINGS__COST_MATRIX:
            return costMatrix != null;
        }
        return super.eIsSet(featureID);
    }

} // ClassificationSettingsImpl
