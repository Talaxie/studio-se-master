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

import org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.IMPORTSType;
import org.talend.designer.core.model.utils.emf.component.TEMPLATESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CODEGENERATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.CODEGENERATIONTypeImpl#getTEMPLATES <em>TEMPLATES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.CODEGENERATIONTypeImpl#getIMPORTS <em>IMPORTS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CODEGENERATIONTypeImpl extends EObjectImpl implements CODEGENERATIONType {
    /**
     * The cached value of the '{@link #getTEMPLATES() <em>TEMPLATES</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTEMPLATES()
     * @generated
     * @ordered
     */
    protected EList tEMPLATES;

    /**
     * The cached value of the '{@link #getIMPORTS() <em>IMPORTS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIMPORTS()
     * @generated
     * @ordered
     */
    protected IMPORTSType iMPORTS;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CODEGENERATIONTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.CODEGENERATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getTEMPLATES() {
        if (tEMPLATES == null) {
            tEMPLATES = new EObjectContainmentEList(TEMPLATESType.class, this, ComponentPackage.CODEGENERATION_TYPE__TEMPLATES);
        }
        return tEMPLATES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IMPORTSType getIMPORTS() {
        return iMPORTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIMPORTS(IMPORTSType newIMPORTS, NotificationChain msgs) {
        IMPORTSType oldIMPORTS = iMPORTS;
        iMPORTS = newIMPORTS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.CODEGENERATION_TYPE__IMPORTS, oldIMPORTS, newIMPORTS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIMPORTS(IMPORTSType newIMPORTS) {
        if (newIMPORTS != iMPORTS) {
            NotificationChain msgs = null;
            if (iMPORTS != null)
                msgs = ((InternalEObject)iMPORTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.CODEGENERATION_TYPE__IMPORTS, null, msgs);
            if (newIMPORTS != null)
                msgs = ((InternalEObject)newIMPORTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.CODEGENERATION_TYPE__IMPORTS, null, msgs);
            msgs = basicSetIMPORTS(newIMPORTS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CODEGENERATION_TYPE__IMPORTS, newIMPORTS, newIMPORTS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.CODEGENERATION_TYPE__TEMPLATES:
                return ((InternalEList)getTEMPLATES()).basicRemove(otherEnd, msgs);
            case ComponentPackage.CODEGENERATION_TYPE__IMPORTS:
                return basicSetIMPORTS(null, msgs);
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
            case ComponentPackage.CODEGENERATION_TYPE__TEMPLATES:
                return getTEMPLATES();
            case ComponentPackage.CODEGENERATION_TYPE__IMPORTS:
                return getIMPORTS();
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
            case ComponentPackage.CODEGENERATION_TYPE__TEMPLATES:
                getTEMPLATES().clear();
                getTEMPLATES().addAll((Collection)newValue);
                return;
            case ComponentPackage.CODEGENERATION_TYPE__IMPORTS:
                setIMPORTS((IMPORTSType)newValue);
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
            case ComponentPackage.CODEGENERATION_TYPE__TEMPLATES:
                getTEMPLATES().clear();
                return;
            case ComponentPackage.CODEGENERATION_TYPE__IMPORTS:
                setIMPORTS((IMPORTSType)null);
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
            case ComponentPackage.CODEGENERATION_TYPE__TEMPLATES:
                return tEMPLATES != null && !tEMPLATES.isEmpty();
            case ComponentPackage.CODEGENERATION_TYPE__IMPORTS:
                return iMPORTS != null;
        }
        return super.eIsSet(featureID);
    }

} //CODEGENERATIONTypeImpl
