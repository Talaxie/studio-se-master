/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.analysis.informationset.InformationSet;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.analysis.informationset.Rule;
import orgomg.cwmx.analysis.informationset.Segment;
import orgomg.cwmx.analysis.informationset.SegmentRegion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Rule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl#getRuleExpression <em>Rule Expression</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl#getInformationSet <em>Information Set</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.RuleImpl#getSegmentRegion <em>Segment Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends ModelElementImpl implements Rule {

    /**
     * The cached value of the '{@link #getRuleExpression() <em>Rule Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleExpression()
     * @generated
     * @ordered
     */
    protected ExpressionNode ruleExpression;

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
     * The cached value of the '{@link #getInformationSet() <em>Information Set</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getInformationSet()
     * @generated
     * @ordered
     */
    protected InformationSet informationSet;

    /**
     * The cached value of the '{@link #getSegment() <em>Segment</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSegment()
     * @generated
     * @ordered
     */
    protected Segment segment;

    /**
     * The cached value of the '{@link #getSegmentRegion() <em>Segment Region</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSegmentRegion()
     * @generated
     * @ordered
     */
    protected SegmentRegion segmentRegion;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationsetPackage.Literals.RULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getRuleExpression() {
        return ruleExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRuleExpression(ExpressionNode newRuleExpression, NotificationChain msgs) {
        ExpressionNode oldRuleExpression = ruleExpression;
        ruleExpression = newRuleExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    InformationsetPackage.RULE__RULE_EXPRESSION, oldRuleExpression, newRuleExpression);
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
    public void setRuleExpression(ExpressionNode newRuleExpression) {
        if (newRuleExpression != ruleExpression) {
            NotificationChain msgs = null;
            if (ruleExpression != null)
                msgs = ((InternalEObject) ruleExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - InformationsetPackage.RULE__RULE_EXPRESSION, null, msgs);
            if (newRuleExpression != null)
                msgs = ((InternalEObject) newRuleExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - InformationsetPackage.RULE__RULE_EXPRESSION, null, msgs);
            msgs = basicSetRuleExpression(newRuleExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.RULE__RULE_EXPRESSION, newRuleExpression,
                    newRuleExpression));
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
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.RULE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InformationSet getInformationSet() {
        if (informationSet != null && informationSet.eIsProxy()) {
            InternalEObject oldInformationSet = (InternalEObject) informationSet;
            informationSet = (InformationSet) eResolveProxy(oldInformationSet);
            if (informationSet != oldInformationSet) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationsetPackage.RULE__INFORMATION_SET,
                            oldInformationSet, informationSet));
            }
        }
        return informationSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InformationSet basicGetInformationSet() {
        return informationSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInformationSet(InformationSet newInformationSet, NotificationChain msgs) {
        InformationSet oldInformationSet = informationSet;
        informationSet = newInformationSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    InformationsetPackage.RULE__INFORMATION_SET, oldInformationSet, newInformationSet);
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
    public void setInformationSet(InformationSet newInformationSet) {
        if (newInformationSet != informationSet) {
            NotificationChain msgs = null;
            if (informationSet != null)
                msgs = ((InternalEObject) informationSet).eInverseRemove(this, InformationsetPackage.INFORMATION_SET__RULE,
                        InformationSet.class, msgs);
            if (newInformationSet != null)
                msgs = ((InternalEObject) newInformationSet).eInverseAdd(this, InformationsetPackage.INFORMATION_SET__RULE,
                        InformationSet.class, msgs);
            msgs = basicSetInformationSet(newInformationSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.RULE__INFORMATION_SET, newInformationSet,
                    newInformationSet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment getSegment() {
        if (segment != null && segment.eIsProxy()) {
            InternalEObject oldSegment = (InternalEObject) segment;
            segment = (Segment) eResolveProxy(oldSegment);
            if (segment != oldSegment) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationsetPackage.RULE__SEGMENT, oldSegment,
                            segment));
            }
        }
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment basicGetSegment() {
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSegment(Segment newSegment, NotificationChain msgs) {
        Segment oldSegment = segment;
        segment = newSegment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationsetPackage.RULE__SEGMENT,
                    oldSegment, newSegment);
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
    public void setSegment(Segment newSegment) {
        if (newSegment != segment) {
            NotificationChain msgs = null;
            if (segment != null)
                msgs = ((InternalEObject) segment).eInverseRemove(this, InformationsetPackage.SEGMENT__RULE, Segment.class, msgs);
            if (newSegment != null)
                msgs = ((InternalEObject) newSegment).eInverseAdd(this, InformationsetPackage.SEGMENT__RULE, Segment.class, msgs);
            msgs = basicSetSegment(newSegment, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.RULE__SEGMENT, newSegment, newSegment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentRegion getSegmentRegion() {
        if (segmentRegion != null && segmentRegion.eIsProxy()) {
            InternalEObject oldSegmentRegion = (InternalEObject) segmentRegion;
            segmentRegion = (SegmentRegion) eResolveProxy(oldSegmentRegion);
            if (segmentRegion != oldSegmentRegion) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationsetPackage.RULE__SEGMENT_REGION,
                            oldSegmentRegion, segmentRegion));
            }
        }
        return segmentRegion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SegmentRegion basicGetSegmentRegion() {
        return segmentRegion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSegmentRegion(SegmentRegion newSegmentRegion, NotificationChain msgs) {
        SegmentRegion oldSegmentRegion = segmentRegion;
        segmentRegion = newSegmentRegion;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    InformationsetPackage.RULE__SEGMENT_REGION, oldSegmentRegion, newSegmentRegion);
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
    public void setSegmentRegion(SegmentRegion newSegmentRegion) {
        if (newSegmentRegion != segmentRegion) {
            NotificationChain msgs = null;
            if (segmentRegion != null)
                msgs = ((InternalEObject) segmentRegion).eInverseRemove(this, InformationsetPackage.SEGMENT_REGION__RULE,
                        SegmentRegion.class, msgs);
            if (newSegmentRegion != null)
                msgs = ((InternalEObject) newSegmentRegion).eInverseAdd(this, InformationsetPackage.SEGMENT_REGION__RULE,
                        SegmentRegion.class, msgs);
            msgs = basicSetSegmentRegion(newSegmentRegion, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.RULE__SEGMENT_REGION, newSegmentRegion,
                    newSegmentRegion));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationsetPackage.RULE__INFORMATION_SET:
            if (informationSet != null)
                msgs = ((InternalEObject) informationSet).eInverseRemove(this, InformationsetPackage.INFORMATION_SET__RULE,
                        InformationSet.class, msgs);
            return basicSetInformationSet((InformationSet) otherEnd, msgs);
        case InformationsetPackage.RULE__SEGMENT:
            if (segment != null)
                msgs = ((InternalEObject) segment).eInverseRemove(this, InformationsetPackage.SEGMENT__RULE, Segment.class, msgs);
            return basicSetSegment((Segment) otherEnd, msgs);
        case InformationsetPackage.RULE__SEGMENT_REGION:
            if (segmentRegion != null)
                msgs = ((InternalEObject) segmentRegion).eInverseRemove(this, InformationsetPackage.SEGMENT_REGION__RULE,
                        SegmentRegion.class, msgs);
            return basicSetSegmentRegion((SegmentRegion) otherEnd, msgs);
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
        case InformationsetPackage.RULE__RULE_EXPRESSION:
            return basicSetRuleExpression(null, msgs);
        case InformationsetPackage.RULE__INFORMATION_SET:
            return basicSetInformationSet(null, msgs);
        case InformationsetPackage.RULE__SEGMENT:
            return basicSetSegment(null, msgs);
        case InformationsetPackage.RULE__SEGMENT_REGION:
            return basicSetSegmentRegion(null, msgs);
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
        case InformationsetPackage.RULE__RULE_EXPRESSION:
            return getRuleExpression();
        case InformationsetPackage.RULE__TYPE:
            return getType();
        case InformationsetPackage.RULE__INFORMATION_SET:
            if (resolve)
                return getInformationSet();
            return basicGetInformationSet();
        case InformationsetPackage.RULE__SEGMENT:
            if (resolve)
                return getSegment();
            return basicGetSegment();
        case InformationsetPackage.RULE__SEGMENT_REGION:
            if (resolve)
                return getSegmentRegion();
            return basicGetSegmentRegion();
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
        case InformationsetPackage.RULE__RULE_EXPRESSION:
            setRuleExpression((ExpressionNode) newValue);
            return;
        case InformationsetPackage.RULE__TYPE:
            setType((String) newValue);
            return;
        case InformationsetPackage.RULE__INFORMATION_SET:
            setInformationSet((InformationSet) newValue);
            return;
        case InformationsetPackage.RULE__SEGMENT:
            setSegment((Segment) newValue);
            return;
        case InformationsetPackage.RULE__SEGMENT_REGION:
            setSegmentRegion((SegmentRegion) newValue);
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
        case InformationsetPackage.RULE__RULE_EXPRESSION:
            setRuleExpression((ExpressionNode) null);
            return;
        case InformationsetPackage.RULE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case InformationsetPackage.RULE__INFORMATION_SET:
            setInformationSet((InformationSet) null);
            return;
        case InformationsetPackage.RULE__SEGMENT:
            setSegment((Segment) null);
            return;
        case InformationsetPackage.RULE__SEGMENT_REGION:
            setSegmentRegion((SegmentRegion) null);
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
        case InformationsetPackage.RULE__RULE_EXPRESSION:
            return ruleExpression != null;
        case InformationsetPackage.RULE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case InformationsetPackage.RULE__INFORMATION_SET:
            return informationSet != null;
        case InformationsetPackage.RULE__SEGMENT:
            return segment != null;
        case InformationsetPackage.RULE__SEGMENT_REGION:
            return segmentRegion != null;
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

} // RuleImpl
