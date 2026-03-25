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
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQAnalysisItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDQ Analysis Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.impl.TDQAnalysisItemImpl#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDQAnalysisItemImpl extends TDQItemImpl implements TDQAnalysisItem {
    /**
     * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalysis()
     * @generated
     * @ordered
     */
    protected Analysis analysis;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TDQAnalysisItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.TDQ_ANALYSIS_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Analysis getAnalysis() {
        if (analysis != null && analysis.eIsProxy()) {
            InternalEObject oldAnalysis = (InternalEObject)analysis;
            analysis = (Analysis)eResolveProxy(oldAnalysis);
            if (analysis != oldAnalysis) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.TDQ_ANALYSIS_ITEM__ANALYSIS, oldAnalysis, analysis));
            }
        }
        return analysis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Analysis basicGetAnalysis() {
        return analysis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnalysis(Analysis newAnalysis) {
        Analysis oldAnalysis = analysis;
        analysis = newAnalysis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.TDQ_ANALYSIS_ITEM__ANALYSIS, oldAnalysis, analysis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.TDQ_ANALYSIS_ITEM__ANALYSIS:
                if (resolve) return getAnalysis();
                return basicGetAnalysis();
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
            case PropertiesPackage.TDQ_ANALYSIS_ITEM__ANALYSIS:
                setAnalysis((Analysis)newValue);
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
            case PropertiesPackage.TDQ_ANALYSIS_ITEM__ANALYSIS:
                setAnalysis((Analysis)null);
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
            case PropertiesPackage.TDQ_ANALYSIS_ITEM__ANALYSIS:
                return analysis != null;
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
        return FactoriesUtil.ANA;
    }
} //TDQAnalysisItemImpl
