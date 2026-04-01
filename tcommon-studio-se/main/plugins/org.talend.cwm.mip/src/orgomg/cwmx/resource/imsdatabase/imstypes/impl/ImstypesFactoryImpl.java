/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.imstypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.resource.imsdatabase.imstypes.*;
import orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType;
import orgomg.cwmx.resource.imsdatabase.imstypes.AlgorithmType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.DeviceType;
import orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesFactory;
import orgomg.cwmx.resource.imsdatabase.imstypes.ImstypesPackage;
import orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.LTermType;
import orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype;
import orgomg.cwmx.resource.imsdatabase.imstypes.ModelType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PCBType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PSBLanguageType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ParentType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PositioningType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RECFMType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RulesType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ImstypesFactoryImpl extends EFactoryImpl implements ImstypesFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static ImstypesFactory init() {
        try {
            ImstypesFactory theImstypesFactory = (ImstypesFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/resource/imsdatabase/imstypes.ecore");
            if (theImstypesFactory != null) {
                return theImstypesFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ImstypesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ImstypesFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
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
        case ImstypesPackage.ACCESS_METHOD_TYPE:
            return createAccessMethodTypeFromString(eDataType, initialValue);
        case ImstypesPackage.PSB_LANGUAGE_TYPE:
            return createPSBLanguageTypeFromString(eDataType, initialValue);
        case ImstypesPackage.PCB_TYPE:
            return createPCBTypeFromString(eDataType, initialValue);
        case ImstypesPackage.POSITIONING_TYPE:
            return createPositioningTypeFromString(eDataType, initialValue);
        case ImstypesPackage.LTERM_TYPE:
            return createLTermTypeFromString(eDataType, initialValue);
        case ImstypesPackage.RULES_TYPE:
            return createRulesTypeFromString(eDataType, initialValue);
        case ImstypesPackage.CHILD_POINTER_TYPE:
            return createChildPointerTypeFromString(eDataType, initialValue);
        case ImstypesPackage.FLAGS_TYPE:
            return createFlagsTypeFromString(eDataType, initialValue);
        case ImstypesPackage.POINTER_TYPE:
            return createPointerTypeFromString(eDataType, initialValue);
        case ImstypesPackage.DEVICE_TYPE:
            return createDeviceTypeFromString(eDataType, initialValue);
        case ImstypesPackage.MODEL_TYPE:
            return createModelTypeFromString(eDataType, initialValue);
        case ImstypesPackage.RECFM_TYPE:
            return createRECFMTypeFromString(eDataType, initialValue);
        case ImstypesPackage.ALGORITHM_TYPE:
            return createAlgorithmTypeFromString(eDataType, initialValue);
        case ImstypesPackage.LPOINTER_TYPE:
            return createLPointerTypeFromString(eDataType, initialValue);
        case ImstypesPackage.MSD_BTYPE:
            return createMSDBtypeFromString(eDataType, initialValue);
        case ImstypesPackage.PARENT_TYPE:
            return createParentTypeFromString(eDataType, initialValue);
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
        case ImstypesPackage.ACCESS_METHOD_TYPE:
            return convertAccessMethodTypeToString(eDataType, instanceValue);
        case ImstypesPackage.PSB_LANGUAGE_TYPE:
            return convertPSBLanguageTypeToString(eDataType, instanceValue);
        case ImstypesPackage.PCB_TYPE:
            return convertPCBTypeToString(eDataType, instanceValue);
        case ImstypesPackage.POSITIONING_TYPE:
            return convertPositioningTypeToString(eDataType, instanceValue);
        case ImstypesPackage.LTERM_TYPE:
            return convertLTermTypeToString(eDataType, instanceValue);
        case ImstypesPackage.RULES_TYPE:
            return convertRulesTypeToString(eDataType, instanceValue);
        case ImstypesPackage.CHILD_POINTER_TYPE:
            return convertChildPointerTypeToString(eDataType, instanceValue);
        case ImstypesPackage.FLAGS_TYPE:
            return convertFlagsTypeToString(eDataType, instanceValue);
        case ImstypesPackage.POINTER_TYPE:
            return convertPointerTypeToString(eDataType, instanceValue);
        case ImstypesPackage.DEVICE_TYPE:
            return convertDeviceTypeToString(eDataType, instanceValue);
        case ImstypesPackage.MODEL_TYPE:
            return convertModelTypeToString(eDataType, instanceValue);
        case ImstypesPackage.RECFM_TYPE:
            return convertRECFMTypeToString(eDataType, instanceValue);
        case ImstypesPackage.ALGORITHM_TYPE:
            return convertAlgorithmTypeToString(eDataType, instanceValue);
        case ImstypesPackage.LPOINTER_TYPE:
            return convertLPointerTypeToString(eDataType, instanceValue);
        case ImstypesPackage.MSD_BTYPE:
            return convertMSDBtypeToString(eDataType, instanceValue);
        case ImstypesPackage.PARENT_TYPE:
            return convertParentTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AccessMethodType createAccessMethodTypeFromString(EDataType eDataType, String initialValue) {
        AccessMethodType result = AccessMethodType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertAccessMethodTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PSBLanguageType createPSBLanguageTypeFromString(EDataType eDataType, String initialValue) {
        PSBLanguageType result = PSBLanguageType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertPSBLanguageTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PCBType createPCBTypeFromString(EDataType eDataType, String initialValue) {
        PCBType result = PCBType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertPCBTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PositioningType createPositioningTypeFromString(EDataType eDataType, String initialValue) {
        PositioningType result = PositioningType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertPositioningTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LTermType createLTermTypeFromString(EDataType eDataType, String initialValue) {
        LTermType result = LTermType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertLTermTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RulesType createRulesTypeFromString(EDataType eDataType, String initialValue) {
        RulesType result = RulesType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertRulesTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ChildPointerType createChildPointerTypeFromString(EDataType eDataType, String initialValue) {
        ChildPointerType result = ChildPointerType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertChildPointerTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FlagsType createFlagsTypeFromString(EDataType eDataType, String initialValue) {
        FlagsType result = FlagsType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertFlagsTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PointerType createPointerTypeFromString(EDataType eDataType, String initialValue) {
        PointerType result = PointerType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertPointerTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DeviceType createDeviceTypeFromString(EDataType eDataType, String initialValue) {
        DeviceType result = DeviceType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertDeviceTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModelType createModelTypeFromString(EDataType eDataType, String initialValue) {
        ModelType result = ModelType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertModelTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RECFMType createRECFMTypeFromString(EDataType eDataType, String initialValue) {
        RECFMType result = RECFMType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertRECFMTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AlgorithmType createAlgorithmTypeFromString(EDataType eDataType, String initialValue) {
        AlgorithmType result = AlgorithmType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertAlgorithmTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LPointerType createLPointerTypeFromString(EDataType eDataType, String initialValue) {
        LPointerType result = LPointerType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertLPointerTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MSDBtype createMSDBtypeFromString(EDataType eDataType, String initialValue) {
        MSDBtype result = MSDBtype.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertMSDBtypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ParentType createParentTypeFromString(EDataType eDataType, String initialValue) {
        ParentType result = ParentType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertParentTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ImstypesPackage getImstypesPackage() {
        return (ImstypesPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ImstypesPackage getPackage() {
        return ImstypesPackage.eINSTANCE;
    }

} // ImstypesFactoryImpl
