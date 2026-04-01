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
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.analysis.datamining.AttributeUsage;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Attribute Usage Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AttributeUsageRelationImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AttributeUsageRelationImpl#isIncludeInApplyResult <em>Include In Apply Result</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AttributeUsageRelationImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AttributeUsageRelationImpl#isSuppressNormalization <em>Suppress Normalization</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AttributeUsageRelationImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AttributeUsageRelationImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeUsageRelationImpl extends ModelElementImpl implements AttributeUsageRelation {

    /**
     * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUsageType()
     * @generated
     * @ordered
     */
    protected static final AttributeUsage USAGE_TYPE_EDEFAULT = AttributeUsage.ACTIVE;

    /**
     * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUsageType()
     * @generated
     * @ordered
     */
    protected AttributeUsage usageType = USAGE_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isIncludeInApplyResult() <em>Include In Apply Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIncludeInApplyResult()
     * @generated
     * @ordered
     */
    protected static final boolean INCLUDE_IN_APPLY_RESULT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIncludeInApplyResult() <em>Include In Apply Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIncludeInApplyResult()
     * @generated
     * @ordered
     */
    protected boolean includeInApplyResult = INCLUDE_IN_APPLY_RESULT_EDEFAULT;

    /**
     * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWeight()
     * @generated
     * @ordered
     */
    protected static final String WEIGHT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWeight()
     * @generated
     * @ordered
     */
    protected String weight = WEIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #isSuppressNormalization() <em>Suppress Normalization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSuppressNormalization()
     * @generated
     * @ordered
     */
    protected static final boolean SUPPRESS_NORMALIZATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSuppressNormalization() <em>Suppress Normalization</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isSuppressNormalization()
     * @generated
     * @ordered
     */
    protected boolean suppressNormalization = SUPPRESS_NORMALIZATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected MiningAttribute attribute;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AttributeUsageRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.ATTRIBUTE_USAGE_RELATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AttributeUsage getUsageType() {
        return usageType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUsageType(AttributeUsage newUsageType) {
        AttributeUsage oldUsageType = usageType;
        usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ATTRIBUTE_USAGE_RELATION__USAGE_TYPE,
                    oldUsageType, usageType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIncludeInApplyResult() {
        return includeInApplyResult;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIncludeInApplyResult(boolean newIncludeInApplyResult) {
        boolean oldIncludeInApplyResult = includeInApplyResult;
        includeInApplyResult = newIncludeInApplyResult;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.ATTRIBUTE_USAGE_RELATION__INCLUDE_IN_APPLY_RESULT, oldIncludeInApplyResult,
                    includeInApplyResult));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getWeight() {
        return weight;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setWeight(String newWeight) {
        String oldWeight = weight;
        weight = newWeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ATTRIBUTE_USAGE_RELATION__WEIGHT, oldWeight,
                    weight));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isSuppressNormalization() {
        return suppressNormalization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSuppressNormalization(boolean newSuppressNormalization) {
        boolean oldSuppressNormalization = suppressNormalization;
        suppressNormalization = newSuppressNormalization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.ATTRIBUTE_USAGE_RELATION__SUPPRESS_NORMALIZATION, oldSuppressNormalization,
                    suppressNormalization));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningSettings getSettings() {
        if (eContainerFeatureID() != DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS)
            return null;
        return (MiningSettings) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSettings(MiningSettings newSettings, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newSettings, DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSettings(MiningSettings newSettings) {
        if (newSettings != eInternalContainer()
                || (eContainerFeatureID() != DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS && newSettings != null)) {
            if (EcoreUtil.isAncestor(this, newSettings))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSettings != null)
                msgs = ((InternalEObject) newSettings).eInverseAdd(this, DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE,
                        MiningSettings.class, msgs);
            msgs = basicSetSettings(newSettings, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS,
                    newSettings, newSettings));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningAttribute getAttribute() {
        if (attribute != null && attribute.eIsProxy()) {
            InternalEObject oldAttribute = (InternalEObject) attribute;
            attribute = (MiningAttribute) eResolveProxy(oldAttribute);
            if (attribute != oldAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE, oldAttribute, attribute));
            }
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningAttribute basicGetAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttribute(MiningAttribute newAttribute, NotificationChain msgs) {
        MiningAttribute oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE, oldAttribute, newAttribute);
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
    public void setAttribute(MiningAttribute newAttribute) {
        if (newAttribute != attribute) {
            NotificationChain msgs = null;
            if (attribute != null)
                msgs = ((InternalEObject) attribute).eInverseRemove(this, DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE,
                        MiningAttribute.class, msgs);
            if (newAttribute != null)
                msgs = ((InternalEObject) newAttribute).eInverseAdd(this, DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE,
                        MiningAttribute.class, msgs);
            msgs = basicSetAttribute(newAttribute, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE,
                    newAttribute, newAttribute));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSettings((MiningSettings) otherEnd, msgs);
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE:
            if (attribute != null)
                msgs = ((InternalEObject) attribute).eInverseRemove(this, DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE,
                        MiningAttribute.class, msgs);
            return basicSetAttribute((MiningAttribute) otherEnd, msgs);
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
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            return basicSetSettings(null, msgs);
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE:
            return basicSetAttribute(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            return eInternalContainer().eInverseRemove(this, DataminingPackage.MINING_SETTINGS__ATTRIBUTE_USAGE,
                    MiningSettings.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__USAGE_TYPE:
            return getUsageType();
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__INCLUDE_IN_APPLY_RESULT:
            return isIncludeInApplyResult();
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__WEIGHT:
            return getWeight();
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SUPPRESS_NORMALIZATION:
            return isSuppressNormalization();
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            return getSettings();
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE:
            if (resolve)
                return getAttribute();
            return basicGetAttribute();
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
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__USAGE_TYPE:
            setUsageType((AttributeUsage) newValue);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__INCLUDE_IN_APPLY_RESULT:
            setIncludeInApplyResult((Boolean) newValue);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__WEIGHT:
            setWeight((String) newValue);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SUPPRESS_NORMALIZATION:
            setSuppressNormalization((Boolean) newValue);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            setSettings((MiningSettings) newValue);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE:
            setAttribute((MiningAttribute) newValue);
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
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__USAGE_TYPE:
            setUsageType(USAGE_TYPE_EDEFAULT);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__INCLUDE_IN_APPLY_RESULT:
            setIncludeInApplyResult(INCLUDE_IN_APPLY_RESULT_EDEFAULT);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__WEIGHT:
            setWeight(WEIGHT_EDEFAULT);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SUPPRESS_NORMALIZATION:
            setSuppressNormalization(SUPPRESS_NORMALIZATION_EDEFAULT);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            setSettings((MiningSettings) null);
            return;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE:
            setAttribute((MiningAttribute) null);
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
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__USAGE_TYPE:
            return usageType != USAGE_TYPE_EDEFAULT;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__INCLUDE_IN_APPLY_RESULT:
            return includeInApplyResult != INCLUDE_IN_APPLY_RESULT_EDEFAULT;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__WEIGHT:
            return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SUPPRESS_NORMALIZATION:
            return suppressNormalization != SUPPRESS_NORMALIZATION_EDEFAULT;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__SETTINGS:
            return getSettings() != null;
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE:
            return attribute != null;
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
        result.append(" (usageType: ");
        result.append(usageType);
        result.append(", includeInApplyResult: ");
        result.append(includeInApplyResult);
        result.append(", weight: ");
        result.append(weight);
        result.append(", suppressNormalization: ");
        result.append(suppressNormalization);
        result.append(')');
        return result.toString();
    }

} // AttributeUsageRelationImpl
