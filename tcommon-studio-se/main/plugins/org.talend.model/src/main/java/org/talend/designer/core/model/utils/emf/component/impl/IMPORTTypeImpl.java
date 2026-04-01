/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;
import org.talend.designer.core.model.utils.emf.component.INSTALLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMPORT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getINSTALL <em>INSTALL</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getURL <em>URL</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getBundleID <em>Bundle ID</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getMESSAGE <em>MESSAGE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getMODULE <em>MODULE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getMODULEGROUP <em>MODULEGROUP</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#isMRREQUIRED <em>MRREQUIRED</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#isREQUIRED <em>REQUIRED</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getREQUIREDIF <em>REQUIREDIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#isSHOW <em>SHOW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.IMPORTTypeImpl#getMVN <em>MVN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IMPORTTypeImpl extends EObjectImpl implements IMPORTType {
    /**
     * The cached value of the '{@link #getINSTALL() <em>INSTALL</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getINSTALL()
     * @generated
     * @ordered
     */
    protected EList iNSTALL;

    /**
     * The cached value of the '{@link #getURL() <em>URL</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getURL()
     * @generated
     * @ordered
     */
    protected EList uRL;

    /**
     * The default value of the '{@link #getBundleID() <em>Bundle ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBundleID()
     * @generated
     * @ordered
     */
    protected static final String BUNDLE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBundleID() <em>Bundle ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBundleID()
     * @generated
     * @ordered
     */
    protected String bundleID = BUNDLE_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getMESSAGE() <em>MESSAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMESSAGE()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMESSAGE() <em>MESSAGE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMESSAGE()
     * @generated
     * @ordered
     */
    protected String mESSAGE = MESSAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getMODULE() <em>MODULE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMODULE()
     * @generated
     * @ordered
     */
    protected static final String MODULE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMODULE() <em>MODULE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMODULE()
     * @generated
     * @ordered
     */
    protected String mODULE = MODULE_EDEFAULT;

    /**
     * The default value of the '{@link #getMODULEGROUP() <em>MODULEGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMODULEGROUP()
     * @generated
     * @ordered
     */
    protected static final String MODULEGROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMODULEGROUP() <em>MODULEGROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMODULEGROUP()
     * @generated
     * @ordered
     */
    protected String mODULEGROUP = MODULEGROUP_EDEFAULT;

    /**
     * The default value of the '{@link #isMRREQUIRED() <em>MRREQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMRREQUIRED()
     * @generated
     * @ordered
     */
    protected static final boolean MRREQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMRREQUIRED() <em>MRREQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMRREQUIRED()
     * @generated
     * @ordered
     */
    protected boolean mRREQUIRED = MRREQUIRED_EDEFAULT;

    /**
     * This is true if the MRREQUIRED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mRREQUIREDESet;

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
     * The default value of the '{@link #isREQUIRED() <em>REQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREQUIRED()
     * @generated
     * @ordered
     */
    protected static final boolean REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isREQUIRED() <em>REQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREQUIRED()
     * @generated
     * @ordered
     */
    protected boolean rEQUIRED = REQUIRED_EDEFAULT;

    /**
     * This is true if the REQUIRED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEQUIREDESet;

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
     * The default value of the '{@link #isSHOW() <em>SHOW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSHOW()
     * @generated
     * @ordered
     */
    protected static final boolean SHOW_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isSHOW() <em>SHOW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSHOW()
     * @generated
     * @ordered
     */
    protected boolean sHOW = SHOW_EDEFAULT;

    /**
     * This is true if the SHOW attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sHOWESet;

    /**
     * The default value of the '{@link #getUrlPath() <em>Url Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrlPath()
     * @generated
     * @ordered
     */
    protected static final String URL_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrlPath() <em>Url Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrlPath()
     * @generated
     * @ordered
     */
    protected String urlPath = URL_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getMVN() <em>MVN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMVN()
     * @generated
     * @ordered
     */
    protected static final String MVN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMVN() <em>MVN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMVN()
     * @generated
     * @ordered
     */
    protected String mvn = MVN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IMPORTTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.IMPORT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getINSTALL() {
        if (iNSTALL == null) {
            iNSTALL = new EObjectContainmentEList(INSTALLType.class, this, ComponentPackage.IMPORT_TYPE__INSTALL);
        }
        return iNSTALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getURL() {
        if (uRL == null) {
            uRL = new EDataTypeEList(String.class, this, ComponentPackage.IMPORT_TYPE__URL);
        }
        return uRL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBundleID() {
        return bundleID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBundleID(String newBundleID) {
        String oldBundleID = bundleID;
        bundleID = newBundleID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__BUNDLE_ID, oldBundleID, bundleID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMESSAGE() {
        return mESSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMESSAGE(String newMESSAGE) {
        String oldMESSAGE = mESSAGE;
        mESSAGE = newMESSAGE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__MESSAGE, oldMESSAGE, mESSAGE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMODULE() {
        return mODULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMODULE(String newMODULE) {
        String oldMODULE = mODULE;
        mODULE = newMODULE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__MODULE, oldMODULE, mODULE));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isREQUIRED() {
        return rEQUIRED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREQUIRED(boolean newREQUIRED) {
        boolean oldREQUIRED = rEQUIRED;
        rEQUIRED = newREQUIRED;
        boolean oldREQUIREDESet = rEQUIREDESet;
        rEQUIREDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__REQUIRED, oldREQUIRED, rEQUIRED, !oldREQUIREDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREQUIRED() {
        boolean oldREQUIRED = rEQUIRED;
        boolean oldREQUIREDESet = rEQUIREDESet;
        rEQUIRED = REQUIRED_EDEFAULT;
        rEQUIREDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.IMPORT_TYPE__REQUIRED, oldREQUIRED, REQUIRED_EDEFAULT, oldREQUIREDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREQUIRED() {
        return rEQUIREDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSHOW() {
        return sHOW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHOW(boolean newSHOW) {
        boolean oldSHOW = sHOW;
        sHOW = newSHOW;
        boolean oldSHOWESet = sHOWESet;
        sHOWESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__SHOW, oldSHOW, sHOW, !oldSHOWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSHOW() {
        boolean oldSHOW = sHOW;
        boolean oldSHOWESet = sHOWESet;
        sHOW = SHOW_EDEFAULT;
        sHOWESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.IMPORT_TYPE__SHOW, oldSHOW, SHOW_EDEFAULT, oldSHOWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSHOW() {
        return sHOWESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrlPath(String newUrlPath) {
        String oldUrlPath = urlPath;
        urlPath = newUrlPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__URL_PATH, oldUrlPath, urlPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMVN() {
        return mvn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMVN(String newMVN) {
        String oldMVN = mvn;
        mvn = newMVN;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__MVN, oldMVN, mvn));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__REQUIREDIF, oldREQUIREDIF, rEQUIREDIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMRREQUIRED() {
        return mRREQUIRED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMRREQUIRED(boolean newMRREQUIRED) {
        boolean oldMRREQUIRED = mRREQUIRED;
        mRREQUIRED = newMRREQUIRED;
        boolean oldMRREQUIREDESet = mRREQUIREDESet;
        mRREQUIREDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__MRREQUIRED, oldMRREQUIRED, mRREQUIRED, !oldMRREQUIREDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMRREQUIRED() {
        boolean oldMRREQUIRED = mRREQUIRED;
        boolean oldMRREQUIREDESet = mRREQUIREDESet;
        mRREQUIRED = MRREQUIRED_EDEFAULT;
        mRREQUIREDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.IMPORT_TYPE__MRREQUIRED, oldMRREQUIRED, MRREQUIRED_EDEFAULT, oldMRREQUIREDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMRREQUIRED() {
        return mRREQUIREDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMODULEGROUP() {
        return mODULEGROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMODULEGROUP(String newMODULEGROUP) {
        String oldMODULEGROUP = mODULEGROUP;
        mODULEGROUP = newMODULEGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.IMPORT_TYPE__MODULEGROUP, oldMODULEGROUP, mODULEGROUP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.IMPORT_TYPE__INSTALL:
                return ((InternalEList)getINSTALL()).basicRemove(otherEnd, msgs);
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
            case ComponentPackage.IMPORT_TYPE__INSTALL:
                return getINSTALL();
            case ComponentPackage.IMPORT_TYPE__URL:
                return getURL();
            case ComponentPackage.IMPORT_TYPE__BUNDLE_ID:
                return getBundleID();
            case ComponentPackage.IMPORT_TYPE__MESSAGE:
                return getMESSAGE();
            case ComponentPackage.IMPORT_TYPE__MODULE:
                return getMODULE();
            case ComponentPackage.IMPORT_TYPE__MODULEGROUP:
                return getMODULEGROUP();
            case ComponentPackage.IMPORT_TYPE__MRREQUIRED:
                return isMRREQUIRED() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.IMPORT_TYPE__NAME:
                return getNAME();
            case ComponentPackage.IMPORT_TYPE__REQUIRED:
                return isREQUIRED() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.IMPORT_TYPE__REQUIREDIF:
                return getREQUIREDIF();
            case ComponentPackage.IMPORT_TYPE__SHOW:
                return isSHOW() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.IMPORT_TYPE__URL_PATH:
                return getUrlPath();
            case ComponentPackage.IMPORT_TYPE__MVN:
                return getMVN();
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
            case ComponentPackage.IMPORT_TYPE__INSTALL:
                getINSTALL().clear();
                getINSTALL().addAll((Collection)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__URL:
                getURL().clear();
                getURL().addAll((Collection)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__BUNDLE_ID:
                setBundleID((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__MESSAGE:
                setMESSAGE((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__MODULE:
                setMODULE((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__MODULEGROUP:
                setMODULEGROUP((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__MRREQUIRED:
                setMRREQUIRED(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.IMPORT_TYPE__NAME:
                setNAME((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__REQUIRED:
                setREQUIRED(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.IMPORT_TYPE__REQUIREDIF:
                setREQUIREDIF((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__SHOW:
                setSHOW(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.IMPORT_TYPE__URL_PATH:
                setUrlPath((String)newValue);
                return;
            case ComponentPackage.IMPORT_TYPE__MVN:
                setMVN((String)newValue);
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
            case ComponentPackage.IMPORT_TYPE__INSTALL:
                getINSTALL().clear();
                return;
            case ComponentPackage.IMPORT_TYPE__URL:
                getURL().clear();
                return;
            case ComponentPackage.IMPORT_TYPE__BUNDLE_ID:
                setBundleID(BUNDLE_ID_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__MESSAGE:
                setMESSAGE(MESSAGE_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__MODULE:
                setMODULE(MODULE_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__MODULEGROUP:
                setMODULEGROUP(MODULEGROUP_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__MRREQUIRED:
                unsetMRREQUIRED();
                return;
            case ComponentPackage.IMPORT_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__REQUIRED:
                unsetREQUIRED();
                return;
            case ComponentPackage.IMPORT_TYPE__REQUIREDIF:
                setREQUIREDIF(REQUIREDIF_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__SHOW:
                unsetSHOW();
                return;
            case ComponentPackage.IMPORT_TYPE__URL_PATH:
                setUrlPath(URL_PATH_EDEFAULT);
                return;
            case ComponentPackage.IMPORT_TYPE__MVN:
                setMVN(MVN_EDEFAULT);
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
            case ComponentPackage.IMPORT_TYPE__INSTALL:
                return iNSTALL != null && !iNSTALL.isEmpty();
            case ComponentPackage.IMPORT_TYPE__URL:
                return uRL != null && !uRL.isEmpty();
            case ComponentPackage.IMPORT_TYPE__BUNDLE_ID:
                return BUNDLE_ID_EDEFAULT == null ? bundleID != null : !BUNDLE_ID_EDEFAULT.equals(bundleID);
            case ComponentPackage.IMPORT_TYPE__MESSAGE:
                return MESSAGE_EDEFAULT == null ? mESSAGE != null : !MESSAGE_EDEFAULT.equals(mESSAGE);
            case ComponentPackage.IMPORT_TYPE__MODULE:
                return MODULE_EDEFAULT == null ? mODULE != null : !MODULE_EDEFAULT.equals(mODULE);
            case ComponentPackage.IMPORT_TYPE__MODULEGROUP:
                return MODULEGROUP_EDEFAULT == null ? mODULEGROUP != null : !MODULEGROUP_EDEFAULT.equals(mODULEGROUP);
            case ComponentPackage.IMPORT_TYPE__MRREQUIRED:
                return isSetMRREQUIRED();
            case ComponentPackage.IMPORT_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case ComponentPackage.IMPORT_TYPE__REQUIRED:
                return isSetREQUIRED();
            case ComponentPackage.IMPORT_TYPE__REQUIREDIF:
                return REQUIREDIF_EDEFAULT == null ? rEQUIREDIF != null : !REQUIREDIF_EDEFAULT.equals(rEQUIREDIF);
            case ComponentPackage.IMPORT_TYPE__SHOW:
                return isSetSHOW();
            case ComponentPackage.IMPORT_TYPE__URL_PATH:
                return URL_PATH_EDEFAULT == null ? urlPath != null : !URL_PATH_EDEFAULT.equals(urlPath);
            case ComponentPackage.IMPORT_TYPE__MVN:
                return MVN_EDEFAULT == null ? mvn != null : !MVN_EDEFAULT.equals(mvn);
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
        result.append(" (uRL: ");
        result.append(uRL);
        result.append(", bundleID: ");
        result.append(bundleID);
        result.append(", mESSAGE: ");
        result.append(mESSAGE);
        result.append(", mODULE: ");
        result.append(mODULE);
        result.append(", mODULEGROUP: ");
        result.append(mODULEGROUP);
        result.append(", mRREQUIRED: ");
        if (mRREQUIREDESet) result.append(mRREQUIRED); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", rEQUIRED: ");
        if (rEQUIREDESet) result.append(rEQUIRED); else result.append("<unset>");
        result.append(", rEQUIREDIF: ");
        result.append(rEQUIREDIF);
        result.append(", sHOW: ");
        if (sHOWESet) result.append(sHOW); else result.append("<unset>");
        result.append(", urlPath: ");
        result.append(urlPath);
        result.append(", MVN: ");
        result.append(mvn);
        result.append(')');
        return result.toString();
    }
    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.bundleID == null) ? 0 : this.bundleID.hashCode());
        result = prime * result + ((this.mESSAGE == null) ? 0 : this.mESSAGE.hashCode());
        result = prime * result + ((this.mODULE == null) ? 0 : this.mODULE.hashCode());
        result = prime * result + ((this.mODULEGROUP == null) ? 0 : this.mODULEGROUP.hashCode());
        result = prime * result + ((this.nAME == null) ? 0 : this.nAME.hashCode());
        result = prime * result + ((this.rEQUIREDIF == null) ? 0 : this.rEQUIREDIF.hashCode());
        result = prime * result + ((this.urlPath == null) ? 0 : this.urlPath.hashCode());
        result = prime * result + ((this.mvn == null) ? 0 : this.mvn.hashCode());
        result = prime * result + (this.mRREQUIREDESet ? 1231 : 1237);  //boolean
        result = prime * result + (this.rEQUIREDESet ? 1231 : 1237);
        result = prime * result + (this.sHOWESet ? 1231 : 1237);
        result = prime * result + ((this.uRL == null) ? 0 : this.uRL.hashCode());
        return result;
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IMPORTTypeImpl other = (IMPORTTypeImpl) obj;
        if(eIsProxy() != other.eIsProxy() ) {
            return false;
        }
        
        if (!StringUtils.equals(this.getBundleID(), other.getBundleID())) {
            return false;
        }
        if (!StringUtils.equals(this.getMESSAGE(), other.getMESSAGE())) {
            return false;
        }
        if (!StringUtils.equals(this.getMODULE(), other.getMODULE())) {
            return false;
        }
        if (!StringUtils.equals(this.getMODULEGROUP(), other.getMODULEGROUP())) {
            return false;
        }
        if (!StringUtils.equals(this.getNAME(), other.getNAME())) {
            return false;
        }
        if (!StringUtils.equals(this.getREQUIREDIF(), other.getREQUIREDIF())) {
            return false;
        }
        if (!StringUtils.equals(this.getUrlPath(), other.getUrlPath())) {
            return false;
        }
        if (!StringUtils.equals(this.getMVN(), other.getMVN())) {
            return false;
        }
        if(this.mRREQUIREDESet != other.mRREQUIREDESet) {
            return false;
        }
        if(this.rEQUIREDESet != other.rEQUIREDESet) {
            return false;
        }
        if(this.sHOWESet != other.sHOWESet) {
            return false;
        }
        
        if((uRL !=null && other.uRL == null) || ((uRL ==null && other.uRL != null))) {
            return false;
        } else if(uRL != null && other.uRL != null){
            Collections.sort(uRL);
            Collections.sort(other.uRL);
            if(!Arrays.equals(uRL.toArray(), other.uRL.toArray())) {
                return false;
            }
        }
        
        return true;
    }

} //IMPORTTypeImpl
