/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.GraphSubset;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Graph Subset</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmmip.impl.GraphSubsetImpl#getElement <em>Element</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.GraphSubsetImpl#isDeepCopy <em>Deep Copy</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.GraphSubsetImpl#getCopyDepth <em>Copy Depth</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.GraphSubsetImpl#isAggregationsOnly <em>Aggregations Only</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.GraphSubsetImpl#isIncludeAssociations <em>Include Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphSubsetImpl extends ProjectionImpl implements GraphSubset {

    /**
     * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected static final String ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected String element = ELEMENT_EDEFAULT;

    /**
     * The default value of the '{@link #isDeepCopy() <em>Deep Copy</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isDeepCopy()
     * @generated
     * @ordered
     */
    protected static final boolean DEEP_COPY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDeepCopy() <em>Deep Copy</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isDeepCopy()
     * @generated
     * @ordered
     */
    protected boolean deepCopy = DEEP_COPY_EDEFAULT;

    /**
     * The default value of the '{@link #getCopyDepth() <em>Copy Depth</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCopyDepth()
     * @generated
     * @ordered
     */
    protected static final long COPY_DEPTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getCopyDepth() <em>Copy Depth</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCopyDepth()
     * @generated
     * @ordered
     */
    protected long copyDepth = COPY_DEPTH_EDEFAULT;

    /**
     * The default value of the '{@link #isAggregationsOnly() <em>Aggregations Only</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isAggregationsOnly()
     * @generated
     * @ordered
     */
    protected static final boolean AGGREGATIONS_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAggregationsOnly() <em>Aggregations Only</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isAggregationsOnly()
     * @generated
     * @ordered
     */
    protected boolean aggregationsOnly = AGGREGATIONS_ONLY_EDEFAULT;

    /**
     * The default value of the '{@link #isIncludeAssociations() <em>Include Associations</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIncludeAssociations()
     * @generated
     * @ordered
     */
    protected static final boolean INCLUDE_ASSOCIATIONS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIncludeAssociations() <em>Include Associations</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIncludeAssociations()
     * @generated
     * @ordered
     */
    protected boolean includeAssociations = INCLUDE_ASSOCIATIONS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected GraphSubsetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CwmmipPackage.Literals.GRAPH_SUBSET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getElement() {
        return element;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setElement(String newElement) {
        String oldElement = element;
        element = newElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.GRAPH_SUBSET__ELEMENT, oldElement, element));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isDeepCopy() {
        return deepCopy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDeepCopy(boolean newDeepCopy) {
        boolean oldDeepCopy = deepCopy;
        deepCopy = newDeepCopy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.GRAPH_SUBSET__DEEP_COPY, oldDeepCopy, deepCopy));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getCopyDepth() {
        return copyDepth;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCopyDepth(long newCopyDepth) {
        long oldCopyDepth = copyDepth;
        copyDepth = newCopyDepth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.GRAPH_SUBSET__COPY_DEPTH, oldCopyDepth, copyDepth));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isAggregationsOnly() {
        return aggregationsOnly;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAggregationsOnly(boolean newAggregationsOnly) {
        boolean oldAggregationsOnly = aggregationsOnly;
        aggregationsOnly = newAggregationsOnly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.GRAPH_SUBSET__AGGREGATIONS_ONLY,
                    oldAggregationsOnly, aggregationsOnly));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIncludeAssociations() {
        return includeAssociations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIncludeAssociations(boolean newIncludeAssociations) {
        boolean oldIncludeAssociations = includeAssociations;
        includeAssociations = newIncludeAssociations;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CwmmipPackage.GRAPH_SUBSET__INCLUDE_ASSOCIATIONS,
                    oldIncludeAssociations, includeAssociations));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case CwmmipPackage.GRAPH_SUBSET__ELEMENT:
            return getElement();
        case CwmmipPackage.GRAPH_SUBSET__DEEP_COPY:
            return isDeepCopy();
        case CwmmipPackage.GRAPH_SUBSET__COPY_DEPTH:
            return getCopyDepth();
        case CwmmipPackage.GRAPH_SUBSET__AGGREGATIONS_ONLY:
            return isAggregationsOnly();
        case CwmmipPackage.GRAPH_SUBSET__INCLUDE_ASSOCIATIONS:
            return isIncludeAssociations();
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
        case CwmmipPackage.GRAPH_SUBSET__ELEMENT:
            setElement((String) newValue);
            return;
        case CwmmipPackage.GRAPH_SUBSET__DEEP_COPY:
            setDeepCopy((Boolean) newValue);
            return;
        case CwmmipPackage.GRAPH_SUBSET__COPY_DEPTH:
            setCopyDepth((Long) newValue);
            return;
        case CwmmipPackage.GRAPH_SUBSET__AGGREGATIONS_ONLY:
            setAggregationsOnly((Boolean) newValue);
            return;
        case CwmmipPackage.GRAPH_SUBSET__INCLUDE_ASSOCIATIONS:
            setIncludeAssociations((Boolean) newValue);
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
        case CwmmipPackage.GRAPH_SUBSET__ELEMENT:
            setElement(ELEMENT_EDEFAULT);
            return;
        case CwmmipPackage.GRAPH_SUBSET__DEEP_COPY:
            setDeepCopy(DEEP_COPY_EDEFAULT);
            return;
        case CwmmipPackage.GRAPH_SUBSET__COPY_DEPTH:
            setCopyDepth(COPY_DEPTH_EDEFAULT);
            return;
        case CwmmipPackage.GRAPH_SUBSET__AGGREGATIONS_ONLY:
            setAggregationsOnly(AGGREGATIONS_ONLY_EDEFAULT);
            return;
        case CwmmipPackage.GRAPH_SUBSET__INCLUDE_ASSOCIATIONS:
            setIncludeAssociations(INCLUDE_ASSOCIATIONS_EDEFAULT);
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
        case CwmmipPackage.GRAPH_SUBSET__ELEMENT:
            return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
        case CwmmipPackage.GRAPH_SUBSET__DEEP_COPY:
            return deepCopy != DEEP_COPY_EDEFAULT;
        case CwmmipPackage.GRAPH_SUBSET__COPY_DEPTH:
            return copyDepth != COPY_DEPTH_EDEFAULT;
        case CwmmipPackage.GRAPH_SUBSET__AGGREGATIONS_ONLY:
            return aggregationsOnly != AGGREGATIONS_ONLY_EDEFAULT;
        case CwmmipPackage.GRAPH_SUBSET__INCLUDE_ASSOCIATIONS:
            return includeAssociations != INCLUDE_ASSOCIATIONS_EDEFAULT;
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
        result.append(" (element: ");
        result.append(element);
        result.append(", deepCopy: ");
        result.append(deepCopy);
        result.append(", copyDepth: ");
        result.append(copyDepth);
        result.append(", aggregationsOnly: ");
        result.append(aggregationsOnly);
        result.append(", includeAssociations: ");
        result.append(includeAssociations);
        result.append(')');
        return result.toString();
    }

} // GraphSubsetImpl
