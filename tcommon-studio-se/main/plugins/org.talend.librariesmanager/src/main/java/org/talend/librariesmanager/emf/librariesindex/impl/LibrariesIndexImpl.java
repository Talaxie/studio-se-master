/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.librariesmanager.emf.librariesindex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.librariesmanager.emf.librariesindex.LibrariesIndex;
import org.talend.librariesmanager.emf.librariesindex.LibrariesindexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Libraries Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.librariesmanager.emf.librariesindex.impl.LibrariesIndexImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.talend.librariesmanager.emf.librariesindex.impl.LibrariesIndexImpl#getJarsToRelativePath <em>Jars To Relative Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibrariesIndexImpl extends EObjectImpl implements LibrariesIndex {
    /**
     * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInitialized()
     * @generated
     * @ordered
     */
    protected static final boolean INITIALIZED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInitialized()
     * @generated
     * @ordered
     */
    protected boolean initialized = INITIALIZED_EDEFAULT;

    /**
     * The cached value of the '{@link #getJarsToRelativePath() <em>Jars To Relative Path</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJarsToRelativePath()
     * @generated
     * @ordered
     */
    protected EMap<String, String> jarsToRelativePath;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LibrariesIndexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LibrariesindexPackage.Literals.LIBRARIES_INDEX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInitialized() {
        return initialized;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialized(boolean newInitialized) {
        boolean oldInitialized = initialized;
        initialized = newInitialized;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LibrariesindexPackage.LIBRARIES_INDEX__INITIALIZED, oldInitialized, initialized));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getJarsToRelativePath() {
        if (jarsToRelativePath == null) {
            jarsToRelativePath = new EcoreEMap<String,String>(LibrariesindexPackage.Literals.JAR_TO_RELATIVE_PATH, jarToRelativePathImpl.class, this, LibrariesindexPackage.LIBRARIES_INDEX__JARS_TO_RELATIVE_PATH);
        }
        return jarsToRelativePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case LibrariesindexPackage.LIBRARIES_INDEX__JARS_TO_RELATIVE_PATH:
                return ((InternalEList<?>)getJarsToRelativePath()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case LibrariesindexPackage.LIBRARIES_INDEX__INITIALIZED:
                return isInitialized();
            case LibrariesindexPackage.LIBRARIES_INDEX__JARS_TO_RELATIVE_PATH:
                if (coreType) return getJarsToRelativePath();
                else return getJarsToRelativePath().map();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case LibrariesindexPackage.LIBRARIES_INDEX__INITIALIZED:
                setInitialized((Boolean)newValue);
                return;
            case LibrariesindexPackage.LIBRARIES_INDEX__JARS_TO_RELATIVE_PATH:
                ((EStructuralFeature.Setting)getJarsToRelativePath()).set(newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case LibrariesindexPackage.LIBRARIES_INDEX__INITIALIZED:
                setInitialized(INITIALIZED_EDEFAULT);
                return;
            case LibrariesindexPackage.LIBRARIES_INDEX__JARS_TO_RELATIVE_PATH:
                getJarsToRelativePath().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case LibrariesindexPackage.LIBRARIES_INDEX__INITIALIZED:
                return initialized != INITIALIZED_EDEFAULT;
            case LibrariesindexPackage.LIBRARIES_INDEX__JARS_TO_RELATIVE_PATH:
                return jarsToRelativePath != null && !jarsToRelativePath.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (initialized: ");
        result.append(initialized);
        result.append(')');
        return result.toString();
    }

} //LibrariesIndexImpl
