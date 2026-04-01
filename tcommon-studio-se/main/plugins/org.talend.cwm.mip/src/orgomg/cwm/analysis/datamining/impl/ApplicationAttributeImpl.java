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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.ApplicationAttribute;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.AttributeType;
import orgomg.cwm.analysis.datamining.AttributeUsage;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.SupervisedMiningModel;
import orgomg.cwm.objectmodel.core.impl.AttributeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Application Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ApplicationAttributeImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ApplicationAttributeImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ApplicationAttributeImpl#getInputSpec <em>Input Spec</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ApplicationAttributeImpl#getSupervisedMiningModel <em>Supervised Mining Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationAttributeImpl extends AttributeImpl implements ApplicationAttribute {

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
     * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAttributeType()
     * @generated
     * @ordered
     */
    protected static final AttributeType ATTRIBUTE_TYPE_EDEFAULT = AttributeType.CATEGORICAL;

    /**
     * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAttributeType()
     * @generated
     * @ordered
     */
    protected AttributeType attributeType = ATTRIBUTE_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSupervisedMiningModel() <em>Supervised Mining Model</em>}' reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getSupervisedMiningModel()
     * @generated
     * @ordered
     */
    protected EList<SupervisedMiningModel> supervisedMiningModel;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.APPLICATION_ATTRIBUTE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.APPLICATION_ATTRIBUTE__USAGE_TYPE,
                    oldUsageType, usageType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AttributeType getAttributeType() {
        return attributeType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeType(AttributeType newAttributeType) {
        AttributeType oldAttributeType = attributeType;
        attributeType = newAttributeType == null ? ATTRIBUTE_TYPE_EDEFAULT : newAttributeType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.APPLICATION_ATTRIBUTE__ATTRIBUTE_TYPE,
                    oldAttributeType, attributeType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ApplicationInputSpecification getInputSpec() {
        if (eContainerFeatureID() != DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC)
            return null;
        return (ApplicationInputSpecification) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputSpec(ApplicationInputSpecification newInputSpec, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newInputSpec, DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setInputSpec(ApplicationInputSpecification newInputSpec) {
        if (newInputSpec != eInternalContainer()
                || (eContainerFeatureID() != DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC && newInputSpec != null)) {
            if (EcoreUtil.isAncestor(this, newInputSpec))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInputSpec != null)
                msgs = ((InternalEObject) newInputSpec).eInverseAdd(this,
                        DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE, ApplicationInputSpecification.class,
                        msgs);
            msgs = basicSetInputSpec(newInputSpec, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC,
                    newInputSpec, newInputSpec));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SupervisedMiningModel> getSupervisedMiningModel() {
        if (supervisedMiningModel == null) {
            supervisedMiningModel = new EObjectWithInverseResolvingEList<SupervisedMiningModel>(SupervisedMiningModel.class,
                    this, DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL,
                    DataminingPackage.SUPERVISED_MINING_MODEL__TARGET);
        }
        return supervisedMiningModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInputSpec((ApplicationInputSpecification) otherEnd, msgs);
        case DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSupervisedMiningModel()).basicAdd(otherEnd, msgs);
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
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            return basicSetInputSpec(null, msgs);
        case DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL:
            return ((InternalEList<?>) getSupervisedMiningModel()).basicRemove(otherEnd, msgs);
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
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            return eInternalContainer().eInverseRemove(this, DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE,
                    ApplicationInputSpecification.class, msgs);
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
        case DataminingPackage.APPLICATION_ATTRIBUTE__USAGE_TYPE:
            return getUsageType();
        case DataminingPackage.APPLICATION_ATTRIBUTE__ATTRIBUTE_TYPE:
            return getAttributeType();
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            return getInputSpec();
        case DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL:
            return getSupervisedMiningModel();
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
        case DataminingPackage.APPLICATION_ATTRIBUTE__USAGE_TYPE:
            setUsageType((AttributeUsage) newValue);
            return;
        case DataminingPackage.APPLICATION_ATTRIBUTE__ATTRIBUTE_TYPE:
            setAttributeType((AttributeType) newValue);
            return;
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            setInputSpec((ApplicationInputSpecification) newValue);
            return;
        case DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL:
            getSupervisedMiningModel().clear();
            getSupervisedMiningModel().addAll((Collection<? extends SupervisedMiningModel>) newValue);
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
        case DataminingPackage.APPLICATION_ATTRIBUTE__USAGE_TYPE:
            setUsageType(USAGE_TYPE_EDEFAULT);
            return;
        case DataminingPackage.APPLICATION_ATTRIBUTE__ATTRIBUTE_TYPE:
            setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
            return;
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            setInputSpec((ApplicationInputSpecification) null);
            return;
        case DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL:
            getSupervisedMiningModel().clear();
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
        case DataminingPackage.APPLICATION_ATTRIBUTE__USAGE_TYPE:
            return usageType != USAGE_TYPE_EDEFAULT;
        case DataminingPackage.APPLICATION_ATTRIBUTE__ATTRIBUTE_TYPE:
            return attributeType != ATTRIBUTE_TYPE_EDEFAULT;
        case DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC:
            return getInputSpec() != null;
        case DataminingPackage.APPLICATION_ATTRIBUTE__SUPERVISED_MINING_MODEL:
            return supervisedMiningModel != null && !supervisedMiningModel.isEmpty();
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
        result.append(", attributeType: ");
        result.append(attributeType);
        result.append(')');
        return result.toString();
    }

} // ApplicationAttributeImpl
