/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.SupervisedMiningSettings;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Supervised Mining Settings</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.SupervisedMiningSettingsImpl#getConfidenceAttributeName <em>Confidence Attribute Name</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.SupervisedMiningSettingsImpl#getPredictedAttributeName <em>Predicted Attribute Name</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.SupervisedMiningSettingsImpl#getCostFunction <em>Cost Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupervisedMiningSettingsImpl extends MiningSettingsImpl implements SupervisedMiningSettings {

    /**
     * The default value of the '{@link #getConfidenceAttributeName() <em>Confidence Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidenceAttributeName()
     * @generated
     * @ordered
     */
    protected static final String CONFIDENCE_ATTRIBUTE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfidenceAttributeName() <em>Confidence Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidenceAttributeName()
     * @generated
     * @ordered
     */
    protected String confidenceAttributeName = CONFIDENCE_ATTRIBUTE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPredictedAttributeName() <em>Predicted Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictedAttributeName()
     * @generated
     * @ordered
     */
    protected static final String PREDICTED_ATTRIBUTE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPredictedAttributeName() <em>Predicted Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictedAttributeName()
     * @generated
     * @ordered
     */
    protected String predictedAttributeName = PREDICTED_ATTRIBUTE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCostFunction() <em>Cost Function</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getCostFunction()
     * @generated
     * @ordered
     */
    protected static final String COST_FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCostFunction() <em>Cost Function</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getCostFunction()
     * @generated
     * @ordered
     */
    protected String costFunction = COST_FUNCTION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SupervisedMiningSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.SUPERVISED_MINING_SETTINGS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getConfidenceAttributeName() {
        return confidenceAttributeName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConfidenceAttributeName(String newConfidenceAttributeName) {
        String oldConfidenceAttributeName = confidenceAttributeName;
        confidenceAttributeName = newConfidenceAttributeName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.SUPERVISED_MINING_SETTINGS__CONFIDENCE_ATTRIBUTE_NAME, oldConfidenceAttributeName,
                    confidenceAttributeName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPredictedAttributeName() {
        return predictedAttributeName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPredictedAttributeName(String newPredictedAttributeName) {
        String oldPredictedAttributeName = predictedAttributeName;
        predictedAttributeName = newPredictedAttributeName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.SUPERVISED_MINING_SETTINGS__PREDICTED_ATTRIBUTE_NAME, oldPredictedAttributeName,
                    predictedAttributeName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getCostFunction() {
        return costFunction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCostFunction(String newCostFunction) {
        String oldCostFunction = costFunction;
        costFunction = newCostFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.SUPERVISED_MINING_SETTINGS__COST_FUNCTION,
                    oldCostFunction, costFunction));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__CONFIDENCE_ATTRIBUTE_NAME:
            return getConfidenceAttributeName();
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__PREDICTED_ATTRIBUTE_NAME:
            return getPredictedAttributeName();
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__COST_FUNCTION:
            return getCostFunction();
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
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__CONFIDENCE_ATTRIBUTE_NAME:
            setConfidenceAttributeName((String) newValue);
            return;
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__PREDICTED_ATTRIBUTE_NAME:
            setPredictedAttributeName((String) newValue);
            return;
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__COST_FUNCTION:
            setCostFunction((String) newValue);
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
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__CONFIDENCE_ATTRIBUTE_NAME:
            setConfidenceAttributeName(CONFIDENCE_ATTRIBUTE_NAME_EDEFAULT);
            return;
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__PREDICTED_ATTRIBUTE_NAME:
            setPredictedAttributeName(PREDICTED_ATTRIBUTE_NAME_EDEFAULT);
            return;
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__COST_FUNCTION:
            setCostFunction(COST_FUNCTION_EDEFAULT);
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
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__CONFIDENCE_ATTRIBUTE_NAME:
            return CONFIDENCE_ATTRIBUTE_NAME_EDEFAULT == null ? confidenceAttributeName != null
                    : !CONFIDENCE_ATTRIBUTE_NAME_EDEFAULT.equals(confidenceAttributeName);
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__PREDICTED_ATTRIBUTE_NAME:
            return PREDICTED_ATTRIBUTE_NAME_EDEFAULT == null ? predictedAttributeName != null
                    : !PREDICTED_ATTRIBUTE_NAME_EDEFAULT.equals(predictedAttributeName);
        case DataminingPackage.SUPERVISED_MINING_SETTINGS__COST_FUNCTION:
            return COST_FUNCTION_EDEFAULT == null ? costFunction != null : !COST_FUNCTION_EDEFAULT.equals(costFunction);
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
        result.append(" (confidenceAttributeName: ");
        result.append(confidenceAttributeName);
        result.append(", predictedAttributeName: ");
        result.append(predictedAttributeName);
        result.append(", costFunction: ");
        result.append(costFunction);
        result.append(')');
        return result.toString();
    }

} // SupervisedMiningSettingsImpl
