/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.ElementImpl;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.InterchangePattern;
import orgomg.cwmmip.Projection;
import orgomg.cwmmip.UnitOfInterchange;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Interchange Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getUnitOfInterchange <em>Unit Of Interchange</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getComponentPattern <em>Component Pattern</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.InterchangePatternImpl#getCompositePattern <em>Composite Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterchangePatternImpl extends ElementImpl implements InterchangePattern {

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

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
     * The default value of the '{@link #getUri() <em>Uri</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUri()
     * @generated
     * @ordered
     */
    protected static final String URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUri()
     * @generated
     * @ordered
     */
    protected String uri = URI_EDEFAULT;

    /**
     * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getClassification()
     * @generated
     * @ordered
     */
    protected static final String CLASSIFICATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getClassification()
     * @generated
     * @ordered
     */
    protected String classification = CLASSIFICATION_EDEFAULT;

    /**
     * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected static final String CATEGORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected String category = CATEGORY_EDEFAULT;

    /**
     * The cached value of the '{@link #getProjection() <em>Projection</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getProjection()
     * @generated
     * @ordered
     */
    protected Projection projection;

    /**
     * The cached value of the '{@link #getUnitOfInterchange() <em>Unit Of Interchange</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitOfInterchange()
     * @generated
     * @ordered
     */
    protected EList<UnitOfInterchange> unitOfInterchange;

    /**
     * The cached value of the '{@link #getComponentPattern() <em>Component Pattern</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getComponentPattern()
     * @generated
     * @ordered
     */
    protected EList<InterchangePattern> componentPattern;

    /**
     * The cached value of the '{@link #getCompositePattern() <em>Composite Pattern</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getCompositePattern()
     * @generated
     * @ordered
     */
    protected EList<InterchangePattern> compositePattern;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected InterchangePatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CwmmipPackage.Literals.INTERCHANGE_PATTERN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.INTERCHANGE_PATTERN__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.INTERCHANGE_PATTERN__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getUri() {
        return uri;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setUri(String newUri) {
        String oldUri = uri;
        uri = newUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.INTERCHANGE_PATTERN__URI, oldUri, uri));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getClassification() {
        return classification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setClassification(String newClassification) {
        String oldClassification = classification;
        classification = newClassification;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.INTERCHANGE_PATTERN__CLASSIFICATION,
                    oldClassification, classification));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCategory(String newCategory) {
        String oldCategory = category;
        category = newCategory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.INTERCHANGE_PATTERN__CATEGORY, oldCategory,
                    category));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Projection getProjection() {
        return projection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProjection(Projection newProjection, NotificationChain msgs) {
        Projection oldProjection = projection;
        projection = newProjection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION, oldProjection, newProjection);
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
    public void setProjection(Projection newProjection) {
        if (newProjection != projection) {
            NotificationChain msgs = null;
            if (projection != null)
                msgs = ((InternalEObject) projection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION, null, msgs);
            if (newProjection != null)
                msgs = ((InternalEObject) newProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION, null, msgs);
            msgs = basicSetProjection(newProjection, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION, newProjection,
                    newProjection));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<UnitOfInterchange> getUnitOfInterchange() {
        if (unitOfInterchange == null) {
            unitOfInterchange = new EObjectWithInverseResolvingEList<UnitOfInterchange>(UnitOfInterchange.class, this,
                    CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE,
                    CwmmipPackage.UNIT_OF_INTERCHANGE__INTERCHANGE_PATTERN);
        }
        return unitOfInterchange;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<InterchangePattern> getComponentPattern() {
        if (componentPattern == null) {
            componentPattern = new EObjectWithInverseResolvingEList.ManyInverse<InterchangePattern>(InterchangePattern.class,
                    this, CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN,
                    CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN);
        }
        return componentPattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<InterchangePattern> getCompositePattern() {
        if (compositePattern == null) {
            compositePattern = new EObjectWithInverseResolvingEList.ManyInverse<InterchangePattern>(InterchangePattern.class,
                    this, CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN,
                    CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN);
        }
        return compositePattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnitOfInterchange()).basicAdd(otherEnd, msgs);
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getComponentPattern()).basicAdd(otherEnd, msgs);
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getCompositePattern()).basicAdd(otherEnd, msgs);
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
        case CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION:
            return basicSetProjection(null, msgs);
        case CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE:
            return ((InternalEList<?>) getUnitOfInterchange()).basicRemove(otherEnd, msgs);
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN:
            return ((InternalEList<?>) getComponentPattern()).basicRemove(otherEnd, msgs);
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN:
            return ((InternalEList<?>) getCompositePattern()).basicRemove(otherEnd, msgs);
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
        case CwmmipPackage.INTERCHANGE_PATTERN__NAME:
            return getName();
        case CwmmipPackage.INTERCHANGE_PATTERN__VERSION:
            return getVersion();
        case CwmmipPackage.INTERCHANGE_PATTERN__URI:
            return getUri();
        case CwmmipPackage.INTERCHANGE_PATTERN__CLASSIFICATION:
            return getClassification();
        case CwmmipPackage.INTERCHANGE_PATTERN__CATEGORY:
            return getCategory();
        case CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION:
            return getProjection();
        case CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE:
            return getUnitOfInterchange();
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN:
            return getComponentPattern();
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN:
            return getCompositePattern();
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
        case CwmmipPackage.INTERCHANGE_PATTERN__NAME:
            setName((String) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__VERSION:
            setVersion((String) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__URI:
            setUri((String) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__CLASSIFICATION:
            setClassification((String) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__CATEGORY:
            setCategory((String) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION:
            setProjection((Projection) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE:
            getUnitOfInterchange().clear();
            getUnitOfInterchange().addAll((Collection<? extends UnitOfInterchange>) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN:
            getComponentPattern().clear();
            getComponentPattern().addAll((Collection<? extends InterchangePattern>) newValue);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN:
            getCompositePattern().clear();
            getCompositePattern().addAll((Collection<? extends InterchangePattern>) newValue);
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
        case CwmmipPackage.INTERCHANGE_PATTERN__NAME:
            setName(NAME_EDEFAULT);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__VERSION:
            setVersion(VERSION_EDEFAULT);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__URI:
            setUri(URI_EDEFAULT);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__CLASSIFICATION:
            setClassification(CLASSIFICATION_EDEFAULT);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__CATEGORY:
            setCategory(CATEGORY_EDEFAULT);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION:
            setProjection((Projection) null);
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE:
            getUnitOfInterchange().clear();
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN:
            getComponentPattern().clear();
            return;
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN:
            getCompositePattern().clear();
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
        case CwmmipPackage.INTERCHANGE_PATTERN__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case CwmmipPackage.INTERCHANGE_PATTERN__VERSION:
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
        case CwmmipPackage.INTERCHANGE_PATTERN__URI:
            return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
        case CwmmipPackage.INTERCHANGE_PATTERN__CLASSIFICATION:
            return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
        case CwmmipPackage.INTERCHANGE_PATTERN__CATEGORY:
            return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
        case CwmmipPackage.INTERCHANGE_PATTERN__PROJECTION:
            return projection != null;
        case CwmmipPackage.INTERCHANGE_PATTERN__UNIT_OF_INTERCHANGE:
            return unitOfInterchange != null && !unitOfInterchange.isEmpty();
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPONENT_PATTERN:
            return componentPattern != null && !componentPattern.isEmpty();
        case CwmmipPackage.INTERCHANGE_PATTERN__COMPOSITE_PATTERN:
            return compositePattern != null && !compositePattern.isEmpty();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", version: ");
        result.append(version);
        result.append(", uri: ");
        result.append(uri);
        result.append(", classification: ");
        result.append(classification);
        result.append(", category: ");
        result.append(category);
        result.append(')');
        return result.toString();
    }

} // InterchangePatternImpl
