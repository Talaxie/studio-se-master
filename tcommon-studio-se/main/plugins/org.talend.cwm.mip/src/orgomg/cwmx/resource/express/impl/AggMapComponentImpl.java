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
import orgomg.cwmx.resource.express.AggMap;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.Dimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.PreComputeClause;
import orgomg.cwmx.resource.express.Relation;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Agg Map Component</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl#getAggOperator <em>Agg Operator</em>}</li>
 * <li>{@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl#getRelation <em>Relation</em>}</li>
 * <li>
 * {@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl#getDimension <em>Dimension</em>}</li>
 * <li>
 * {@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl#getComputeClause <em>Compute Clause</em>}</li>
 * <li>{@link orgomg.cwmx.resource.express.impl.AggMapComponentImpl#getAggMap <em>Agg Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AggMapComponentImpl extends ModelElementImpl implements AggMapComponent {

    /**
     * The default value of the '{@link #getAggOperator() <em>Agg Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggOperator()
     * @generated
     * @ordered
     */
    protected static final String AGG_OPERATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAggOperator() <em>Agg Operator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAggOperator()
     * @generated
     * @ordered
     */
    protected String aggOperator = AGG_OPERATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRelation()
     * @generated
     * @ordered
     */
    protected Relation relation;

    /**
     * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected Dimension dimension;

    /**
     * The cached value of the '{@link #getComputeClause() <em>Compute Clause</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getComputeClause()
     * @generated
     * @ordered
     */
    protected PreComputeClause computeClause;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AggMapComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.AGG_MAP_COMPONENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAggOperator() {
        return aggOperator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAggOperator(String newAggOperator) {
        String oldAggOperator = aggOperator;
        aggOperator = newAggOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.AGG_MAP_COMPONENT__AGG_OPERATOR, oldAggOperator,
                    aggOperator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Relation getRelation() {
        if (relation != null && relation.eIsProxy()) {
            InternalEObject oldRelation = (InternalEObject) relation;
            relation = (Relation) eResolveProxy(oldRelation);
            if (relation != oldRelation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.AGG_MAP_COMPONENT__RELATION,
                            oldRelation, relation));
            }
        }
        return relation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Relation basicGetRelation() {
        return relation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRelation(Relation newRelation, NotificationChain msgs) {
        Relation oldRelation = relation;
        relation = newRelation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.AGG_MAP_COMPONENT__RELATION, oldRelation, newRelation);
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
    public void setRelation(Relation newRelation) {
        if (newRelation != relation) {
            NotificationChain msgs = null;
            if (relation != null)
                msgs = ((InternalEObject) relation).eInverseRemove(this, ExpressPackage.RELATION__AGG_MAP_COMPONENT,
                        Relation.class, msgs);
            if (newRelation != null)
                msgs = ((InternalEObject) newRelation).eInverseAdd(this, ExpressPackage.RELATION__AGG_MAP_COMPONENT,
                        Relation.class, msgs);
            msgs = basicSetRelation(newRelation, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.AGG_MAP_COMPONENT__RELATION, newRelation,
                    newRelation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension getDimension() {
        if (dimension != null && dimension.eIsProxy()) {
            InternalEObject oldDimension = (InternalEObject) dimension;
            dimension = (Dimension) eResolveProxy(oldDimension);
            if (dimension != oldDimension) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.AGG_MAP_COMPONENT__DIMENSION,
                            oldDimension, dimension));
            }
        }
        return dimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension basicGetDimension() {
        return dimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
        Dimension oldDimension = dimension;
        dimension = newDimension;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.AGG_MAP_COMPONENT__DIMENSION, oldDimension, newDimension);
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
    public void setDimension(Dimension newDimension) {
        if (newDimension != dimension) {
            NotificationChain msgs = null;
            if (dimension != null)
                msgs = ((InternalEObject) dimension).eInverseRemove(this, ExpressPackage.DIMENSION__AGG_MAP_COMPONENT,
                        Dimension.class, msgs);
            if (newDimension != null)
                msgs = ((InternalEObject) newDimension).eInverseAdd(this, ExpressPackage.DIMENSION__AGG_MAP_COMPONENT,
                        Dimension.class, msgs);
            msgs = basicSetDimension(newDimension, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.AGG_MAP_COMPONENT__DIMENSION, newDimension,
                    newDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PreComputeClause getComputeClause() {
        return computeClause;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComputeClause(PreComputeClause newComputeClause, NotificationChain msgs) {
        PreComputeClause oldComputeClause = computeClause;
        computeClause = newComputeClause;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE, oldComputeClause, newComputeClause);
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
    public void setComputeClause(PreComputeClause newComputeClause) {
        if (newComputeClause != computeClause) {
            NotificationChain msgs = null;
            if (computeClause != null)
                msgs = ((InternalEObject) computeClause).eInverseRemove(this,
                        ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT, PreComputeClause.class, msgs);
            if (newComputeClause != null)
                msgs = ((InternalEObject) newComputeClause).eInverseAdd(this,
                        ExpressPackage.PRE_COMPUTE_CLAUSE__AGG_MAP_COMPONENT, PreComputeClause.class, msgs);
            msgs = basicSetComputeClause(newComputeClause, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE,
                    newComputeClause, newComputeClause));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AggMap getAggMap() {
        if (eContainerFeatureID() != ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP)
            return null;
        return (AggMap) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAggMap(AggMap newAggMap, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newAggMap, ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAggMap(AggMap newAggMap) {
        if (newAggMap != eInternalContainer()
                || (eContainerFeatureID() != ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP && newAggMap != null)) {
            if (EcoreUtil.isAncestor(this, newAggMap))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAggMap != null)
                msgs = ((InternalEObject) newAggMap).eInverseAdd(this, ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT, AggMap.class,
                        msgs);
            msgs = basicSetAggMap(newAggMap, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP, newAggMap, newAggMap));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.AGG_MAP_COMPONENT__RELATION:
            if (relation != null)
                msgs = ((InternalEObject) relation).eInverseRemove(this, ExpressPackage.RELATION__AGG_MAP_COMPONENT,
                        Relation.class, msgs);
            return basicSetRelation((Relation) otherEnd, msgs);
        case ExpressPackage.AGG_MAP_COMPONENT__DIMENSION:
            if (dimension != null)
                msgs = ((InternalEObject) dimension).eInverseRemove(this, ExpressPackage.DIMENSION__AGG_MAP_COMPONENT,
                        Dimension.class, msgs);
            return basicSetDimension((Dimension) otherEnd, msgs);
        case ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE:
            if (computeClause != null)
                msgs = ((InternalEObject) computeClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE, null, msgs);
            return basicSetComputeClause((PreComputeClause) otherEnd, msgs);
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetAggMap((AggMap) otherEnd, msgs);
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
        case ExpressPackage.AGG_MAP_COMPONENT__RELATION:
            return basicSetRelation(null, msgs);
        case ExpressPackage.AGG_MAP_COMPONENT__DIMENSION:
            return basicSetDimension(null, msgs);
        case ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE:
            return basicSetComputeClause(null, msgs);
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            return basicSetAggMap(null, msgs);
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
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            return eInternalContainer().eInverseRemove(this, ExpressPackage.AGG_MAP__AGG_MAP_COMPONENT, AggMap.class, msgs);
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
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_OPERATOR:
            return getAggOperator();
        case ExpressPackage.AGG_MAP_COMPONENT__RELATION:
            if (resolve)
                return getRelation();
            return basicGetRelation();
        case ExpressPackage.AGG_MAP_COMPONENT__DIMENSION:
            if (resolve)
                return getDimension();
            return basicGetDimension();
        case ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE:
            return getComputeClause();
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            return getAggMap();
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
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_OPERATOR:
            setAggOperator((String) newValue);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__RELATION:
            setRelation((Relation) newValue);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__DIMENSION:
            setDimension((Dimension) newValue);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE:
            setComputeClause((PreComputeClause) newValue);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            setAggMap((AggMap) newValue);
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
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_OPERATOR:
            setAggOperator(AGG_OPERATOR_EDEFAULT);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__RELATION:
            setRelation((Relation) null);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__DIMENSION:
            setDimension((Dimension) null);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE:
            setComputeClause((PreComputeClause) null);
            return;
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            setAggMap((AggMap) null);
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
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_OPERATOR:
            return AGG_OPERATOR_EDEFAULT == null ? aggOperator != null : !AGG_OPERATOR_EDEFAULT.equals(aggOperator);
        case ExpressPackage.AGG_MAP_COMPONENT__RELATION:
            return relation != null;
        case ExpressPackage.AGG_MAP_COMPONENT__DIMENSION:
            return dimension != null;
        case ExpressPackage.AGG_MAP_COMPONENT__COMPUTE_CLAUSE:
            return computeClause != null;
        case ExpressPackage.AGG_MAP_COMPONENT__AGG_MAP:
            return getAggMap() != null;
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
        result.append(" (aggOperator: ");
        result.append(aggOperator);
        result.append(')');
        return result.toString();
    }

} // AggMapComponentImpl
