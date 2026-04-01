/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.impl.ClassifierImpl;
import orgomg.cwmx.foundation.er.Domain;
import orgomg.cwmx.foundation.er.ErPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Domain</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.DomainImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.DomainImpl#getValidationRule <em>Validation Rule</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.DomainImpl#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends ClassifierImpl implements Domain {

    /**
     * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected ExpressionNode default_;

    /**
     * The cached value of the '{@link #getValidationRule() <em>Validation Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidationRule()
     * @generated
     * @ordered
     */
    protected ExpressionNode validationRule;

    /**
     * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getBaseType()
     * @generated
     * @ordered
     */
    protected Classifier baseType;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DomainImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErPackage.Literals.DOMAIN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getDefault() {
        return default_;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefault(ExpressionNode newDefault, NotificationChain msgs) {
        ExpressionNode oldDefault = default_;
        default_ = newDefault;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__DEFAULT, oldDefault,
                    newDefault);
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
    public void setDefault(ExpressionNode newDefault) {
        if (newDefault != default_) {
            NotificationChain msgs = null;
            if (default_ != null)
                msgs = ((InternalEObject) default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErPackage.DOMAIN__DEFAULT,
                        null, msgs);
            if (newDefault != null)
                msgs = ((InternalEObject) newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErPackage.DOMAIN__DEFAULT, null,
                        msgs);
            msgs = basicSetDefault(newDefault, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__DEFAULT, newDefault, newDefault));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getValidationRule() {
        return validationRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValidationRule(ExpressionNode newValidationRule, NotificationChain msgs) {
        ExpressionNode oldValidationRule = validationRule;
        validationRule = newValidationRule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__VALIDATION_RULE,
                    oldValidationRule, newValidationRule);
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
    public void setValidationRule(ExpressionNode newValidationRule) {
        if (newValidationRule != validationRule) {
            NotificationChain msgs = null;
            if (validationRule != null)
                msgs = ((InternalEObject) validationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.DOMAIN__VALIDATION_RULE, null, msgs);
            if (newValidationRule != null)
                msgs = ((InternalEObject) newValidationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.DOMAIN__VALIDATION_RULE, null, msgs);
            msgs = basicSetValidationRule(newValidationRule, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__VALIDATION_RULE, newValidationRule,
                    newValidationRule));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Classifier getBaseType() {
        if (baseType != null && baseType.eIsProxy()) {
            InternalEObject oldBaseType = (InternalEObject) baseType;
            baseType = (Classifier) eResolveProxy(oldBaseType);
            if (baseType != oldBaseType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.DOMAIN__BASE_TYPE, oldBaseType, baseType));
            }
        }
        return baseType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetBaseType() {
        return baseType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseType(Classifier newBaseType, NotificationChain msgs) {
        Classifier oldBaseType = baseType;
        baseType = newBaseType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__BASE_TYPE,
                    oldBaseType, newBaseType);
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
    public void setBaseType(Classifier newBaseType) {
        if (newBaseType != baseType) {
            NotificationChain msgs = null;
            if (baseType != null)
                msgs = ((InternalEObject) baseType).eInverseRemove(this, CorePackage.CLASSIFIER__DOMAIN, Classifier.class, msgs);
            if (newBaseType != null)
                msgs = ((InternalEObject) newBaseType).eInverseAdd(this, CorePackage.CLASSIFIER__DOMAIN, Classifier.class, msgs);
            msgs = basicSetBaseType(newBaseType, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.DOMAIN__BASE_TYPE, newBaseType, newBaseType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ErPackage.DOMAIN__BASE_TYPE:
            if (baseType != null)
                msgs = ((InternalEObject) baseType).eInverseRemove(this, CorePackage.CLASSIFIER__DOMAIN, Classifier.class, msgs);
            return basicSetBaseType((Classifier) otherEnd, msgs);
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
        case ErPackage.DOMAIN__DEFAULT:
            return basicSetDefault(null, msgs);
        case ErPackage.DOMAIN__VALIDATION_RULE:
            return basicSetValidationRule(null, msgs);
        case ErPackage.DOMAIN__BASE_TYPE:
            return basicSetBaseType(null, msgs);
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
        case ErPackage.DOMAIN__DEFAULT:
            return getDefault();
        case ErPackage.DOMAIN__VALIDATION_RULE:
            return getValidationRule();
        case ErPackage.DOMAIN__BASE_TYPE:
            if (resolve)
                return getBaseType();
            return basicGetBaseType();
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
        case ErPackage.DOMAIN__DEFAULT:
            setDefault((ExpressionNode) newValue);
            return;
        case ErPackage.DOMAIN__VALIDATION_RULE:
            setValidationRule((ExpressionNode) newValue);
            return;
        case ErPackage.DOMAIN__BASE_TYPE:
            setBaseType((Classifier) newValue);
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
        case ErPackage.DOMAIN__DEFAULT:
            setDefault((ExpressionNode) null);
            return;
        case ErPackage.DOMAIN__VALIDATION_RULE:
            setValidationRule((ExpressionNode) null);
            return;
        case ErPackage.DOMAIN__BASE_TYPE:
            setBaseType((Classifier) null);
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
        case ErPackage.DOMAIN__DEFAULT:
            return default_ != null;
        case ErPackage.DOMAIN__VALIDATION_RULE:
            return validationRule != null;
        case ErPackage.DOMAIN__BASE_TYPE:
            return baseType != null;
        }
        return super.eIsSet(featureID);
    }

} // DomainImpl
