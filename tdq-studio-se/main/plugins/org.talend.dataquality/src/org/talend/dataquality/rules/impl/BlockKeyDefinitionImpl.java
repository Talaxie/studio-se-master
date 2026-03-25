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
import org.talend.dataquality.rules.BlockKeyDefinition;
import org.talend.dataquality.rules.RulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Key Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.BlockKeyDefinitionImpl#getPreAlgorithm <em>Pre Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.BlockKeyDefinitionImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.BlockKeyDefinitionImpl#getPostAlgorithm <em>Post Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockKeyDefinitionImpl extends KeyDefinitionImpl implements BlockKeyDefinition {
    /**
     * The cached value of the '{@link #getPreAlgorithm() <em>Pre Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreAlgorithm()
     * @generated
     * @ordered
     */
    protected AlgorithmDefinition preAlgorithm;

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
     * The cached value of the '{@link #getPostAlgorithm() <em>Post Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostAlgorithm()
     * @generated
     * @ordered
     */
    protected AlgorithmDefinition postAlgorithm;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BlockKeyDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.BLOCK_KEY_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlgorithmDefinition getPreAlgorithm() {
        return preAlgorithm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPreAlgorithm(AlgorithmDefinition newPreAlgorithm, NotificationChain msgs) {
        AlgorithmDefinition oldPreAlgorithm = preAlgorithm;
        preAlgorithm = newPreAlgorithm;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM, oldPreAlgorithm, newPreAlgorithm);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreAlgorithm(AlgorithmDefinition newPreAlgorithm) {
        if (newPreAlgorithm != preAlgorithm) {
            NotificationChain msgs = null;
            if (preAlgorithm != null)
                msgs = ((InternalEObject)preAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM, null, msgs);
            if (newPreAlgorithm != null)
                msgs = ((InternalEObject)newPreAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM, null, msgs);
            msgs = basicSetPreAlgorithm(newPreAlgorithm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM, newPreAlgorithm, newPreAlgorithm));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM, oldAlgorithm, newAlgorithm);
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
                msgs = ((InternalEObject)algorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM, null, msgs);
            if (newAlgorithm != null)
                msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM, null, msgs);
            msgs = basicSetAlgorithm(newAlgorithm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM, newAlgorithm, newAlgorithm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlgorithmDefinition getPostAlgorithm() {
        return postAlgorithm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPostAlgorithm(AlgorithmDefinition newPostAlgorithm, NotificationChain msgs) {
        AlgorithmDefinition oldPostAlgorithm = postAlgorithm;
        postAlgorithm = newPostAlgorithm;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM, oldPostAlgorithm, newPostAlgorithm);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostAlgorithm(AlgorithmDefinition newPostAlgorithm) {
        if (newPostAlgorithm != postAlgorithm) {
            NotificationChain msgs = null;
            if (postAlgorithm != null)
                msgs = ((InternalEObject)postAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM, null, msgs);
            if (newPostAlgorithm != null)
                msgs = ((InternalEObject)newPostAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM, null, msgs);
            msgs = basicSetPostAlgorithm(newPostAlgorithm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM, newPostAlgorithm, newPostAlgorithm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM:
                return basicSetPreAlgorithm(null, msgs);
            case RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM:
                return basicSetAlgorithm(null, msgs);
            case RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM:
                return basicSetPostAlgorithm(null, msgs);
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
            case RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM:
                return getPreAlgorithm();
            case RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM:
                return getAlgorithm();
            case RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM:
                return getPostAlgorithm();
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
            case RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM:
                setPreAlgorithm((AlgorithmDefinition)newValue);
                return;
            case RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM:
                setAlgorithm((AlgorithmDefinition)newValue);
                return;
            case RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM:
                setPostAlgorithm((AlgorithmDefinition)newValue);
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
            case RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM:
                setPreAlgorithm((AlgorithmDefinition)null);
                return;
            case RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM:
                setAlgorithm((AlgorithmDefinition)null);
                return;
            case RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM:
                setPostAlgorithm((AlgorithmDefinition)null);
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
            case RulesPackage.BLOCK_KEY_DEFINITION__PRE_ALGORITHM:
                return preAlgorithm != null;
            case RulesPackage.BLOCK_KEY_DEFINITION__ALGORITHM:
                return algorithm != null;
            case RulesPackage.BLOCK_KEY_DEFINITION__POST_ALGORITHM:
                return postAlgorithm != null;
        }
        return super.eIsSet(featureID);
    }

} //BlockKeyDefinitionImpl
