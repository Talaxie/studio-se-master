/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.resource.record.impl.FieldImpl;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.RemapItem;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Remap Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#getOccurs <em>Occurs</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#isIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#isIsGivingException <em>Is Giving Exception</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl#getVirtualExpression <em>Virtual Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemapItemImpl extends FieldImpl implements RemapItem {

    /**
     * The default value of the '{@link #getOccurs() <em>Occurs</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccurs()
     * @generated
     * @ordered
     */
    protected static final long OCCURS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getOccurs() <em>Occurs</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccurs()
     * @generated
     * @ordered
     */
    protected long occurs = OCCURS_EDEFAULT;

    /**
     * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsRequired()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsRequired()
     * @generated
     * @ordered
     */
    protected boolean isRequired = IS_REQUIRED_EDEFAULT;

    /**
     * The default value of the '{@link #isIsHidden() <em>Is Hidden</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsHidden()
     * @generated
     * @ordered
     */
    protected static final boolean IS_HIDDEN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsHidden() <em>Is Hidden</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsHidden()
     * @generated
     * @ordered
     */
    protected boolean isHidden = IS_HIDDEN_EDEFAULT;

    /**
     * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsReadOnly()
     * @generated
     * @ordered
     */
    protected static final boolean IS_READ_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsReadOnly()
     * @generated
     * @ordered
     */
    protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGivingException() <em>Is Giving Exception</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGivingException()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GIVING_EXCEPTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGivingException() <em>Is Giving Exception</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGivingException()
     * @generated
     * @ordered
     */
    protected boolean isGivingException = IS_GIVING_EXCEPTION_EDEFAULT;

    /**
     * The default value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsVirtual()
     * @generated
     * @ordered
     */
    protected static final boolean IS_VIRTUAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsVirtual()
     * @generated
     * @ordered
     */
    protected boolean isVirtual = IS_VIRTUAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getVirtualExpression() <em>Virtual Expression</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getVirtualExpression()
     * @generated
     * @ordered
     */
    protected ExpressionNode virtualExpression;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RemapItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.REMAP_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getOccurs() {
        return occurs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOccurs(long newOccurs) {
        long oldOccurs = occurs;
        occurs = newOccurs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__OCCURS, oldOccurs, occurs));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsRequired(boolean newIsRequired) {
        boolean oldIsRequired = isRequired;
        isRequired = newIsRequired;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__IS_REQUIRED, oldIsRequired, isRequired));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsHidden(boolean newIsHidden) {
        boolean oldIsHidden = isHidden;
        isHidden = newIsHidden;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__IS_HIDDEN, oldIsHidden, isHidden));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsReadOnly(boolean newIsReadOnly) {
        boolean oldIsReadOnly = isReadOnly;
        isReadOnly = newIsReadOnly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__IS_READ_ONLY, oldIsReadOnly,
                    isReadOnly));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGivingException() {
        return isGivingException;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGivingException(boolean newIsGivingException) {
        boolean oldIsGivingException = isGivingException;
        isGivingException = newIsGivingException;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__IS_GIVING_EXCEPTION,
                    oldIsGivingException, isGivingException));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsVirtual(boolean newIsVirtual) {
        boolean oldIsVirtual = isVirtual;
        isVirtual = newIsVirtual;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__IS_VIRTUAL, oldIsVirtual, isVirtual));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getVirtualExpression() {
        return virtualExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVirtualExpression(ExpressionNode newVirtualExpression, NotificationChain msgs) {
        ExpressionNode oldVirtualExpression = virtualExpression;
        virtualExpression = newVirtualExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION, oldVirtualExpression, newVirtualExpression);
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
    public void setVirtualExpression(ExpressionNode newVirtualExpression) {
        if (newVirtualExpression != virtualExpression) {
            NotificationChain msgs = null;
            if (virtualExpression != null)
                msgs = ((InternalEObject) virtualExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION, null, msgs);
            if (newVirtualExpression != null)
                msgs = ((InternalEObject) newVirtualExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION, null, msgs);
            msgs = basicSetVirtualExpression(newVirtualExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION,
                    newVirtualExpression, newVirtualExpression));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION:
            return basicSetVirtualExpression(null, msgs);
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
        case DmsiiPackage.REMAP_ITEM__OCCURS:
            return getOccurs();
        case DmsiiPackage.REMAP_ITEM__IS_REQUIRED:
            return isIsRequired();
        case DmsiiPackage.REMAP_ITEM__IS_HIDDEN:
            return isIsHidden();
        case DmsiiPackage.REMAP_ITEM__IS_READ_ONLY:
            return isIsReadOnly();
        case DmsiiPackage.REMAP_ITEM__IS_GIVING_EXCEPTION:
            return isIsGivingException();
        case DmsiiPackage.REMAP_ITEM__IS_VIRTUAL:
            return isIsVirtual();
        case DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION:
            return getVirtualExpression();
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
        case DmsiiPackage.REMAP_ITEM__OCCURS:
            setOccurs((Long) newValue);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_REQUIRED:
            setIsRequired((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_HIDDEN:
            setIsHidden((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_READ_ONLY:
            setIsReadOnly((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_GIVING_EXCEPTION:
            setIsGivingException((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_VIRTUAL:
            setIsVirtual((Boolean) newValue);
            return;
        case DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION:
            setVirtualExpression((ExpressionNode) newValue);
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
        case DmsiiPackage.REMAP_ITEM__OCCURS:
            setOccurs(OCCURS_EDEFAULT);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_REQUIRED:
            setIsRequired(IS_REQUIRED_EDEFAULT);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_HIDDEN:
            setIsHidden(IS_HIDDEN_EDEFAULT);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_READ_ONLY:
            setIsReadOnly(IS_READ_ONLY_EDEFAULT);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_GIVING_EXCEPTION:
            setIsGivingException(IS_GIVING_EXCEPTION_EDEFAULT);
            return;
        case DmsiiPackage.REMAP_ITEM__IS_VIRTUAL:
            setIsVirtual(IS_VIRTUAL_EDEFAULT);
            return;
        case DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION:
            setVirtualExpression((ExpressionNode) null);
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
        case DmsiiPackage.REMAP_ITEM__OCCURS:
            return occurs != OCCURS_EDEFAULT;
        case DmsiiPackage.REMAP_ITEM__IS_REQUIRED:
            return isRequired != IS_REQUIRED_EDEFAULT;
        case DmsiiPackage.REMAP_ITEM__IS_HIDDEN:
            return isHidden != IS_HIDDEN_EDEFAULT;
        case DmsiiPackage.REMAP_ITEM__IS_READ_ONLY:
            return isReadOnly != IS_READ_ONLY_EDEFAULT;
        case DmsiiPackage.REMAP_ITEM__IS_GIVING_EXCEPTION:
            return isGivingException != IS_GIVING_EXCEPTION_EDEFAULT;
        case DmsiiPackage.REMAP_ITEM__IS_VIRTUAL:
            return isVirtual != IS_VIRTUAL_EDEFAULT;
        case DmsiiPackage.REMAP_ITEM__VIRTUAL_EXPRESSION:
            return virtualExpression != null;
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
        result.append(" (occurs: ");
        result.append(occurs);
        result.append(", isRequired: ");
        result.append(isRequired);
        result.append(", isHidden: ");
        result.append(isHidden);
        result.append(", isReadOnly: ");
        result.append(isReadOnly);
        result.append(", isGivingException: ");
        result.append(isGivingException);
        result.append(", isVirtual: ");
        result.append(isVirtual);
        result.append(')');
        return result.toString();
    }

} // RemapItemImpl
