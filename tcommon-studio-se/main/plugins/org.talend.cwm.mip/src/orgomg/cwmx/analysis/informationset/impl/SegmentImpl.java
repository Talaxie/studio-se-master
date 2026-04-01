/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.olap.impl.CubeImpl;
import orgomg.cwm.objectmodel.core.ProcedureExpression;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.analysis.informationset.Rule;
import orgomg.cwmx.analysis.informationset.Segment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Segment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.SegmentImpl#getRegionSequence <em>Region Sequence</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.SegmentImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends CubeImpl implements Segment {

    /**
     * The cached value of the '{@link #getRegionSequence() <em>Region Sequence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegionSequence()
     * @generated
     * @ordered
     */
    protected ProcedureExpression regionSequence;

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
    protected SegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationsetPackage.Literals.SEGMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ProcedureExpression getRegionSequence() {
        return regionSequence;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegionSequence(ProcedureExpression newRegionSequence, NotificationChain msgs) {
        ProcedureExpression oldRegionSequence = regionSequence;
        regionSequence = newRegionSequence;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    InformationsetPackage.SEGMENT__REGION_SEQUENCE, oldRegionSequence, newRegionSequence);
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
    public void setRegionSequence(ProcedureExpression newRegionSequence) {
        if (newRegionSequence != regionSequence) {
            NotificationChain msgs = null;
            if (regionSequence != null)
                msgs = ((InternalEObject) regionSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - InformationsetPackage.SEGMENT__REGION_SEQUENCE, null, msgs);
            if (newRegionSequence != null)
                msgs = ((InternalEObject) newRegionSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - InformationsetPackage.SEGMENT__REGION_SEQUENCE, null, msgs);
            msgs = basicSetRegionSequence(newRegionSequence, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.SEGMENT__REGION_SEQUENCE,
                    newRegionSequence, newRegionSequence));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Rule> getRule() {
        if (rule == null) {
            rule = new EObjectWithInverseResolvingEList<Rule>(Rule.class, this, InformationsetPackage.SEGMENT__RULE,
                    InformationsetPackage.RULE__SEGMENT);
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
        case InformationsetPackage.SEGMENT__RULE:
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
        case InformationsetPackage.SEGMENT__REGION_SEQUENCE:
            return basicSetRegionSequence(null, msgs);
        case InformationsetPackage.SEGMENT__RULE:
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
        case InformationsetPackage.SEGMENT__REGION_SEQUENCE:
            return getRegionSequence();
        case InformationsetPackage.SEGMENT__RULE:
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
        case InformationsetPackage.SEGMENT__REGION_SEQUENCE:
            setRegionSequence((ProcedureExpression) newValue);
            return;
        case InformationsetPackage.SEGMENT__RULE:
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
        case InformationsetPackage.SEGMENT__REGION_SEQUENCE:
            setRegionSequence((ProcedureExpression) null);
            return;
        case InformationsetPackage.SEGMENT__RULE:
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
        case InformationsetPackage.SEGMENT__REGION_SEQUENCE:
            return regionSequence != null;
        case InformationsetPackage.SEGMENT__RULE:
            return rule != null && !rule.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SegmentImpl
