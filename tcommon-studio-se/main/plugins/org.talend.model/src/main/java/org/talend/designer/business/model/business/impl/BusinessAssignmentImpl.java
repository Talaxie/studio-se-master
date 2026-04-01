/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.designer.business.model.business.BusinessAssignment;
import org.talend.designer.business.model.business.BusinessItem;
import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.business.model.business.TalendItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Assignment</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl#getBusinessItem <em>Business Item</em>}</li>
 * <li>{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl#getTalendItem <em>Talaxie Item</em>}</li>
 * <li>{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BusinessAssignmentImpl extends EObjectImpl implements BusinessAssignment {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public static final String copyright = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getTalendItem() <em>Talaxie Item</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTalendItem()
     * @generated
     * @ordered
     */
    protected TalendItem talendItem;

    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BusinessAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return BusinessPackage.Literals.BUSINESS_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessItem getBusinessItem() {
        if (eContainerFeatureID() != BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM) return null;
        return (BusinessItem)eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessItem(BusinessItem newBusinessItem, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBusinessItem, BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public void setBusinessItem(BusinessItem newBusinessItem) {
        if (newBusinessItem != eInternalContainer() || (eContainerFeatureID != BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM && newBusinessItem != null)) {
            if (EcoreUtil.isAncestor(this, newBusinessItem))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBusinessItem != null)
                msgs = ((InternalEObject)newBusinessItem).eInverseAdd(this, BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS, BusinessItem.class, msgs);
            msgs = basicSetBusinessItem(newBusinessItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM, newBusinessItem, newBusinessItem));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TalendItem getTalendItem() {
        if (talendItem != null && talendItem.eIsProxy()) {
            InternalEObject oldTalendItem = (InternalEObject)talendItem;
            talendItem = (TalendItem)eResolveProxy(oldTalendItem);
            if (talendItem != oldTalendItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM, oldTalendItem, talendItem));
            }
        }
        return talendItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TalendItem basicGetTalendItem() {
        return talendItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTalendItem(TalendItem newTalendItem, NotificationChain msgs) {
        TalendItem oldTalendItem = talendItem;
        talendItem = newTalendItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM, oldTalendItem, newTalendItem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTalendItem(TalendItem newTalendItem) {
        if (newTalendItem != talendItem) {
            NotificationChain msgs = null;
            if (talendItem != null)
                msgs = ((InternalEObject)talendItem).eInverseRemove(this, BusinessPackage.TALEND_ITEM__ASSIGNMENTS, TalendItem.class, msgs);
            if (newTalendItem != null)
                msgs = ((InternalEObject)newTalendItem).eInverseAdd(this, BusinessPackage.TALEND_ITEM__ASSIGNMENTS, TalendItem.class, msgs);
            msgs = basicSetTalendItem(newTalendItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM, newTalendItem, newTalendItem));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setComment(String newComment) {
        String oldComment = comment;
        comment = newComment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS_ASSIGNMENT__COMMENT, oldComment, comment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBusinessItem((BusinessItem)otherEnd, msgs);
            case BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM:
                if (talendItem != null)
                    msgs = ((InternalEObject)talendItem).eInverseRemove(this, BusinessPackage.TALEND_ITEM__ASSIGNMENTS, TalendItem.class, msgs);
                return basicSetTalendItem((TalendItem)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                return basicSetBusinessItem(null, msgs);
            case BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM:
                return basicSetTalendItem(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                return eInternalContainer().eInverseRemove(this, BusinessPackage.BUSINESS_ITEM__ASSIGNMENTS, BusinessItem.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                return getBusinessItem();
            case BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM:
                if (resolve) return getTalendItem();
                return basicGetTalendItem();
            case BusinessPackage.BUSINESS_ASSIGNMENT__COMMENT:
                return getComment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                setBusinessItem((BusinessItem)newValue);
                return;
            case BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM:
                setTalendItem((TalendItem)newValue);
                return;
            case BusinessPackage.BUSINESS_ASSIGNMENT__COMMENT:
                setComment((String)newValue);
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
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                setBusinessItem((BusinessItem)null);
                return;
            case BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM:
                setTalendItem((TalendItem)null);
                return;
            case BusinessPackage.BUSINESS_ASSIGNMENT__COMMENT:
                setComment(COMMENT_EDEFAULT);
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
            case BusinessPackage.BUSINESS_ASSIGNMENT__BUSINESS_ITEM:
                return getBusinessItem() != null;
            case BusinessPackage.BUSINESS_ASSIGNMENT__TALEND_ITEM:
                return talendItem != null;
            case BusinessPackage.BUSINESS_ASSIGNMENT__COMMENT:
                return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated NOT
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (comment: "); //$NON-NLS-1$
        result.append(comment);
        result.append(')');
        return result.toString();
    }

} // BusinessAssignmentImpl
