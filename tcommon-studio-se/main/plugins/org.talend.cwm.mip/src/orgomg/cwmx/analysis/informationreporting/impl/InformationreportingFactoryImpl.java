/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationreporting.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.analysis.informationreporting.*;
import orgomg.cwmx.analysis.informationreporting.InformationreportingFactory;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;
import orgomg.cwmx.analysis.informationreporting.Report;
import orgomg.cwmx.analysis.informationreporting.ReportAttribute;
import orgomg.cwmx.analysis.informationreporting.ReportExecution;
import orgomg.cwmx.analysis.informationreporting.ReportField;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;
import orgomg.cwmx.analysis.informationreporting.ReportGroupType;
import orgomg.cwmx.analysis.informationreporting.ReportPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class InformationreportingFactoryImpl extends EFactoryImpl implements InformationreportingFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static InformationreportingFactory init() {
        try {
            InformationreportingFactory theInformationreportingFactory = (InformationreportingFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/analysis/informationreporting.ecore");
            if (theInformationreportingFactory != null) {
                return theInformationreportingFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InformationreportingFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public InformationreportingFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case InformationreportingPackage.REPORT:
            return createReport();
        case InformationreportingPackage.REPORT_ATTRIBUTE:
            return createReportAttribute();
        case InformationreportingPackage.REPORT_EXECUTION:
            return createReportExecution();
        case InformationreportingPackage.REPORT_FIELD:
            return createReportField();
        case InformationreportingPackage.REPORT_GROUP:
            return createReportGroup();
        case InformationreportingPackage.REPORT_PACKAGE:
            return createReportPackage();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case InformationreportingPackage.REPORT_GROUP_TYPE:
            return createReportGroupTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case InformationreportingPackage.REPORT_GROUP_TYPE:
            return convertReportGroupTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Report createReport() {
        ReportImpl report = new ReportImpl();
        return report;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportAttribute createReportAttribute() {
        ReportAttributeImpl reportAttribute = new ReportAttributeImpl();
        return reportAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportExecution createReportExecution() {
        ReportExecutionImpl reportExecution = new ReportExecutionImpl();
        return reportExecution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportField createReportField() {
        ReportFieldImpl reportField = new ReportFieldImpl();
        return reportField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportGroup createReportGroup() {
        ReportGroupImpl reportGroup = new ReportGroupImpl();
        return reportGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportPackage createReportPackage() {
        ReportPackageImpl reportPackage = new ReportPackageImpl();
        return reportPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportGroupType createReportGroupTypeFromString(EDataType eDataType, String initialValue) {
        ReportGroupType result = ReportGroupType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertReportGroupTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InformationreportingPackage getInformationreportingPackage() {
        return (InformationreportingPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InformationreportingPackage getPackage() {
        return InformationreportingPackage.eINSTANCE;
    }

} // InformationreportingFactoryImpl
