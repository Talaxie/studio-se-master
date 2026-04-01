/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.olap.impl.CubeRegionImpl;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.analysis.informationset.Rule;
import orgomg.cwmx.analysis.informationset.SegmentRegion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Segment Region</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.SegmentRegionImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentRegionImpl extends CubeRegionImpl implements SegmentRegion {

    /**
     * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRule()
     * @generated
     * @ordered
     */
    protected EList<Rule> rule;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SegmentRegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationsetPackage.Literals.SEGMENT_REGION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Rule> getRule() {
        if (rule == null) {
            rule = new EObjectWithInverseResolvingEList<Rule>(Rule.class, this, InformationsetPackage.SEGMENT_REGION__RULE,
                    InformationsetPackage.RULE__SEGMENT_REGION);
        }
        return rule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationsetPackage.SEGMENT_REGION__RULE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRule()).basicAdd(otherEnd, msgs);
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
        case InformationsetPackage.SEGMENT_REGION__RULE:
            return ((InternalEList<?>) getRule()).basicRemove(otherEnd, msgs);
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
        case InformationsetPackage.SEGMENT_REGION__RULE:
            return getRule();
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
        case InformationsetPackage.SEGMENT_REGION__RULE:
            getRule().clear();
            getRule().addAll((Collection<? extends Rule>) newValue);
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
        case InformationsetPackage.SEGMENT_REGION__RULE:
            getRule().clear();
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
        case InformationsetPackage.SEGMENT_REGION__RULE:
            return rule != null && !rule.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SegmentRegionImpl
