/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.designer.core.model.utils.emf.component.COLUMNType;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COLUMN Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#isCUSTOM <em>CUSTOM</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getDBTYPE <em>DBTYPE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getDEFAULT <em>DEFAULT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#isKEY <em>KEY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#isNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getPATTERN <em>PATTERN</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#isREADONLY <em>READONLY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getRELATEDENTITY <em>RELATEDENTITY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getRELATIONSHIPTYPE <em>RELATIONSHIPTYPE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.COLUMNTypeImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COLUMNTypeImpl extends EObjectImpl implements COLUMNType {
    /**
     * The default value of the '{@link #getCOMMENT() <em>COMMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMENT()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOMMENT() <em>COMMENT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOMMENT()
     * @generated
     * @ordered
     */
    protected String cOMMENT = COMMENT_EDEFAULT;

    /**
     * The default value of the '{@link #isCUSTOM() <em>CUSTOM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCUSTOM()
     * @generated
     * @ordered
     */
    protected static final boolean CUSTOM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCUSTOM() <em>CUSTOM</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCUSTOM()
     * @generated
     * @ordered
     */
    protected boolean cUSTOM = CUSTOM_EDEFAULT;

    /**
     * This is true if the CUSTOM attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cUSTOMESet;

    /**
     * The default value of the '{@link #getDBTYPE() <em>DBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDBTYPE()
     * @generated
     * @ordered
     */
    protected static final String DBTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDBTYPE() <em>DBTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDBTYPE()
     * @generated
     * @ordered
     */
    protected String dBTYPE = DBTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDEFAULT() <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULT()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDEFAULT() <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULT()
     * @generated
     * @ordered
     */
    protected String dEFAULT = DEFAULT_EDEFAULT;

    /**
     * The default value of the '{@link #isKEY() <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKEY()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKEY() <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isKEY()
     * @generated
     * @ordered
     */
    protected boolean kEY = KEY_EDEFAULT;

    /**
     * This is true if the KEY attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kEYESet;

    /**
     * The default value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLENGTH()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLENGTH()
     * @generated
     * @ordered
     */
    protected int lENGTH = LENGTH_EDEFAULT;

    /**
     * This is true if the LENGTH attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lENGTHESet;

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
     * The default value of the '{@link #isNULLABLE() <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNULLABLE()
     * @generated
     * @ordered
     */
    protected static final boolean NULLABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isNULLABLE() <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNULLABLE()
     * @generated
     * @ordered
     */
    protected boolean nULLABLE = NULLABLE_EDEFAULT;

    /**
     * This is true if the NULLABLE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nULLABLEESet;

    /**
     * The default value of the '{@link #getPATTERN() <em>PATTERN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPATTERN()
     * @generated
     * @ordered
     */
    protected static final String PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPATTERN() <em>PATTERN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPATTERN()
     * @generated
     * @ordered
     */
    protected String pATTERN = PATTERN_EDEFAULT;

    /**
     * The default value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected static final int PRECISION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPRECISION() <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPRECISION()
     * @generated
     * @ordered
     */
    protected int pRECISION = PRECISION_EDEFAULT;

    /**
     * This is true if the PRECISION attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pRECISIONESet;

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
     * The default value of the '{@link #getRELATEDENTITY() <em>RELATEDENTITY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRELATEDENTITY()
     * @generated
     * @ordered
     */
    protected static final String RELATEDENTITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRELATEDENTITY() <em>RELATEDENTITY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRELATEDENTITY()
     * @generated
     * @ordered
     */
    protected String rELATEDENTITY = RELATEDENTITY_EDEFAULT;

    /**
     * The default value of the '{@link #getRELATIONSHIPTYPE() <em>RELATIONSHIPTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRELATIONSHIPTYPE()
     * @generated
     * @ordered
     */
    protected static final String RELATIONSHIPTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRELATIONSHIPTYPE() <em>RELATIONSHIPTYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRELATIONSHIPTYPE()
     * @generated
     * @ordered
     */
    protected String rELATIONSHIPTYPE = RELATIONSHIPTYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
    protected String tYPE = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected COLUMNTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.COLUMN_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCOMMENT() {
        return cOMMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOMMENT(String newCOMMENT) {
        String oldCOMMENT = cOMMENT;
        cOMMENT = newCOMMENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__COMMENT, oldCOMMENT, cOMMENT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCUSTOM() {
        return cUSTOM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCUSTOM(boolean newCUSTOM) {
        boolean oldCUSTOM = cUSTOM;
        cUSTOM = newCUSTOM;
        boolean oldCUSTOMESet = cUSTOMESet;
        cUSTOMESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__CUSTOM, oldCUSTOM, cUSTOM, !oldCUSTOMESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCUSTOM() {
        boolean oldCUSTOM = cUSTOM;
        boolean oldCUSTOMESet = cUSTOMESet;
        cUSTOM = CUSTOM_EDEFAULT;
        cUSTOMESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.COLUMN_TYPE__CUSTOM, oldCUSTOM, CUSTOM_EDEFAULT, oldCUSTOMESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCUSTOM() {
        return cUSTOMESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDEFAULT() {
        return dEFAULT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDEFAULT(String newDEFAULT) {
        String oldDEFAULT = dEFAULT;
        dEFAULT = newDEFAULT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__DEFAULT, oldDEFAULT, dEFAULT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isKEY() {
        return kEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKEY(boolean newKEY) {
        boolean oldKEY = kEY;
        kEY = newKEY;
        boolean oldKEYESet = kEYESet;
        kEYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__KEY, oldKEY, kEY, !oldKEYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetKEY() {
        boolean oldKEY = kEY;
        boolean oldKEYESet = kEYESet;
        kEY = KEY_EDEFAULT;
        kEYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.COLUMN_TYPE__KEY, oldKEY, KEY_EDEFAULT, oldKEYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetKEY() {
        return kEYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLENGTH() {
        return lENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLENGTH(int newLENGTH) {
        int oldLENGTH = lENGTH;
        lENGTH = newLENGTH;
        boolean oldLENGTHESet = lENGTHESet;
        lENGTHESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__LENGTH, oldLENGTH, lENGTH, !oldLENGTHESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLENGTH() {
        int oldLENGTH = lENGTH;
        boolean oldLENGTHESet = lENGTHESet;
        lENGTH = LENGTH_EDEFAULT;
        lENGTHESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.COLUMN_TYPE__LENGTH, oldLENGTH, LENGTH_EDEFAULT, oldLENGTHESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLENGTH() {
        return lENGTHESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNULLABLE() {
        return nULLABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNULLABLE(boolean newNULLABLE) {
        boolean oldNULLABLE = nULLABLE;
        nULLABLE = newNULLABLE;
        boolean oldNULLABLEESet = nULLABLEESet;
        nULLABLEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__NULLABLE, oldNULLABLE, nULLABLE, !oldNULLABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNULLABLE() {
        boolean oldNULLABLE = nULLABLE;
        boolean oldNULLABLEESet = nULLABLEESet;
        nULLABLE = NULLABLE_EDEFAULT;
        nULLABLEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.COLUMN_TYPE__NULLABLE, oldNULLABLE, NULLABLE_EDEFAULT, oldNULLABLEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNULLABLE() {
        return nULLABLEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPATTERN() {
        return pATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPATTERN(String newPATTERN) {
        String oldPATTERN = pATTERN;
        pATTERN = newPATTERN;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__PATTERN, oldPATTERN, pATTERN));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPRECISION() {
        return pRECISION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPRECISION(int newPRECISION) {
        int oldPRECISION = pRECISION;
        pRECISION = newPRECISION;
        boolean oldPRECISIONESet = pRECISIONESet;
        pRECISIONESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__PRECISION, oldPRECISION, pRECISION, !oldPRECISIONESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPRECISION() {
        int oldPRECISION = pRECISION;
        boolean oldPRECISIONESet = pRECISIONESet;
        pRECISION = PRECISION_EDEFAULT;
        pRECISIONESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.COLUMN_TYPE__PRECISION, oldPRECISION, PRECISION_EDEFAULT, oldPRECISIONESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPRECISION() {
        return pRECISIONESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__READONLY, oldREADONLY, rEADONLY, !oldREADONLYESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.COLUMN_TYPE__READONLY, oldREADONLY, READONLY_EDEFAULT, oldREADONLYESet));
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
    public String getRELATEDENTITY() {
        return rELATEDENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRELATEDENTITY(String newRELATEDENTITY) {
        String oldRELATEDENTITY = rELATEDENTITY;
        rELATEDENTITY = newRELATEDENTITY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__RELATEDENTITY, oldRELATEDENTITY, rELATEDENTITY));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRELATIONSHIPTYPE() {
        return rELATIONSHIPTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRELATIONSHIPTYPE(String newRELATIONSHIPTYPE) {
        String oldRELATIONSHIPTYPE = rELATIONSHIPTYPE;
        rELATIONSHIPTYPE = newRELATIONSHIPTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__RELATIONSHIPTYPE, oldRELATIONSHIPTYPE, rELATIONSHIPTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTYPE() {
        return tYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTYPE(String newTYPE) {
        String oldTYPE = tYPE;
        tYPE = newTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__TYPE, oldTYPE, tYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDBTYPE() {
        return dBTYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDBTYPE(String newDBTYPE) {
        String oldDBTYPE = dBTYPE;
        dBTYPE = newDBTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COLUMN_TYPE__DBTYPE, oldDBTYPE, dBTYPE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.COLUMN_TYPE__COMMENT:
                return getCOMMENT();
            case ComponentPackage.COLUMN_TYPE__CUSTOM:
                return isCUSTOM() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.COLUMN_TYPE__DBTYPE:
                return getDBTYPE();
            case ComponentPackage.COLUMN_TYPE__DEFAULT:
                return getDEFAULT();
            case ComponentPackage.COLUMN_TYPE__KEY:
                return isKEY() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.COLUMN_TYPE__LENGTH:
                return new Integer(getLENGTH());
            case ComponentPackage.COLUMN_TYPE__NAME:
                return getNAME();
            case ComponentPackage.COLUMN_TYPE__NULLABLE:
                return isNULLABLE() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.COLUMN_TYPE__PATTERN:
                return getPATTERN();
            case ComponentPackage.COLUMN_TYPE__PRECISION:
                return new Integer(getPRECISION());
            case ComponentPackage.COLUMN_TYPE__READONLY:
                return isREADONLY() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.COLUMN_TYPE__RELATEDENTITY:
                return getRELATEDENTITY();
            case ComponentPackage.COLUMN_TYPE__RELATIONSHIPTYPE:
                return getRELATIONSHIPTYPE();
            case ComponentPackage.COLUMN_TYPE__TYPE:
                return getTYPE();
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
            case ComponentPackage.COLUMN_TYPE__COMMENT:
                setCOMMENT((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__CUSTOM:
                setCUSTOM(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.COLUMN_TYPE__DBTYPE:
                setDBTYPE((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__DEFAULT:
                setDEFAULT((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__KEY:
                setKEY(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.COLUMN_TYPE__LENGTH:
                setLENGTH(((Integer)newValue).intValue());
                return;
            case ComponentPackage.COLUMN_TYPE__NAME:
                setNAME((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__NULLABLE:
                setNULLABLE(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.COLUMN_TYPE__PATTERN:
                setPATTERN((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__PRECISION:
                setPRECISION(((Integer)newValue).intValue());
                return;
            case ComponentPackage.COLUMN_TYPE__READONLY:
                setREADONLY(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.COLUMN_TYPE__RELATEDENTITY:
                setRELATEDENTITY((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__RELATIONSHIPTYPE:
                setRELATIONSHIPTYPE((String)newValue);
                return;
            case ComponentPackage.COLUMN_TYPE__TYPE:
                setTYPE((String)newValue);
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
            case ComponentPackage.COLUMN_TYPE__COMMENT:
                setCOMMENT(COMMENT_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__CUSTOM:
                unsetCUSTOM();
                return;
            case ComponentPackage.COLUMN_TYPE__DBTYPE:
                setDBTYPE(DBTYPE_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__DEFAULT:
                setDEFAULT(DEFAULT_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__KEY:
                unsetKEY();
                return;
            case ComponentPackage.COLUMN_TYPE__LENGTH:
                unsetLENGTH();
                return;
            case ComponentPackage.COLUMN_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__NULLABLE:
                unsetNULLABLE();
                return;
            case ComponentPackage.COLUMN_TYPE__PATTERN:
                setPATTERN(PATTERN_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__PRECISION:
                unsetPRECISION();
                return;
            case ComponentPackage.COLUMN_TYPE__READONLY:
                unsetREADONLY();
                return;
            case ComponentPackage.COLUMN_TYPE__RELATEDENTITY:
                setRELATEDENTITY(RELATEDENTITY_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__RELATIONSHIPTYPE:
                setRELATIONSHIPTYPE(RELATIONSHIPTYPE_EDEFAULT);
                return;
            case ComponentPackage.COLUMN_TYPE__TYPE:
                setTYPE(TYPE_EDEFAULT);
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
            case ComponentPackage.COLUMN_TYPE__COMMENT:
                return COMMENT_EDEFAULT == null ? cOMMENT != null : !COMMENT_EDEFAULT.equals(cOMMENT);
            case ComponentPackage.COLUMN_TYPE__CUSTOM:
                return isSetCUSTOM();
            case ComponentPackage.COLUMN_TYPE__DBTYPE:
                return DBTYPE_EDEFAULT == null ? dBTYPE != null : !DBTYPE_EDEFAULT.equals(dBTYPE);
            case ComponentPackage.COLUMN_TYPE__DEFAULT:
                return DEFAULT_EDEFAULT == null ? dEFAULT != null : !DEFAULT_EDEFAULT.equals(dEFAULT);
            case ComponentPackage.COLUMN_TYPE__KEY:
                return isSetKEY();
            case ComponentPackage.COLUMN_TYPE__LENGTH:
                return isSetLENGTH();
            case ComponentPackage.COLUMN_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case ComponentPackage.COLUMN_TYPE__NULLABLE:
                return isSetNULLABLE();
            case ComponentPackage.COLUMN_TYPE__PATTERN:
                return PATTERN_EDEFAULT == null ? pATTERN != null : !PATTERN_EDEFAULT.equals(pATTERN);
            case ComponentPackage.COLUMN_TYPE__PRECISION:
                return isSetPRECISION();
            case ComponentPackage.COLUMN_TYPE__READONLY:
                return isSetREADONLY();
            case ComponentPackage.COLUMN_TYPE__RELATEDENTITY:
                return RELATEDENTITY_EDEFAULT == null ? rELATEDENTITY != null : !RELATEDENTITY_EDEFAULT.equals(rELATEDENTITY);
            case ComponentPackage.COLUMN_TYPE__RELATIONSHIPTYPE:
                return RELATIONSHIPTYPE_EDEFAULT == null ? rELATIONSHIPTYPE != null : !RELATIONSHIPTYPE_EDEFAULT.equals(rELATIONSHIPTYPE);
            case ComponentPackage.COLUMN_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? tYPE != null : !TYPE_EDEFAULT.equals(tYPE);
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
        result.append(" (cOMMENT: ");
        result.append(cOMMENT);
        result.append(", cUSTOM: ");
        if (cUSTOMESet) result.append(cUSTOM); else result.append("<unset>");
        result.append(", dBTYPE: ");
        result.append(dBTYPE);
        result.append(", dEFAULT: ");
        result.append(dEFAULT);
        result.append(", kEY: ");
        if (kEYESet) result.append(kEY); else result.append("<unset>");
        result.append(", lENGTH: ");
        if (lENGTHESet) result.append(lENGTH); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", nULLABLE: ");
        if (nULLABLEESet) result.append(nULLABLE); else result.append("<unset>");
        result.append(", pATTERN: ");
        result.append(pATTERN);
        result.append(", pRECISION: ");
        if (pRECISIONESet) result.append(pRECISION); else result.append("<unset>");
        result.append(", rEADONLY: ");
        if (rEADONLYESet) result.append(rEADONLY); else result.append("<unset>");
        result.append(", rELATEDENTITY: ");
        result.append(rELATEDENTITY);
        result.append(", rELATIONSHIPTYPE: ");
        result.append(rELATIONSHIPTYPE);
        result.append(", tYPE: ");
        result.append(tYPE);
        result.append(')');
        return result.toString();
    }

} //COLUMNTypeImpl
