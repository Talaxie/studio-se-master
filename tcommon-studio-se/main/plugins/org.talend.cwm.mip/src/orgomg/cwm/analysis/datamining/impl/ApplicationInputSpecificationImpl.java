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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.ApplicationAttribute;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Application Input Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ApplicationInputSpecificationImpl#getInputAttribute <em>Input Attribute</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.ApplicationInputSpecificationImpl#getMiningModel <em>Mining Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationInputSpecificationImpl extends ClassImpl implements ApplicationInputSpecification {

    /**
     * The cached value of the '{@link #getInputAttribute()
     * <em>Input Attribute</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getInputAttribute()
     * @generated
     * @ordered
     */
    protected EList<ApplicationAttribute> inputAttribute;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationInputSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.APPLICATION_INPUT_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ApplicationAttribute> getInputAttribute() {
        if (inputAttribute == null) {
            inputAttribute = new EObjectContainmentWithInverseEList<ApplicationAttribute>(ApplicationAttribute.class, this,
                    DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE,
                    DataminingPackage.APPLICATION_ATTRIBUTE__INPUT_SPEC);
        }
        return inputAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModel getMiningModel() {
        if (eContainerFeatureID() != DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL)
            return null;
        return (MiningModel) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMiningModel(MiningModel newMiningModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newMiningModel,
                DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMiningModel(MiningModel newMiningModel) {
        if (newMiningModel != eInternalContainer()
                || (eContainerFeatureID() != DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL && newMiningModel != null)) {
            if (EcoreUtil.isAncestor(this, newMiningModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMiningModel != null)
                msgs = ((InternalEObject) newMiningModel).eInverseAdd(this, DataminingPackage.MINING_MODEL__INPUT_SPEC,
                        MiningModel.class, msgs);
            msgs = basicSetMiningModel(newMiningModel, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL, newMiningModel, newMiningModel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputAttribute()).basicAdd(otherEnd, msgs);
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetMiningModel((MiningModel) otherEnd, msgs);
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE:
            return ((InternalEList<?>) getInputAttribute()).basicRemove(otherEnd, msgs);
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            return basicSetMiningModel(null, msgs);
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            return eInternalContainer().eInverseRemove(this, DataminingPackage.MINING_MODEL__INPUT_SPEC, MiningModel.class, msgs);
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE:
            return getInputAttribute();
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            return getMiningModel();
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE:
            getInputAttribute().clear();
            getInputAttribute().addAll((Collection<? extends ApplicationAttribute>) newValue);
            return;
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            setMiningModel((MiningModel) newValue);
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE:
            getInputAttribute().clear();
            return;
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            setMiningModel((MiningModel) null);
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__INPUT_ATTRIBUTE:
            return inputAttribute != null && !inputAttribute.isEmpty();
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION__MINING_MODEL:
            return getMiningModel() != null;
        }
        return super.eIsSet(featureID);
    }

} // ApplicationInputSpecificationImpl
