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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningModelResult;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mining Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelImpl#getMiningResult <em>Mining Result</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelImpl#getInputSpec <em>Input Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningModelImpl extends ClassImpl implements MiningModel {

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
     * The cached value of the '{@link #getSettings() <em>Settings</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSettings()
     * @generated
     * @ordered
     */
    protected MiningSettings settings;

    /**
     * The cached value of the '{@link #getMiningResult() <em>Mining Result</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMiningResult()
     * @generated
     * @ordered
     */
    protected EList<MiningModelResult> miningResult;

    /**
     * The cached value of the '{@link #getInputSpec() <em>Input Spec</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInputSpec()
     * @generated
     * @ordered
     */
    protected EList<ApplicationInputSpecification> inputSpec;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MiningModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.MINING_MODEL;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_MODEL__FUNCTION, oldFunction, function));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_MODEL__ALGORITHM, oldAlgorithm,
                    algorithm));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningSettings getSettings() {
        if (settings != null && settings.eIsProxy()) {
            InternalEObject oldSettings = (InternalEObject) settings;
            settings = (MiningSettings) eResolveProxy(oldSettings);
            if (settings != oldSettings) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataminingPackage.MINING_MODEL__SETTINGS,
                            oldSettings, settings));
            }
        }
        return settings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningSettings basicGetSettings() {
        return settings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSettings(MiningSettings newSettings, NotificationChain msgs) {
        MiningSettings oldSettings = settings;
        settings = newSettings;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.MINING_MODEL__SETTINGS, oldSettings, newSettings);
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
    public void setSettings(MiningSettings newSettings) {
        if (newSettings != settings) {
            NotificationChain msgs = null;
            if (settings != null)
                msgs = ((InternalEObject) settings).eInverseRemove(this, DataminingPackage.MINING_SETTINGS__MINING_MODEL,
                        MiningSettings.class, msgs);
            if (newSettings != null)
                msgs = ((InternalEObject) newSettings).eInverseAdd(this, DataminingPackage.MINING_SETTINGS__MINING_MODEL,
                        MiningSettings.class, msgs);
            msgs = basicSetSettings(newSettings, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_MODEL__SETTINGS, newSettings,
                    newSettings));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<MiningModelResult> getMiningResult() {
        if (miningResult == null) {
            miningResult = new EObjectWithInverseResolvingEList<MiningModelResult>(MiningModelResult.class, this,
                    DataminingPackage.MINING_MODEL__MINING_RESULT, DataminingPackage.MINING_MODEL_RESULT__MODEL);
        }
        return miningResult;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ApplicationInputSpecification> getInputSpec() {
        if (inputSpec == null) {
            inputSpec = new EObjectContainmentWithInverseEList<ApplicationInputSpecification>(
                    ApplicationInputSpecification.class, this, DataminingPackage.MINING_MODEL__INPUT_SPEC,
                    DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL);
        }
        return inputSpec;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.MINING_MODEL__SETTINGS:
            if (settings != null)
                msgs = ((InternalEObject) settings).eInverseRemove(this, DataminingPackage.MINING_SETTINGS__MINING_MODEL,
                        MiningSettings.class, msgs);
            return basicSetSettings((MiningSettings) otherEnd, msgs);
        case DataminingPackage.MINING_MODEL__MINING_RESULT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMiningResult()).basicAdd(otherEnd, msgs);
        case DataminingPackage.MINING_MODEL__INPUT_SPEC:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSpec()).basicAdd(otherEnd, msgs);
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
        case DataminingPackage.MINING_MODEL__SETTINGS:
            return basicSetSettings(null, msgs);
        case DataminingPackage.MINING_MODEL__MINING_RESULT:
            return ((InternalEList<?>) getMiningResult()).basicRemove(otherEnd, msgs);
        case DataminingPackage.MINING_MODEL__INPUT_SPEC:
            return ((InternalEList<?>) getInputSpec()).basicRemove(otherEnd, msgs);
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
        case DataminingPackage.MINING_MODEL__FUNCTION:
            return getFunction();
        case DataminingPackage.MINING_MODEL__ALGORITHM:
            return getAlgorithm();
        case DataminingPackage.MINING_MODEL__SETTINGS:
            if (resolve)
                return getSettings();
            return basicGetSettings();
        case DataminingPackage.MINING_MODEL__MINING_RESULT:
            return getMiningResult();
        case DataminingPackage.MINING_MODEL__INPUT_SPEC:
            return getInputSpec();
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
        case DataminingPackage.MINING_MODEL__FUNCTION:
            setFunction((String) newValue);
            return;
        case DataminingPackage.MINING_MODEL__ALGORITHM:
            setAlgorithm((String) newValue);
            return;
        case DataminingPackage.MINING_MODEL__SETTINGS:
            setSettings((MiningSettings) newValue);
            return;
        case DataminingPackage.MINING_MODEL__MINING_RESULT:
            getMiningResult().clear();
            getMiningResult().addAll((Collection<? extends MiningModelResult>) newValue);
            return;
        case DataminingPackage.MINING_MODEL__INPUT_SPEC:
            getInputSpec().clear();
            getInputSpec().addAll((Collection<? extends ApplicationInputSpecification>) newValue);
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
        case DataminingPackage.MINING_MODEL__FUNCTION:
            setFunction(FUNCTION_EDEFAULT);
            return;
        case DataminingPackage.MINING_MODEL__ALGORITHM:
            setAlgorithm(ALGORITHM_EDEFAULT);
            return;
        case DataminingPackage.MINING_MODEL__SETTINGS:
            setSettings((MiningSettings) null);
            return;
        case DataminingPackage.MINING_MODEL__MINING_RESULT:
            getMiningResult().clear();
            return;
        case DataminingPackage.MINING_MODEL__INPUT_SPEC:
            getInputSpec().clear();
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
        case DataminingPackage.MINING_MODEL__FUNCTION:
            return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
        case DataminingPackage.MINING_MODEL__ALGORITHM:
            return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
        case DataminingPackage.MINING_MODEL__SETTINGS:
            return settings != null;
        case DataminingPackage.MINING_MODEL__MINING_RESULT:
            return miningResult != null && !miningResult.isEmpty();
        case DataminingPackage.MINING_MODEL__INPUT_SPEC:
            return inputSpec != null && !inputSpec.isEmpty();
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

} // MiningModelImpl
