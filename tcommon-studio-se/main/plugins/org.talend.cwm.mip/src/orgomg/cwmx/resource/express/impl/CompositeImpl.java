/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwmx.resource.express.Composite;
import orgomg.cwmx.resource.express.ExpressPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Composite</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.CompositeImpl#getSearchAlgorithm <em>Search Algorithm</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.CompositeImpl#getPageSpace <em>Page Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeImpl extends DimensionImpl implements Composite {

    /**
     * The default value of the '{@link #getSearchAlgorithm() <em>Search Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSearchAlgorithm()
     * @generated
     * @ordered
     */
    protected static final String SEARCH_ALGORITHM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSearchAlgorithm() <em>Search Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSearchAlgorithm()
     * @generated
     * @ordered
     */
    protected String searchAlgorithm = SEARCH_ALGORITHM_EDEFAULT;

    /**
     * The default value of the '{@link #getPageSpace() <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPageSpace()
     * @generated
     * @ordered
     */
    protected static final String PAGE_SPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPageSpace() <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPageSpace()
     * @generated
     * @ordered
     */
    protected String pageSpace = PAGE_SPACE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CompositeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.COMPOSITE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getSearchAlgorithm() {
        return searchAlgorithm;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSearchAlgorithm(String newSearchAlgorithm) {
        String oldSearchAlgorithm = searchAlgorithm;
        searchAlgorithm = newSearchAlgorithm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.COMPOSITE__SEARCH_ALGORITHM, oldSearchAlgorithm,
                    searchAlgorithm));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPageSpace() {
        return pageSpace;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPageSpace(String newPageSpace) {
        String oldPageSpace = pageSpace;
        pageSpace = newPageSpace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.COMPOSITE__PAGE_SPACE, oldPageSpace, pageSpace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ExpressPackage.COMPOSITE__SEARCH_ALGORITHM:
            return getSearchAlgorithm();
        case ExpressPackage.COMPOSITE__PAGE_SPACE:
            return getPageSpace();
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
        case ExpressPackage.COMPOSITE__SEARCH_ALGORITHM:
            setSearchAlgorithm((String) newValue);
            return;
        case ExpressPackage.COMPOSITE__PAGE_SPACE:
            setPageSpace((String) newValue);
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
        case ExpressPackage.COMPOSITE__SEARCH_ALGORITHM:
            setSearchAlgorithm(SEARCH_ALGORITHM_EDEFAULT);
            return;
        case ExpressPackage.COMPOSITE__PAGE_SPACE:
            setPageSpace(PAGE_SPACE_EDEFAULT);
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
        case ExpressPackage.COMPOSITE__SEARCH_ALGORITHM:
            return SEARCH_ALGORITHM_EDEFAULT == null ? searchAlgorithm != null : !SEARCH_ALGORITHM_EDEFAULT
                    .equals(searchAlgorithm);
        case ExpressPackage.COMPOSITE__PAGE_SPACE:
            return PAGE_SPACE_EDEFAULT == null ? pageSpace != null : !PAGE_SPACE_EDEFAULT.equals(pageSpace);
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
        result.append(" (searchAlgorithm: ");
        result.append(searchAlgorithm);
        result.append(", pageSpace: ");
        result.append(pageSpace);
        result.append(')');
        return result.toString();
    }

} // CompositeImpl
