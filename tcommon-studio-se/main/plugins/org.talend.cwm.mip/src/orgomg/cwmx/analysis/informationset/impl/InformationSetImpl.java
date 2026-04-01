/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset.impl;

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
import orgomg.cwm.analysis.olap.impl.SchemaImpl;
import orgomg.cwmx.analysis.informationset.InfoSetAdministration;
import orgomg.cwmx.analysis.informationset.InformationSet;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.analysis.informationset.Rule;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Information Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InformationSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InformationSetImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InformationSetImpl#getInfoSetAdmin <em>Info Set Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationSetImpl extends SchemaImpl implements InformationSet {

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRule()
     * @generated
     * @ordered
     */
    protected EList<Rule> rule;

    /**
     * The cached value of the '{@link #getInfoSetAdmin() <em>Info Set Admin</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getInfoSetAdmin()
     * @generated
     * @ordered
     */
    protected EList<InfoSetAdministration> infoSetAdmin;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected InformationSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationsetPackage.Literals.INFORMATION_SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFORMATION_SET__VERSION, oldVersion,
                    version));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Rule> getRule() {
        if (rule == null) {
            rule = new EObjectWithInverseResolvingEList<Rule>(Rule.class, this, InformationsetPackage.INFORMATION_SET__RULE,
                    InformationsetPackage.RULE__INFORMATION_SET);
        }
        return rule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<InfoSetAdministration> getInfoSetAdmin() {
        if (infoSetAdmin == null) {
            infoSetAdmin = new EObjectContainmentWithInverseEList<InfoSetAdministration>(InfoSetAdministration.class, this,
                    InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN,
                    InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET);
        }
        return infoSetAdmin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationsetPackage.INFORMATION_SET__RULE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRule()).basicAdd(otherEnd, msgs);
        case InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getInfoSetAdmin()).basicAdd(otherEnd, msgs);
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
        case InformationsetPackage.INFORMATION_SET__RULE:
            return ((InternalEList<?>) getRule()).basicRemove(otherEnd, msgs);
        case InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN:
            return ((InternalEList<?>) getInfoSetAdmin()).basicRemove(otherEnd, msgs);
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
        case InformationsetPackage.INFORMATION_SET__VERSION:
            return getVersion();
        case InformationsetPackage.INFORMATION_SET__RULE:
            return getRule();
        case InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN:
            return getInfoSetAdmin();
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
        case InformationsetPackage.INFORMATION_SET__VERSION:
            setVersion((String) newValue);
            return;
        case InformationsetPackage.INFORMATION_SET__RULE:
            getRule().clear();
            getRule().addAll((Collection<? extends Rule>) newValue);
            return;
        case InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN:
            getInfoSetAdmin().clear();
            getInfoSetAdmin().addAll((Collection<? extends InfoSetAdministration>) newValue);
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
        case InformationsetPackage.INFORMATION_SET__VERSION:
            setVersion(VERSION_EDEFAULT);
            return;
        case InformationsetPackage.INFORMATION_SET__RULE:
            getRule().clear();
            return;
        case InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN:
            getInfoSetAdmin().clear();
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
        case InformationsetPackage.INFORMATION_SET__VERSION:
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
        case InformationsetPackage.INFORMATION_SET__RULE:
            return rule != null && !rule.isEmpty();
        case InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN:
            return infoSetAdmin != null && !infoSetAdmin.isEmpty();
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
        result.append(" (version: ");
        result.append(version);
        result.append(')');
        return result.toString();
    }

} // InformationSetImpl
