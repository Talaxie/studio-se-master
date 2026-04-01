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
import orgomg.cwm.analysis.datamining.AssociationRulesSettings;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.objectmodel.core.impl.AttributeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mining Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningAttributeImpl#getDataSpecification <em>Data Specification</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningAttributeImpl#getAttributeUsage <em>Attribute Usage</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningAttributeImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningAttributeImpl extends AttributeImpl implements MiningAttribute {

    /**
     * The cached value of the '{@link #getAttributeUsage() <em>Attribute Usage</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAttributeUsage()
     * @generated
     * @ordered
     */
    protected EList<AttributeUsageRelation> attributeUsage;

    /**
     * The cached value of the '{@link #getSettings() <em>Settings</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSettings()
     * @generated
     * @ordered
     */
    protected EList<AssociationRulesSettings> settings;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MiningAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.MINING_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningDataSpecification getDataSpecification() {
        if (eContainerFeatureID() != DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION)
            return null;
        return (MiningDataSpecification) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataSpecification(MiningDataSpecification newDataSpecification, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDataSpecification, DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDataSpecification(MiningDataSpecification newDataSpecification) {
        if (newDataSpecification != eInternalContainer()
                || (eContainerFeatureID() != DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION && newDataSpecification != null)) {
            if (EcoreUtil.isAncestor(this, newDataSpecification))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataSpecification != null)
                msgs = ((InternalEObject) newDataSpecification).eInverseAdd(this,
                        DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE, MiningDataSpecification.class, msgs);
            msgs = basicSetDataSpecification(newDataSpecification, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION,
                    newDataSpecification, newDataSpecification));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeUsageRelation> getAttributeUsage() {
        if (attributeUsage == null) {
            attributeUsage = new EObjectWithInverseResolvingEList<AttributeUsageRelation>(AttributeUsageRelation.class, this,
                    DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE, DataminingPackage.ATTRIBUTE_USAGE_RELATION__ATTRIBUTE);
        }
        return attributeUsage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AssociationRulesSettings> getSettings() {
        if (settings == null) {
            settings = new EObjectWithInverseResolvingEList<AssociationRulesSettings>(AssociationRulesSettings.class, this,
                    DataminingPackage.MINING_ATTRIBUTE__SETTINGS, DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID);
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDataSpecification((MiningDataSpecification) otherEnd, msgs);
        case DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributeUsage()).basicAdd(otherEnd, msgs);
        case DataminingPackage.MINING_ATTRIBUTE__SETTINGS:
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            return basicSetDataSpecification(null, msgs);
        case DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE:
            return ((InternalEList<?>) getAttributeUsage()).basicRemove(otherEnd, msgs);
        case DataminingPackage.MINING_ATTRIBUTE__SETTINGS:
            return ((InternalEList<?>) getSettings()).basicRemove(otherEnd, msgs);
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            return eInternalContainer().eInverseRemove(this, DataminingPackage.MINING_DATA_SPECIFICATION__ATTRIBUTE,
                    MiningDataSpecification.class, msgs);
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            return getDataSpecification();
        case DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE:
            return getAttributeUsage();
        case DataminingPackage.MINING_ATTRIBUTE__SETTINGS:
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            setDataSpecification((MiningDataSpecification) newValue);
            return;
        case DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE:
            getAttributeUsage().clear();
            getAttributeUsage().addAll((Collection<? extends AttributeUsageRelation>) newValue);
            return;
        case DataminingPackage.MINING_ATTRIBUTE__SETTINGS:
            getSettings().clear();
            getSettings().addAll((Collection<? extends AssociationRulesSettings>) newValue);
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            setDataSpecification((MiningDataSpecification) null);
            return;
        case DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE:
            getAttributeUsage().clear();
            return;
        case DataminingPackage.MINING_ATTRIBUTE__SETTINGS:
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
        case DataminingPackage.MINING_ATTRIBUTE__DATA_SPECIFICATION:
            return getDataSpecification() != null;
        case DataminingPackage.MINING_ATTRIBUTE__ATTRIBUTE_USAGE:
            return attributeUsage != null && !attributeUsage.isEmpty();
        case DataminingPackage.MINING_ATTRIBUTE__SETTINGS:
            return settings != null && !settings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MiningAttributeImpl
