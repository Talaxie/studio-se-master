/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.multidimensional.impl.DimensionedObjectImpl;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.Dimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Relation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.RelationImpl#isIsTemp <em>Is Temp</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.RelationImpl#getPageSpace <em>Page Space</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.RelationImpl#getReferenceDimension <em>Reference Dimension</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.RelationImpl#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends DimensionedObjectImpl implements Relation {

    /**
     * The default value of the '{@link #isIsTemp() <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTemp()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TEMP_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsTemp() <em>Is Temp</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTemp()
     * @generated
     * @ordered
     */
    protected boolean isTemp = IS_TEMP_EDEFAULT;

    /**
     * The default value of the '{@link #getPageSpace() <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPageSpace()
     * @generated
     * @ordered
     */
    protected static final String PAGE_SPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPageSpace() <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPageSpace()
     * @generated
     * @ordered
     */
    protected String pageSpace = PAGE_SPACE_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferenceDimension() <em>Reference Dimension</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReferenceDimension()
     * @generated
     * @ordered
     */
    protected Dimension referenceDimension;

    /**
     * The cached value of the '{@link #getAggMapComponent() <em>Agg Map Component</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAggMapComponent()
     * @generated
     * @ordered
     */
    protected EList<AggMapComponent> aggMapComponent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.RELATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsTemp() {
        return isTemp;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsTemp(boolean newIsTemp) {
        boolean oldIsTemp = isTemp;
        isTemp = newIsTemp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.RELATION__IS_TEMP, oldIsTemp, isTemp));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPageSpace() {
        return pageSpace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPageSpace(String newPageSpace) {
        String oldPageSpace = pageSpace;
        pageSpace = newPageSpace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.RELATION__PAGE_SPACE, oldPageSpace, pageSpace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension getReferenceDimension() {
        if (referenceDimension != null && referenceDimension.eIsProxy()) {
            InternalEObject oldReferenceDimension = (InternalEObject) referenceDimension;
            referenceDimension = (Dimension) eResolveProxy(oldReferenceDimension);
            if (referenceDimension != oldReferenceDimension) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.RELATION__REFERENCE_DIMENSION,
                            oldReferenceDimension, referenceDimension));
            }
        }
        return referenceDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension basicGetReferenceDimension() {
        return referenceDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferenceDimension(Dimension newReferenceDimension, NotificationChain msgs) {
        Dimension oldReferenceDimension = referenceDimension;
        referenceDimension = newReferenceDimension;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.RELATION__REFERENCE_DIMENSION, oldReferenceDimension, newReferenceDimension);
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
    public void setReferenceDimension(Dimension newReferenceDimension) {
        if (newReferenceDimension != referenceDimension) {
            NotificationChain msgs = null;
            if (referenceDimension != null)
                msgs = ((InternalEObject) referenceDimension).eInverseRemove(this, ExpressPackage.DIMENSION__RELATION,
                        Dimension.class, msgs);
            if (newReferenceDimension != null)
                msgs = ((InternalEObject) newReferenceDimension).eInverseAdd(this, ExpressPackage.DIMENSION__RELATION,
                        Dimension.class, msgs);
            msgs = basicSetReferenceDimension(newReferenceDimension, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.RELATION__REFERENCE_DIMENSION,
                    newReferenceDimension, newReferenceDimension));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AggMapComponent> getAggMapComponent() {
        if (aggMapComponent == null) {
            aggMapComponent = new EObjectWithInverseResolvingEList<AggMapComponent>(AggMapComponent.class, this,
                    ExpressPackage.RELATION__AGG_MAP_COMPONENT, ExpressPackage.AGG_MAP_COMPONENT__RELATION);
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
        case ExpressPackage.RELATION__REFERENCE_DIMENSION:
            if (referenceDimension != null)
                msgs = ((InternalEObject) referenceDimension).eInverseRemove(this, ExpressPackage.DIMENSION__RELATION,
                        Dimension.class, msgs);
            return basicSetReferenceDimension((Dimension) otherEnd, msgs);
        case ExpressPackage.RELATION__AGG_MAP_COMPONENT:
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
        case ExpressPackage.RELATION__REFERENCE_DIMENSION:
            return basicSetReferenceDimension(null, msgs);
        case ExpressPackage.RELATION__AGG_MAP_COMPONENT:
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
        case ExpressPackage.RELATION__IS_TEMP:
            return isIsTemp();
        case ExpressPackage.RELATION__PAGE_SPACE:
            return getPageSpace();
        case ExpressPackage.RELATION__REFERENCE_DIMENSION:
            if (resolve)
                return getReferenceDimension();
            return basicGetReferenceDimension();
        case ExpressPackage.RELATION__AGG_MAP_COMPONENT:
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
        case ExpressPackage.RELATION__IS_TEMP:
            setIsTemp((Boolean) newValue);
            return;
        case ExpressPackage.RELATION__PAGE_SPACE:
            setPageSpace((String) newValue);
            return;
        case ExpressPackage.RELATION__REFERENCE_DIMENSION:
            setReferenceDimension((Dimension) newValue);
            return;
        case ExpressPackage.RELATION__AGG_MAP_COMPONENT:
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
        case ExpressPackage.RELATION__IS_TEMP:
            setIsTemp(IS_TEMP_EDEFAULT);
            return;
        case ExpressPackage.RELATION__PAGE_SPACE:
            setPageSpace(PAGE_SPACE_EDEFAULT);
            return;
        case ExpressPackage.RELATION__REFERENCE_DIMENSION:
            setReferenceDimension((Dimension) null);
            return;
        case ExpressPackage.RELATION__AGG_MAP_COMPONENT:
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
        case ExpressPackage.RELATION__IS_TEMP:
            return isTemp != IS_TEMP_EDEFAULT;
        case ExpressPackage.RELATION__PAGE_SPACE:
            return PAGE_SPACE_EDEFAULT == null ? pageSpace != null : !PAGE_SPACE_EDEFAULT.equals(pageSpace);
        case ExpressPackage.RELATION__REFERENCE_DIMENSION:
            return referenceDimension != null;
        case ExpressPackage.RELATION__AGG_MAP_COMPONENT:
            return aggMapComponent != null && !aggMapComponent.isEmpty();
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
        result.append(" (isTemp: ");
        result.append(isTemp);
        result.append(", pageSpace: ");
        result.append(pageSpace);
        result.append(')');
        return result.toString();
    }

} // RelationImpl
