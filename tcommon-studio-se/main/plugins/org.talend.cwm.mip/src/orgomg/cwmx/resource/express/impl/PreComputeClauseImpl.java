/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.PreComputeClause;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Pre Compute Clause</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.PreComputeClauseImpl#getStatusList <em>Status List</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.PreComputeClauseImpl#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreComputeClauseImpl extends ModelElementImpl implements PreComputeClause {

    /**
     * The default value of the '{@link #getStatusList() <em>Status List</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStatusList()
     * @generated
     * @ordered
     */
    protected static final String STATUS_LIST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatusList() <em>Status List</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStatusList()
     * @generated
     * @ordered
     */
    protected String statusList = STATUS_LIST_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PreComputeClauseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.PRE_COMPUTE_CLAUSE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStatusList() {
        return statusList;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStatusList(String newStatusList) {
        String oldStatusList = statusList;
        statusList = newStatusList;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.PRE_COMPUTE_CLAUSE__STATUS_LIST, oldStatusList,
                    statusList));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AggMapComponent getAggMapComponent() {
        if (eContainerFeatureID() != ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT)
            return null;
        return (AggMapComponent) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAggMapComponent(AggMapComponent newAggMapComponent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newAggMapComponent, ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAggMapComponent(AggMapComponent newAggMapComponent) {
        if (newAggMapComponent != eInternalContainer()
                || (eContainerFeatureID() != ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT && newAggMapComponent != null)) {
            if (EcoreUtil.isAncestor(this, newAggMapComponent))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAggMapComponent != null)
                msgs = ((InternalEObject) newAggMapComponent).eInverseAdd(this, ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE,
                        AggMapComponent.class, msgs);
            msgs = basicSetAggMapComponent(newAggMapComponent, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT,
                    newAggMapComponent, newAggMapComponent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAggMapComponent((AggMapComponent) otherEnd, msgs);
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
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            return basicSetAggMapComponent(null, msgs);
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
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            return eInternalContainer().eInverseRemove(this, ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE,
                    AggMapComponent.class, msgs);
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
        case ExpressPackage.PRE_COMPUTE_CLAUSE__STATUS_LIST:
            return getStatusList();
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            return getAggMapComponent();
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
        case ExpressPackage.PRE_COMPUTE_CLAUSE__STATUS_LIST:
            setStatusList((String) newValue);
            return;
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            setAggMapComponent((AggMapComponent) newValue);
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
        case ExpressPackage.PRE_COMPUTE_CLAUSE__STATUS_LIST:
            setStatusList(STATUS_LIST_EDEFAULT);
            return;
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            setAggMapComponent((AggMapComponent) null);
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
        case ExpressPackage.PRE_COMPUTE_CLAUSE__STATUS_LIST:
            return STATUS_LIST_EDEFAULT == null ? statusList != null : !STATUS_LIST_EDEFAULT.equals(statusList);
        case ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT:
            return getAggMapComponent() != null;
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
        result.append(" (statusList: ");
        result.append(statusList);
        result.append(')');
        return result.toString();
    }

} // PreComputeClauseImpl
