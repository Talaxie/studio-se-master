/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.indicators.schema.CatalogIndicator;
import org.talend.dataquality.indicators.schema.SchemaIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Catalog Indicator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.CatalogIndicatorImpl#getSchemaCount <em>Schema Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.CatalogIndicatorImpl#getSchemaIndicators <em>Schema Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogIndicatorImpl extends SchemaIndicatorImpl implements CatalogIndicator {

    /**
     * The default value of the '{@link #getSchemaCount() <em>Schema Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaCount()
     * @generated
     * @ordered
     */
    protected static final int SCHEMA_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSchemaCount() <em>Schema Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaCount()
     * @generated
     * @ordered
     */
    protected int schemaCount = SCHEMA_COUNT_EDEFAULT;

    /**
     * The cached value of the '{@link #getSchemaIndicators() <em>Schema Indicators</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSchemaIndicators()
     * @generated
     * @ordered
     */
    protected EList<SchemaIndicator> schemaIndicators;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CatalogIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.CATALOG_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getSchemaCount() {
        return schemaCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSchemaCount(int newSchemaCount) {
        int oldSchemaCount = schemaCount;
        schemaCount = newSchemaCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CATALOG_INDICATOR__SCHEMA_COUNT, oldSchemaCount, schemaCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<SchemaIndicator> getSchemaIndicators() {
        if (schemaIndicators == null) {
            schemaIndicators = new EObjectContainmentEList<SchemaIndicator>(SchemaIndicator.class, this, SchemaPackage.CATALOG_INDICATOR__SCHEMA_INDICATORS);
        }
        return schemaIndicators;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT scorreia 20080729 addSchemaIndicator(SchemaIndicator schemaIndicator)
     */
    public boolean addSchemaIndicator(SchemaIndicator schemaIndicator) {
        return this.getSchemaIndicators().add(schemaIndicator);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_INDICATORS:
                return ((InternalEList<?>)getSchemaIndicators()).basicRemove(otherEnd, msgs);
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
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_COUNT:
                return getSchemaCount();
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_INDICATORS:
                return getSchemaIndicators();
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
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_COUNT:
                setSchemaCount((Integer)newValue);
                return;
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_INDICATORS:
                getSchemaIndicators().clear();
                getSchemaIndicators().addAll((Collection<? extends SchemaIndicator>)newValue);
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
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_COUNT:
                setSchemaCount(SCHEMA_COUNT_EDEFAULT);
                return;
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_INDICATORS:
                getSchemaIndicators().clear();
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
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_COUNT:
                return schemaCount != SCHEMA_COUNT_EDEFAULT;
            case SchemaPackage.CATALOG_INDICATOR__SCHEMA_INDICATORS:
                return schemaIndicators != null && !schemaIndicators.isEmpty();
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
        result.append(" (schemaCount: ");
        result.append(schemaCount);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc) ADDED scorreia 2008-07-29 reset implemented.
     * 
     * @see org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#reset()
     */
    @Override
    public boolean reset() {
        boolean ok = super.reset();
        this.schemaCount = SCHEMA_COUNT_EDEFAULT;
        this.getSchemaIndicators().clear();
        return ok;
    }

} // CatalogIndicatorImpl
