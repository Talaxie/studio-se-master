/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.business.model.business.BaseBusinessItemRelationship;
import org.talend.designer.business.model.business.BusinessItemRelationship;
import org.talend.designer.business.model.business.BusinessItemShape;
import org.talend.designer.business.model.business.BusinessPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item Shape</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.designer.business.model.business.impl.BusinessItemShapeImpl#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 * <li>{@link org.talend.designer.business.model.business.impl.BusinessItemShapeImpl#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BusinessItemShapeImpl extends BusinessItemImpl implements BusinessItemShape {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getIncomingRelationships() <em>Incoming Relationships</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIncomingRelationships()
     * @generated
     * @ordered
     */
    protected EList incomingRelationships;

    /**
     * The cached value of the '{@link #getOutgoingRelationships() <em>Outgoing Relationships</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOutgoingRelationships()
     * @generated
     * @ordered
     */
    protected EList outgoingRelationships;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BusinessItemShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return BusinessPackage.Literals.BUSINESS_ITEM_SHAPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getIncomingRelationships() {
        if (incomingRelationships == null) {
            incomingRelationships = new EObjectWithInverseResolvingEList(BaseBusinessItemRelationship.class, this, BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__TARGET);
        }
        return incomingRelationships;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList getOutgoingRelationships() {
        if (outgoingRelationships == null) {
            outgoingRelationships = new EObjectWithInverseResolvingEList(BaseBusinessItemRelationship.class, this, BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS, BusinessPackage.BASE_BUSINESS_ITEM_RELATIONSHIP__SOURCE);
        }
        return outgoingRelationships;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS:
                return ((InternalEList)getIncomingRelationships()).basicAdd(otherEnd, msgs);
            case BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS:
                return ((InternalEList)getOutgoingRelationships()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS:
                return ((InternalEList)getIncomingRelationships()).basicRemove(otherEnd, msgs);
            case BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS:
                return ((InternalEList)getOutgoingRelationships()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS:
                return getIncomingRelationships();
            case BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS:
                return getOutgoingRelationships();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS:
                getIncomingRelationships().clear();
                getIncomingRelationships().addAll((Collection)newValue);
                return;
            case BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS:
                getOutgoingRelationships().clear();
                getOutgoingRelationships().addAll((Collection)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS:
                getIncomingRelationships().clear();
                return;
            case BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS:
                getOutgoingRelationships().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS:
                return incomingRelationships != null && !incomingRelationships.isEmpty();
            case BusinessPackage.BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS:
                return outgoingRelationships != null && !outgoingRelationships.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // BusinessItemShapeImpl
