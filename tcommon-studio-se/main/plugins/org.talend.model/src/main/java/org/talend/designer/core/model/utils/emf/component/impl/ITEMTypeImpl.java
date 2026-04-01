/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.ITEMSType;
import org.talend.designer.core.model.utils.emf.component.ITEMType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITEM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getITEMS <em>ITEMS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getCONTEXT <em>CONTEXT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#isDISPLAYNAMEASVALUE <em>DISPLAYNAMEASVALUE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getFIELD <em>FIELD</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#isNOCONTEXTASSIST <em>NOCONTEXTASSIST</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getNOTREADONLYIF <em>NOTREADONLYIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getNOTSHOWIF <em>NOTSHOWIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#isRAW <em>RAW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#isREADONLY <em>READONLY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getREADONLYIF <em>READONLYIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getREPOSITORYITEM <em>REPOSITORYITEM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getSHOWIF <em>SHOWIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.ITEMTypeImpl#getVALUE <em>VALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ITEMTypeImpl extends EObjectImpl implements ITEMType {
    /**
     * The cached value of the '{@link #getITEMS() <em>ITEMS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getITEMS()
     * @generated
     * @ordered
     */
    protected ITEMSType iTEMS;

    /**
     * The default value of the '{@link #getCONTEXT() <em>CONTEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONTEXT()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONTEXT() <em>CONTEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONTEXT()
     * @generated
     * @ordered
     */
    protected String cONTEXT = CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #isDISPLAYNAMEASVALUE() <em>DISPLAYNAMEASVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDISPLAYNAMEASVALUE()
     * @generated
     * @ordered
     */
    protected static final boolean DISPLAYNAMEASVALUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDISPLAYNAMEASVALUE() <em>DISPLAYNAMEASVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDISPLAYNAMEASVALUE()
     * @generated
     * @ordered
     */
    protected boolean dISPLAYNAMEASVALUE = DISPLAYNAMEASVALUE_EDEFAULT;

    /**
     * This is true if the DISPLAYNAMEASVALUE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dISPLAYNAMEASVALUEESet;

    /**
     * The default value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @generated
     * @ordered
     */
    protected static final String FIELD_EDEFAULT = "TEXT";

    /**
     * The cached value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @generated
     * @ordered
     */
    protected String fIELD = FIELD_EDEFAULT;

    /**
     * This is true if the FIELD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fIELDESet;

    /**
     * The default value of the '{@link #getFILTER() <em>FILTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILTER()
     * @generated
     * @ordered
     */
    protected static final String FILTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFILTER() <em>FILTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILTER()
     * @generated
     * @ordered
     */
    protected String fILTER = FILTER_EDEFAULT;

    /**
     * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected String nAME = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isNOCONTEXTASSIST() <em>NOCONTEXTASSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNOCONTEXTASSIST()
     * @generated
     * @ordered
     */
    protected static final boolean NOCONTEXTASSIST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNOCONTEXTASSIST() <em>NOCONTEXTASSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNOCONTEXTASSIST()
     * @generated
     * @ordered
     */
    protected boolean nOCONTEXTASSIST = NOCONTEXTASSIST_EDEFAULT;

    /**
     * This is true if the NOCONTEXTASSIST attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nOCONTEXTASSISTESet;

    /**
     * The default value of the '{@link #getNOTREADONLYIF() <em>NOTREADONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTREADONLYIF()
     * @generated
     * @ordered
     */
    protected static final String NOTREADONLYIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNOTREADONLYIF() <em>NOTREADONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTREADONLYIF()
     * @generated
     * @ordered
     */
    protected String nOTREADONLYIF = NOTREADONLYIF_EDEFAULT;

    /**
     * The default value of the '{@link #getNOTSHOWIF() <em>NOTSHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTSHOWIF()
     * @generated
     * @ordered
     */
    protected static final String NOTSHOWIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNOTSHOWIF() <em>NOTSHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTSHOWIF()
     * @generated
     * @ordered
     */
    protected String nOTSHOWIF = NOTSHOWIF_EDEFAULT;

    /**
     * The default value of the '{@link #isRAW() <em>RAW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRAW()
     * @generated
     * @ordered
     */
    protected static final boolean RAW_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRAW() <em>RAW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRAW()
     * @generated
     * @ordered
     */
    protected boolean rAW = RAW_EDEFAULT;

    /**
     * This is true if the RAW attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rAWESet;

    /**
     * The default value of the '{@link #isREADONLY() <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREADONLY()
     * @generated
     * @ordered
     */
    protected static final boolean READONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isREADONLY() <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREADONLY()
     * @generated
     * @ordered
     */
    protected boolean rEADONLY = READONLY_EDEFAULT;

    /**
     * This is true if the READONLY attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEADONLYESet;

    /**
     * The default value of the '{@link #getREADONLYIF() <em>READONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREADONLYIF()
     * @generated
     * @ordered
     */
    protected static final String READONLYIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREADONLYIF() <em>READONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREADONLYIF()
     * @generated
     * @ordered
     */
    protected String rEADONLYIF = READONLYIF_EDEFAULT;

    /**
     * The default value of the '{@link #getREPOSITORYITEM() <em>REPOSITORYITEM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYITEM()
     * @generated
     * @ordered
     */
    protected static final String REPOSITORYITEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREPOSITORYITEM() <em>REPOSITORYITEM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYITEM()
     * @generated
     * @ordered
     */
    protected String rEPOSITORYITEM = REPOSITORYITEM_EDEFAULT;

    /**
     * The default value of the '{@link #getSHOWIF() <em>SHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHOWIF()
     * @generated
     * @ordered
     */
    protected static final String SHOWIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSHOWIF() <em>SHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHOWIF()
     * @generated
     * @ordered
     */
    protected String sHOWIF = SHOWIF_EDEFAULT;

    /**
     * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVALUE()
     * @generated
     * @ordered
     */
    protected String vALUE = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ITEMTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.ITEM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ITEMSType getITEMS() {
        return iTEMS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetITEMS(ITEMSType newITEMS, NotificationChain msgs) {
        ITEMSType oldITEMS = iTEMS;
        iTEMS = newITEMS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__ITEMS, oldITEMS, newITEMS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setITEMS(ITEMSType newITEMS) {
        if (newITEMS != iTEMS) {
            NotificationChain msgs = null;
            if (iTEMS != null)
                msgs = ((InternalEObject)iTEMS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.ITEM_TYPE__ITEMS, null, msgs);
            if (newITEMS != null)
                msgs = ((InternalEObject)newITEMS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.ITEM_TYPE__ITEMS, null, msgs);
            msgs = basicSetITEMS(newITEMS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__ITEMS, newITEMS, newITEMS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCONTEXT() {
        return cONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONTEXT(String newCONTEXT) {
        String oldCONTEXT = cONTEXT;
        cONTEXT = newCONTEXT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__CONTEXT, oldCONTEXT, cONTEXT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDISPLAYNAMEASVALUE() {
        return dISPLAYNAMEASVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDISPLAYNAMEASVALUE(boolean newDISPLAYNAMEASVALUE) {
        boolean oldDISPLAYNAMEASVALUE = dISPLAYNAMEASVALUE;
        dISPLAYNAMEASVALUE = newDISPLAYNAMEASVALUE;
        boolean oldDISPLAYNAMEASVALUEESet = dISPLAYNAMEASVALUEESet;
        dISPLAYNAMEASVALUEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__DISPLAYNAMEASVALUE, oldDISPLAYNAMEASVALUE, dISPLAYNAMEASVALUE, !oldDISPLAYNAMEASVALUEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDISPLAYNAMEASVALUE() {
        boolean oldDISPLAYNAMEASVALUE = dISPLAYNAMEASVALUE;
        boolean oldDISPLAYNAMEASVALUEESet = dISPLAYNAMEASVALUEESet;
        dISPLAYNAMEASVALUE = DISPLAYNAMEASVALUE_EDEFAULT;
        dISPLAYNAMEASVALUEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEM_TYPE__DISPLAYNAMEASVALUE, oldDISPLAYNAMEASVALUE, DISPLAYNAMEASVALUE_EDEFAULT, oldDISPLAYNAMEASVALUEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDISPLAYNAMEASVALUE() {
        return dISPLAYNAMEASVALUEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFIELD() {
        return fIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELD(String newFIELD) {
        String oldFIELD = fIELD;
        fIELD = newFIELD;
        boolean oldFIELDESet = fIELDESet;
        fIELDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__FIELD, oldFIELD, fIELD, !oldFIELDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFIELD() {
        String oldFIELD = fIELD;
        boolean oldFIELDESet = fIELDESet;
        fIELD = FIELD_EDEFAULT;
        fIELDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEM_TYPE__FIELD, oldFIELD, FIELD_EDEFAULT, oldFIELDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFIELD() {
        return fIELDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFILTER() {
        return fILTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFILTER(String newFILTER) {
        String oldFILTER = fILTER;
        fILTER = newFILTER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__FILTER, oldFILTER, fILTER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNAME() {
        return nAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAME(String newNAME) {
        String oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNOCONTEXTASSIST() {
        return nOCONTEXTASSIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOCONTEXTASSIST(boolean newNOCONTEXTASSIST) {
        boolean oldNOCONTEXTASSIST = nOCONTEXTASSIST;
        nOCONTEXTASSIST = newNOCONTEXTASSIST;
        boolean oldNOCONTEXTASSISTESet = nOCONTEXTASSISTESet;
        nOCONTEXTASSISTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__NOCONTEXTASSIST, oldNOCONTEXTASSIST, nOCONTEXTASSIST, !oldNOCONTEXTASSISTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNOCONTEXTASSIST() {
        boolean oldNOCONTEXTASSIST = nOCONTEXTASSIST;
        boolean oldNOCONTEXTASSISTESet = nOCONTEXTASSISTESet;
        nOCONTEXTASSIST = NOCONTEXTASSIST_EDEFAULT;
        nOCONTEXTASSISTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEM_TYPE__NOCONTEXTASSIST, oldNOCONTEXTASSIST, NOCONTEXTASSIST_EDEFAULT, oldNOCONTEXTASSISTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNOCONTEXTASSIST() {
        return nOCONTEXTASSISTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNOTREADONLYIF() {
        return nOTREADONLYIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOTREADONLYIF(String newNOTREADONLYIF) {
        String oldNOTREADONLYIF = nOTREADONLYIF;
        nOTREADONLYIF = newNOTREADONLYIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__NOTREADONLYIF, oldNOTREADONLYIF, nOTREADONLYIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNOTSHOWIF() {
        return nOTSHOWIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOTSHOWIF(String newNOTSHOWIF) {
        String oldNOTSHOWIF = nOTSHOWIF;
        nOTSHOWIF = newNOTSHOWIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__NOTSHOWIF, oldNOTSHOWIF, nOTSHOWIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isREADONLY() {
        return rEADONLY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREADONLY(boolean newREADONLY) {
        boolean oldREADONLY = rEADONLY;
        rEADONLY = newREADONLY;
        boolean oldREADONLYESet = rEADONLYESet;
        rEADONLYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__READONLY, oldREADONLY, rEADONLY, !oldREADONLYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREADONLY() {
        boolean oldREADONLY = rEADONLY;
        boolean oldREADONLYESet = rEADONLYESet;
        rEADONLY = READONLY_EDEFAULT;
        rEADONLYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEM_TYPE__READONLY, oldREADONLY, READONLY_EDEFAULT, oldREADONLYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREADONLY() {
        return rEADONLYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREADONLYIF() {
        return rEADONLYIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREADONLYIF(String newREADONLYIF) {
        String oldREADONLYIF = rEADONLYIF;
        rEADONLYIF = newREADONLYIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__READONLYIF, oldREADONLYIF, rEADONLYIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREPOSITORYITEM() {
        return rEPOSITORYITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPOSITORYITEM(String newREPOSITORYITEM) {
        String oldREPOSITORYITEM = rEPOSITORYITEM;
        rEPOSITORYITEM = newREPOSITORYITEM;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__REPOSITORYITEM, oldREPOSITORYITEM, rEPOSITORYITEM));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSHOWIF() {
        return sHOWIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHOWIF(String newSHOWIF) {
        String oldSHOWIF = sHOWIF;
        sHOWIF = newSHOWIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__SHOWIF, oldSHOWIF, sHOWIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVALUE() {
        return vALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVALUE(String newVALUE) {
        String oldVALUE = vALUE;
        vALUE = newVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__VALUE, oldVALUE, vALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRAW() {
        return rAW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRAW(boolean newRAW) {
        boolean oldRAW = rAW;
        rAW = newRAW;
        boolean oldRAWESet = rAWESet;
        rAWESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ITEM_TYPE__RAW, oldRAW, rAW, !oldRAWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRAW() {
        boolean oldRAW = rAW;
        boolean oldRAWESet = rAWESet;
        rAW = RAW_EDEFAULT;
        rAWESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.ITEM_TYPE__RAW, oldRAW, RAW_EDEFAULT, oldRAWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRAW() {
        return rAWESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.ITEM_TYPE__ITEMS:
                return basicSetITEMS(null, msgs);
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
            case ComponentPackage.ITEM_TYPE__ITEMS:
                return getITEMS();
            case ComponentPackage.ITEM_TYPE__CONTEXT:
                return getCONTEXT();
            case ComponentPackage.ITEM_TYPE__DISPLAYNAMEASVALUE:
                return isDISPLAYNAMEASVALUE() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEM_TYPE__FIELD:
                return getFIELD();
            case ComponentPackage.ITEM_TYPE__FILTER:
                return getFILTER();
            case ComponentPackage.ITEM_TYPE__NAME:
                return getNAME();
            case ComponentPackage.ITEM_TYPE__NOCONTEXTASSIST:
                return isNOCONTEXTASSIST() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEM_TYPE__NOTREADONLYIF:
                return getNOTREADONLYIF();
            case ComponentPackage.ITEM_TYPE__NOTSHOWIF:
                return getNOTSHOWIF();
            case ComponentPackage.ITEM_TYPE__RAW:
                return isRAW() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEM_TYPE__READONLY:
                return isREADONLY() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.ITEM_TYPE__READONLYIF:
                return getREADONLYIF();
            case ComponentPackage.ITEM_TYPE__REPOSITORYITEM:
                return getREPOSITORYITEM();
            case ComponentPackage.ITEM_TYPE__SHOWIF:
                return getSHOWIF();
            case ComponentPackage.ITEM_TYPE__VALUE:
                return getVALUE();
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
            case ComponentPackage.ITEM_TYPE__ITEMS:
                setITEMS((ITEMSType)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__CONTEXT:
                setCONTEXT((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__DISPLAYNAMEASVALUE:
                setDISPLAYNAMEASVALUE(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEM_TYPE__FIELD:
                setFIELD((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__FILTER:
                setFILTER((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__NAME:
                setNAME((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__NOCONTEXTASSIST:
                setNOCONTEXTASSIST(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEM_TYPE__NOTREADONLYIF:
                setNOTREADONLYIF((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__NOTSHOWIF:
                setNOTSHOWIF((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__RAW:
                setRAW(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEM_TYPE__READONLY:
                setREADONLY(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.ITEM_TYPE__READONLYIF:
                setREADONLYIF((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__REPOSITORYITEM:
                setREPOSITORYITEM((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__SHOWIF:
                setSHOWIF((String)newValue);
                return;
            case ComponentPackage.ITEM_TYPE__VALUE:
                setVALUE((String)newValue);
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
            case ComponentPackage.ITEM_TYPE__ITEMS:
                setITEMS((ITEMSType)null);
                return;
            case ComponentPackage.ITEM_TYPE__CONTEXT:
                setCONTEXT(CONTEXT_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__DISPLAYNAMEASVALUE:
                unsetDISPLAYNAMEASVALUE();
                return;
            case ComponentPackage.ITEM_TYPE__FIELD:
                unsetFIELD();
                return;
            case ComponentPackage.ITEM_TYPE__FILTER:
                setFILTER(FILTER_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__NOCONTEXTASSIST:
                unsetNOCONTEXTASSIST();
                return;
            case ComponentPackage.ITEM_TYPE__NOTREADONLYIF:
                setNOTREADONLYIF(NOTREADONLYIF_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__NOTSHOWIF:
                setNOTSHOWIF(NOTSHOWIF_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__RAW:
                unsetRAW();
                return;
            case ComponentPackage.ITEM_TYPE__READONLY:
                unsetREADONLY();
                return;
            case ComponentPackage.ITEM_TYPE__READONLYIF:
                setREADONLYIF(READONLYIF_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__REPOSITORYITEM:
                setREPOSITORYITEM(REPOSITORYITEM_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__SHOWIF:
                setSHOWIF(SHOWIF_EDEFAULT);
                return;
            case ComponentPackage.ITEM_TYPE__VALUE:
                setVALUE(VALUE_EDEFAULT);
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
            case ComponentPackage.ITEM_TYPE__ITEMS:
                return iTEMS != null;
            case ComponentPackage.ITEM_TYPE__CONTEXT:
                return CONTEXT_EDEFAULT == null ? cONTEXT != null : !CONTEXT_EDEFAULT.equals(cONTEXT);
            case ComponentPackage.ITEM_TYPE__DISPLAYNAMEASVALUE:
                return isSetDISPLAYNAMEASVALUE();
            case ComponentPackage.ITEM_TYPE__FIELD:
                return isSetFIELD();
            case ComponentPackage.ITEM_TYPE__FILTER:
                return FILTER_EDEFAULT == null ? fILTER != null : !FILTER_EDEFAULT.equals(fILTER);
            case ComponentPackage.ITEM_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case ComponentPackage.ITEM_TYPE__NOCONTEXTASSIST:
                return isSetNOCONTEXTASSIST();
            case ComponentPackage.ITEM_TYPE__NOTREADONLYIF:
                return NOTREADONLYIF_EDEFAULT == null ? nOTREADONLYIF != null : !NOTREADONLYIF_EDEFAULT.equals(nOTREADONLYIF);
            case ComponentPackage.ITEM_TYPE__NOTSHOWIF:
                return NOTSHOWIF_EDEFAULT == null ? nOTSHOWIF != null : !NOTSHOWIF_EDEFAULT.equals(nOTSHOWIF);
            case ComponentPackage.ITEM_TYPE__RAW:
                return isSetRAW();
            case ComponentPackage.ITEM_TYPE__READONLY:
                return isSetREADONLY();
            case ComponentPackage.ITEM_TYPE__READONLYIF:
                return READONLYIF_EDEFAULT == null ? rEADONLYIF != null : !READONLYIF_EDEFAULT.equals(rEADONLYIF);
            case ComponentPackage.ITEM_TYPE__REPOSITORYITEM:
                return REPOSITORYITEM_EDEFAULT == null ? rEPOSITORYITEM != null : !REPOSITORYITEM_EDEFAULT.equals(rEPOSITORYITEM);
            case ComponentPackage.ITEM_TYPE__SHOWIF:
                return SHOWIF_EDEFAULT == null ? sHOWIF != null : !SHOWIF_EDEFAULT.equals(sHOWIF);
            case ComponentPackage.ITEM_TYPE__VALUE:
                return VALUE_EDEFAULT == null ? vALUE != null : !VALUE_EDEFAULT.equals(vALUE);
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
        result.append(" (cONTEXT: ");
        result.append(cONTEXT);
        result.append(", dISPLAYNAMEASVALUE: ");
        if (dISPLAYNAMEASVALUEESet) result.append(dISPLAYNAMEASVALUE); else result.append("<unset>");
        result.append(", fIELD: ");
        if (fIELDESet) result.append(fIELD); else result.append("<unset>");
        result.append(", fILTER: ");
        result.append(fILTER);
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", nOCONTEXTASSIST: ");
        if (nOCONTEXTASSISTESet) result.append(nOCONTEXTASSIST); else result.append("<unset>");
        result.append(", nOTREADONLYIF: ");
        result.append(nOTREADONLYIF);
        result.append(", nOTSHOWIF: ");
        result.append(nOTSHOWIF);
        result.append(", rAW: ");
        if (rAWESet) result.append(rAW); else result.append("<unset>");
        result.append(", rEADONLY: ");
        if (rEADONLYESet) result.append(rEADONLY); else result.append("<unset>");
        result.append(", rEADONLYIF: ");
        result.append(rEADONLYIF);
        result.append(", rEPOSITORYITEM: ");
        result.append(rEPOSITORYITEM);
        result.append(", sHOWIF: ");
        result.append(sHOWIF);
        result.append(", vALUE: ");
        result.append(vALUE);
        result.append(')');
        return result.toString();
    }

} //ITEMTypeImpl
