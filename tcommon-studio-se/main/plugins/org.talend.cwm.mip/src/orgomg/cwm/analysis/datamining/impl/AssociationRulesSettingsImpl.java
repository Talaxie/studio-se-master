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
import orgomg.cwm.analysis.datamining.AssociationRulesSettings;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Association Rules Settings</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AssociationRulesSettingsImpl#getMinimumSupport <em>Minimum Support</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AssociationRulesSettingsImpl#getMinimumConfidence <em>Minimum Confidence</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.AssociationRulesSettingsImpl#getItemId <em>Item Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationRulesSettingsImpl extends MiningSettingsImpl implements AssociationRulesSettings {

    /**
     * The default value of the '{@link #getMinimumSupport() <em>Minimum Support</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMinimumSupport()
     * @generated
     * @ordered
     */
    protected static final String MINIMUM_SUPPORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumSupport() <em>Minimum Support</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMinimumSupport()
     * @generated
     * @ordered
     */
    protected String minimumSupport = MINIMUM_SUPPORT_EDEFAULT;

    /**
     * The default value of the '{@link #getMinimumConfidence() <em>Minimum Confidence</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMinimumConfidence()
     * @generated
     * @ordered
     */
    protected static final String MINIMUM_CONFIDENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumConfidence() <em>Minimum Confidence</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMinimumConfidence()
     * @generated
     * @ordered
     */
    protected String minimumConfidence = MINIMUM_CONFIDENCE_EDEFAULT;

    /**
     * The cached value of the '{@link #getItemId() <em>Item Id</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getItemId()
     * @generated
     * @ordered
     */
    protected MiningAttribute itemId;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AssociationRulesSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.ASSOCIATION_RULES_SETTINGS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getMinimumSupport() {
        return minimumSupport;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinimumSupport(String newMinimumSupport) {
        String oldMinimumSupport = minimumSupport;
        minimumSupport = newMinimumSupport;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_SUPPORT,
                    oldMinimumSupport, minimumSupport));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getMinimumConfidence() {
        return minimumConfidence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMinimumConfidence(String newMinimumConfidence) {
        String oldMinimumConfidence = minimumConfidence;
        minimumConfidence = newMinimumConfidence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_CONFIDENCE, oldMinimumConfidence, minimumConfidence));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningAttribute getItemId() {
        if (itemId != null && itemId.eIsProxy()) {
            InternalEObject oldItemId = (InternalEObject) itemId;
            itemId = (MiningAttribute) eResolveProxy(oldItemId);
            if (itemId != oldItemId) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID, oldItemId, itemId));
            }
        }
        return itemId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningAttribute basicGetItemId() {
        return itemId;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetItemId(MiningAttribute newItemId, NotificationChain msgs) {
        MiningAttribute oldItemId = itemId;
        itemId = newItemId;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID, oldItemId, newItemId);
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
    public void setItemId(MiningAttribute newItemId) {
        if (newItemId != itemId) {
            NotificationChain msgs = null;
            if (itemId != null)
                msgs = ((InternalEObject) itemId).eInverseRemove(this, DataminingPackage.MINING_ATTRIBUTE__SETTINGS,
                        MiningAttribute.class, msgs);
            if (newItemId != null)
                msgs = ((InternalEObject) newItemId).eInverseAdd(this, DataminingPackage.MINING_ATTRIBUTE__SETTINGS,
                        MiningAttribute.class, msgs);
            msgs = basicSetItemId(newItemId, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID,
                    newItemId, newItemId));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID:
            if (itemId != null)
                msgs = ((InternalEObject) itemId).eInverseRemove(this, DataminingPackage.MINING_ATTRIBUTE__SETTINGS,
                        MiningAttribute.class, msgs);
            return basicSetItemId((MiningAttribute) otherEnd, msgs);
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
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID:
            return basicSetItemId(null, msgs);
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
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_SUPPORT:
            return getMinimumSupport();
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_CONFIDENCE:
            return getMinimumConfidence();
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID:
            if (resolve)
                return getItemId();
            return basicGetItemId();
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
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_SUPPORT:
            setMinimumSupport((String) newValue);
            return;
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_CONFIDENCE:
            setMinimumConfidence((String) newValue);
            return;
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID:
            setItemId((MiningAttribute) newValue);
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
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_SUPPORT:
            setMinimumSupport(MINIMUM_SUPPORT_EDEFAULT);
            return;
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_CONFIDENCE:
            setMinimumConfidence(MINIMUM_CONFIDENCE_EDEFAULT);
            return;
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID:
            setItemId((MiningAttribute) null);
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
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_SUPPORT:
            return MINIMUM_SUPPORT_EDEFAULT == null ? minimumSupport != null : !MINIMUM_SUPPORT_EDEFAULT.equals(minimumSupport);
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__MINIMUM_CONFIDENCE:
            return MINIMUM_CONFIDENCE_EDEFAULT == null ? minimumConfidence != null : !MINIMUM_CONFIDENCE_EDEFAULT
                    .equals(minimumConfidence);
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS__ITEM_ID:
            return itemId != null;
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
        result.append(" (minimumSupport: ");
        result.append(minimumSupport);
        result.append(", minimumConfidence: ");
        result.append(minimumConfidence);
        result.append(')');
        return result.toString();
    }

} // AssociationRulesSettingsImpl
