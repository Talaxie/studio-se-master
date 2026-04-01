/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.designer.core.model.utils.emf.component.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentFactoryImpl extends EFactoryImpl implements ComponentFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ComponentFactory init() {
        try {
            ComponentFactory theComponentFactory = (ComponentFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentPackage.eNS_URI);
            if (theComponentFactory != null) {
                return theComponentFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ComponentFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ComponentPackage.ADVANCEDPARAMETERS_TYPE: return createADVANCEDPARAMETERSType();
            case ComponentPackage.ARG_TYPE: return createARGType();
            case ComponentPackage.CODEGENERATION_TYPE: return createCODEGENERATIONType();
            case ComponentPackage.COLUMN_TYPE: return createCOLUMNType();
            case ComponentPackage.COMPONENT_TYPE: return createCOMPONENTType();
            case ComponentPackage.CONNECTORS_TYPE: return createCONNECTORSType();
            case ComponentPackage.CONNECTOR_TYPE: return createCONNECTORType();
            case ComponentPackage.DEFAULT_TYPE: return createDEFAULTType();
            case ComponentPackage.DOCUMENTATION_TYPE: return createDOCUMENTATIONType();
            case ComponentPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case ComponentPackage.FAMILIES_TYPE: return createFAMILIESType();
            case ComponentPackage.FORMAT_TYPE: return createFORMATType();
            case ComponentPackage.HEADER_TYPE: return createHEADERType();
            case ComponentPackage.IMPORTS_TYPE: return createIMPORTSType();
            case ComponentPackage.IMPORT_TYPE: return createIMPORTType();
            case ComponentPackage.INSTALL_TYPE: return createINSTALLType();
            case ComponentPackage.ITEMS_TYPE: return createITEMSType();
            case ComponentPackage.ITEM_TYPE: return createITEMType();
            case ComponentPackage.JAVACOMMAND_TYPE: return createJAVACOMMANDType();
            case ComponentPackage.LINKTO_TYPE: return createLINKTOType();
            case ComponentPackage.PARAMETERS_TYPE: return createPARAMETERSType();
            case ComponentPackage.PARAMETER_TYPE: return createPARAMETERType();
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE: return createPLUGINDEPENDENCIESType();
            case ComponentPackage.PLUGINDEPENDENCY_TYPE: return createPLUGINDEPENDENCYType();
            case ComponentPackage.RETURNS_TYPE: return createRETURNSType();
            case ComponentPackage.RETURN_TYPE: return createRETURNType();
            case ComponentPackage.SQLTEMPLATES_TYPE: return createSQLTEMPLATESType();
            case ComponentPackage.SQLTEMPLATE_TYPE: return createSQLTEMPLATEType();
            case ComponentPackage.TABLE_TYPE: return createTABLEType();
            case ComponentPackage.TEMPLATEPARAM_TYPE: return createTEMPLATEPARAMType();
            case ComponentPackage.TEMPLATES_TYPE: return createTEMPLATESType();
            case ComponentPackage.TEMPLATE_TYPE: return createTEMPLATEType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ADVANCEDPARAMETERSType createADVANCEDPARAMETERSType() {
        ADVANCEDPARAMETERSTypeImpl advancedparametersType = new ADVANCEDPARAMETERSTypeImpl();
        return advancedparametersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ARGType createARGType() {
        ARGTypeImpl argType = new ARGTypeImpl();
        return argType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CODEGENERATIONType createCODEGENERATIONType() {
        CODEGENERATIONTypeImpl codegenerationType = new CODEGENERATIONTypeImpl();
        return codegenerationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public COLUMNType createCOLUMNType() {
        COLUMNTypeImpl columnType = new COLUMNTypeImpl();
        return columnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public COMPONENTType createCOMPONENTType() {
        COMPONENTTypeImpl componentType = new COMPONENTTypeImpl();
        return componentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTORSType createCONNECTORSType() {
        CONNECTORSTypeImpl connectorsType = new CONNECTORSTypeImpl();
        return connectorsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONNECTORType createCONNECTORType() {
        CONNECTORTypeImpl connectorType = new CONNECTORTypeImpl();
        return connectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DEFAULTType createDEFAULTType() {
        DEFAULTTypeImpl defaultType = new DEFAULTTypeImpl();
        return defaultType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DOCUMENTATIONType createDOCUMENTATIONType() {
        DOCUMENTATIONTypeImpl documentationType = new DOCUMENTATIONTypeImpl();
        return documentationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FAMILIESType createFAMILIESType() {
        FAMILIESTypeImpl familiesType = new FAMILIESTypeImpl();
        return familiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FORMATType createFORMATType() {
        FORMATTypeImpl formatType = new FORMATTypeImpl();
        return formatType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HEADERType createHEADERType() {
        HEADERTypeImpl headerType = new HEADERTypeImpl();
        return headerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IMPORTSType createIMPORTSType() {
        IMPORTSTypeImpl importsType = new IMPORTSTypeImpl();
        return importsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IMPORTType createIMPORTType() {
        IMPORTTypeImpl importType = new IMPORTTypeImpl();
        return importType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public INSTALLType createINSTALLType() {
        INSTALLTypeImpl installType = new INSTALLTypeImpl();
        return installType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ITEMSType createITEMSType() {
        ITEMSTypeImpl itemsType = new ITEMSTypeImpl();
        return itemsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ITEMType createITEMType() {
        ITEMTypeImpl itemType = new ITEMTypeImpl();
        return itemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JAVACOMMANDType createJAVACOMMANDType() {
        JAVACOMMANDTypeImpl javacommandType = new JAVACOMMANDTypeImpl();
        return javacommandType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LINKTOType createLINKTOType() {
        LINKTOTypeImpl linktoType = new LINKTOTypeImpl();
        return linktoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARAMETERSType createPARAMETERSType() {
        PARAMETERSTypeImpl parametersType = new PARAMETERSTypeImpl();
        return parametersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PARAMETERType createPARAMETERType() {
        PARAMETERTypeImpl parameterType = new PARAMETERTypeImpl();
        return parameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PLUGINDEPENDENCIESType createPLUGINDEPENDENCIESType() {
        PLUGINDEPENDENCIESTypeImpl plugindependenciesType = new PLUGINDEPENDENCIESTypeImpl();
        return plugindependenciesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PLUGINDEPENDENCYType createPLUGINDEPENDENCYType() {
        PLUGINDEPENDENCYTypeImpl plugindependencyType = new PLUGINDEPENDENCYTypeImpl();
        return plugindependencyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RETURNSType createRETURNSType() {
        RETURNSTypeImpl returnsType = new RETURNSTypeImpl();
        return returnsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RETURNType createRETURNType() {
        RETURNTypeImpl returnType = new RETURNTypeImpl();
        return returnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SQLTEMPLATESType createSQLTEMPLATESType() {
        SQLTEMPLATESTypeImpl sqltemplatesType = new SQLTEMPLATESTypeImpl();
        return sqltemplatesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SQLTEMPLATEType createSQLTEMPLATEType() {
        SQLTEMPLATETypeImpl sqltemplateType = new SQLTEMPLATETypeImpl();
        return sqltemplateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TABLEType createTABLEType() {
        TABLETypeImpl tableType = new TABLETypeImpl();
        return tableType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TEMPLATEPARAMType createTEMPLATEPARAMType() {
        TEMPLATEPARAMTypeImpl templateparamType = new TEMPLATEPARAMTypeImpl();
        return templateparamType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TEMPLATESType createTEMPLATESType() {
        TEMPLATESTypeImpl templatesType = new TEMPLATESTypeImpl();
        return templatesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TEMPLATEType createTEMPLATEType() {
        TEMPLATETypeImpl templateType = new TEMPLATETypeImpl();
        return templateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentPackage getComponentPackage() {
        return (ComponentPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    public static ComponentPackage getPackage() {
        return ComponentPackage.eINSTANCE;
    }

} //ComponentFactoryImpl
