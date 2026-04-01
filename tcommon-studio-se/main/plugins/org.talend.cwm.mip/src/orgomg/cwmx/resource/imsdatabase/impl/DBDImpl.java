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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.record.impl.RecordFileImpl;
import orgomg.cwmx.resource.imsdatabase.ACBLIB;
import orgomg.cwmx.resource.imsdatabase.AccessMethod;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.DBDLib;
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.Exit;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DBD</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getDliAccess <em>Dli Access</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#isIsVSAM <em>Is VSAM</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#isPasswordFlag <em>Password Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getVersionString <em>Version String</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getAcblib <em>Acblib</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getPcb <em>Pcb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.DBDImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBDImpl extends RecordFileImpl implements DBD {

    /**
     * The default value of the '{@link #getDliAccess() <em>Dli Access</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDliAccess()
     * @generated
     * @ordered
     */
    protected static final AccessMethodType DLI_ACCESS_EDEFAULT = AccessMethodType.IMSAM_DEDB;

    /**
     * The cached value of the '{@link #getDliAccess() <em>Dli Access</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDliAccess()
     * @generated
     * @ordered
     */
    protected AccessMethodType dliAccess = DLI_ACCESS_EDEFAULT;

    /**
     * The default value of the '{@link #isIsVSAM() <em>Is VSAM</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsVSAM()
     * @generated
     * @ordered
     */
    protected static final boolean IS_VSAM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsVSAM() <em>Is VSAM</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsVSAM()
     * @generated
     * @ordered
     */
    protected boolean isVSAM = IS_VSAM_EDEFAULT;

    /**
     * The default value of the '{@link #isPasswordFlag() <em>Password Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isPasswordFlag()
     * @generated
     * @ordered
     */
    protected static final boolean PASSWORD_FLAG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPasswordFlag() <em>Password Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isPasswordFlag()
     * @generated
     * @ordered
     */
    protected boolean passwordFlag = PASSWORD_FLAG_EDEFAULT;

    /**
     * The default value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersionString()
     * @generated
     * @ordered
     */
    protected static final String VERSION_STRING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersionString()
     * @generated
     * @ordered
     */
    protected String versionString = VERSION_STRING_EDEFAULT;

    /**
     * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessMethod()
     * @generated
     * @ordered
     */
    protected AccessMethod accessMethod;

    /**
     * The cached value of the '{@link #getAcblib() <em>Acblib</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAcblib()
     * @generated
     * @ordered
     */
    protected EList<ACBLIB> acblib;

    /**
     * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDataset()
     * @generated
     * @ordered
     */
    protected EList<Dataset> dataset;

    /**
     * The cached value of the '{@link #getSegment() <em>Segment</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSegment()
     * @generated
     * @ordered
     */
    protected EList<Segment> segment;

    /**
     * The cached value of the '{@link #getPcb() <em>Pcb</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPcb()
     * @generated
     * @ordered
     */
    protected EList<PCB> pcb;

    /**
     * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getExit()
     * @generated
     * @ordered
     */
    protected EList<Exit> exit;

    /**
     * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLibrary()
     * @generated
     * @ordered
     */
    protected EList<DBDLib> library;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DBDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.DBD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AccessMethodType getDliAccess() {
        return dliAccess;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDliAccess(AccessMethodType newDliAccess) {
        AccessMethodType oldDliAccess = dliAccess;
        dliAccess = newDliAccess == null ? DLI_ACCESS_EDEFAULT : newDliAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DBD__DLI_ACCESS, oldDliAccess, dliAccess));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsVSAM() {
        return isVSAM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsVSAM(boolean newIsVSAM) {
        boolean oldIsVSAM = isVSAM;
        isVSAM = newIsVSAM;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DBD__IS_VSAM, oldIsVSAM, isVSAM));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isPasswordFlag() {
        return passwordFlag;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPasswordFlag(boolean newPasswordFlag) {
        boolean oldPasswordFlag = passwordFlag;
        passwordFlag = newPasswordFlag;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DBD__PASSWORD_FLAG, oldPasswordFlag,
                    passwordFlag));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getVersionString() {
        return versionString;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVersionString(String newVersionString) {
        String oldVersionString = versionString;
        versionString = newVersionString;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DBD__VERSION_STRING, oldVersionString,
                    versionString));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AccessMethod getAccessMethod() {
        return accessMethod;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAccessMethod(AccessMethod newAccessMethod, NotificationChain msgs) {
        AccessMethod oldAccessMethod = accessMethod;
        accessMethod = newAccessMethod;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DBD__ACCESS_METHOD,
                    oldAccessMethod, newAccessMethod);
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
    public void setAccessMethod(AccessMethod newAccessMethod) {
        if (newAccessMethod != accessMethod) {
            NotificationChain msgs = null;
            if (accessMethod != null)
                msgs = ((InternalEObject) accessMethod).eInverseRemove(this, ImsdatabasePackage.ACCESS_METHOD__DBD,
                        AccessMethod.class, msgs);
            if (newAccessMethod != null)
                msgs = ((InternalEObject) newAccessMethod).eInverseAdd(this, ImsdatabasePackage.ACCESS_METHOD__DBD,
                        AccessMethod.class, msgs);
            msgs = basicSetAccessMethod(newAccessMethod, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.DBD__ACCESS_METHOD, newAccessMethod,
                    newAccessMethod));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ACBLIB> getAcblib() {
        if (acblib == null) {
            acblib = new EObjectWithInverseResolvingEList.ManyInverse<ACBLIB>(ACBLIB.class, this, ImsdatabasePackage.DBD__ACBLIB,
                    ImsdatabasePackage.ACBLIB__DBD);
        }
        return acblib;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Dataset> getDataset() {
        if (dataset == null) {
            dataset = new EObjectContainmentWithInverseEList<Dataset>(Dataset.class, this, ImsdatabasePackage.DBD__DATASET,
                    ImsdatabasePackage.DATASET__DBD);
        }
        return dataset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Segment> getSegment() {
        if (segment == null) {
            segment = new EObjectContainmentWithInverseEList<Segment>(Segment.class, this, ImsdatabasePackage.DBD__SEGMENT,
                    ImsdatabasePackage.SEGMENT__DBD);
        }
        return segment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<PCB> getPcb() {
        if (pcb == null) {
            pcb = new EObjectWithInverseResolvingEList<PCB>(PCB.class, this, ImsdatabasePackage.DBD__PCB,
                    ImsdatabasePackage.PCB__DBD);
        }
        return pcb;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Exit> getExit() {
        if (exit == null) {
            exit = new EObjectContainmentWithInverseEList<Exit>(Exit.class, this, ImsdatabasePackage.DBD__EXIT,
                    ImsdatabasePackage.EXIT__DBD);
        }
        return exit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DBDLib> getLibrary() {
        if (library == null) {
            library = new EObjectWithInverseResolvingEList.ManyInverse<DBDLib>(DBDLib.class, this,
                    ImsdatabasePackage.DBD__LIBRARY, ImsdatabasePackage.DBD_LIB__DBD);
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
        case ImsdatabasePackage.DBD__ACCESS_METHOD:
            if (accessMethod != null)
                msgs = ((InternalEObject) accessMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ImsdatabasePackage.DBD__ACCESS_METHOD, null, msgs);
            return basicSetAccessMethod((AccessMethod) otherEnd, msgs);
        case ImsdatabasePackage.DBD__ACBLIB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAcblib()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.DBD__DATASET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataset()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.DBD__SEGMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSegment()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.DBD__PCB:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPcb()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.DBD__EXIT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getExit()).basicAdd(otherEnd, msgs);
        case ImsdatabasePackage.DBD__LIBRARY:
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
        case ImsdatabasePackage.DBD__ACCESS_METHOD:
            return basicSetAccessMethod(null, msgs);
        case ImsdatabasePackage.DBD__ACBLIB:
            return ((InternalEList<?>) getAcblib()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.DBD__DATASET:
            return ((InternalEList<?>) getDataset()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.DBD__SEGMENT:
            return ((InternalEList<?>) getSegment()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.DBD__PCB:
            return ((InternalEList<?>) getPcb()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.DBD__EXIT:
            return ((InternalEList<?>) getExit()).basicRemove(otherEnd, msgs);
        case ImsdatabasePackage.DBD__LIBRARY:
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
        case ImsdatabasePackage.DBD__DLI_ACCESS:
            return getDliAccess();
        case ImsdatabasePackage.DBD__IS_VSAM:
            return isIsVSAM();
        case ImsdatabasePackage.DBD__PASSWORD_FLAG:
            return isPasswordFlag();
        case ImsdatabasePackage.DBD__VERSION_STRING:
            return getVersionString();
        case ImsdatabasePackage.DBD__ACCESS_METHOD:
            return getAccessMethod();
        case ImsdatabasePackage.DBD__ACBLIB:
            return getAcblib();
        case ImsdatabasePackage.DBD__DATASET:
            return getDataset();
        case ImsdatabasePackage.DBD__SEGMENT:
            return getSegment();
        case ImsdatabasePackage.DBD__PCB:
            return getPcb();
        case ImsdatabasePackage.DBD__EXIT:
            return getExit();
        case ImsdatabasePackage.DBD__LIBRARY:
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
        case ImsdatabasePackage.DBD__DLI_ACCESS:
            setDliAccess((AccessMethodType) newValue);
            return;
        case ImsdatabasePackage.DBD__IS_VSAM:
            setIsVSAM((Boolean) newValue);
            return;
        case ImsdatabasePackage.DBD__PASSWORD_FLAG:
            setPasswordFlag((Boolean) newValue);
            return;
        case ImsdatabasePackage.DBD__VERSION_STRING:
            setVersionString((String) newValue);
            return;
        case ImsdatabasePackage.DBD__ACCESS_METHOD:
            setAccessMethod((AccessMethod) newValue);
            return;
        case ImsdatabasePackage.DBD__ACBLIB:
            getAcblib().clear();
            getAcblib().addAll((Collection<? extends ACBLIB>) newValue);
            return;
        case ImsdatabasePackage.DBD__DATASET:
            getDataset().clear();
            getDataset().addAll((Collection<? extends Dataset>) newValue);
            return;
        case ImsdatabasePackage.DBD__SEGMENT:
            getSegment().clear();
            getSegment().addAll((Collection<? extends Segment>) newValue);
            return;
        case ImsdatabasePackage.DBD__PCB:
            getPcb().clear();
            getPcb().addAll((Collection<? extends PCB>) newValue);
            return;
        case ImsdatabasePackage.DBD__EXIT:
            getExit().clear();
            getExit().addAll((Collection<? extends Exit>) newValue);
            return;
        case ImsdatabasePackage.DBD__LIBRARY:
            getLibrary().clear();
            getLibrary().addAll((Collection<? extends DBDLib>) newValue);
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
        case ImsdatabasePackage.DBD__DLI_ACCESS:
            setDliAccess(DLI_ACCESS_EDEFAULT);
            return;
        case ImsdatabasePackage.DBD__IS_VSAM:
            setIsVSAM(IS_VSAM_EDEFAULT);
            return;
        case ImsdatabasePackage.DBD__PASSWORD_FLAG:
            setPasswordFlag(PASSWORD_FLAG_EDEFAULT);
            return;
        case ImsdatabasePackage.DBD__VERSION_STRING:
            setVersionString(VERSION_STRING_EDEFAULT);
            return;
        case ImsdatabasePackage.DBD__ACCESS_METHOD:
            setAccessMethod((AccessMethod) null);
            return;
        case ImsdatabasePackage.DBD__ACBLIB:
            getAcblib().clear();
            return;
        case ImsdatabasePackage.DBD__DATASET:
            getDataset().clear();
            return;
        case ImsdatabasePackage.DBD__SEGMENT:
            getSegment().clear();
            return;
        case ImsdatabasePackage.DBD__PCB:
            getPcb().clear();
            return;
        case ImsdatabasePackage.DBD__EXIT:
            getExit().clear();
            return;
        case ImsdatabasePackage.DBD__LIBRARY:
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
        case ImsdatabasePackage.DBD__DLI_ACCESS:
            return dliAccess != DLI_ACCESS_EDEFAULT;
        case ImsdatabasePackage.DBD__IS_VSAM:
            return isVSAM != IS_VSAM_EDEFAULT;
        case ImsdatabasePackage.DBD__PASSWORD_FLAG:
            return passwordFlag != PASSWORD_FLAG_EDEFAULT;
        case ImsdatabasePackage.DBD__VERSION_STRING:
            return VERSION_STRING_EDEFAULT == null ? versionString != null : !VERSION_STRING_EDEFAULT.equals(versionString);
        case ImsdatabasePackage.DBD__ACCESS_METHOD:
            return accessMethod != null;
        case ImsdatabasePackage.DBD__ACBLIB:
            return acblib != null && !acblib.isEmpty();
        case ImsdatabasePackage.DBD__DATASET:
            return dataset != null && !dataset.isEmpty();
        case ImsdatabasePackage.DBD__SEGMENT:
            return segment != null && !segment.isEmpty();
        case ImsdatabasePackage.DBD__PCB:
            return pcb != null && !pcb.isEmpty();
        case ImsdatabasePackage.DBD__EXIT:
            return exit != null && !exit.isEmpty();
        case ImsdatabasePackage.DBD__LIBRARY:
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
        result.append(" (dliAccess: ");
        result.append(dliAccess);
        result.append(", isVSAM: ");
        result.append(isVSAM);
        result.append(", passwordFlag: ");
        result.append(passwordFlag);
        result.append(", versionString: ");
        result.append(versionString);
        result.append(')');
        return result.toString();
    }

} // DBDImpl
