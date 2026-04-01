/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;
import orgomg.cwmx.resource.express.AggMap;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.ExpressPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Agg Map</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.AggMapImpl#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggMapImpl extends ClassImpl implements AggMap {

    /**
     * The cached value of the '{@link #getAggMapComponent()
     * <em>Agg Map Component</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAggMapComponent()
     * @generated
     * @ordered
     */
    protected EList<AggMapComponent> aggMapComponent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AggMapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.AGG_MAP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AggMapComponent> getAggMapComponent() {
        if (aggMapComponent == null) {
            aggMapComponent = new EObjectContainmentWithInverseEList<AggMapComponent>(AggMapComponent.class, this,
                    ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT, ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP);
        }
        return aggMapComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAggMapComponent()).basicAdd(otherEnd, msgs);
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
        case ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT:
            return ((InternalEList<?>) getAggMapComponent()).basicRemove(otherEnd, msgs);
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
        case ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT:
            return getAggMapComponent();
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
        case ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT:
            getAggMapComponent().clear();
            getAggMapComponent().addAll((Collection<? extends AggMapComponent>) newValue);
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
        case ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT:
            getAggMapComponent().clear();
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
        case ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT:
            return aggMapComponent != null && !aggMapComponent.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // AggMapImpl
