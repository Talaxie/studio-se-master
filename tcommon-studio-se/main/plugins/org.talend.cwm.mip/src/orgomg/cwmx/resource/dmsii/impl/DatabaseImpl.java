/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

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
import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.impl.StructuralFeatureImpl;
import orgomg.cwmx.resource.dmsii.Database;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl#getDataManager <em>Data Manager</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl#isIsLogical <em>Is Logical</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl#getGuardFile <em>Guard File</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends StructuralFeatureImpl implements Database {

    /**
     * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getOwnedElement()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> ownedElement;

    /**
     * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getImportedElement()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> importedElement;

    /**
     * The cached value of the '{@link #getDataManager() <em>Data Manager</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDataManager()
     * @generated
     * @ordered
     */
    protected EList<DataManager> dataManager;

    /**
     * The default value of the '{@link #isIsLogical() <em>Is Logical</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsLogical()
     * @generated
     * @ordered
     */
    protected static final boolean IS_LOGICAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsLogical() <em>Is Logical</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsLogical()
     * @generated
     * @ordered
     */
    protected boolean isLogical = IS_LOGICAL_EDEFAULT;

    /**
     * The default value of the '{@link #getGuardFile() <em>Guard File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGuardFile()
     * @generated
     * @ordered
     */
    protected static final String GUARD_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGuardFile() <em>Guard File</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGuardFile()
     * @generated
     * @ordered
     */
    protected String guardFile = GUARD_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DatabaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.DATABASE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new EObjectContainmentWithInverseEList<ModelElement>(ModelElement.class, this,
                    DmsiiPackage.DATABASE__OWNED_ELEMENT, CorePackage.MODEL_ELEMENT__NAMESPACE);
        }
        return ownedElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getImportedElement() {
        if (importedElement == null) {
            importedElement = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this,
                    DmsiiPackage.DATABASE__IMPORTED_ELEMENT, CorePackage.MODEL_ELEMENT__IMPORTER);
        }
        return importedElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DataManager> getDataManager() {
        if (dataManager == null) {
            dataManager = new EObjectWithInverseResolvingEList.ManyInverse<DataManager>(DataManager.class, this,
                    DmsiiPackage.DATABASE__DATA_MANAGER, SoftwaredeploymentPackage.DATA_MANAGER__DATA_PACKAGE);
        }
        return dataManager;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsLogical() {
        return isLogical;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsLogical(boolean newIsLogical) {
        boolean oldIsLogical = isLogical;
        isLogical = newIsLogical;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATABASE__IS_LOGICAL, oldIsLogical, isLogical));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getGuardFile() {
        return guardFile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setGuardFile(String newGuardFile) {
        String oldGuardFile = guardFile;
        guardFile = newGuardFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATABASE__GUARD_FILE, oldGuardFile, guardFile));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSource(String newSource) {
        String oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATABASE__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.DATABASE__OWNED_ELEMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedElement()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getImportedElement()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.DATABASE__DATA_MANAGER:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataManager()).basicAdd(otherEnd, msgs);
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
        case DmsiiPackage.DATABASE__OWNED_ELEMENT:
            return ((InternalEList<?>) getOwnedElement()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
            return ((InternalEList<?>) getImportedElement()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.DATABASE__DATA_MANAGER:
            return ((InternalEList<?>) getDataManager()).basicRemove(otherEnd, msgs);
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
        case DmsiiPackage.DATABASE__OWNED_ELEMENT:
            return getOwnedElement();
        case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
            return getImportedElement();
        case DmsiiPackage.DATABASE__DATA_MANAGER:
            return getDataManager();
        case DmsiiPackage.DATABASE__IS_LOGICAL:
            return isIsLogical();
        case DmsiiPackage.DATABASE__GUARD_FILE:
            return getGuardFile();
        case DmsiiPackage.DATABASE__SOURCE:
            return getSource();
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
        case DmsiiPackage.DATABASE__OWNED_ELEMENT:
            getOwnedElement().clear();
            getOwnedElement().addAll((Collection<? extends ModelElement>) newValue);
            return;
        case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
            getImportedElement().clear();
            getImportedElement().addAll((Collection<? extends ModelElement>) newValue);
            return;
        case DmsiiPackage.DATABASE__DATA_MANAGER:
            getDataManager().clear();
            getDataManager().addAll((Collection<? extends DataManager>) newValue);
            return;
        case DmsiiPackage.DATABASE__IS_LOGICAL:
            setIsLogical((Boolean) newValue);
            return;
        case DmsiiPackage.DATABASE__GUARD_FILE:
            setGuardFile((String) newValue);
            return;
        case DmsiiPackage.DATABASE__SOURCE:
            setSource((String) newValue);
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
        case DmsiiPackage.DATABASE__OWNED_ELEMENT:
            getOwnedElement().clear();
            return;
        case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
            getImportedElement().clear();
            return;
        case DmsiiPackage.DATABASE__DATA_MANAGER:
            getDataManager().clear();
            return;
        case DmsiiPackage.DATABASE__IS_LOGICAL:
            setIsLogical(IS_LOGICAL_EDEFAULT);
            return;
        case DmsiiPackage.DATABASE__GUARD_FILE:
            setGuardFile(GUARD_FILE_EDEFAULT);
            return;
        case DmsiiPackage.DATABASE__SOURCE:
            setSource(SOURCE_EDEFAULT);
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
        case DmsiiPackage.DATABASE__OWNED_ELEMENT:
            return ownedElement != null && !ownedElement.isEmpty();
        case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
            return importedElement != null && !importedElement.isEmpty();
        case DmsiiPackage.DATABASE__DATA_MANAGER:
            return dataManager != null && !dataManager.isEmpty();
        case DmsiiPackage.DATABASE__IS_LOGICAL:
            return isLogical != IS_LOGICAL_EDEFAULT;
        case DmsiiPackage.DATABASE__GUARD_FILE:
            return GUARD_FILE_EDEFAULT == null ? guardFile != null : !GUARD_FILE_EDEFAULT.equals(guardFile);
        case DmsiiPackage.DATABASE__SOURCE:
            return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Namespace.class) {
            switch (derivedFeatureID) {
            case DmsiiPackage.DATABASE__OWNED_ELEMENT:
                return CorePackage.NAMESPACE__OWNED_ELEMENT;
            default:
                return -1;
            }
        }
        if (baseClass == orgomg.cwm.objectmodel.core.Package.class) {
            switch (derivedFeatureID) {
            case DmsiiPackage.DATABASE__IMPORTED_ELEMENT:
                return CorePackage.PACKAGE__IMPORTED_ELEMENT;
            case DmsiiPackage.DATABASE__DATA_MANAGER:
                return CorePackage.PACKAGE__DATA_MANAGER;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Namespace.class) {
            switch (baseFeatureID) {
            case CorePackage.NAMESPACE__OWNED_ELEMENT:
                return DmsiiPackage.DATABASE__OWNED_ELEMENT;
            default:
                return -1;
            }
        }
        if (baseClass == orgomg.cwm.objectmodel.core.Package.class) {
            switch (baseFeatureID) {
            case CorePackage.PACKAGE__IMPORTED_ELEMENT:
                return DmsiiPackage.DATABASE__IMPORTED_ELEMENT;
            case CorePackage.PACKAGE__DATA_MANAGER:
                return DmsiiPackage.DATABASE__DATA_MANAGER;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (isLogical: ");
        result.append(isLogical);
        result.append(", guardFile: ");
        result.append(guardFile);
        result.append(", source: ");
        result.append(source);
        result.append(')');
        return result.toString();
    }

} // DatabaseImpl
