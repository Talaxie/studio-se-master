/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.resource.coboldata.*;
import orgomg.cwmx.resource.coboldata.AccessType;
import orgomg.cwmx.resource.coboldata.BlockKind;
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.COBOLFDIndex;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.CoboldataFactory;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.FileOrganization;
import orgomg.cwmx.resource.coboldata.FileSection;
import orgomg.cwmx.resource.coboldata.LabelKind;
import orgomg.cwmx.resource.coboldata.LinageInfo;
import orgomg.cwmx.resource.coboldata.LinageInfoType;
import orgomg.cwmx.resource.coboldata.LinkageSection;
import orgomg.cwmx.resource.coboldata.OccursKey;
import orgomg.cwmx.resource.coboldata.Renames;
import orgomg.cwmx.resource.coboldata.ReportWriterSection;
import orgomg.cwmx.resource.coboldata.Section;
import orgomg.cwmx.resource.coboldata.SignKindType;
import orgomg.cwmx.resource.coboldata.Usage;
import orgomg.cwmx.resource.coboldata.WorkingStorageSection;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CoboldataFactoryImpl extends EFactoryImpl implements CoboldataFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static CoboldataFactory init() {
        try {
            CoboldataFactory theCoboldataFactory = (CoboldataFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/resource/coboldata.ecore");
            if (theCoboldataFactory != null) {
                return theCoboldataFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CoboldataFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public CoboldataFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case CoboldataPackage.COBOLFD:
            return createCOBOLFD();
        case CoboldataPackage.COBOL_FIELD:
            return createCOBOLField();
        case CoboldataPackage.RENAMES:
            return createRenames();
        case CoboldataPackage.SECTION:
            return createSection();
        case CoboldataPackage.WORKING_STORAGE_SECTION:
            return createWorkingStorageSection();
        case CoboldataPackage.FILE_SECTION:
            return createFileSection();
        case CoboldataPackage.REPORT_WRITER_SECTION:
            return createReportWriterSection();
        case CoboldataPackage.LINKAGE_SECTION:
            return createLinkageSection();
        case CoboldataPackage.OCCURS_KEY:
            return createOccursKey();
        case CoboldataPackage.LINAGE_INFO:
            return createLinageInfo();
        case CoboldataPackage.COBOLFD_INDEX:
            return createCOBOLFDIndex();
        case CoboldataPackage.USAGE:
            return createUsage();
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
        case CoboldataPackage.ACCESS_TYPE:
            return createAccessTypeFromString(eDataType, initialValue);
        case CoboldataPackage.BLOCK_KIND:
            return createBlockKindFromString(eDataType, initialValue);
        case CoboldataPackage.FILE_ORGANIZATION:
            return createFileOrganizationFromString(eDataType, initialValue);
        case CoboldataPackage.LABEL_KIND:
            return createLabelKindFromString(eDataType, initialValue);
        case CoboldataPackage.LINAGE_INFO_TYPE:
            return createLinageInfoTypeFromString(eDataType, initialValue);
        case CoboldataPackage.SIGN_KIND_TYPE:
            return createSignKindTypeFromString(eDataType, initialValue);
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
        case CoboldataPackage.ACCESS_TYPE:
            return convertAccessTypeToString(eDataType, instanceValue);
        case CoboldataPackage.BLOCK_KIND:
            return convertBlockKindToString(eDataType, instanceValue);
        case CoboldataPackage.FILE_ORGANIZATION:
            return convertFileOrganizationToString(eDataType, instanceValue);
        case CoboldataPackage.LABEL_KIND:
            return convertLabelKindToString(eDataType, instanceValue);
        case CoboldataPackage.LINAGE_INFO_TYPE:
            return convertLinageInfoTypeToString(eDataType, instanceValue);
        case CoboldataPackage.SIGN_KIND_TYPE:
            return convertSignKindTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLFD createCOBOLFD() {
        COBOLFDImpl cobolfd = new COBOLFDImpl();
        return cobolfd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLField createCOBOLField() {
        COBOLFieldImpl cobolField = new COBOLFieldImpl();
        return cobolField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Renames createRenames() {
        RenamesImpl renames = new RenamesImpl();
        return renames;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Section createSection() {
        SectionImpl section = new SectionImpl();
        return section;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public WorkingStorageSection createWorkingStorageSection() {
        WorkingStorageSectionImpl workingStorageSection = new WorkingStorageSectionImpl();
        return workingStorageSection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FileSection createFileSection() {
        FileSectionImpl fileSection = new FileSectionImpl();
        return fileSection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportWriterSection createReportWriterSection() {
        ReportWriterSectionImpl reportWriterSection = new ReportWriterSectionImpl();
        return reportWriterSection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LinkageSection createLinkageSection() {
        LinkageSectionImpl linkageSection = new LinkageSectionImpl();
        return linkageSection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public OccursKey createOccursKey() {
        OccursKeyImpl occursKey = new OccursKeyImpl();
        return occursKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LinageInfo createLinageInfo() {
        LinageInfoImpl linageInfo = new LinageInfoImpl();
        return linageInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public COBOLFDIndex createCOBOLFDIndex() {
        COBOLFDIndexImpl cobolfdIndex = new COBOLFDIndexImpl();
        return cobolfdIndex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Usage createUsage() {
        UsageImpl usage = new UsageImpl();
        return usage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
        AccessType result = AccessType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BlockKind createBlockKindFromString(EDataType eDataType, String initialValue) {
        BlockKind result = BlockKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FileOrganization createFileOrganizationFromString(EDataType eDataType, String initialValue) {
        FileOrganization result = FileOrganization.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertFileOrganizationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LabelKind createLabelKindFromString(EDataType eDataType, String initialValue) {
        LabelKind result = LabelKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertLabelKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LinageInfoType createLinageInfoTypeFromString(EDataType eDataType, String initialValue) {
        LinageInfoType result = LinageInfoType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertLinageInfoTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SignKindType createSignKindTypeFromString(EDataType eDataType, String initialValue) {
        SignKindType result = SignKindType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertSignKindTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CoboldataPackage getCoboldataPackage() {
        return (CoboldataPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CoboldataPackage getPackage() {
        return CoboldataPackage.eINSTANCE;
    }

} // CoboldataFactoryImpl
