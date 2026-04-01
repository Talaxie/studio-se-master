/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.business.model.business.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.talend.designer.business.model.business.BaseBusinessItemRelationship;
import org.talend.designer.business.model.business.BusinessItemShape;
import org.talend.designer.business.model.business.BusinessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Business Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.business.model.business.impl.BaseBusinessItemRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.talend.designer.business.model.business.impl.BaseBusinessItemRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseBusinessItemRelationshipImpl extends BusinessItemImpl implements BaseBusinessItemRelationship {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected BusinessItemShape source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected BusinessItemShape target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseBusinessItemRelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return BusinessPackage.Literals.BASE_BUSINESS_ITEM_RELATIONSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemShape getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (BusinessItemShape)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemShape basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(BusinessItemShape newSource, NotificationChain msgs) {
        BusinessItemShape oldSource = source;
        source = newSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(BusinessItemShape newSource) {
        if (newSource != source) {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS, BusinessItemShape.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS, BusinessItemShape.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemShape getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (BusinessItemShape)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemShape basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(BusinessItemShape newTarget, NotificationChain msgs) {
        BusinessItemShape oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(BusinessItemShape newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS, BusinessItemShape.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS, BusinessItemShape.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS, BusinessItemShape.class, msgs);
                return basicSetSource((BusinessItemShape)otherEnd, msgs);
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS, BusinessItemShape.class, msgs);
                return basicSetTarget((BusinessItemShape)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE:
                return basicSetSource(null, msgs);
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET:
                return basicSetTarget(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE:
                setSource((BusinessItemShape)newValue);
                return;
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET:
                setTarget((BusinessItemShape)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE:
                setSource((BusinessItemShape)null);
                return;
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET:
                setTarget((BusinessItemShape)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE:
                return source != null;
            case BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET:
                return target != null;
        }
        return super.eIsSet(featureID);
    }

} //BaseBusinessItemRelationshipImpl