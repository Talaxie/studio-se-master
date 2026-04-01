/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.ADVANCEDPARAMETERSType;
import org.talend.designer.core.model.utils.emf.component.CODEGENERATIONType;
import org.talend.designer.core.model.utils.emf.component.COMPONENTType;
import org.talend.designer.core.model.utils.emf.component.CONNECTORSType;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.DOCUMENTATIONType;
import org.talend.designer.core.model.utils.emf.component.FAMILIESType;
import org.talend.designer.core.model.utils.emf.component.HEADERType;
import org.talend.designer.core.model.utils.emf.component.PARAMETERSType;
import org.talend.designer.core.model.utils.emf.component.PLUGINDEPENDENCIESType;
import org.talend.designer.core.model.utils.emf.component.RETURNSType;
import org.talend.designer.core.model.utils.emf.component.SQLTEMPLATESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COMPONENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getFAMILIES <em>FAMILIES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getDOCUMENTATION <em>DOCUMENTATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getCONNECTORS <em>CONNECTORS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getSQLTEMPLATES <em>SQLTEMPLATES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getPARAMETERS <em>PARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getADVANCEDPARAMETERS <em>ADVANCEDPARAMETERS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getCODEGENERATION <em>CODEGENERATION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getRETURNS <em>RETURNS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COMPONENTTypeImpl#getPLUGINDEPENDENCIES <em>PLUGINDEPENDENCIES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COMPONENTTypeImpl extends EObjectImpl implements COMPONENTType {
    /**
     * The cached value of the '{@link #getHEADER() <em>HEADER</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHEADER()
     * @generated
     * @ordered
     */
    protected HEADERType hEADER;

    /**
     * The cached value of the '{@link #getFAMILIES() <em>FAMILIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFAMILIES()
     * @generated
     * @ordered
     */
    protected FAMILIESType fAMILIES;

    /**
     * The cached value of the '{@link #getDOCUMENTATION() <em>DOCUMENTATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDOCUMENTATION()
     * @generated
     * @ordered
     */
    protected DOCUMENTATIONType dOCUMENTATION;

    /**
     * The cached value of the '{@link #getCONNECTORS() <em>CONNECTORS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONNECTORS()
     * @generated
     * @ordered
     */
    protected CONNECTORSType cONNECTORS;

    /**
     * The cached value of the '{@link #getSQLTEMPLATES() <em>SQLTEMPLATES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSQLTEMPLATES()
     * @generated
     * @ordered
     */
    protected SQLTEMPLATESType sQLTEMPLATES;

    /**
     * The cached value of the '{@link #getPARAMETERS() <em>PARAMETERS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPARAMETERS()
     * @generated
     * @ordered
     */
    protected PARAMETERSType pARAMETERS;

    /**
     * The cached value of the '{@link #getADVANCEDPARAMETERS() <em>ADVANCEDPARAMETERS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getADVANCEDPARAMETERS()
     * @generated
     * @ordered
     */
    protected ADVANCEDPARAMETERSType aDVANCEDPARAMETERS;

    /**
     * The cached value of the '{@link #getCODEGENERATION() <em>CODEGENERATION</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCODEGENERATION()
     * @generated
     * @ordered
     */
    protected CODEGENERATIONType cODEGENERATION;

    /**
     * The cached value of the '{@link #getRETURNS() <em>RETURNS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRETURNS()
     * @generated
     * @ordered
     */
    protected RETURNSType rETURNS;

    /**
     * The cached value of the '{@link #getPLUGINDEPENDENCIES() <em>PLUGINDEPENDENCIES</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLUGINDEPENDENCIES()
     * @generated
     * @ordered
     */
    protected PLUGINDEPENDENCIESType pLUGINDEPENDENCIES;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected COMPONENTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.COMPONENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HEADERType getHEADER() {
        return hEADER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHEADER(HEADERType newHEADER, NotificationChain msgs) {
        HEADERType oldHEADER = hEADER;
        hEADER = newHEADER;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__HEADER, oldHEADER, newHEADER);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHEADER(HEADERType newHEADER) {
        if (newHEADER != hEADER) {
            NotificationChain msgs = null;
            if (hEADER != null)
                msgs = ((InternalEObject)hEADER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__HEADER, null, msgs);
            if (newHEADER != null)
                msgs = ((InternalEObject)newHEADER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__HEADER, null, msgs);
            msgs = basicSetHEADER(newHEADER, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__HEADER, newHEADER, newHEADER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAMILIESType getFAMILIES() {
        return fAMILIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFAMILIES(FAMILIESType newFAMILIES, NotificationChain msgs) {
        FAMILIESType oldFAMILIES = fAMILIES;
        fAMILIES = newFAMILIES;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__FAMILIES, oldFAMILIES, newFAMILIES);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFAMILIES(FAMILIESType newFAMILIES) {
        if (newFAMILIES != fAMILIES) {
            NotificationChain msgs = null;
            if (fAMILIES != null)
                msgs = ((InternalEObject)fAMILIES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__FAMILIES, null, msgs);
            if (newFAMILIES != null)
                msgs = ((InternalEObject)newFAMILIES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__FAMILIES, null, msgs);
            msgs = basicSetFAMILIES(newFAMILIES, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__FAMILIES, newFAMILIES, newFAMILIES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DOCUMENTATIONType getDOCUMENTATION() {
        return dOCUMENTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDOCUMENTATION(DOCUMENTATIONType newDOCUMENTATION, NotificationChain msgs) {
        DOCUMENTATIONType oldDOCUMENTATION = dOCUMENTATION;
        dOCUMENTATION = newDOCUMENTATION;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__DOCUMENTATION, oldDOCUMENTATION, newDOCUMENTATION);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDOCUMENTATION(DOCUMENTATIONType newDOCUMENTATION) {
        if (newDOCUMENTATION != dOCUMENTATION) {
            NotificationChain msgs = null;
            if (dOCUMENTATION != null)
                msgs = ((InternalEObject)dOCUMENTATION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__DOCUMENTATION, null, msgs);
            if (newDOCUMENTATION != null)
                msgs = ((InternalEObject)newDOCUMENTATION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__DOCUMENTATION, null, msgs);
            msgs = basicSetDOCUMENTATION(newDOCUMENTATION, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__DOCUMENTATION, newDOCUMENTATION, newDOCUMENTATION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTORSType getCONNECTORS() {
        return cONNECTORS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCONNECTORS(CONNECTORSType newCONNECTORS, NotificationChain msgs) {
        CONNECTORSType oldCONNECTORS = cONNECTORS;
        cONNECTORS = newCONNECTORS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__CONNECTORS, oldCONNECTORS, newCONNECTORS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONNECTORS(CONNECTORSType newCONNECTORS) {
        if (newCONNECTORS != cONNECTORS) {
            NotificationChain msgs = null;
            if (cONNECTORS != null)
                msgs = ((InternalEObject)cONNECTORS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__CONNECTORS, null, msgs);
            if (newCONNECTORS != null)
                msgs = ((InternalEObject)newCONNECTORS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__CONNECTORS, null, msgs);
            msgs = basicSetCONNECTORS(newCONNECTORS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__CONNECTORS, newCONNECTORS, newCONNECTORS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SQLTEMPLATESType getSQLTEMPLATES() {
        return sQLTEMPLATES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSQLTEMPLATES(SQLTEMPLATESType newSQLTEMPLATES, NotificationChain msgs) {
        SQLTEMPLATESType oldSQLTEMPLATES = sQLTEMPLATES;
        sQLTEMPLATES = newSQLTEMPLATES;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES, oldSQLTEMPLATES, newSQLTEMPLATES);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSQLTEMPLATES(SQLTEMPLATESType newSQLTEMPLATES) {
        if (newSQLTEMPLATES != sQLTEMPLATES) {
            NotificationChain msgs = null;
            if (sQLTEMPLATES != null)
                msgs = ((InternalEObject)sQLTEMPLATES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES, null, msgs);
            if (newSQLTEMPLATES != null)
                msgs = ((InternalEObject)newSQLTEMPLATES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES, null, msgs);
            msgs = basicSetSQLTEMPLATES(newSQLTEMPLATES, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES, newSQLTEMPLATES, newSQLTEMPLATES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARAMETERSType getPARAMETERS() {
        return pARAMETERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPARAMETERS(PARAMETERSType newPARAMETERS, NotificationChain msgs) {
        PARAMETERSType oldPARAMETERS = pARAMETERS;
        pARAMETERS = newPARAMETERS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__PARAMETERS, oldPARAMETERS, newPARAMETERS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPARAMETERS(PARAMETERSType newPARAMETERS) {
        if (newPARAMETERS != pARAMETERS) {
            NotificationChain msgs = null;
            if (pARAMETERS != null)
                msgs = ((InternalEObject)pARAMETERS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__PARAMETERS, null, msgs);
            if (newPARAMETERS != null)
                msgs = ((InternalEObject)newPARAMETERS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__PARAMETERS, null, msgs);
            msgs = basicSetPARAMETERS(newPARAMETERS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__PARAMETERS, newPARAMETERS, newPARAMETERS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ADVANCEDPARAMETERSType getADVANCEDPARAMETERS() {
        return aDVANCEDPARAMETERS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetADVANCEDPARAMETERS(ADVANCEDPARAMETERSType newADVANCEDPARAMETERS, NotificationChain msgs) {
        ADVANCEDPARAMETERSType oldADVANCEDPARAMETERS = aDVANCEDPARAMETERS;
        aDVANCEDPARAMETERS = newADVANCEDPARAMETERS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS, oldADVANCEDPARAMETERS, newADVANCEDPARAMETERS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setADVANCEDPARAMETERS(ADVANCEDPARAMETERSType newADVANCEDPARAMETERS) {
        if (newADVANCEDPARAMETERS != aDVANCEDPARAMETERS) {
            NotificationChain msgs = null;
            if (aDVANCEDPARAMETERS != null)
                msgs = ((InternalEObject)aDVANCEDPARAMETERS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS, null, msgs);
            if (newADVANCEDPARAMETERS != null)
                msgs = ((InternalEObject)newADVANCEDPARAMETERS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS, null, msgs);
            msgs = basicSetADVANCEDPARAMETERS(newADVANCEDPARAMETERS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS, newADVANCEDPARAMETERS, newADVANCEDPARAMETERS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CODEGENERATIONType getCODEGENERATION() {
        return cODEGENERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCODEGENERATION(CODEGENERATIONType newCODEGENERATION, NotificationChain msgs) {
        CODEGENERATIONType oldCODEGENERATION = cODEGENERATION;
        cODEGENERATION = newCODEGENERATION;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__CODEGENERATION, oldCODEGENERATION, newCODEGENERATION);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCODEGENERATION(CODEGENERATIONType newCODEGENERATION) {
        if (newCODEGENERATION != cODEGENERATION) {
            NotificationChain msgs = null;
            if (cODEGENERATION != null)
                msgs = ((InternalEObject)cODEGENERATION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__CODEGENERATION, null, msgs);
            if (newCODEGENERATION != null)
                msgs = ((InternalEObject)newCODEGENERATION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__CODEGENERATION, null, msgs);
            msgs = basicSetCODEGENERATION(newCODEGENERATION, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__CODEGENERATION, newCODEGENERATION, newCODEGENERATION));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RETURNSType getRETURNS() {
        return rETURNS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRETURNS(RETURNSType newRETURNS, NotificationChain msgs) {
        RETURNSType oldRETURNS = rETURNS;
        rETURNS = newRETURNS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__RETURNS, oldRETURNS, newRETURNS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRETURNS(RETURNSType newRETURNS) {
        if (newRETURNS != rETURNS) {
            NotificationChain msgs = null;
            if (rETURNS != null)
                msgs = ((InternalEObject)rETURNS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__RETURNS, null, msgs);
            if (newRETURNS != null)
                msgs = ((InternalEObject)newRETURNS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__RETURNS, null, msgs);
            msgs = basicSetRETURNS(newRETURNS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__RETURNS, newRETURNS, newRETURNS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PLUGINDEPENDENCIESType getPLUGINDEPENDENCIES() {
        return pLUGINDEPENDENCIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType newPLUGINDEPENDENCIES, NotificationChain msgs) {
        PLUGINDEPENDENCIESType oldPLUGINDEPENDENCIES = pLUGINDEPENDENCIES;
        pLUGINDEPENDENCIES = newPLUGINDEPENDENCIES;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES, oldPLUGINDEPENDENCIES, newPLUGINDEPENDENCIES);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPLUGINDEPENDENCIES(PLUGINDEPENDENCIESType newPLUGINDEPENDENCIES) {
        if (newPLUGINDEPENDENCIES != pLUGINDEPENDENCIES) {
            NotificationChain msgs = null;
            if (pLUGINDEPENDENCIES != null)
                msgs = ((InternalEObject)pLUGINDEPENDENCIES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES, null, msgs);
            if (newPLUGINDEPENDENCIES != null)
                msgs = ((InternalEObject)newPLUGINDEPENDENCIES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES, null, msgs);
            msgs = basicSetPLUGINDEPENDENCIES(newPLUGINDEPENDENCIES, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES, newPLUGINDEPENDENCIES, newPLUGINDEPENDENCIES));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.COMPONENT_TYPE__HEADER:
                return basicSetHEADER(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__FAMILIES:
                return basicSetFAMILIES(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__DOCUMENTATION:
                return basicSetDOCUMENTATION(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__CONNECTORS:
                return basicSetCONNECTORS(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES:
                return basicSetSQLTEMPLATES(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__PARAMETERS:
                return basicSetPARAMETERS(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS:
                return basicSetADVANCEDPARAMETERS(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__CODEGENERATION:
                return basicSetCODEGENERATION(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__RETURNS:
                return basicSetRETURNS(null, msgs);
            case ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES:
                return basicSetPLUGINDEPENDENCIES(null, msgs);
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
            case ComponentPackage.COMPONENT_TYPE__HEADER:
                return getHEADER();
            case ComponentPackage.COMPONENT_TYPE__FAMILIES:
                return getFAMILIES();
            case ComponentPackage.COMPONENT_TYPE__DOCUMENTATION:
                return getDOCUMENTATION();
            case ComponentPackage.COMPONENT_TYPE__CONNECTORS:
                return getCONNECTORS();
            case ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES:
                return getSQLTEMPLATES();
            case ComponentPackage.COMPONENT_TYPE__PARAMETERS:
                return getPARAMETERS();
            case ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS:
                return getADVANCEDPARAMETERS();
            case ComponentPackage.COMPONENT_TYPE__CODEGENERATION:
                return getCODEGENERATION();
            case ComponentPackage.COMPONENT_TYPE__RETURNS:
                return getRETURNS();
            case ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES:
                return getPLUGINDEPENDENCIES();
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
            case ComponentPackage.COMPONENT_TYPE__HEADER:
                setHEADER((HEADERType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__FAMILIES:
                setFAMILIES((FAMILIESType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__DOCUMENTATION:
                setDOCUMENTATION((DOCUMENTATIONType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__CONNECTORS:
                setCONNECTORS((CONNECTORSType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES:
                setSQLTEMPLATES((SQLTEMPLATESType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__PARAMETERS:
                setPARAMETERS((PARAMETERSType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS:
                setADVANCEDPARAMETERS((ADVANCEDPARAMETERSType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__CODEGENERATION:
                setCODEGENERATION((CODEGENERATIONType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__RETURNS:
                setRETURNS((RETURNSType)newValue);
                return;
            case ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES:
                setPLUGINDEPENDENCIES((PLUGINDEPENDENCIESType)newValue);
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
            case ComponentPackage.COMPONENT_TYPE__HEADER:
                setHEADER((HEADERType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__FAMILIES:
                setFAMILIES((FAMILIESType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__DOCUMENTATION:
                setDOCUMENTATION((DOCUMENTATIONType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__CONNECTORS:
                setCONNECTORS((CONNECTORSType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES:
                setSQLTEMPLATES((SQLTEMPLATESType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__PARAMETERS:
                setPARAMETERS((PARAMETERSType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS:
                setADVANCEDPARAMETERS((ADVANCEDPARAMETERSType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__CODEGENERATION:
                setCODEGENERATION((CODEGENERATIONType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__RETURNS:
                setRETURNS((RETURNSType)null);
                return;
            case ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES:
                setPLUGINDEPENDENCIES((PLUGINDEPENDENCIESType)null);
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
            case ComponentPackage.COMPONENT_TYPE__HEADER:
                return hEADER != null;
            case ComponentPackage.COMPONENT_TYPE__FAMILIES:
                return fAMILIES != null;
            case ComponentPackage.COMPONENT_TYPE__DOCUMENTATION:
                return dOCUMENTATION != null;
            case ComponentPackage.COMPONENT_TYPE__CONNECTORS:
                return cONNECTORS != null;
            case ComponentPackage.COMPONENT_TYPE__SQLTEMPLATES:
                return sQLTEMPLATES != null;
            case ComponentPackage.COMPONENT_TYPE__PARAMETERS:
                return pARAMETERS != null;
            case ComponentPackage.COMPONENT_TYPE__ADVANCEDPARAMETERS:
                return aDVANCEDPARAMETERS != null;
            case ComponentPackage.COMPONENT_TYPE__CODEGENERATION:
                return cODEGENERATION != null;
            case ComponentPackage.COMPONENT_TYPE__RETURNS:
                return rETURNS != null;
            case ComponentPackage.COMPONENT_TYPE__PLUGINDEPENDENCIES:
                return pLUGINDEPENDENCIES != null;
        }
        return super.eIsSet(featureID);
    }

} //COMPONENTTypeImpl
