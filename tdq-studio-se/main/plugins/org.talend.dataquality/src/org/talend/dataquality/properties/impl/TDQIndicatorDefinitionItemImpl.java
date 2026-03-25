/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.commons.emf.FactoriesUtil;
import org.talend.core.model.properties.impl.TDQItemImpl;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQIndicatorDefinitionItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDQ Indicator Definition Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.impl.TDQIndicatorDefinitionItemImpl#getIndicatorDefinition <em>Indicator Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDQIndicatorDefinitionItemImpl extends TDQItemImpl implements TDQIndicatorDefinitionItem {
    /**
     * The cached value of the '{@link #getIndicatorDefinition() <em>Indicator Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndicatorDefinition()
     * @generated
     * @ordered
     */
    protected IndicatorDefinition indicatorDefinition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDQIndicatorDefinitionItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_INDICATOR_DEFINITION_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorDefinition getIndicatorDefinition() {
        if (indicatorDefinition != null && indicatorDefinition.eIsProxy()) {
            InternalEObject oldIndicatorDefinition = (InternalEObject)indicatorDefinition;
            indicatorDefinition = (IndicatorDefinition)eResolveProxy(oldIndicatorDefinition);
            if (indicatorDefinition != oldIndicatorDefinition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION, oldIndicatorDefinition, indicatorDefinition));
            }
        }
        return indicatorDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorDefinition basicGetIndicatorDefinition() {
        return indicatorDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIndicatorDefinition(IndicatorDefinition newIndicatorDefinition) {
        IndicatorDefinition oldIndicatorDefinition = indicatorDefinition;
        indicatorDefinition = newIndicatorDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION, oldIndicatorDefinition, indicatorDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION:
                if (resolve) return getIndicatorDefinition();
                return basicGetIndicatorDefinition();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION:
                setIndicatorDefinition((IndicatorDefinition)newValue);
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
            case PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION:
                setIndicatorDefinition((IndicatorDefinition)null);
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
            case PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM__INDICATOR_DEFINITION:
                return indicatorDefinition != null;
        }
        return super.eIsSet(featureID);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getFileExtension(){
        return FactoriesUtil.DEFINITION;
    }

} //TDQIndicatorDefinitionItemImpl
