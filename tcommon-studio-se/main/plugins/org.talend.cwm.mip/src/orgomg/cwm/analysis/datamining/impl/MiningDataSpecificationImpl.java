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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mining Data Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningDataSpecificationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningDataSpecificationImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningDataSpecificationImpl extends ClassImpl implements MiningDataSpecification {

    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected EList<MiningAttribute> attribute;

    /**
     * The cached value of the '{@link #getSettings() <em>Settings</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSettings()
     * @generated
     * @ordered
     */
    protected EList<MiningSettings> settings;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MiningDataSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.MINING_DATA_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<MiningAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new EObjectContainmentWithInverseEList<MiningAttribute>(MiningAttribute.class, this,
                    DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE,
                    DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION);
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<MiningSettings> getSettings() {
        if (settings == null) {
            settings = new EObjectWithInverseResolvingEList<MiningSettings>(MiningSettings.class, this,
                    DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS, DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION);
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
        case DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttribute()).basicAdd(otherEnd, msgs);
        case DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS:
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
        case DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE:
            return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd, msgs);
        case DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS:
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
        case DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE:
            return getAttribute();
        case DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS:
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
        case DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE:
            getAttribute().clear();
            getAttribute().addAll((Collection<? extends MiningAttribute>) newValue);
            return;
        case DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS:
            getSettings().clear();
            getSettings().addAll((Collection<? extends MiningSettings>) newValue);
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
        case DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE:
            getAttribute().clear();
            return;
        case DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS:
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
        case DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE:
            return attribute != null && !attribute.isEmpty();
        case DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS:
            return settings != null && !settings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MiningDataSpecificationImpl
