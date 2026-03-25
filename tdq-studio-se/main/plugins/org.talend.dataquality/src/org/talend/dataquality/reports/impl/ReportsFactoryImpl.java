/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.reports.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.reports.AnalysisMap;
import org.talend.dataquality.reports.PresentationParameter;
import org.talend.dataquality.reports.ReportsFactory;
import org.talend.dataquality.reports.ReportsPackage;
import org.talend.dataquality.reports.TdReport;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ReportsFactoryImpl extends EFactoryImpl implements ReportsFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ReportsFactory init() {
        try {
            ReportsFactory theReportsFactory = (ReportsFactory)EPackage.Registry.INSTANCE.getEFactory("http://dataquality.reports"); 
            if (theReportsFactory != null) {
                return theReportsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ReportsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ReportsPackage.TD_REPORT: return createTdReport();
            case ReportsPackage.PRESENTATION_PARAMETER: return createPresentationParameter();
            case ReportsPackage.ANALYSIS_MAP: return createAnalysisMap();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TdReport createTdReport() {
        TdReportImpl tdReport = new TdReportImpl();
        return tdReport;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PresentationParameter createPresentationParameter() {
        PresentationParameterImpl presentationParameter = new PresentationParameterImpl();
        return presentationParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AnalysisMap createAnalysisMap() {
        AnalysisMapImpl analysisMap = new AnalysisMapImpl();
        return analysisMap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportsPackage getReportsPackage() {
        return (ReportsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ReportsPackage getPackage() {
        return ReportsPackage.eINSTANCE;
    }

} // ReportsFactoryImpl
