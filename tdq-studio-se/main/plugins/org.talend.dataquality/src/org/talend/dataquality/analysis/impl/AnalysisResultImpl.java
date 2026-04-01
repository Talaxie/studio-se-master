/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalysisResult;
import org.talend.dataquality.analysis.AnalyzedDataSet;
import org.talend.dataquality.analysis.ExecutionInformations;
import org.talend.dataquality.indicators.Indicator;
import orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisResultImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisResultImpl#getResultMetadata <em>Result Metadata</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisResultImpl#getIndicators <em>Indicators</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisResultImpl#getIndicToRowMap <em>Indic To Row Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisResultImpl extends ReportGroupImpl implements AnalysisResult {
    /**
     * The cached value of the '{@link #getResultMetadata() <em>Result Metadata</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResultMetadata()
     * @generated
     * @ordered
     */
    protected ExecutionInformations resultMetadata;

    /**
     * The cached value of the '{@link #getIndicators() <em>Indicators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndicators()
     * @generated
     * @ordered
     */
    protected EList<Indicator> indicators;

    /**
     * The cached value of the '{@link #getIndicToRowMap() <em>Indic To Row Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndicToRowMap()
     * @generated
     * @ordered
     */
    protected EMap<Indicator, AnalyzedDataSet> indicToRowMap;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisResultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnalysisPackage.Literals.ANALYSIS_RESULT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Analysis getAnalysis() {
        if (eContainerFeatureID() != AnalysisPackage.ANALYSIS_RESULT__ANALYSIS) return null;
        return (Analysis)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalysis(Analysis newAnalysis, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAnalysis, AnalysisPackage.ANALYSIS_RESULT__ANALYSIS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnalysis(Analysis newAnalysis) {
        if (newAnalysis != eInternalContainer() || (eContainerFeatureID() != AnalysisPackage.ANALYSIS_RESULT__ANALYSIS && newAnalysis != null)) {
            if (EcoreUtil.isAncestor(this, newAnalysis))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAnalysis != null)
                msgs = ((InternalEObject)newAnalysis).eInverseAdd(this, AnalysisPackage.ANALYSIS__RESULTS, Analysis.class, msgs);
            msgs = basicSetAnalysis(newAnalysis, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_RESULT__ANALYSIS, newAnalysis, newAnalysis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionInformations getResultMetadata() {
        return resultMetadata;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResultMetadata(ExecutionInformations newResultMetadata, NotificationChain msgs) {
        ExecutionInformations oldResultMetadata = resultMetadata;
        resultMetadata = newResultMetadata;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA, oldResultMetadata, newResultMetadata);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResultMetadata(ExecutionInformations newResultMetadata) {
        if (newResultMetadata != resultMetadata) {
            NotificationChain msgs = null;
            if (resultMetadata != null)
                msgs = ((InternalEObject)resultMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA, null, msgs);
            if (newResultMetadata != null)
                msgs = ((InternalEObject)newResultMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA, null, msgs);
            msgs = basicSetResultMetadata(newResultMetadata, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA, newResultMetadata, newResultMetadata));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Indicator> getIndicators() {
        if (indicators == null) {
            indicators = new EObjectContainmentEList<Indicator>(Indicator.class, this, AnalysisPackage.ANALYSIS_RESULT__INDICATORS);
        }
        return indicators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<Indicator, AnalyzedDataSet> getIndicToRowMap() {
        if (indicToRowMap == null) {
            indicToRowMap = new EcoreEMap<Indicator,AnalyzedDataSet>(AnalysisPackage.Literals.INDIC_TO_ROWS_MAP, IndicToRowsMapImpl.class, this, AnalysisPackage.ANALYSIS_RESULT__INDIC_TO_ROW_MAP);
        }
        return indicToRowMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAnalysis((Analysis)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                return basicSetAnalysis(null, msgs);
            case AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA:
                return basicSetResultMetadata(null, msgs);
            case AnalysisPackage.ANALYSIS_RESULT__INDICATORS:
                return ((InternalEList<?>)getIndicators()).basicRemove(otherEnd, msgs);
            case AnalysisPackage.ANALYSIS_RESULT__INDIC_TO_ROW_MAP:
                return ((InternalEList<?>)getIndicToRowMap()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                return eInternalContainer().eInverseRemove(this, AnalysisPackage.ANALYSIS__RESULTS, Analysis.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                return getAnalysis();
            case AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA:
                return getResultMetadata();
            case AnalysisPackage.ANALYSIS_RESULT__INDICATORS:
                return getIndicators();
            case AnalysisPackage.ANALYSIS_RESULT__INDIC_TO_ROW_MAP:
                if (coreType) return getIndicToRowMap();
                else return getIndicToRowMap().map();
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
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                setAnalysis((Analysis)newValue);
                return;
            case AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA:
                setResultMetadata((ExecutionInformations)newValue);
                return;
            case AnalysisPackage.ANALYSIS_RESULT__INDICATORS:
                getIndicators().clear();
                getIndicators().addAll((Collection<? extends Indicator>)newValue);
                return;
            case AnalysisPackage.ANALYSIS_RESULT__INDIC_TO_ROW_MAP:
                ((EStructuralFeature.Setting)getIndicToRowMap()).set(newValue);
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
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                setAnalysis((Analysis)null);
                return;
            case AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA:
                setResultMetadata((ExecutionInformations)null);
                return;
            case AnalysisPackage.ANALYSIS_RESULT__INDICATORS:
                getIndicators().clear();
                return;
            case AnalysisPackage.ANALYSIS_RESULT__INDIC_TO_ROW_MAP:
                getIndicToRowMap().clear();
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
            case AnalysisPackage.ANALYSIS_RESULT__ANALYSIS:
                return getAnalysis() != null;
            case AnalysisPackage.ANALYSIS_RESULT__RESULT_METADATA:
                return resultMetadata != null;
            case AnalysisPackage.ANALYSIS_RESULT__INDICATORS:
                return indicators != null && !indicators.isEmpty();
            case AnalysisPackage.ANALYSIS_RESULT__INDIC_TO_ROW_MAP:
                return indicToRowMap != null && !indicToRowMap.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AnalysisResultImpl
