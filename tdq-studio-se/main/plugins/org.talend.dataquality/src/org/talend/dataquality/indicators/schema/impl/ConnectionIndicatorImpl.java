/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.schema.CatalogIndicator;
import org.talend.dataquality.indicators.schema.ConnectionIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Connection Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.ConnectionIndicatorImpl#getCatalogIndicators <em>Catalog Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.ConnectionIndicatorImpl#getCatalogCount <em>Catalog Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionIndicatorImpl extends CatalogIndicatorImpl implements ConnectionIndicator {

    /**
     * The cached value of the '{@link #getCatalogIndicators() <em>Catalog Indicators</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCatalogIndicators()
     * @generated
     * @ordered
     */
    protected EList<CatalogIndicator> catalogIndicators;

    /**
     * The default value of the '{@link #getCatalogCount() <em>Catalog Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogCount()
     * @generated
     * @ordered
     */
    protected static final int CATALOG_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCatalogCount() <em>Catalog Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogCount()
     * @generated
     * @ordered
     */
    protected int catalogCount = CATALOG_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.CONNECTION_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<CatalogIndicator> getCatalogIndicators() {
        if (catalogIndicators == null) {
            catalogIndicators = new EObjectContainmentEList<CatalogIndicator>(CatalogIndicator.class, this, SchemaPackage.CONNECTION_INDICATOR__CATALOG_INDICATORS);
        }
        return catalogIndicators;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getCatalogCount() {
        return catalogCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCatalogCount(int newCatalogCount) {
        int oldCatalogCount = catalogCount;
        catalogCount = newCatalogCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CONNECTION_INDICATOR__CATALOG_COUNT, oldCatalogCount, catalogCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT scorreia 20080729 addCatalogIndicator (CatalogIndicator catalogIndicator)
     */
    public boolean addCatalogIndicator(CatalogIndicator catalogIndicator) {
        return this.getCatalogIndicators().add(catalogIndicator);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_INDICATORS:
                return ((InternalEList<?>)getCatalogIndicators()).basicRemove(otherEnd, msgs);
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
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_INDICATORS:
                return getCatalogIndicators();
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_COUNT:
                return getCatalogCount();
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
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_INDICATORS:
                getCatalogIndicators().clear();
                getCatalogIndicators().addAll((Collection<? extends CatalogIndicator>)newValue);
                return;
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_COUNT:
                setCatalogCount((Integer)newValue);
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
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_INDICATORS:
                getCatalogIndicators().clear();
                return;
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_COUNT:
                setCatalogCount(CATALOG_COUNT_EDEFAULT);
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
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_INDICATORS:
                return catalogIndicators != null && !catalogIndicators.isEmpty();
            case SchemaPackage.CONNECTION_INDICATOR__CATALOG_COUNT:
                return catalogCount != CATALOG_COUNT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (catalogCount: ");
        result.append(catalogCount);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc) ADDED rli 2008-07-10 reset implemented.
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#reset()
     */
    public boolean reset() {
        boolean ok = super.reset();
        this.catalogCount = CATALOG_COUNT_EDEFAULT;
        this.getCatalogIndicators().clear();
        this.getSchemaIndicators().clear();
        return ok;
    }

    /**
     * add qiongli 2010-9-16 bug 15525
     */
    public EList<Indicator> getChildIndicators() {
        EList<Indicator> ls = new BasicEList<Indicator>();
        return ls;
    }

} // ConnectionIndicatorImpl
