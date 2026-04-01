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
import orgomg.cwm.foundation.keysindexes.impl.KeyRelationshipImpl;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.foundation.er.ForeignKey;
import orgomg.cwmx.foundation.er.RelationshipEnd;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Foreign Key</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.foundation.er.impl.ForeignKeyImpl#getRelationshipEnd <em>Relationship End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends KeyRelationshipImpl implements ForeignKey {

    /**
     * The cached value of the '{@link #getRelationshipEnd() <em>Relationship End</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRelationshipEnd()
     * @generated
     * @ordered
     */
    protected RelationshipEnd relationshipEnd;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ForeignKeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErPackage.Literals.FOREIGN_KEY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RelationshipEnd getRelationshipEnd() {
        if (relationshipEnd != null && relationshipEnd.eIsProxy()) {
            InternalEObject oldRelationshipEnd = (InternalEObject) relationshipEnd;
            relationshipEnd = (RelationshipEnd) eResolveProxy(oldRelationshipEnd);
            if (relationshipEnd != oldRelationshipEnd) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErPackage.FOREIGN_KEY__RELATIONSHIP_END,
                            oldRelationshipEnd, relationshipEnd));
            }
        }
        return relationshipEnd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RelationshipEnd basicGetRelationshipEnd() {
        return relationshipEnd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRelationshipEnd(RelationshipEnd newRelationshipEnd, NotificationChain msgs) {
        RelationshipEnd oldRelationshipEnd = relationshipEnd;
        relationshipEnd = newRelationshipEnd;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ErPackage.FOREIGN_KEY__RELATIONSHIP_END, oldRelationshipEnd, newRelationshipEnd);
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
    public void setRelationshipEnd(RelationshipEnd newRelationshipEnd) {
        if (newRelationshipEnd != relationshipEnd) {
            NotificationChain msgs = null;
            if (relationshipEnd != null)
                msgs = ((InternalEObject) relationshipEnd).eInverseRemove(this, ErPackage.RELATIONSHIP_END__FOREIGN_KEY,
                        RelationshipEnd.class, msgs);
            if (newRelationshipEnd != null)
                msgs = ((InternalEObject) newRelationshipEnd).eInverseAdd(this, ErPackage.RELATIONSHIP_END__FOREIGN_KEY,
                        RelationshipEnd.class, msgs);
            msgs = basicSetRelationshipEnd(newRelationshipEnd, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ErPackage.FOREIGN_KEY__RELATIONSHIP_END, newRelationshipEnd,
                    newRelationshipEnd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ErPackage.FOREIGN_KEY__RELATIONSHIP_END:
            if (relationshipEnd != null)
                msgs = ((InternalEObject) relationshipEnd).eInverseRemove(this, ErPackage.RELATIONSHIP_END__FOREIGN_KEY,
                        RelationshipEnd.class, msgs);
            return basicSetRelationshipEnd((RelationshipEnd) otherEnd, msgs);
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
        case ErPackage.FOREIGN_KEY__RELATIONSHIP_END:
            return basicSetRelationshipEnd(null, msgs);
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
        case ErPackage.FOREIGN_KEY__RELATIONSHIP_END:
            if (resolve)
                return getRelationshipEnd();
            return basicGetRelationshipEnd();
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
        case ErPackage.FOREIGN_KEY__RELATIONSHIP_END:
            setRelationshipEnd((RelationshipEnd) newValue);
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
        case ErPackage.FOREIGN_KEY__RELATIONSHIP_END:
            setRelationshipEnd((RelationshipEnd) null);
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
        case ErPackage.FOREIGN_KEY__RELATIONSHIP_END:
            return relationshipEnd != null;
        }
        return super.eIsSet(featureID);
    }

} // ForeignKeyImpl
