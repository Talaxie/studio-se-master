/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwmx.resource.express.AliasDimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.SimpleDimension;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Simple Dimension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#isIsTime <em>Is Time</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getBeginningPhase <em>Beginning Phase</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getEndingPhase <em>Ending Phase</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getSearchAlgorithm <em>Search Algorithm</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getPageSpace <em>Page Space</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getAliasDimension <em>Alias Dimension</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.SimpleDimensionImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleDimensionImpl extends DimensionImpl implements SimpleDimension {

    /**
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected static final long WIDTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected long width = WIDTH_EDEFAULT;

    /**
     * The default value of the '{@link #isIsTime() <em>Is Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTime()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TIME_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsTime() <em>Is Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsTime()
     * @generated
     * @ordered
     */
    protected boolean isTime = IS_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMultiple()
     * @generated
     * @ordered
     */
    protected static final long MULTIPLE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMultiple()
     * @generated
     * @ordered
     */
    protected long multiple = MULTIPLE_EDEFAULT;

    /**
     * The default value of the '{@link #getBeginningPhase() <em>Beginning Phase</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBeginningPhase()
     * @generated
     * @ordered
     */
    protected static final String BEGINNING_PHASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBeginningPhase() <em>Beginning Phase</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getBeginningPhase()
     * @generated
     * @ordered
     */
    protected String beginningPhase = BEGINNING_PHASE_EDEFAULT;

    /**
     * The default value of the '{@link #getEndingPhase() <em>Ending Phase</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getEndingPhase()
     * @generated
     * @ordered
     */
    protected static final String ENDING_PHASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndingPhase() <em>Ending Phase</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getEndingPhase()
     * @generated
     * @ordered
     */
    protected String endingPhase = ENDING_PHASE_EDEFAULT;

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
     * The cached value of the '{@link #getAliasDimension() <em>Alias Dimension</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAliasDimension()
     * @generated
     * @ordered
     */
    protected EList<AliasDimension> aliasDimension;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected Classifier dataType;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SimpleDimensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.SIMPLE_DIMENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getWidth() {
        return width;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setWidth(long newWidth) {
        long oldWidth = width;
        width = newWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__WIDTH, oldWidth, width));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsTime() {
        return isTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsTime(boolean newIsTime) {
        boolean oldIsTime = isTime;
        isTime = newIsTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__IS_TIME, oldIsTime, isTime));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getMultiple() {
        return multiple;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMultiple(long newMultiple) {
        long oldMultiple = multiple;
        multiple = newMultiple;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__MULTIPLE, oldMultiple,
                    multiple));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getBeginningPhase() {
        return beginningPhase;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setBeginningPhase(String newBeginningPhase) {
        String oldBeginningPhase = beginningPhase;
        beginningPhase = newBeginningPhase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__BEGINNING_PHASE,
                    oldBeginningPhase, beginningPhase));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getEndingPhase() {
        return endingPhase;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setEndingPhase(String newEndingPhase) {
        String oldEndingPhase = endingPhase;
        endingPhase = newEndingPhase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__ENDING_PHASE, oldEndingPhase,
                    endingPhase));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__SEARCH_ALGORITHM,
                    oldSearchAlgorithm, searchAlgorithm));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__PAGE_SPACE, oldPageSpace,
                    pageSpace));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AliasDimension> getAliasDimension() {
        if (aliasDimension == null) {
            aliasDimension = new EObjectWithInverseResolvingEList<AliasDimension>(AliasDimension.class, this,
                    ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION, ExpressPackage.ALIAS_DIMENSION__BASE_DIMENSION);
        }
        return aliasDimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Classifier getDataType() {
        if (dataType != null && dataType.eIsProxy()) {
            InternalEObject oldDataType = (InternalEObject) dataType;
            dataType = (Classifier) eResolveProxy(oldDataType);
            if (dataType != oldDataType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE,
                            oldDataType, dataType));
            }
        }
        return dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataType(Classifier newDataType, NotificationChain msgs) {
        Classifier oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE, oldDataType, newDataType);
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
    public void setDataType(Classifier newDataType) {
        if (newDataType != dataType) {
            NotificationChain msgs = null;
            if (dataType != null)
                msgs = ((InternalEObject) dataType).eInverseRemove(this, CorePackage.CLASSIFIER__SIMPLE_DIMENSION,
                        Classifier.class, msgs);
            if (newDataType != null)
                msgs = ((InternalEObject) newDataType).eInverseAdd(this, CorePackage.CLASSIFIER__SIMPLE_DIMENSION,
                        Classifier.class, msgs);
            msgs = basicSetDataType(newDataType, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE, newDataType,
                    newDataType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAliasDimension()).basicAdd(otherEnd, msgs);
        case ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE:
            if (dataType != null)
                msgs = ((InternalEObject) dataType).eInverseRemove(this, CorePackage.CLASSIFIER__SIMPLE_DIMENSION,
                        Classifier.class, msgs);
            return basicSetDataType((Classifier) otherEnd, msgs);
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
        case ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION:
            return ((InternalEList<?>) getAliasDimension()).basicRemove(otherEnd, msgs);
        case ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE:
            return basicSetDataType(null, msgs);
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
        case ExpressPackage.SIMPLE_DIMENSION__WIDTH:
            return getWidth();
        case ExpressPackage.SIMPLE_DIMENSION__IS_TIME:
            return isIsTime();
        case ExpressPackage.SIMPLE_DIMENSION__MULTIPLE:
            return getMultiple();
        case ExpressPackage.SIMPLE_DIMENSION__BEGINNING_PHASE:
            return getBeginningPhase();
        case ExpressPackage.SIMPLE_DIMENSION__ENDING_PHASE:
            return getEndingPhase();
        case ExpressPackage.SIMPLE_DIMENSION__SEARCH_ALGORITHM:
            return getSearchAlgorithm();
        case ExpressPackage.SIMPLE_DIMENSION__PAGE_SPACE:
            return getPageSpace();
        case ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION:
            return getAliasDimension();
        case ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE:
            if (resolve)
                return getDataType();
            return basicGetDataType();
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
        case ExpressPackage.SIMPLE_DIMENSION__WIDTH:
            setWidth((Long) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__IS_TIME:
            setIsTime((Boolean) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__MULTIPLE:
            setMultiple((Long) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__BEGINNING_PHASE:
            setBeginningPhase((String) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__ENDING_PHASE:
            setEndingPhase((String) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__SEARCH_ALGORITHM:
            setSearchAlgorithm((String) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__PAGE_SPACE:
            setPageSpace((String) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION:
            getAliasDimension().clear();
            getAliasDimension().addAll((Collection<? extends AliasDimension>) newValue);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE:
            setDataType((Classifier) newValue);
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
        case ExpressPackage.SIMPLE_DIMENSION__WIDTH:
            setWidth(WIDTH_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__IS_TIME:
            setIsTime(IS_TIME_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__MULTIPLE:
            setMultiple(MULTIPLE_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__BEGINNING_PHASE:
            setBeginningPhase(BEGINNING_PHASE_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__ENDING_PHASE:
            setEndingPhase(ENDING_PHASE_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__SEARCH_ALGORITHM:
            setSearchAlgorithm(SEARCH_ALGORITHM_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__PAGE_SPACE:
            setPageSpace(PAGE_SPACE_EDEFAULT);
            return;
        case ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION:
            getAliasDimension().clear();
            return;
        case ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE:
            setDataType((Classifier) null);
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
        case ExpressPackage.SIMPLE_DIMENSION__WIDTH:
            return width != WIDTH_EDEFAULT;
        case ExpressPackage.SIMPLE_DIMENSION__IS_TIME:
            return isTime != IS_TIME_EDEFAULT;
        case ExpressPackage.SIMPLE_DIMENSION__MULTIPLE:
            return multiple != MULTIPLE_EDEFAULT;
        case ExpressPackage.SIMPLE_DIMENSION__BEGINNING_PHASE:
            return BEGINNING_PHASE_EDEFAULT == null ? beginningPhase != null : !BEGINNING_PHASE_EDEFAULT.equals(beginningPhase);
        case ExpressPackage.SIMPLE_DIMENSION__ENDING_PHASE:
            return ENDING_PHASE_EDEFAULT == null ? endingPhase != null : !ENDING_PHASE_EDEFAULT.equals(endingPhase);
        case ExpressPackage.SIMPLE_DIMENSION__SEARCH_ALGORITHM:
            return SEARCH_ALGORITHM_EDEFAULT == null ? searchAlgorithm != null : !SEARCH_ALGORITHM_EDEFAULT
                    .equals(searchAlgorithm);
        case ExpressPackage.SIMPLE_DIMENSION__PAGE_SPACE:
            return PAGE_SPACE_EDEFAULT == null ? pageSpace != null : !PAGE_SPACE_EDEFAULT.equals(pageSpace);
        case ExpressPackage.SIMPLE_DIMENSION__ALIAS_DIMENSION:
            return aliasDimension != null && !aliasDimension.isEmpty();
        case ExpressPackage.SIMPLE_DIMENSION__DATA_TYPE:
            return dataType != null;
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
        result.append(" (width: ");
        result.append(width);
        result.append(", isTime: ");
        result.append(isTime);
        result.append(", multiple: ");
        result.append(multiple);
        result.append(", beginningPhase: ");
        result.append(beginningPhase);
        result.append(", endingPhase: ");
        result.append(endingPhase);
        result.append(", searchAlgorithm: ");
        result.append(searchAlgorithm);
        result.append(", pageSpace: ");
        result.append(pageSpace);
        result.append(')');
        return result.toString();
    }

} // SimpleDimensionImpl
