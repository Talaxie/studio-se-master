/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.record.impl.RecordFileImpl;
import orgomg.cwmx.resource.imsdatabase.ACBLIB;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.PSB;
import orgomg.cwmx.resource.imsdatabase.PSBLib;
import orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PSB</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#isCompatibility <em>Compatibility</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getIoErrorOption <em>Io Error Option</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getIoaSize <em>Ioa Size</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getLockMaximum <em>Lock Maximum</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getMaximumQxCalls <em>Maximum Qx Calls</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#isOnlineImageCopy <em>Online Image Copy</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getSsaSize <em>Ssa Size</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#isWriteToOperator <em>Write To Operator</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getAcblib <em>Acblib</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getPcb <em>Pcb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.PSBImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PSBImpl extends RecordFileImpl implements PSB {

    /**
     * The default value of the '{@link #isCompatibility() <em>Compatibility</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isCompatibility()
     * @generated
     * @ordered
     */
    protected static final boolean COMPATIBILITY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCompatibility() <em>Compatibility</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isCompatibility()
     * @generated
     * @ordered
     */
    protected boolean compatibility = COMPATIBILITY_EDEFAULT;

    /**
     * The default value of the '{@link #getIoErrorOption() <em>Io Error Option</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIoErrorOption()
     * @generated
     * @ordered
     */
    protected static final long IO_ERROR_OPTION_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIoErrorOption() <em>Io Error Option</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIoErrorOption()
     * @generated
     * @ordered
     */
    protected long ioErrorOption = IO_ERROR_OPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getIoaSize() <em>Ioa Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIoaSize()
     * @generated
     * @ordered
     */
    protected static final long IOA_SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIoaSize() <em>Ioa Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIoaSize()
     * @generated
     * @ordered
     */
    protected long ioaSize = IOA_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected static final PSBLanguageType LANGUAGE_EDEFAULT = PSBLanguageType.IMSLT_ASSEM;

    /**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected PSBLanguageType language = LANGUAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getLockMaximum() <em>Lock Maximum</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLockMaximum()
     * @generated
     * @ordered
     */
    protected static final long LOCK_MAXIMUM_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getLockMaximum() <em>Lock Maximum</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLockMaximum()
     * @generated
     * @ordered
     */
    protected long lockMaximum = LOCK_MAXIMUM_EDEFAULT;

    /**
     * The default value of the '{@link #getMaximumQxCalls() <em>Maximum Qx Calls</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMaximumQxCalls()
     * @generated
     * @ordered
     */
    protected static final long MAXIMUM_QX_CALLS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMaximumQxCalls() <em>Maximum Qx Calls</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMaximumQxCalls()
     * @generated
     * @ordered
     */
    protected long maximumQxCalls = MAXIMUM_QX_CALLS_EDEFAULT;

    /**
     * The default value of the '{@link #isOnlineImageCopy() <em>Online Image Copy</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isOnlineImageCopy()
     * @generated
     * @ordered
     */
    protected static final boolean ONLINE_IMAGE_COPY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOnlineImageCopy() <em>Online Image Copy</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isOnlineImageCopy()
     * @generated
     * @ordered
     */
    protected boolean onlineImageCopy = ONLINE_IMAGE_COPY_EDEFAULT;

    /**
     * The default value of the '{@link #getSsaSize() <em>Ssa Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSsaSize()
     * @generated
     * @ordered
     */
    protected static final long SSA_SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSsaSize() <em>Ssa Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSsaSize()
     * @generated
     * @ordered
     */
    protected long ssaSize = SSA_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #isWriteToOperator() <em>Write To Operator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isWriteToOperator()
     * @generated
     * @ordered
     */
    protected static final boolean WRITE_TO_OPERATOR_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isWriteToOperator() <em>Write To Operator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isWriteToOperator()
     * @generated
     * @ordered
     */
    protected boolean writeToOperator = WRITE_TO_OPERATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getAcblib() <em>Acblib</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAcblib()
     * @generated
     * @ordered
     */
    protected EList<ACBLIB> acblib;

    /**
     * The cached value of the '{@link #getPcb() <em>Pcb</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPcb()
     * @generated
     * @ordered
     */
    protected EList<PCB> pcb;

    /**
     * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
    protected EList<PSBLib> library;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PSBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.PSB;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isCompatibility() {
        return compatibility;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCompatibility(boolean newCompatibility) {
        boolean oldCompatibility = compatibility;
        compatibility = newCompatibility;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__COMPATIBILITY, oldCompatibility,
                    compatibility));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getIoErrorOption() {
        return ioErrorOption;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIoErrorOption(long newIoErrorOption) {
        long oldIoErrorOption = ioErrorOption;
        ioErrorOption = newIoErrorOption;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__IO_ERROR_OPTION, oldIoErrorOption,
                    ioErrorOption));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getIoaSize() {
        return ioaSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIoaSize(long newIoaSize) {
        long oldIoaSize = ioaSize;
        ioaSize = newIoaSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__IOA_SIZE, oldIoaSize, ioaSize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PSBLanguageType getLanguage() {
        return language;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLanguage(PSBLanguageType newLanguage) {
        PSBLanguageType oldLanguage = language;
        language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__LANGUAGE, oldLanguage, language));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getLockMaximum() {
        return lockMaximum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLockMaximum(long newLockMaximum) {
        long oldLockMaximum = lockMaximum;
        lockMaximum = newLockMaximum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__LOCK_MAXIMUM, oldLockMaximum,
                    lockMaximum));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMaximumQxCalls() {
        return maximumQxCalls;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaximumQxCalls(long newMaximumQxCalls) {
        long oldMaximumQxCalls = maximumQxCalls;
        maximumQxCalls = newMaximumQxCalls;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__MAXIMUM_QX_CALLS, oldMaximumQxCalls,
                    maximumQxCalls));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isOnlineImageCopy() {
        return onlineImageCopy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOnlineImageCopy(boolean newOnlineImageCopy) {
        boolean oldOnlineImageCopy = onlineImageCopy;
        onlineImageCopy = newOnlineImageCopy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__ONLINE_IMAGE_COPY, oldOnlineImageCopy,
                    onlineImageCopy));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getSsaSize() {
        return ssaSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSsaSize(long newSsaSize) {
        long oldSsaSize = ssaSize;
        ssaSize = newSsaSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__SSA_SIZE, oldSsaSize, ssaSize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isWriteToOperator() {
        return writeToOperator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setWriteToOperator(boolean newWriteToOperator) {
        boolean oldWriteToOperator = writeToOperator;
        writeToOperator = newWriteToOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.PSB__WRITE_TO_OPERATOR, oldWriteToOperator,
                    writeToOperator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ACBLIB> getAcblib() {
        if (acblib == null) {
            acblib = new EObjectWithInverseResolvingEList.ManyInverse<ACBLIB>(ACBLIB.class, this, ImsdatabasePackage.PSB__ACBLIB,
                    ImsdatabasePackage.ACBLIB__PSB);
        }
        return acblib;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<PCB> getPcb() {
        if (pcb == null) {
            pcb = new EObjectWithInverseResolvingEList.ManyInverse<PCB>(PCB.class, this, ImsdatabasePackage.PSB__PCB,
                    ImsdatabasePackage.PCB__PSB);
        }
        return pcb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<PSBLib> getLibrary() {
        if (library == null) {
            library = new EObjectWithInverseResolvingEList.ManyInverse<PSBLib>(PSBLib.class, this,
                    ImsdatabasePackage.PSB__LIBRARY, ImsdatabasePackage.PSB_LIB__PSB);
        }
        return library;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.PSB__ACBLIB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAcblib()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.PSB__PCB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPcb()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.PSB__LIBRARY:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLibrary()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.PSB__ACBLIB:
            return ((InternalEList<?>) getAcblib()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.PSB__PCB:
            return ((InternalEList<?>) getPcb()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.PSB__LIBRARY:
            return ((InternalEList<?>) getLibrary()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.PSB__COMPATIBILITY:
            return isCompatibility();
        case ImsdatabasePackage.PSB__IO_ERROR_OPTION:
            return getIoErrorOption();
        case ImsdatabasePackage.PSB__IOA_SIZE:
            return getIoaSize();
        case ImsdatabasePackage.PSB__LANGUAGE:
            return getLanguage();
        case ImsdatabasePackage.PSB__LOCK_MAXIMUM:
            return getLockMaximum();
        case ImsdatabasePackage.PSB__MAXIMUM_QX_CALLS:
            return getMaximumQxCalls();
        case ImsdatabasePackage.PSB__ONLINE_IMAGE_COPY:
            return isOnlineImageCopy();
        case ImsdatabasePackage.PSB__SSA_SIZE:
            return getSsaSize();
        case ImsdatabasePackage.PSB__WRITE_TO_OPERATOR:
            return isWriteToOperator();
        case ImsdatabasePackage.PSB__ACBLIB:
            return getAcblib();
        case ImsdatabasePackage.PSB__PCB:
            return getPcb();
        case ImsdatabasePackage.PSB__LIBRARY:
            return getLibrary();
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
        case ImsdatabasePackage.PSB__COMPATIBILITY:
            setCompatibility((Boolean) newValue);
            return;
        case ImsdatabasePackage.PSB__IO_ERROR_OPTION:
            setIoErrorOption((Long) newValue);
            return;
        case ImsdatabasePackage.PSB__IOA_SIZE:
            setIoaSize((Long) newValue);
            return;
        case ImsdatabasePackage.PSB__LANGUAGE:
            setLanguage((PSBLanguageType) newValue);
            return;
        case ImsdatabasePackage.PSB__LOCK_MAXIMUM:
            setLockMaximum((Long) newValue);
            return;
        case ImsdatabasePackage.PSB__MAXIMUM_QX_CALLS:
            setMaximumQxCalls((Long) newValue);
            return;
        case ImsdatabasePackage.PSB__ONLINE_IMAGE_COPY:
            setOnlineImageCopy((Boolean) newValue);
            return;
        case ImsdatabasePackage.PSB__SSA_SIZE:
            setSsaSize((Long) newValue);
            return;
        case ImsdatabasePackage.PSB__WRITE_TO_OPERATOR:
            setWriteToOperator((Boolean) newValue);
            return;
        case ImsdatabasePackage.PSB__ACBLIB:
            getAcblib().clear();
            getAcblib().addAll((Collection<? extends ACBLIB>) newValue);
            return;
        case ImsdatabasePackage.PSB__PCB:
            getPcb().clear();
            getPcb().addAll((Collection<? extends PCB>) newValue);
            return;
        case ImsdatabasePackage.PSB__LIBRARY:
            getLibrary().clear();
            getLibrary().addAll((Collection<? extends PSBLib>) newValue);
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
        case ImsdatabasePackage.PSB__COMPATIBILITY:
            setCompatibility(COMPATIBILITY_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__IO_ERROR_OPTION:
            setIoErrorOption(IO_ERROR_OPTION_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__IOA_SIZE:
            setIoaSize(IOA_SIZE_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__LANGUAGE:
            setLanguage(LANGUAGE_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__LOCK_MAXIMUM:
            setLockMaximum(LOCK_MAXIMUM_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__MAXIMUM_QX_CALLS:
            setMaximumQxCalls(MAXIMUM_QX_CALLS_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__ONLINE_IMAGE_COPY:
            setOnlineImageCopy(ONLINE_IMAGE_COPY_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__SSA_SIZE:
            setSsaSize(SSA_SIZE_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__WRITE_TO_OPERATOR:
            setWriteToOperator(WRITE_TO_OPERATOR_EDEFAULT);
            return;
        case ImsdatabasePackage.PSB__ACBLIB:
            getAcblib().clear();
            return;
        case ImsdatabasePackage.PSB__PCB:
            getPcb().clear();
            return;
        case ImsdatabasePackage.PSB__LIBRARY:
            getLibrary().clear();
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
        case ImsdatabasePackage.PSB__COMPATIBILITY:
            return compatibility != COMPATIBILITY_EDEFAULT;
        case ImsdatabasePackage.PSB__IO_ERROR_OPTION:
            return ioErrorOption != IO_ERROR_OPTION_EDEFAULT;
        case ImsdatabasePackage.PSB__IOA_SIZE:
            return ioaSize != IOA_SIZE_EDEFAULT;
        case ImsdatabasePackage.PSB__LANGUAGE:
            return language != LANGUAGE_EDEFAULT;
        case ImsdatabasePackage.PSB__LOCK_MAXIMUM:
            return lockMaximum != LOCK_MAXIMUM_EDEFAULT;
        case ImsdatabasePackage.PSB__MAXIMUM_QX_CALLS:
            return maximumQxCalls != MAXIMUM_QX_CALLS_EDEFAULT;
        case ImsdatabasePackage.PSB__ONLINE_IMAGE_COPY:
            return onlineImageCopy != ONLINE_IMAGE_COPY_EDEFAULT;
        case ImsdatabasePackage.PSB__SSA_SIZE:
            return ssaSize != SSA_SIZE_EDEFAULT;
        case ImsdatabasePackage.PSB__WRITE_TO_OPERATOR:
            return writeToOperator != WRITE_TO_OPERATOR_EDEFAULT;
        case ImsdatabasePackage.PSB__ACBLIB:
            return acblib != null && !acblib.isEmpty();
        case ImsdatabasePackage.PSB__PCB:
            return pcb != null && !pcb.isEmpty();
        case ImsdatabasePackage.PSB__LIBRARY:
            return library != null && !library.isEmpty();
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
        result.append(" (compatibility: ");
        result.append(compatibility);
        result.append(", ioErrorOption: ");
        result.append(ioErrorOption);
        result.append(", ioaSize: ");
        result.append(ioaSize);
        result.append(", language: ");
        result.append(language);
        result.append(", lockMaximum: ");
        result.append(lockMaximum);
        result.append(", maximumQxCalls: ");
        result.append(maximumQxCalls);
        result.append(", onlineImageCopy: ");
        result.append(onlineImageCopy);
        result.append(", ssaSize: ");
        result.append(ssaSize);
        result.append(", writeToOperator: ");
        result.append(writeToOperator);
        result.append(')');
        return result.toString();
    }

} // PSBImpl
