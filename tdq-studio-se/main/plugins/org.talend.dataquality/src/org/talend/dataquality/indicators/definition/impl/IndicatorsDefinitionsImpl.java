/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import org.talend.dataquality.indicators.definition.IndicatorCategory;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;
import org.talend.dataquality.indicators.definition.IndicatorsDefinitions;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indicators Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.impl.IndicatorsDefinitionsImpl#getIndicatorDefinitions <em>Indicator Definitions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.impl.IndicatorsDefinitionsImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndicatorsDefinitionsImpl extends ModelElementImpl implements IndicatorsDefinitions {
    /**
     * The cached value of the '{@link #getIndicatorDefinitions() <em>Indicator Definitions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndicatorDefinitions()
     * @generated
     * @ordered
     */
    protected EList<IndicatorDefinition> indicatorDefinitions;

    /**
     * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategories()
     * @generated
     * @ordered
     */
    protected EList<IndicatorCategory> categories;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IndicatorsDefinitionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DefinitionPackage.Literals.INDICATORS_DEFINITIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IndicatorDefinition> getIndicatorDefinitions() {
        if (indicatorDefinitions == null) {
            indicatorDefinitions = new EObjectContainmentEList<IndicatorDefinition>(IndicatorDefinition.class, this, DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS);
        }
        return indicatorDefinitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IndicatorCategory> getCategories() {
        if (categories == null) {
            categories = new EObjectContainmentEList<IndicatorCategory>(IndicatorCategory.class, this, DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES);
        }
        return categories;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS:
                return ((InternalEList<?>)getIndicatorDefinitions()).basicRemove(otherEnd, msgs);
            case DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES:
                return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS:
                return getIndicatorDefinitions();
            case DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES:
                return getCategories();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS:
                getIndicatorDefinitions().clear();
                getIndicatorDefinitions().addAll((Collection<? extends IndicatorDefinition>)newValue);
                return;
            case DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES:
                getCategories().clear();
                getCategories().addAll((Collection<? extends IndicatorCategory>)newValue);
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
            case DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS:
                getIndicatorDefinitions().clear();
                return;
            case DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES:
                getCategories().clear();
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
            case DefinitionPackage.INDICATORS_DEFINITIONS__INDICATOR_DEFINITIONS:
                return indicatorDefinitions != null && !indicatorDefinitions.isEmpty();
            case DefinitionPackage.INDICATORS_DEFINITIONS__CATEGORIES:
                return categories != null && !categories.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //IndicatorsDefinitionsImpl
