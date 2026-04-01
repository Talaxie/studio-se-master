/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.reports.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.reports.PresentationParameter;
import org.talend.dataquality.reports.ReportsPackage;
import orgomg.cwm.analysis.informationvisualization.impl.RenderingImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.reports.impl.PresentationParameterImpl#getPlotType <em>Plot Type</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.PresentationParameterImpl#getIndicator <em>Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentationParameterImpl extends RenderingImpl implements PresentationParameter {
    /**
     * The default value of the '{@link #getPlotType() <em>Plot Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlotType()
     * @generated
     * @ordered
     */
    protected static final String PLOT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlotType() <em>Plot Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlotType()
     * @generated
     * @ordered
     */
    protected String plotType = PLOT_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndicator()
     * @generated
     * @ordered
     */
    protected Indicator indicator;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresentationParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReportsPackage.Literals.PRESENTATION_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPlotType() {
        return plotType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlotType(String newPlotType) {
        String oldPlotType = plotType;
        plotType = newPlotType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.PRESENTATION_PARAMETER__PLOT_TYPE, oldPlotType, plotType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Indicator getIndicator() {
        if (indicator != null && indicator.eIsProxy()) {
            InternalEObject oldIndicator = (InternalEObject)indicator;
            indicator = (Indicator)eResolveProxy(oldIndicator);
            if (indicator != oldIndicator) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportsPackage.PRESENTATION_PARAMETER__INDICATOR, oldIndicator, indicator));
            }
        }
        return indicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Indicator basicGetIndicator() {
        return indicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIndicator(Indicator newIndicator) {
        Indicator oldIndicator = indicator;
        indicator = newIndicator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.PRESENTATION_PARAMETER__INDICATOR, oldIndicator, indicator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReportsPackage.PRESENTATION_PARAMETER__PLOT_TYPE:
                return getPlotType();
            case ReportsPackage.PRESENTATION_PARAMETER__INDICATOR:
                if (resolve) return getIndicator();
                return basicGetIndicator();
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
            case ReportsPackage.PRESENTATION_PARAMETER__PLOT_TYPE:
                setPlotType((String)newValue);
                return;
            case ReportsPackage.PRESENTATION_PARAMETER__INDICATOR:
                setIndicator((Indicator)newValue);
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
            case ReportsPackage.PRESENTATION_PARAMETER__PLOT_TYPE:
                setPlotType(PLOT_TYPE_EDEFAULT);
                return;
            case ReportsPackage.PRESENTATION_PARAMETER__INDICATOR:
                setIndicator((Indicator)null);
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
            case ReportsPackage.PRESENTATION_PARAMETER__PLOT_TYPE:
                return PLOT_TYPE_EDEFAULT == null ? plotType != null : !PLOT_TYPE_EDEFAULT.equals(plotType);
            case ReportsPackage.PRESENTATION_PARAMETER__INDICATOR:
                return indicator != null;
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
        result.append(" (plotType: ");
        result.append(plotType);
        result.append(')');
        return result.toString();
    }

} //PresentationParameterImpl
