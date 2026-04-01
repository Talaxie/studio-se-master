/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mining Settings</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningSettingsImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningSettingsImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningSettingsImpl#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningSettingsImpl#getAttributeUsage <em>Attribute Usage</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningSettingsImpl#getDataSpecification <em>Data Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningSettingsImpl extends ClassImpl implements MiningSettings {

    /**
     * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected String function = FUNCTION_EDEFAULT;

    /**
     * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAlgorithm()
     * @generated
     * @ordered
     */
    protected static final String ALGORITHM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAlgorithm()
     * @generated
     * @ordered
     */
    protected String algorithm = ALGORITHM_EDEFAULT;

    /**
     * The cached value of the '{@link #getMiningModel() <em>Mining Model</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMiningModel()
     * @generated
     * @ordered
     */
    protected MiningModel miningModel;

    /**
     * The cached value of the '{@link #getAttributeUsage()
     * <em>Attribute Usage</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAttributeUsage()
     * @generated
     * @ordered
     */
    protected EList<AttributeUsageRelation> attributeUsage;

    /**
     * The cached value of the '{@link #getDataSpecification() <em>Data Specification</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDataSpecification()
     * @generated
     * @ordered
     */
    protected MiningDataSpecification dataSpecification;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MiningSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.MINING_SETTINGS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFunction() {
        return function;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFunction(String newFunction) {
        String oldFunction = function;
        function = newFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_SETTINGS__FUNCTION, oldFunction,
                    function));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAlgorithm(String newAlgorithm) {
        String oldAlgorithm = algorithm;
        algorithm = newAlgorithm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_SETTINGS__ALGORITHM, oldAlgorithm,
                    algorithm));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModel getMiningModel() {
        if (miningModel != null && miningModel.eIsProxy()) {
            InternalEObject oldMiningModel = (InternalEObject) miningModel;
            miningModel = (MiningModel) eResolveProxy(oldMiningModel);
            if (miningModel != oldMiningModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataminingPackage.MINING_SETTINGS__MINING_MODEL,
                            oldMiningModel, miningModel));
            }
        }
        return miningModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModel basicGetMiningModel() {
        return miningModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMiningModel(MiningModel newMiningModel, NotificationChain msgs) {
        MiningModel oldMiningModel = miningModel;
        miningModel = newMiningModel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.MINING_SETTINGS__MINING_MODEL, oldMiningModel, newMiningModel);
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
    public void setMiningModel(MiningModel newMiningModel) {
        if (newMiningModel != miningModel) {
            NotificationChain msgs = null;
            if (miningModel != null)
                msgs = ((InternalEObject) miningModel).eInverseRemove(this, DataminingPackage.MINING_MODEL__SETTINGS,
                        MiningModel.class, msgs);
            if (newMiningModel != null)
                msgs = ((InternalEObject) newMiningModel).eInverseAdd(this, DataminingPackage.MINING_MODEL__SETTINGS,
                        MiningModel.class, msgs);
            msgs = basicSetMiningModel(newMiningModel, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_SETTINGS__MINING_MODEL,
                    newMiningModel, newMiningModel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeUsageRelation> getAttributeUsage() {
        if (attributeUsage == null) {
            attributeUsage = new EObjectContainmentWithInverseEList<AttributeUsageRelation>(AttributeUsageRelation.class, this,
                    DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE, DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS);
        }
        return attributeUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningDataSpecification getDataSpecification() {
        if (dataSpecification != null && dataSpecification.eIsProxy()) {
            InternalEObject oldDataSpecification = (InternalEObject) dataSpecification;
            dataSpecification = (MiningDataSpecification) eResolveProxy(oldDataSpecification);
            if (dataSpecification != oldDataSpecification) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION, oldDataSpecification, dataSpecification));
            }
        }
        return dataSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningDataSpecification basicGetDataSpecification() {
        return dataSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataSpecification(MiningDataSpecification newDataSpecification, NotificationChain msgs) {
        MiningDataSpecification oldDataSpecification = dataSpecification;
        dataSpecification = newDataSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION, oldDataSpecification, newDataSpecification);
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
    public void setDataSpecification(MiningDataSpecification newDataSpecification) {
        if (newDataSpecification != dataSpecification) {
            NotificationChain msgs = null;
            if (dataSpecification != null)
                msgs = ((InternalEObject) dataSpecification).eInverseRemove(this,
                        DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS, MiningDataSpecification.class, msgs);
            if (newDataSpecification != null)
                msgs = ((InternalEObject) newDataSpecification).eInverseAdd(this,
                        DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS, MiningDataSpecification.class, msgs);
            msgs = basicSetDataSpecification(newDataSpecification, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION,
                    newDataSpecification, newDataSpecification));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.MINING_SETTINGS__MINING_MODEL:
            if (miningModel != null)
                msgs = ((InternalEObject) miningModel).eInverseRemove(this, DataminingPackage.MINING_MODEL__SETTINGS,
                        MiningModel.class, msgs);
            return basicSetMiningModel((MiningModel) otherEnd, msgs);
        case DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributeUsage()).basicAdd(otherEnd, msgs);
        case DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION:
            if (dataSpecification != null)
                msgs = ((InternalEObject) dataSpecification).eInverseRemove(this,
                        DataminingPackage.MINING_DATA_SPECIFICATION__SETTINGS, MiningDataSpecification.class, msgs);
            return basicSetDataSpecification((MiningDataSpecification) otherEnd, msgs);
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
        case DataminingPackage.MINING_SETTINGS__MINING_MODEL:
            return basicSetMiningModel(null, msgs);
        case DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE:
            return ((InternalEList<?>) getAttributeUsage()).basicRemove(otherEnd, msgs);
        case DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION:
            return basicSetDataSpecification(null, msgs);
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
        case DataminingPackage.MINING_SETTINGS__FUNCTION:
            return getFunction();
        case DataminingPackage.MINING_SETTINGS__ALGORITHM:
            return getAlgorithm();
        case DataminingPackage.MINING_SETTINGS__MINING_MODEL:
            if (resolve)
                return getMiningModel();
            return basicGetMiningModel();
        case DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE:
            return getAttributeUsage();
        case DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION:
            if (resolve)
                return getDataSpecification();
            return basicGetDataSpecification();
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
        case DataminingPackage.MINING_SETTINGS__FUNCTION:
            setFunction((String) newValue);
            return;
        case DataminingPackage.MINING_SETTINGS__ALGORITHM:
            setAlgorithm((String) newValue);
            return;
        case DataminingPackage.MINING_SETTINGS__MINING_MODEL:
            setMiningModel((MiningModel) newValue);
            return;
        case DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE:
            getAttributeUsage().clear();
            getAttributeUsage().addAll((Collection<? extends AttributeUsageRelation>) newValue);
            return;
        case DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION:
            setDataSpecification((MiningDataSpecification) newValue);
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
        case DataminingPackage.MINING_SETTINGS__FUNCTION:
            setFunction(FUNCTION_EDEFAULT);
            return;
        case DataminingPackage.MINING_SETTINGS__ALGORITHM:
            setAlgorithm(ALGORITHM_EDEFAULT);
            return;
        case DataminingPackage.MINING_SETTINGS__MINING_MODEL:
            setMiningModel((MiningModel) null);
            return;
        case DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE:
            getAttributeUsage().clear();
            return;
        case DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION:
            setDataSpecification((MiningDataSpecification) null);
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
        case DataminingPackage.MINING_SETTINGS__FUNCTION:
            return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
        case DataminingPackage.MINING_SETTINGS__ALGORITHM:
            return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
        case DataminingPackage.MINING_SETTINGS__MINING_MODEL:
            return miningModel != null;
        case DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE:
            return attributeUsage != null && !attributeUsage.isEmpty();
        case DataminingPackage.MINING_SETTINGS__DATA_SPECIFICATION:
            return dataSpecification != null;
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
        result.append(" (function: ");
        result.append(function);
        result.append(", algorithm: ");
        result.append(algorithm);
        result.append(')');
        return result.toString();
    }

} // MiningSettingsImpl
