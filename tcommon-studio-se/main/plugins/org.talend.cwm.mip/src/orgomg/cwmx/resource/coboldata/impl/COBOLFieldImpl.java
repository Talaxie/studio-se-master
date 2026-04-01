/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.COBOLItem;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.OccursKey;
import orgomg.cwmx.resource.coboldata.Renames;
import orgomg.cwmx.resource.coboldata.SignKindType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>COBOL Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getSignKind <em>Sign Kind</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#isIsFiller <em>Is Filler</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#isIsJustifiedRight <em>Is Justified Right</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#isIsBlankWhenZero <em>Is Blank When Zero</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#isIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getOccursLower <em>Occurs Lower</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getOccursUpper <em>Occurs Upper</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#isIsGlobal <em>Is Global</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getDependingOnField <em>Depending On Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getRedefinedField <em>Redefined Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getRedefinedByField <em>Redefined By Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getOccursKeyInfo <em>Occurs Key Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getOccursKeyFieldInfo <em>Occurs Key Field Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getFirstRenames <em>First Renames</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLFieldImpl#getThruRenames <em>Thru Renames</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COBOLFieldImpl extends COBOLItemImpl implements COBOLField {

    /**
     * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected static final long LEVEL_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
    protected long level = LEVEL_EDEFAULT;

    /**
     * The default value of the '{@link #getSignKind() <em>Sign Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSignKind()
     * @generated
     * @ordered
     */
    protected static final SignKindType SIGN_KIND_EDEFAULT = SignKindType.SK_UNSIGNED;

    /**
     * The cached value of the '{@link #getSignKind() <em>Sign Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSignKind()
     * @generated
     * @ordered
     */
    protected SignKindType signKind = SIGN_KIND_EDEFAULT;

    /**
     * The default value of the '{@link #isIsFiller() <em>Is Filler</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsFiller()
     * @generated
     * @ordered
     */
    protected static final boolean IS_FILLER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsFiller() <em>Is Filler</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsFiller()
     * @generated
     * @ordered
     */
    protected boolean isFiller = IS_FILLER_EDEFAULT;

    /**
     * The default value of the '{@link #isIsJustifiedRight() <em>Is Justified Right</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsJustifiedRight()
     * @generated
     * @ordered
     */
    protected static final boolean IS_JUSTIFIED_RIGHT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsJustifiedRight() <em>Is Justified Right</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsJustifiedRight()
     * @generated
     * @ordered
     */
    protected boolean isJustifiedRight = IS_JUSTIFIED_RIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #isIsBlankWhenZero() <em>Is Blank When Zero</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsBlankWhenZero()
     * @generated
     * @ordered
     */
    protected static final boolean IS_BLANK_WHEN_ZERO_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsBlankWhenZero() <em>Is Blank When Zero</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsBlankWhenZero()
     * @generated
     * @ordered
     */
    protected boolean isBlankWhenZero = IS_BLANK_WHEN_ZERO_EDEFAULT;

    /**
     * The default value of the '{@link #isIsSynchronized() <em>Is Synchronized</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsSynchronized()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SYNCHRONIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSynchronized() <em>Is Synchronized</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsSynchronized()
     * @generated
     * @ordered
     */
    protected boolean isSynchronized = IS_SYNCHRONIZED_EDEFAULT;

    /**
     * The default value of the '{@link #getPicture() <em>Picture</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPicture()
     * @generated
     * @ordered
     */
    protected static final String PICTURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPicture() <em>Picture</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPicture()
     * @generated
     * @ordered
     */
    protected String picture = PICTURE_EDEFAULT;

    /**
     * The default value of the '{@link #getOccursLower() <em>Occurs Lower</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccursLower()
     * @generated
     * @ordered
     */
    protected static final long OCCURS_LOWER_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getOccursLower() <em>Occurs Lower</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccursLower()
     * @generated
     * @ordered
     */
    protected long occursLower = OCCURS_LOWER_EDEFAULT;

    /**
     * The default value of the '{@link #getOccursUpper() <em>Occurs Upper</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccursUpper()
     * @generated
     * @ordered
     */
    protected static final long OCCURS_UPPER_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getOccursUpper() <em>Occurs Upper</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccursUpper()
     * @generated
     * @ordered
     */
    protected long occursUpper = OCCURS_UPPER_EDEFAULT;

    /**
     * The default value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIndexName()
     * @generated
     * @ordered
     */
    protected static final String INDEX_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIndexName()
     * @generated
     * @ordered
     */
    protected String indexName = INDEX_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsExternal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXTERNAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsExternal()
     * @generated
     * @ordered
     */
    protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGlobal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GLOBAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGlobal() <em>Is Global</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGlobal()
     * @generated
     * @ordered
     */
    protected boolean isGlobal = IS_GLOBAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getDependingOnField() <em>Depending On Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDependingOnField()
     * @generated
     * @ordered
     */
    protected COBOLItem dependingOnField;

    /**
     * The cached value of the '{@link #getRedefinedField() <em>Redefined Field</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getRedefinedField()
     * @generated
     * @ordered
     */
    protected COBOLField redefinedField;

    /**
     * The cached value of the '{@link #getRedefinedByField() <em>Redefined By Field</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedByField()
     * @generated
     * @ordered
     */
    protected EList<COBOLField> redefinedByField;

    /**
     * The cached value of the '{@link #getOccursKeyInfo()
     * <em>Occurs Key Info</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOccursKeyInfo()
     * @generated
     * @ordered
     */
    protected EList<OccursKey> occursKeyInfo;

    /**
     * The cached value of the '{@link #getOccursKeyFieldInfo() <em>Occurs Key Field Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOccursKeyFieldInfo()
     * @generated
     * @ordered
     */
    protected EList<OccursKey> occursKeyFieldInfo;

    /**
     * The cached value of the '{@link #getFirstRenames() <em>First Renames</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFirstRenames()
     * @generated
     * @ordered
     */
    protected EList<Renames> firstRenames;

    /**
     * The cached value of the '{@link #getThruRenames() <em>Thru Renames</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getThruRenames()
     * @generated
     * @ordered
     */
    protected EList<Renames> thruRenames;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected COBOLFieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.COBOL_FIELD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getLevel() {
        return level;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLevel(long newLevel) {
        long oldLevel = level;
        level = newLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__LEVEL, oldLevel, level));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SignKindType getSignKind() {
        return signKind;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSignKind(SignKindType newSignKind) {
        SignKindType oldSignKind = signKind;
        signKind = newSignKind == null ? SIGN_KIND_EDEFAULT : newSignKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__SIGN_KIND, oldSignKind, signKind));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsFiller() {
        return isFiller;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsFiller(boolean newIsFiller) {
        boolean oldIsFiller = isFiller;
        isFiller = newIsFiller;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__IS_FILLER, oldIsFiller, isFiller));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsJustifiedRight() {
        return isJustifiedRight;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsJustifiedRight(boolean newIsJustifiedRight) {
        boolean oldIsJustifiedRight = isJustifiedRight;
        isJustifiedRight = newIsJustifiedRight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__IS_JUSTIFIED_RIGHT,
                    oldIsJustifiedRight, isJustifiedRight));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsBlankWhenZero() {
        return isBlankWhenZero;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsBlankWhenZero(boolean newIsBlankWhenZero) {
        boolean oldIsBlankWhenZero = isBlankWhenZero;
        isBlankWhenZero = newIsBlankWhenZero;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__IS_BLANK_WHEN_ZERO,
                    oldIsBlankWhenZero, isBlankWhenZero));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSynchronized() {
        return isSynchronized;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsSynchronized(boolean newIsSynchronized) {
        boolean oldIsSynchronized = isSynchronized;
        isSynchronized = newIsSynchronized;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__IS_SYNCHRONIZED,
                    oldIsSynchronized, isSynchronized));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPicture() {
        return picture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPicture(String newPicture) {
        String oldPicture = picture;
        picture = newPicture;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__PICTURE, oldPicture, picture));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getOccursLower() {
        return occursLower;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOccursLower(long newOccursLower) {
        long oldOccursLower = occursLower;
        occursLower = newOccursLower;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__OCCURS_LOWER, oldOccursLower,
                    occursLower));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getOccursUpper() {
        return occursUpper;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOccursUpper(long newOccursUpper) {
        long oldOccursUpper = occursUpper;
        occursUpper = newOccursUpper;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__OCCURS_UPPER, oldOccursUpper,
                    occursUpper));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIndexName(String newIndexName) {
        String oldIndexName = indexName;
        indexName = newIndexName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__INDEX_NAME, oldIndexName,
                    indexName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExternal() {
        return isExternal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsExternal(boolean newIsExternal) {
        boolean oldIsExternal = isExternal;
        isExternal = newIsExternal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__IS_EXTERNAL, oldIsExternal,
                    isExternal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGlobal(boolean newIsGlobal) {
        boolean oldIsGlobal = isGlobal;
        isGlobal = newIsGlobal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__IS_GLOBAL, oldIsGlobal, isGlobal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem getDependingOnField() {
        if (dependingOnField != null && dependingOnField.eIsProxy()) {
            InternalEObject oldDependingOnField = (InternalEObject) dependingOnField;
            dependingOnField = (COBOLItem) eResolveProxy(oldDependingOnField);
            if (dependingOnField != oldDependingOnField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD,
                            oldDependingOnField, dependingOnField));
            }
        }
        return dependingOnField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLItem basicGetDependingOnField() {
        return dependingOnField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDependingOnField(COBOLItem newDependingOnField, NotificationChain msgs) {
        COBOLItem oldDependingOnField = dependingOnField;
        dependingOnField = newDependingOnField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD, oldDependingOnField, newDependingOnField);
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
    public void setDependingOnField(COBOLItem newDependingOnField) {
        if (newDependingOnField != dependingOnField) {
            NotificationChain msgs = null;
            if (dependingOnField != null)
                msgs = ((InternalEObject) dependingOnField).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD,
                        COBOLItem.class, msgs);
            if (newDependingOnField != null)
                msgs = ((InternalEObject) newDependingOnField).eInverseAdd(this, CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD,
                        COBOLItem.class, msgs);
            msgs = basicSetDependingOnField(newDependingOnField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD,
                    newDependingOnField, newDependingOnField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField getRedefinedField() {
        if (redefinedField != null && redefinedField.eIsProxy()) {
            InternalEObject oldRedefinedField = (InternalEObject) redefinedField;
            redefinedField = (COBOLField) eResolveProxy(oldRedefinedField);
            if (redefinedField != oldRedefinedField) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD,
                            oldRedefinedField, redefinedField));
            }
        }
        return redefinedField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField basicGetRedefinedField() {
        return redefinedField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRedefinedField(COBOLField newRedefinedField, NotificationChain msgs) {
        COBOLField oldRedefinedField = redefinedField;
        redefinedField = newRedefinedField;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD, oldRedefinedField, newRedefinedField);
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
    public void setRedefinedField(COBOLField newRedefinedField) {
        if (newRedefinedField != redefinedField) {
            NotificationChain msgs = null;
            if (redefinedField != null)
                msgs = ((InternalEObject) redefinedField).eInverseRemove(this, CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD,
                        COBOLField.class, msgs);
            if (newRedefinedField != null)
                msgs = ((InternalEObject) newRedefinedField).eInverseAdd(this, CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD,
                        COBOLField.class, msgs);
            msgs = basicSetRedefinedField(newRedefinedField, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD,
                    newRedefinedField, newRedefinedField));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLField> getRedefinedByField() {
        if (redefinedByField == null) {
            redefinedByField = new EObjectWithInverseResolvingEList<COBOLField>(COBOLField.class, this,
                    CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD, CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD);
        }
        return redefinedByField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<OccursKey> getOccursKeyInfo() {
        if (occursKeyInfo == null) {
            occursKeyInfo = new EObjectContainmentWithInverseEList<OccursKey>(OccursKey.class, this,
                    CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO, CoboldataPackage.OCCURS_KEY__OCCURS_KEY_OF);
        }
        return occursKeyInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<OccursKey> getOccursKeyFieldInfo() {
        if (occursKeyFieldInfo == null) {
            occursKeyFieldInfo = new EObjectWithInverseResolvingEList<OccursKey>(OccursKey.class, this,
                    CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO, CoboldataPackage.OCCURS_KEY__OCCURS_KEY_FIELD);
        }
        return occursKeyFieldInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Renames> getFirstRenames() {
        if (firstRenames == null) {
            firstRenames = new EObjectWithInverseResolvingEList<Renames>(Renames.class, this,
                    CoboldataPackage.COBOL_FIELD__FIRST_RENAMES, CoboldataPackage.RENAMES__FIRST_FIELD);
        }
        return firstRenames;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Renames> getThruRenames() {
        if (thruRenames == null) {
            thruRenames = new EObjectWithInverseResolvingEList<Renames>(Renames.class, this,
                    CoboldataPackage.COBOL_FIELD__THRU_RENAMES, CoboldataPackage.RENAMES__THRU_FIELD);
        }
        return thruRenames;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD:
            if (dependingOnField != null)
                msgs = ((InternalEObject) dependingOnField).eInverseRemove(this, CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD,
                        COBOLItem.class, msgs);
            return basicSetDependingOnField((COBOLItem) otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD:
            if (redefinedField != null)
                msgs = ((InternalEObject) redefinedField).eInverseRemove(this, CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD,
                        COBOLField.class, msgs);
            return basicSetRedefinedField((COBOLField) otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRedefinedByField()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOccursKeyInfo()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOccursKeyFieldInfo()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__FIRST_RENAMES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getFirstRenames()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__THRU_RENAMES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getThruRenames()).basicAdd(otherEnd, msgs);
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
        case CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD:
            return basicSetDependingOnField(null, msgs);
        case CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD:
            return basicSetRedefinedField(null, msgs);
        case CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD:
            return ((InternalEList<?>) getRedefinedByField()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
            return ((InternalEList<?>) getOccursKeyInfo()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO:
            return ((InternalEList<?>) getOccursKeyFieldInfo()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__FIRST_RENAMES:
            return ((InternalEList<?>) getFirstRenames()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_FIELD__THRU_RENAMES:
            return ((InternalEList<?>) getThruRenames()).basicRemove(otherEnd, msgs);
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
        case CoboldataPackage.COBOL_FIELD__LEVEL:
            return getLevel();
        case CoboldataPackage.COBOL_FIELD__SIGN_KIND:
            return getSignKind();
        case CoboldataPackage.COBOL_FIELD__IS_FILLER:
            return isIsFiller();
        case CoboldataPackage.COBOL_FIELD__IS_JUSTIFIED_RIGHT:
            return isIsJustifiedRight();
        case CoboldataPackage.COBOL_FIELD__IS_BLANK_WHEN_ZERO:
            return isIsBlankWhenZero();
        case CoboldataPackage.COBOL_FIELD__IS_SYNCHRONIZED:
            return isIsSynchronized();
        case CoboldataPackage.COBOL_FIELD__PICTURE:
            return getPicture();
        case CoboldataPackage.COBOL_FIELD__OCCURS_LOWER:
            return getOccursLower();
        case CoboldataPackage.COBOL_FIELD__OCCURS_UPPER:
            return getOccursUpper();
        case CoboldataPackage.COBOL_FIELD__INDEX_NAME:
            return getIndexName();
        case CoboldataPackage.COBOL_FIELD__IS_EXTERNAL:
            return isIsExternal();
        case CoboldataPackage.COBOL_FIELD__IS_GLOBAL:
            return isIsGlobal();
        case CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD:
            if (resolve)
                return getDependingOnField();
            return basicGetDependingOnField();
        case CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD:
            if (resolve)
                return getRedefinedField();
            return basicGetRedefinedField();
        case CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD:
            return getRedefinedByField();
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
            return getOccursKeyInfo();
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO:
            return getOccursKeyFieldInfo();
        case CoboldataPackage.COBOL_FIELD__FIRST_RENAMES:
            return getFirstRenames();
        case CoboldataPackage.COBOL_FIELD__THRU_RENAMES:
            return getThruRenames();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case CoboldataPackage.COBOL_FIELD__LEVEL:
            setLevel((Long) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__SIGN_KIND:
            setSignKind((SignKindType) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_FILLER:
            setIsFiller((Boolean) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_JUSTIFIED_RIGHT:
            setIsJustifiedRight((Boolean) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_BLANK_WHEN_ZERO:
            setIsBlankWhenZero((Boolean) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_SYNCHRONIZED:
            setIsSynchronized((Boolean) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__PICTURE:
            setPicture((String) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_LOWER:
            setOccursLower((Long) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_UPPER:
            setOccursUpper((Long) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__INDEX_NAME:
            setIndexName((String) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_EXTERNAL:
            setIsExternal((Boolean) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_GLOBAL:
            setIsGlobal((Boolean) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD:
            setDependingOnField((COBOLItem) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD:
            setRedefinedField((COBOLField) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD:
            getRedefinedByField().clear();
            getRedefinedByField().addAll((Collection<? extends COBOLField>) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
            getOccursKeyInfo().clear();
            getOccursKeyInfo().addAll((Collection<? extends OccursKey>) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO:
            getOccursKeyFieldInfo().clear();
            getOccursKeyFieldInfo().addAll((Collection<? extends OccursKey>) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__FIRST_RENAMES:
            getFirstRenames().clear();
            getFirstRenames().addAll((Collection<? extends Renames>) newValue);
            return;
        case CoboldataPackage.COBOL_FIELD__THRU_RENAMES:
            getThruRenames().clear();
            getThruRenames().addAll((Collection<? extends Renames>) newValue);
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
        case CoboldataPackage.COBOL_FIELD__LEVEL:
            setLevel(LEVEL_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__SIGN_KIND:
            setSignKind(SIGN_KIND_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_FILLER:
            setIsFiller(IS_FILLER_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_JUSTIFIED_RIGHT:
            setIsJustifiedRight(IS_JUSTIFIED_RIGHT_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_BLANK_WHEN_ZERO:
            setIsBlankWhenZero(IS_BLANK_WHEN_ZERO_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_SYNCHRONIZED:
            setIsSynchronized(IS_SYNCHRONIZED_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__PICTURE:
            setPicture(PICTURE_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_LOWER:
            setOccursLower(OCCURS_LOWER_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_UPPER:
            setOccursUpper(OCCURS_UPPER_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__INDEX_NAME:
            setIndexName(INDEX_NAME_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_EXTERNAL:
            setIsExternal(IS_EXTERNAL_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__IS_GLOBAL:
            setIsGlobal(IS_GLOBAL_EDEFAULT);
            return;
        case CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD:
            setDependingOnField((COBOLItem) null);
            return;
        case CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD:
            setRedefinedField((COBOLField) null);
            return;
        case CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD:
            getRedefinedByField().clear();
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
            getOccursKeyInfo().clear();
            return;
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO:
            getOccursKeyFieldInfo().clear();
            return;
        case CoboldataPackage.COBOL_FIELD__FIRST_RENAMES:
            getFirstRenames().clear();
            return;
        case CoboldataPackage.COBOL_FIELD__THRU_RENAMES:
            getThruRenames().clear();
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
        case CoboldataPackage.COBOL_FIELD__LEVEL:
            return level != LEVEL_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__SIGN_KIND:
            return signKind != SIGN_KIND_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__IS_FILLER:
            return isFiller != IS_FILLER_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__IS_JUSTIFIED_RIGHT:
            return isJustifiedRight != IS_JUSTIFIED_RIGHT_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__IS_BLANK_WHEN_ZERO:
            return isBlankWhenZero != IS_BLANK_WHEN_ZERO_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__IS_SYNCHRONIZED:
            return isSynchronized != IS_SYNCHRONIZED_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__PICTURE:
            return PICTURE_EDEFAULT == null ? picture != null : !PICTURE_EDEFAULT.equals(picture);
        case CoboldataPackage.COBOL_FIELD__OCCURS_LOWER:
            return occursLower != OCCURS_LOWER_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__OCCURS_UPPER:
            return occursUpper != OCCURS_UPPER_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__INDEX_NAME:
            return INDEX_NAME_EDEFAULT == null ? indexName != null : !INDEX_NAME_EDEFAULT.equals(indexName);
        case CoboldataPackage.COBOL_FIELD__IS_EXTERNAL:
            return isExternal != IS_EXTERNAL_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__IS_GLOBAL:
            return isGlobal != IS_GLOBAL_EDEFAULT;
        case CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD:
            return dependingOnField != null;
        case CoboldataPackage.COBOL_FIELD__REDEFINED_FIELD:
            return redefinedField != null;
        case CoboldataPackage.COBOL_FIELD__REDEFINED_BY_FIELD:
            return redefinedByField != null && !redefinedByField.isEmpty();
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_INFO:
            return occursKeyInfo != null && !occursKeyInfo.isEmpty();
        case CoboldataPackage.COBOL_FIELD__OCCURS_KEY_FIELD_INFO:
            return occursKeyFieldInfo != null && !occursKeyFieldInfo.isEmpty();
        case CoboldataPackage.COBOL_FIELD__FIRST_RENAMES:
            return firstRenames != null && !firstRenames.isEmpty();
        case CoboldataPackage.COBOL_FIELD__THRU_RENAMES:
            return thruRenames != null && !thruRenames.isEmpty();
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
        result.append(" (level: ");
        result.append(level);
        result.append(", signKind: ");
        result.append(signKind);
        result.append(", isFiller: ");
        result.append(isFiller);
        result.append(", isJustifiedRight: ");
        result.append(isJustifiedRight);
        result.append(", isBlankWhenZero: ");
        result.append(isBlankWhenZero);
        result.append(", isSynchronized: ");
        result.append(isSynchronized);
        result.append(", picture: ");
        result.append(picture);
        result.append(", occursLower: ");
        result.append(occursLower);
        result.append(", occursUpper: ");
        result.append(occursUpper);
        result.append(", indexName: ");
        result.append(indexName);
        result.append(", isExternal: ");
        result.append(isExternal);
        result.append(", isGlobal: ");
        result.append(isGlobal);
        result.append(')');
        return result.toString();
    }

} // COBOLFieldImpl
