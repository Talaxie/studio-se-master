/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.relationships.impl.AssociationEndImpl;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.foundation.er.ForeignKey;
import orgomg.cwmx.foundation.er.RelationshipEnd;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Relationship End</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.RelationshipEndImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.RelationshipEndImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.RelationshipEndImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.RelationshipEndImpl#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipEndImpl extends AssociationEndImpl implements RelationshipEnd {

    /**
     * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDelete()
     * @generated
     * @ordered
     */
    protected ExpressionNode delete;

    /**
     * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getUpdate()
     * @generated
     * @ordered
     */
    protected ExpressionNode update;

    /**
     * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInsert()
     * @generated
     * @ordered
     */
    protected ExpressionNode insert;

    /**
     * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getForeignKey()
     * @generated
     * @ordered
     */
    protected ForeignKey foreignKey;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErPackage.Literals.RELATIONSHIP_END;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getDelete() {
        return delete;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDelete(ExpressionNode newDelete, NotificationChain msgs) {
        ExpressionNode oldDelete = delete;
        delete = newDelete;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__DELETE,
                    oldDelete, newDelete);
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
    public void setDelete(ExpressionNode newDelete) {
        if (newDelete != delete) {
            NotificationChain msgs = null;
            if (delete != null)
                msgs = ((InternalEObject) delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.RELATIONSHIP_END__DELETE, null, msgs);
            if (newDelete != null)
                msgs = ((InternalEObject) newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.RELATIONSHIP_END__DELETE, null, msgs);
            msgs = basicSetDelete(newDelete, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__DELETE, newDelete, newDelete));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getUpdate() {
        return update;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpdate(ExpressionNode newUpdate, NotificationChain msgs) {
        ExpressionNode oldUpdate = update;
        update = newUpdate;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__UPDATE,
                    oldUpdate, newUpdate);
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
    public void setUpdate(ExpressionNode newUpdate) {
        if (newUpdate != update) {
            NotificationChain msgs = null;
            if (update != null)
                msgs = ((InternalEObject) update).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.RELATIONSHIP_END__UPDATE, null, msgs);
            if (newUpdate != null)
                msgs = ((InternalEObject) newUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.RELATIONSHIP_END__UPDATE, null, msgs);
            msgs = basicSetUpdate(newUpdate, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__UPDATE, newUpdate, newUpdate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getInsert() {
        return insert;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInsert(ExpressionNode newInsert, NotificationChain msgs) {
        ExpressionNode oldInsert = insert;
        insert = newInsert;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__INSERT,
                    oldInsert, newInsert);
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
    public void setInsert(ExpressionNode newInsert) {
        if (newInsert != insert) {
            NotificationChain msgs = null;
            if (insert != null)
                msgs = ((InternalEObject) insert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.RELATIONSHIP_END__INSERT, null, msgs);
            if (newInsert != null)
                msgs = ((InternalEObject) newInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ErPackage.RELATIONSHIP_END__INSERT, null, msgs);
            msgs = basicSetInsert(newInsert, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__INSERT, newInsert, newInsert));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ForeignKey getForeignKey() {
        if (foreignKey != null && foreignKey.eIsProxy()) {
            InternalEObject oldForeignKey = (InternalEObject) foreignKey;
            foreignKey = (ForeignKey) eResolveProxy(oldForeignKey);
            if (foreignKey != oldForeignKey) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.RELATIONSHIP_END__FOREIGN_KEY,
                            oldForeignKey, foreignKey));
            }
        }
        return foreignKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ForeignKey basicGetForeignKey() {
        return foreignKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetForeignKey(ForeignKey newForeignKey, NotificationChain msgs) {
        ForeignKey oldForeignKey = foreignKey;
        foreignKey = newForeignKey;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ErPackage.RELATIONSHIP_END__FOREIGN_KEY, oldForeignKey, newForeignKey);
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
    public void setForeignKey(ForeignKey newForeignKey) {
        if (newForeignKey != foreignKey) {
            NotificationChain msgs = null;
            if (foreignKey != null)
                msgs = ((InternalEObject) foreignKey).eInverseRemove(this, ErPackage.FOREIGN_KEY__RELATIONSHIP_END,
                        ForeignKey.class, msgs);
            if (newForeignKey != null)
                msgs = ((InternalEObject) newForeignKey).eInverseAdd(this, ErPackage.FOREIGN_KEY__RELATIONSHIP_END,
                        ForeignKey.class, msgs);
            msgs = basicSetForeignKey(newForeignKey, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.RELATIONSHIP_END__FOREIGN_KEY, newForeignKey,
                    newForeignKey));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ErPackage.RELATIONSHIP_END__FOREIGN_KEY:
            if (foreignKey != null)
                msgs = ((InternalEObject) foreignKey).eInverseRemove(this, ErPackage.FOREIGN_KEY__RELATIONSHIP_END,
                        ForeignKey.class, msgs);
            return basicSetForeignKey((ForeignKey) otherEnd, msgs);
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
        case ErPackage.RELATIONSHIP_END__DELETE:
            return basicSetDelete(null, msgs);
        case ErPackage.RELATIONSHIP_END__UPDATE:
            return basicSetUpdate(null, msgs);
        case ErPackage.RELATIONSHIP_END__INSERT:
            return basicSetInsert(null, msgs);
        case ErPackage.RELATIONSHIP_END__FOREIGN_KEY:
            return basicSetForeignKey(null, msgs);
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
        case ErPackage.RELATIONSHIP_END__DELETE:
            return getDelete();
        case ErPackage.RELATIONSHIP_END__UPDATE:
            return getUpdate();
        case ErPackage.RELATIONSHIP_END__INSERT:
            return getInsert();
        case ErPackage.RELATIONSHIP_END__FOREIGN_KEY:
            if (resolve)
                return getForeignKey();
            return basicGetForeignKey();
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
        case ErPackage.RELATIONSHIP_END__DELETE:
            setDelete((ExpressionNode) newValue);
            return;
        case ErPackage.RELATIONSHIP_END__UPDATE:
            setUpdate((ExpressionNode) newValue);
            return;
        case ErPackage.RELATIONSHIP_END__INSERT:
            setInsert((ExpressionNode) newValue);
            return;
        case ErPackage.RELATIONSHIP_END__FOREIGN_KEY:
            setForeignKey((ForeignKey) newValue);
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
        case ErPackage.RELATIONSHIP_END__DELETE:
            setDelete((ExpressionNode) null);
            return;
        case ErPackage.RELATIONSHIP_END__UPDATE:
            setUpdate((ExpressionNode) null);
            return;
        case ErPackage.RELATIONSHIP_END__INSERT:
            setInsert((ExpressionNode) null);
            return;
        case ErPackage.RELATIONSHIP_END__FOREIGN_KEY:
            setForeignKey((ForeignKey) null);
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
        case ErPackage.RELATIONSHIP_END__DELETE:
            return delete != null;
        case ErPackage.RELATIONSHIP_END__UPDATE:
            return update != null;
        case ErPackage.RELATIONSHIP_END__INSERT:
            return insert != null;
        case ErPackage.RELATIONSHIP_END__FOREIGN_KEY:
            return foreignKey != null;
        }
        return super.eIsSet(featureID);
    }

} // RelationshipEndImpl
