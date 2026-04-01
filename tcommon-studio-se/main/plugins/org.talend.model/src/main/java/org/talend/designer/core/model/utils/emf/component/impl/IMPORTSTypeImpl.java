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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.IMPORTSType;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMPORTS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl#getIMPORT <em>IMPORT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl#getIMPORTS <em>IMPORTS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTSTypeImpl#getREQUIREDIF <em>REQUIREDIF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IMPORTSTypeImpl extends EObjectImpl implements IMPORTSType {
    /**
     * The cached value of the '{@link #getIMPORT() <em>IMPORT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIMPORT()
     * @generated
     * @ordered
     */
    protected EList iMPORT;

    /**
     * The cached value of the '{@link #getIMPORTS() <em>IMPORTS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIMPORTS()
     * @generated
     * @ordered
     */
    protected EList iMPORTS;

    /**
     * The default value of the '{@link #getREQUIREDIF() <em>REQUIREDIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREQUIREDIF()
     * @generated
     * @ordered
     */
    protected static final String REQUIREDIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREQUIREDIF() <em>REQUIREDIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREQUIREDIF()
     * @generated
     * @ordered
     */
    protected String rEQUIREDIF = REQUIREDIF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IMPORTSTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.IMPORTS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREQUIREDIF() {
        return rEQUIREDIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREQUIREDIF(String newREQUIREDIF) {
        String oldREQUIREDIF = rEQUIREDIF;
        rEQUIREDIF = newREQUIREDIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORTS_TYPE__REQUIREDIF, oldREQUIREDIF, rEQUIREDIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getIMPORT() {
        if (iMPORT == null) {
            iMPORT = new EObjectContainmentEList(IMPORTType.class, this, ComponentPackage.IMPORTS_TYPE__IMPORT);
        }
        return iMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getIMPORTS() {
        if (iMPORTS == null) {
            iMPORTS = new EObjectContainmentEList(IMPORTSType.class, this, ComponentPackage.IMPORTS_TYPE__IMPORTS);
        }
        return iMPORTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.IMPORTS_TYPE__IMPORT:
                return ((InternalEList)getIMPORT()).basicRemove(otherEnd, msgs);
            case ComponentPackage.IMPORTS_TYPE__IMPORTS:
                return ((InternalEList)getIMPORTS()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.IMPORTS_TYPE__IMPORT:
                return getIMPORT();
            case ComponentPackage.IMPORTS_TYPE__IMPORTS:
                return getIMPORTS();
            case ComponentPackage.IMPORTS_TYPE__REQUIREDIF:
                return getREQUIREDIF();
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
            case ComponentPackage.IMPORTS_TYPE__IMPORT:
                getIMPORT().clear();
                getIMPORT().addAll((Collection)newValue);
                return;
            case ComponentPackage.IMPORTS_TYPE__IMPORTS:
                getIMPORTS().clear();
                getIMPORTS().addAll((Collection)newValue);
                return;
            case ComponentPackage.IMPORTS_TYPE__REQUIREDIF:
                setREQUIREDIF((String)newValue);
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
            case ComponentPackage.IMPORTS_TYPE__IMPORT:
                getIMPORT().clear();
                return;
            case ComponentPackage.IMPORTS_TYPE__IMPORTS:
                getIMPORTS().clear();
                return;
            case ComponentPackage.IMPORTS_TYPE__REQUIREDIF:
                setREQUIREDIF(REQUIREDIF_EDEFAULT);
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
            case ComponentPackage.IMPORTS_TYPE__IMPORT:
                return iMPORT != null && !iMPORT.isEmpty();
            case ComponentPackage.IMPORTS_TYPE__IMPORTS:
                return iMPORTS != null && !iMPORTS.isEmpty();
            case ComponentPackage.IMPORTS_TYPE__REQUIREDIF:
                return REQUIREDIF_EDEFAULT == null ? rEQUIREDIF != null : !REQUIREDIF_EDEFAULT.equals(rEQUIREDIF);
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
        result.append(" (rEQUIREDIF: ");
        result.append(rEQUIREDIF);
        result.append(')');
        return result.toString();
    }

} //IMPORTSTypeImpl
