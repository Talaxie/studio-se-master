/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.category.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.analysis.category.AnalysisCategories;
import org.talend.dataquality.analysis.category.AnalysisCategory;
import org.talend.dataquality.analysis.category.CategoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoriesImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisCategoriesImpl extends EObjectImpl implements AnalysisCategories {
    /**
     * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategories()
     * @generated
     * @ordered
     */
    protected EList<AnalysisCategory> categories;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisCategoriesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CategoryPackage.Literals.ANALYSIS_CATEGORIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnalysisCategory> getCategories() {
        if (categories == null) {
            categories = new EObjectContainmentEList<AnalysisCategory>(AnalysisCategory.class, this, CategoryPackage.ANALYSIS_CATEGORIES__CATEGORIES);
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
            case CategoryPackage.ANALYSIS_CATEGORIES__CATEGORIES:
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
            case CategoryPackage.ANALYSIS_CATEGORIES__CATEGORIES:
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
            case CategoryPackage.ANALYSIS_CATEGORIES__CATEGORIES:
                getCategories().clear();
                getCategories().addAll((Collection<? extends AnalysisCategory>)newValue);
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
            case CategoryPackage.ANALYSIS_CATEGORIES__CATEGORIES:
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
            case CategoryPackage.ANALYSIS_CATEGORIES__CATEGORIES:
                return categories != null && !categories.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AnalysisCategoriesImpl
