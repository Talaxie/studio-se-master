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
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningModelResult;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mining Model Result</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelResultImpl#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.MiningModelResultImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningModelResultImpl extends ClassImpl implements MiningModelResult {

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected MiningModel model;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MiningModelResultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.MINING_MODEL_RESULT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_MODEL_RESULT__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModel getModel() {
        if (model != null && model.eIsProxy()) {
            InternalEObject oldModel = (InternalEObject) model;
            model = (MiningModel) eResolveProxy(oldModel);
            if (model != oldModel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataminingPackage.MINING_MODEL_RESULT__MODEL,
                            oldModel, model));
            }
        }
        return model;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MiningModel basicGetModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(MiningModel newModel, NotificationChain msgs) {
        MiningModel oldModel = model;
        model = newModel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.MINING_MODEL_RESULT__MODEL, oldModel, newModel);
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
    public void setModel(MiningModel newModel) {
        if (newModel != model) {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject) model).eInverseRemove(this, DataminingPackage.MINING_MODEL__MINING_RESULT,
                        MiningModel.class, msgs);
            if (newModel != null)
                msgs = ((InternalEObject) newModel).eInverseAdd(this, DataminingPackage.MINING_MODEL__MINING_RESULT,
                        MiningModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.MINING_MODEL_RESULT__MODEL, newModel,
                    newModel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.MINING_MODEL_RESULT__MODEL:
            if (model != null)
                msgs = ((InternalEObject) model).eInverseRemove(this, DataminingPackage.MINING_MODEL__MINING_RESULT,
                        MiningModel.class, msgs);
            return basicSetModel((MiningModel) otherEnd, msgs);
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
        case DataminingPackage.MINING_MODEL_RESULT__MODEL:
            return basicSetModel(null, msgs);
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
        case DataminingPackage.MINING_MODEL_RESULT__TYPE:
            return getType();
        case DataminingPackage.MINING_MODEL_RESULT__MODEL:
            if (resolve)
                return getModel();
            return basicGetModel();
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
        case DataminingPackage.MINING_MODEL_RESULT__TYPE:
            setType((String) newValue);
            return;
        case DataminingPackage.MINING_MODEL_RESULT__MODEL:
            setModel((MiningModel) newValue);
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
        case DataminingPackage.MINING_MODEL_RESULT__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case DataminingPackage.MINING_MODEL_RESULT__MODEL:
            setModel((MiningModel) null);
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
        case DataminingPackage.MINING_MODEL_RESULT__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case DataminingPackage.MINING_MODEL_RESULT__MODEL:
            return model != null;
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
        result.append(" (type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} // MiningModelResultImpl
