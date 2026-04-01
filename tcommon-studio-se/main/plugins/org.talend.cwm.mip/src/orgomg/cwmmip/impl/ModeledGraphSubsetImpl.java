/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.ModeledGraphSubset;
import orgomg.mof.model.ModelElement;
import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Modeled Graph Subset</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmmip.impl.ModeledGraphSubsetImpl#getMofElement <em>Mof Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeledGraphSubsetImpl extends GraphSubsetImpl implements ModeledGraphSubset {

    /**
     * The cached value of the '{@link #getMofElement() <em>Mof Element</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMofElement()
     * @generated
     * @ordered
     */
    protected ModelElement mofElement;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ModeledGraphSubsetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CwmmipPackage.Literals.MODELED_GRAPH_SUBSET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModelElement getMofElement() {
        if (mofElement != null && mofElement.eIsProxy()) {
            InternalEObject oldMofElement = (InternalEObject) mofElement;
            mofElement = (ModelElement) eResolveProxy(oldMofElement);
            if (mofElement != oldMofElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT,
                            oldMofElement, mofElement));
            }
        }
        return mofElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModelElement basicGetMofElement() {
        return mofElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMofElement(ModelElement newMofElement, NotificationChain msgs) {
        ModelElement oldMofElement = mofElement;
        mofElement = newMofElement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT, oldMofElement, newMofElement);
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
    public void setMofElement(ModelElement newMofElement) {
        if (newMofElement != mofElement) {
            NotificationChain msgs = null;
            if (mofElement != null)
                msgs = ((InternalEObject) mofElement).eInverseRemove(this, ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET,
                        ModelElement.class, msgs);
            if (newMofElement != null)
                msgs = ((InternalEObject) newMofElement).eInverseAdd(this, ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET,
                        ModelElement.class, msgs);
            msgs = basicSetMofElement(newMofElement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT, newMofElement,
                    newMofElement));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT:
            if (mofElement != null)
                msgs = ((InternalEObject) mofElement).eInverseRemove(this, ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET,
                        ModelElement.class, msgs);
            return basicSetMofElement((ModelElement) otherEnd, msgs);
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
        case CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT:
            return basicSetMofElement(null, msgs);
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
        case CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT:
            if (resolve)
                return getMofElement();
            return basicGetMofElement();
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
        case CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT:
            setMofElement((ModelElement) newValue);
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
        case CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT:
            setMofElement((ModelElement) null);
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
        case CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT:
            return mofElement != null;
        }
        return super.eIsSet(featureID);
    }

} // ModeledGraphSubsetImpl
