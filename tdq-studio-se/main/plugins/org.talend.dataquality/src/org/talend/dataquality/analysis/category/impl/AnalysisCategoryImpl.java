/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.category.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.analysis.AnalysisType;
import org.talend.dataquality.analysis.category.AnalysisCategory;
import org.talend.dataquality.analysis.category.CategoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl#getAnalysisType <em>Analysis Type</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.category.impl.AnalysisCategoryImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisCategoryImpl extends EObjectImpl implements AnalysisCategory {
    /**
     * The default value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalysisType()
     * @generated
     * @ordered
     */
    protected static final AnalysisType ANALYSIS_TYPE_EDEFAULT = AnalysisType.COLUMN;

    /**
     * The cached value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalysisType()
     * @generated
     * @ordered
     */
    protected AnalysisType analysisType = ANALYSIS_TYPE_EDEFAULT;

    /**
     * This is true if the Analysis Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analysisTypeESet;

    /**
     * The cached value of the '{@link #getSubCategories() <em>Sub Categories</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubCategories()
     * @generated
     * @ordered
     */
    protected EList<AnalysisCategory> subCategories;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CategoryPackage.Literals.ANALYSIS_CATEGORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisType getAnalysisType() {
        return analysisType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnalysisType(AnalysisType newAnalysisType) {
        AnalysisType oldAnalysisType = analysisType;
        analysisType = newAnalysisType == null ? ANALYSIS_TYPE_EDEFAULT : newAnalysisType;
        boolean oldAnalysisTypeESet = analysisTypeESet;
        analysisTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.ANALYSIS_CATEGORY__ANALYSIS_TYPE, oldAnalysisType, analysisType, !oldAnalysisTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAnalysisType() {
        AnalysisType oldAnalysisType = analysisType;
        boolean oldAnalysisTypeESet = analysisTypeESet;
        analysisType = ANALYSIS_TYPE_EDEFAULT;
        analysisTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CategoryPackage.ANALYSIS_CATEGORY__ANALYSIS_TYPE, oldAnalysisType, ANALYSIS_TYPE_EDEFAULT, oldAnalysisTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAnalysisType() {
        return analysisTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnalysisCategory> getSubCategories() {
        if (subCategories == null) {
            subCategories = new EObjectContainmentEList<AnalysisCategory>(AnalysisCategory.class, this, CategoryPackage.ANALYSIS_CATEGORY__SUB_CATEGORIES);
        }
        return subCategories;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.ANALYSIS_CATEGORY__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CategoryPackage.ANALYSIS_CATEGORY__SUB_CATEGORIES:
                return ((InternalEList<?>)getSubCategories()).basicRemove(otherEnd, msgs);
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
            case CategoryPackage.ANALYSIS_CATEGORY__ANALYSIS_TYPE:
                return getAnalysisType();
            case CategoryPackage.ANALYSIS_CATEGORY__SUB_CATEGORIES:
                return getSubCategories();
            case CategoryPackage.ANALYSIS_CATEGORY__LABEL:
                return getLabel();
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
            case CategoryPackage.ANALYSIS_CATEGORY__ANALYSIS_TYPE:
                setAnalysisType((AnalysisType)newValue);
                return;
            case CategoryPackage.ANALYSIS_CATEGORY__SUB_CATEGORIES:
                getSubCategories().clear();
                getSubCategories().addAll((Collection<? extends AnalysisCategory>)newValue);
                return;
            case CategoryPackage.ANALYSIS_CATEGORY__LABEL:
                setLabel((String)newValue);
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
            case CategoryPackage.ANALYSIS_CATEGORY__ANALYSIS_TYPE:
                unsetAnalysisType();
                return;
            case CategoryPackage.ANALYSIS_CATEGORY__SUB_CATEGORIES:
                getSubCategories().clear();
                return;
            case CategoryPackage.ANALYSIS_CATEGORY__LABEL:
                setLabel(LABEL_EDEFAULT);
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
            case CategoryPackage.ANALYSIS_CATEGORY__ANALYSIS_TYPE:
                return isSetAnalysisType();
            case CategoryPackage.ANALYSIS_CATEGORY__SUB_CATEGORIES:
                return subCategories != null && !subCategories.isEmpty();
            case CategoryPackage.ANALYSIS_CATEGORY__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (analysisType: ");
        if (analysisTypeESet) result.append(analysisType); else result.append("<unset>");
        result.append(", label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //AnalysisCategoryImpl
