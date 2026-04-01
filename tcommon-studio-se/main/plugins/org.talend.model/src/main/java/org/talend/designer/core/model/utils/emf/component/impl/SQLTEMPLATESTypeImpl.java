/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType;
import org.talend.designer.core.model.utils.emf.component.SQLTEMPLATEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQLTEMPLATES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.SQLTEMPLATESTypeImpl#getSQLTEMPLATE <em>SQLTEMPLATE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.SQLTEMPLATESTypeImpl#getDB <em>DB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLTEMPLATESTypeImpl extends EObjectImpl implements SQLTEMPLATESType {
    /**
     * The cached value of the '{@link #getSQLTEMPLATE() <em>SQLTEMPLATE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSQLTEMPLATE()
     * @generated
     * @ordered
     */
    protected EList sQLTEMPLATE;

    /**
     * The default value of the '{@link #getDB() <em>DB</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDB()
     * @generated
     * @ordered
     */
    protected static final String DB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDB() <em>DB</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDB()
     * @generated
     * @ordered
     */
    protected String dB = DB_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SQLTEMPLATESTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.SQLTEMPLATES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getSQLTEMPLATE() {
        if (sQLTEMPLATE == null) {
            sQLTEMPLATE = new EObjectContainmentEList(SQLTEMPLATEType.class, this, ComponentPackage.SQLTEMPLATES_TYPE__SQLTEMPLATE);
        }
        return sQLTEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDB() {
        return dB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDB(String newDB) {
        String oldDB = dB;
        dB = newDB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.SQLTEMPLATES_TYPE__DB, oldDB, dB));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.SQLTEMPLATES_TYPE__SQLTEMPLATE:
                return ((InternalEList)getSQLTEMPLATE()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.SQLTEMPLATES_TYPE__SQLTEMPLATE:
                return getSQLTEMPLATE();
            case ComponentPackage.SQLTEMPLATES_TYPE__DB:
                return getDB();
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
            case ComponentPackage.SQLTEMPLATES_TYPE__SQLTEMPLATE:
                getSQLTEMPLATE().clear();
                getSQLTEMPLATE().addAll((Collection)newValue);
                return;
            case ComponentPackage.SQLTEMPLATES_TYPE__DB:
                setDB((String)newValue);
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
            case ComponentPackage.SQLTEMPLATES_TYPE__SQLTEMPLATE:
                getSQLTEMPLATE().clear();
                return;
            case ComponentPackage.SQLTEMPLATES_TYPE__DB:
                setDB(DB_EDEFAULT);
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
            case ComponentPackage.SQLTEMPLATES_TYPE__SQLTEMPLATE:
                return sQLTEMPLATE != null && !sQLTEMPLATE.isEmpty();
            case ComponentPackage.SQLTEMPLATES_TYPE__DB:
                return DB_EDEFAULT == null ? dB != null : !DB_EDEFAULT.equals(dB);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (dB: ");
        result.append(dB);
        result.append(')');
        return result.toString();
    }

} //SQLTEMPLATESTypeImpl
