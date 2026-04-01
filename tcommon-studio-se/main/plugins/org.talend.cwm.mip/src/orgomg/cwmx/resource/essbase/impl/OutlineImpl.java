/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.NamespaceImpl;
import orgomg.cwmx.resource.essbase.Database;
import orgomg.cwmx.resource.essbase.Dimension;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Outline;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Outline</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.OutlineImpl#getAliasTableName <em>Alias Table Name</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.OutlineImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.essbase.impl.OutlineImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutlineImpl extends NamespaceImpl implements Outline {

    /**
     * The default value of the '{@link #getAliasTableName() <em>Alias Table Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAliasTableName()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_TABLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAliasTableName() <em>Alias Table Name</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAliasTableName()
     * @generated
     * @ordered
     */
    protected String aliasTableName = ALIAS_TABLE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDimension()
     * @generated
     * @ordered
     */
    protected EList<Dimension> dimension;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected OutlineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EssbasePackage.Literals.OUTLINE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getAliasTableName() {
        return aliasTableName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAliasTableName(String newAliasTableName) {
        String oldAliasTableName = aliasTableName;
        aliasTableName = newAliasTableName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.OUTLINE__ALIAS_TABLE_NAME, oldAliasTableName,
                    aliasTableName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Database getDatabase() {
        if (eContainerFeatureID() != EssbasePackage.OUTLINE__DATABASE)
            return null;
        return (Database) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDatabase, EssbasePackage.OUTLINE__DATABASE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDatabase(Database newDatabase) {
        if (newDatabase != eInternalContainer()
                || (eContainerFeatureID() != EssbasePackage.OUTLINE__DATABASE && newDatabase != null)) {
            if (EcoreUtil.isAncestor(this, newDatabase))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatabase != null)
                msgs = ((InternalEObject) newDatabase).eInverseAdd(this, EssbasePackage.DATABASE__OUTLINE, Database.class, msgs);
            msgs = basicSetDatabase(newDatabase, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EssbasePackage.OUTLINE__DATABASE, newDatabase, newDatabase));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Dimension> getDimension() {
        if (dimension == null) {
            dimension = new EObjectWithInverseResolvingEList<Dimension>(Dimension.class, this, EssbasePackage.OUTLINE__DIMENSION,
                    EssbasePackage.DIMENSION__OUTLINE);
        }
        return dimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case EssbasePackage.OUTLINE__DATABASE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDatabase((Database) otherEnd, msgs);
        case EssbasePackage.OUTLINE__DIMENSION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDimension()).basicAdd(otherEnd, msgs);
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
        case EssbasePackage.OUTLINE__DATABASE:
            return basicSetDatabase(null, msgs);
        case EssbasePackage.OUTLINE__DIMENSION:
            return ((InternalEList<?>) getDimension()).basicRemove(otherEnd, msgs);
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
        case EssbasePackage.OUTLINE__DATABASE:
            return eInternalContainer().eInverseRemove(this, EssbasePackage.DATABASE__OUTLINE, Database.class, msgs);
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
        case EssbasePackage.OUTLINE__ALIAS_TABLE_NAME:
            return getAliasTableName();
        case EssbasePackage.OUTLINE__DATABASE:
            return getDatabase();
        case EssbasePackage.OUTLINE__DIMENSION:
            return getDimension();
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
        case EssbasePackage.OUTLINE__ALIAS_TABLE_NAME:
            setAliasTableName((String) newValue);
            return;
        case EssbasePackage.OUTLINE__DATABASE:
            setDatabase((Database) newValue);
            return;
        case EssbasePackage.OUTLINE__DIMENSION:
            getDimension().clear();
            getDimension().addAll((Collection<? extends Dimension>) newValue);
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
        case EssbasePackage.OUTLINE__ALIAS_TABLE_NAME:
            setAliasTableName(ALIAS_TABLE_NAME_EDEFAULT);
            return;
        case EssbasePackage.OUTLINE__DATABASE:
            setDatabase((Database) null);
            return;
        case EssbasePackage.OUTLINE__DIMENSION:
            getDimension().clear();
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
        case EssbasePackage.OUTLINE__ALIAS_TABLE_NAME:
            return ALIAS_TABLE_NAME_EDEFAULT == null ? aliasTableName != null : !ALIAS_TABLE_NAME_EDEFAULT.equals(aliasTableName);
        case EssbasePackage.OUTLINE__DATABASE:
            return getDatabase() != null;
        case EssbasePackage.OUTLINE__DIMENSION:
            return dimension != null && !dimension.isEmpty();
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
        result.append(" (aliasTableName: ");
        result.append(aliasTableName);
        result.append(')');
        return result.toString();
    }

} // OutlineImpl
