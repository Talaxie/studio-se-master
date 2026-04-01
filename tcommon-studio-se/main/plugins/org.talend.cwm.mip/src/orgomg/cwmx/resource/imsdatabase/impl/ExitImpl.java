/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.Exit;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.Segment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Exit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isKey <em>Key</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isData <em>Data</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isPath <em>Path</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isLog <em>Log</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isCascade <em>Cascade</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isCascadeKey <em>Cascade Key</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isCascadeData <em>Cascade Data</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#isCascadePath <em>Cascade Path</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.ExitImpl#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitImpl extends ModelElementImpl implements Exit {

    /**
     * The default value of the '{@link #isKey() <em>Key</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isKey()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKey() <em>Key</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isKey()
     * @generated
     * @ordered
     */
    protected boolean key = KEY_EDEFAULT;

    /**
     * The default value of the '{@link #isData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isData()
     * @generated
     * @ordered
     */
    protected static final boolean DATA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isData() <em>Data</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isData()
     * @generated
     * @ordered
     */
    protected boolean data = DATA_EDEFAULT;

    /**
     * The default value of the '{@link #isPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isPath()
     * @generated
     * @ordered
     */
    protected static final boolean PATH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPath() <em>Path</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isPath()
     * @generated
     * @ordered
     */
    protected boolean path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #isLog() <em>Log</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isLog()
     * @generated
     * @ordered
     */
    protected static final boolean LOG_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLog() <em>Log</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #isLog()
     * @generated
     * @ordered
     */
    protected boolean log = LOG_EDEFAULT;

    /**
     * The default value of the '{@link #isCascade() <em>Cascade</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascade()
     * @generated
     * @ordered
     */
    protected static final boolean CASCADE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCascade() <em>Cascade</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascade()
     * @generated
     * @ordered
     */
    protected boolean cascade = CASCADE_EDEFAULT;

    /**
     * The default value of the '{@link #isCascadeKey() <em>Cascade Key</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascadeKey()
     * @generated
     * @ordered
     */
    protected static final boolean CASCADE_KEY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCascadeKey() <em>Cascade Key</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascadeKey()
     * @generated
     * @ordered
     */
    protected boolean cascadeKey = CASCADE_KEY_EDEFAULT;

    /**
     * The default value of the '{@link #isCascadeData() <em>Cascade Data</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascadeData()
     * @generated
     * @ordered
     */
    protected static final boolean CASCADE_DATA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCascadeData() <em>Cascade Data</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascadeData()
     * @generated
     * @ordered
     */
    protected boolean cascadeData = CASCADE_DATA_EDEFAULT;

    /**
     * The default value of the '{@link #isCascadePath() <em>Cascade Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascadePath()
     * @generated
     * @ordered
     */
    protected static final boolean CASCADE_PATH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCascadePath() <em>Cascade Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isCascadePath()
     * @generated
     * @ordered
     */
    protected boolean cascadePath = CASCADE_PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ExitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.EXIT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKey(boolean newKey) {
        boolean oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isData() {
        return data;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setData(boolean newData) {
        boolean oldData = data;
        data = newData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__DATA, oldData, data));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPath(boolean newPath) {
        boolean oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isLog() {
        return log;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLog(boolean newLog) {
        boolean oldLog = log;
        log = newLog;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__LOG, oldLog, log));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isCascade() {
        return cascade;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCascade(boolean newCascade) {
        boolean oldCascade = cascade;
        cascade = newCascade;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__CASCADE, oldCascade, cascade));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isCascadeKey() {
        return cascadeKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCascadeKey(boolean newCascadeKey) {
        boolean oldCascadeKey = cascadeKey;
        cascadeKey = newCascadeKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__CASCADE_KEY, oldCascadeKey, cascadeKey));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isCascadeData() {
        return cascadeData;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCascadeData(boolean newCascadeData) {
        boolean oldCascadeData = cascadeData;
        cascadeData = newCascadeData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__CASCADE_DATA, oldCascadeData,
                    cascadeData));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isCascadePath() {
        return cascadePath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCascadePath(boolean newCascadePath) {
        boolean oldCascadePath = cascadePath;
        cascadePath = newCascadePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__CASCADE_PATH, oldCascadePath,
                    cascadePath));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DBD getDbd() {
        if (eContainerFeatureID() != ImsdatabasePackage.EXIT__DBD)
            return null;
        return (DBD) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDbd(DBD newDbd, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDbd, ImsdatabasePackage.EXIT__DBD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDbd(DBD newDbd) {
        if (newDbd != eInternalContainer() || (eContainerFeatureID() != ImsdatabasePackage.EXIT__DBD && newDbd != null)) {
            if (EcoreUtil.isAncestor(this, newDbd))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDbd != null)
                msgs = ((InternalEObject) newDbd).eInverseAdd(this, ImsdatabasePackage.DBD__EXIT, DBD.class, msgs);
            msgs = basicSetDbd(newDbd, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__DBD, newDbd, newDbd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Segment getSegment() {
        if (eContainerFeatureID() != ImsdatabasePackage.EXIT__SEGMENT)
            return null;
        return (Segment) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSegment(Segment newSegment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newSegment, ImsdatabasePackage.EXIT__SEGMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSegment(Segment newSegment) {
        if (newSegment != eInternalContainer()
                || (eContainerFeatureID() != ImsdatabasePackage.EXIT__SEGMENT && newSegment != null)) {
            if (EcoreUtil.isAncestor(this, newSegment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSegment != null)
                msgs = ((InternalEObject) newSegment).eInverseAdd(this, ImsdatabasePackage.SEGMENT__EXIT, Segment.class, msgs);
            msgs = basicSetSegment(newSegment, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.EXIT__SEGMENT, newSegment, newSegment));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.EXIT__DBD:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDbd((DBD) otherEnd, msgs);
        case ImsdatabasePackage.EXIT__SEGMENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSegment((Segment) otherEnd, msgs);
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
        case ImsdatabasePackage.EXIT__DBD:
            return basicSetDbd(null, msgs);
        case ImsdatabasePackage.EXIT__SEGMENT:
            return basicSetSegment(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case ImsdatabasePackage.EXIT__DBD:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.DBD__EXIT, DBD.class, msgs);
        case ImsdatabasePackage.EXIT__SEGMENT:
            return eInternalContainer().eInverseRemove(this, ImsdatabasePackage.SEGMENT__EXIT, Segment.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ImsdatabasePackage.EXIT__KEY:
            return isKey();
        case ImsdatabasePackage.EXIT__DATA:
            return isData();
        case ImsdatabasePackage.EXIT__PATH:
            return isPath();
        case ImsdatabasePackage.EXIT__LOG:
            return isLog();
        case ImsdatabasePackage.EXIT__CASCADE:
            return isCascade();
        case ImsdatabasePackage.EXIT__CASCADE_KEY:
            return isCascadeKey();
        case ImsdatabasePackage.EXIT__CASCADE_DATA:
            return isCascadeData();
        case ImsdatabasePackage.EXIT__CASCADE_PATH:
            return isCascadePath();
        case ImsdatabasePackage.EXIT__DBD:
            return getDbd();
        case ImsdatabasePackage.EXIT__SEGMENT:
            return getSegment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ImsdatabasePackage.EXIT__KEY:
            setKey((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__DATA:
            setData((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__PATH:
            setPath((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__LOG:
            setLog((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__CASCADE:
            setCascade((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__CASCADE_KEY:
            setCascadeKey((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__CASCADE_DATA:
            setCascadeData((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__CASCADE_PATH:
            setCascadePath((Boolean) newValue);
            return;
        case ImsdatabasePackage.EXIT__DBD:
            setDbd((DBD) newValue);
            return;
        case ImsdatabasePackage.EXIT__SEGMENT:
            setSegment((Segment) newValue);
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
        case ImsdatabasePackage.EXIT__KEY:
            setKey(KEY_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__DATA:
            setData(DATA_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__PATH:
            setPath(PATH_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__LOG:
            setLog(LOG_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__CASCADE:
            setCascade(CASCADE_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__CASCADE_KEY:
            setCascadeKey(CASCADE_KEY_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__CASCADE_DATA:
            setCascadeData(CASCADE_DATA_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__CASCADE_PATH:
            setCascadePath(CASCADE_PATH_EDEFAULT);
            return;
        case ImsdatabasePackage.EXIT__DBD:
            setDbd((DBD) null);
            return;
        case ImsdatabasePackage.EXIT__SEGMENT:
            setSegment((Segment) null);
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
        case ImsdatabasePackage.EXIT__KEY:
            return key != KEY_EDEFAULT;
        case ImsdatabasePackage.EXIT__DATA:
            return data != DATA_EDEFAULT;
        case ImsdatabasePackage.EXIT__PATH:
            return path != PATH_EDEFAULT;
        case ImsdatabasePackage.EXIT__LOG:
            return log != LOG_EDEFAULT;
        case ImsdatabasePackage.EXIT__CASCADE:
            return cascade != CASCADE_EDEFAULT;
        case ImsdatabasePackage.EXIT__CASCADE_KEY:
            return cascadeKey != CASCADE_KEY_EDEFAULT;
        case ImsdatabasePackage.EXIT__CASCADE_DATA:
            return cascadeData != CASCADE_DATA_EDEFAULT;
        case ImsdatabasePackage.EXIT__CASCADE_PATH:
            return cascadePath != CASCADE_PATH_EDEFAULT;
        case ImsdatabasePackage.EXIT__DBD:
            return getDbd() != null;
        case ImsdatabasePackage.EXIT__SEGMENT:
            return getSegment() != null;
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
        result.append(" (key: ");
        result.append(key);
        result.append(", data: ");
        result.append(data);
        result.append(", path: ");
        result.append(path);
        result.append(", log: ");
        result.append(log);
        result.append(", cascade: ");
        result.append(cascade);
        result.append(", cascadeKey: ");
        result.append(cascadeKey);
        result.append(", cascadeData: ");
        result.append(cascadeData);
        result.append(", cascadePath: ");
        result.append(cascadePath);
        result.append(')');
        return result.toString();
    }

} // ExitImpl
