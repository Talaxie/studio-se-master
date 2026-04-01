/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.rules.AlgorithmDefinition;
import org.talend.dataquality.rules.MatchKeyDefinition;
import org.talend.dataquality.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Key Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchKeyDefinitionImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchKeyDefinitionImpl#getConfidenceWeight <em>Confidence Weight</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchKeyDefinitionImpl#getHandleNull <em>Handle Null</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchKeyDefinitionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.MatchKeyDefinitionImpl#getTokenizationType <em>Tokenization Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchKeyDefinitionImpl extends KeyDefinitionImpl implements MatchKeyDefinition {
    /**
     * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlgorithm()
     * @generated
     * @ordered
     */
    protected AlgorithmDefinition algorithm;

    /**
     * The default value of the '{@link #getConfidenceWeight() <em>Confidence Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidenceWeight()
     * @generated
     * @ordered
     */
    protected static final int CONFIDENCE_WEIGHT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getConfidenceWeight() <em>Confidence Weight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidenceWeight()
     * @generated
     * @ordered
     */
    protected int confidenceWeight = CONFIDENCE_WEIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #getHandleNull() <em>Handle Null</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandleNull()
     * @generated
     * @ordered
     */
    protected static final String HANDLE_NULL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHandleNull() <em>Handle Null</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandleNull()
     * @generated
     * @ordered
     */
    protected String handleNull = HANDLE_NULL_EDEFAULT;

    /**
     * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreshold()
     * @generated
     * @ordered
     */
    protected static final double THRESHOLD_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreshold()
     * @generated
     * @ordered
     */
    protected double threshold = THRESHOLD_EDEFAULT;

    /**
     * The default value of the '{@link #getTokenizationType() <em>Tokenization Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTokenizationType()
     * @generated
     * @ordered
     */
    protected static final String TOKENIZATION_TYPE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getTokenizationType() <em>Tokenization Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTokenizationType()
     * @generated
     * @ordered
     */
    protected String tokenizationType = TOKENIZATION_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatchKeyDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.MATCH_KEY_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlgorithmDefinition getAlgorithm() {
        return algorithm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAlgorithm(AlgorithmDefinition newAlgorithm, NotificationChain msgs) {
        AlgorithmDefinition oldAlgorithm = algorithm;
        algorithm = newAlgorithm;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM, oldAlgorithm, newAlgorithm);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlgorithm(AlgorithmDefinition newAlgorithm) {
        if (newAlgorithm != algorithm) {
            NotificationChain msgs = null;
            if (algorithm != null)
                msgs = ((InternalEObject)algorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM, null, msgs);
            if (newAlgorithm != null)
                msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM, null, msgs);
            msgs = basicSetAlgorithm(newAlgorithm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM, newAlgorithm, newAlgorithm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getConfidenceWeight() {
        return confidenceWeight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfidenceWeight(int newConfidenceWeight) {
        int oldConfidenceWeight = confidenceWeight;
        confidenceWeight = newConfidenceWeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_KEY_DEFINITION__CONFIDENCE_WEIGHT, oldConfidenceWeight, confidenceWeight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHandleNull() {
        return handleNull;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHandleNull(String newHandleNull) {
        String oldHandleNull = handleNull;
        handleNull = newHandleNull;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_KEY_DEFINITION__HANDLE_NULL, oldHandleNull, handleNull));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getThreshold() {
        return threshold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThreshold(double newThreshold) {
        double oldThreshold = threshold;
        threshold = newThreshold;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_KEY_DEFINITION__THRESHOLD, oldThreshold, threshold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTokenizationType() {
        return tokenizationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTokenizationType(String newTokenizationType) {
        String oldTokenizationType = tokenizationType;
        tokenizationType = newTokenizationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.MATCH_KEY_DEFINITION__TOKENIZATION_TYPE, oldTokenizationType, tokenizationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM:
                return basicSetAlgorithm(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM:
                return getAlgorithm();
            case RulesPackage.MATCH_KEY_DEFINITION__CONFIDENCE_WEIGHT:
                return getConfidenceWeight();
            case RulesPackage.MATCH_KEY_DEFINITION__HANDLE_NULL:
                return getHandleNull();
            case RulesPackage.MATCH_KEY_DEFINITION__THRESHOLD:
                return getThreshold();
            case RulesPackage.MATCH_KEY_DEFINITION__TOKENIZATION_TYPE:
                return getTokenizationType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM:
                setAlgorithm((AlgorithmDefinition)newValue);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__CONFIDENCE_WEIGHT:
                setConfidenceWeight((Integer)newValue);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__HANDLE_NULL:
                setHandleNull((String)newValue);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__THRESHOLD:
                setThreshold((Double)newValue);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__TOKENIZATION_TYPE:
                setTokenizationType((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM:
                setAlgorithm((AlgorithmDefinition)null);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__CONFIDENCE_WEIGHT:
                setConfidenceWeight(CONFIDENCE_WEIGHT_EDEFAULT);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__HANDLE_NULL:
                setHandleNull(HANDLE_NULL_EDEFAULT);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__THRESHOLD:
                setThreshold(THRESHOLD_EDEFAULT);
                return;
            case RulesPackage.MATCH_KEY_DEFINITION__TOKENIZATION_TYPE:
                setTokenizationType(TOKENIZATION_TYPE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RulesPackage.MATCH_KEY_DEFINITION__ALGORITHM:
                return algorithm != null;
            case RulesPackage.MATCH_KEY_DEFINITION__CONFIDENCE_WEIGHT:
                return confidenceWeight != CONFIDENCE_WEIGHT_EDEFAULT;
            case RulesPackage.MATCH_KEY_DEFINITION__HANDLE_NULL:
                return HANDLE_NULL_EDEFAULT == null ? handleNull != null : !HANDLE_NULL_EDEFAULT.equals(handleNull);
            case RulesPackage.MATCH_KEY_DEFINITION__THRESHOLD:
                return threshold != THRESHOLD_EDEFAULT;
            case RulesPackage.MATCH_KEY_DEFINITION__TOKENIZATION_TYPE:
                return TOKENIZATION_TYPE_EDEFAULT == null ? tokenizationType != null : !TOKENIZATION_TYPE_EDEFAULT.equals(tokenizationType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (confidenceWeight: ");
        result.append(confidenceWeight);
        result.append(", handleNull: ");
        result.append(handleNull);
        result.append(", threshold: ");
        result.append(threshold);
        result.append(", tokenizationType: ");
        result.append(tokenizationType);
        result.append(')');
        return result.toString();
    }

} //MatchKeyDefinitionImpl
