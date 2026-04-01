/**
 */
package org.talend.designer.core.model.utils.emf.component.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.component.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage
 * @generated
 */
public class ComponentSwitch {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ComponentPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentSwitch() {
        if (modelPackage == null) {
            modelPackage = ComponentPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public Object doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch((EClass)eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected Object doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ComponentPackage.ADVANCEDPARAMETERS_TYPE: {
                ADVANCEDPARAMETERSType advancedparametersType = (ADVANCEDPARAMETERSType)theEObject;
                Object result = caseADVANCEDPARAMETERSType(advancedparametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ARG_TYPE: {
                ARGType argType = (ARGType)theEObject;
                Object result = caseARGType(argType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.CODEGENERATION_TYPE: {
                CODEGENERATIONType codegenerationType = (CODEGENERATIONType)theEObject;
                Object result = caseCODEGENERATIONType(codegenerationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.COLUMN_TYPE: {
                COLUMNType columnType = (COLUMNType)theEObject;
                Object result = caseCOLUMNType(columnType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.COMPONENT_TYPE: {
                COMPONENTType componentType = (COMPONENTType)theEObject;
                Object result = caseCOMPONENTType(componentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.CONNECTORS_TYPE: {
                CONNECTORSType connectorsType = (CONNECTORSType)theEObject;
                Object result = caseCONNECTORSType(connectorsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.CONNECTOR_TYPE: {
                CONNECTORType connectorType = (CONNECTORType)theEObject;
                Object result = caseCONNECTORType(connectorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.DEFAULT_TYPE: {
                DEFAULTType defaultType = (DEFAULTType)theEObject;
                Object result = caseDEFAULTType(defaultType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.DOCUMENTATION_TYPE: {
                DOCUMENTATIONType documentationType = (DOCUMENTATIONType)theEObject;
                Object result = caseDOCUMENTATIONType(documentationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                Object result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.FAMILIES_TYPE: {
                FAMILIESType familiesType = (FAMILIESType)theEObject;
                Object result = caseFAMILIESType(familiesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.FORMAT_TYPE: {
                FORMATType formatType = (FORMATType)theEObject;
                Object result = caseFORMATType(formatType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.HEADER_TYPE: {
                HEADERType headerType = (HEADERType)theEObject;
                Object result = caseHEADERType(headerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.IMPORTS_TYPE: {
                IMPORTSType importsType = (IMPORTSType)theEObject;
                Object result = caseIMPORTSType(importsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.IMPORT_TYPE: {
                IMPORTType importType = (IMPORTType)theEObject;
                Object result = caseIMPORTType(importType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.INSTALL_TYPE: {
                INSTALLType installType = (INSTALLType)theEObject;
                Object result = caseINSTALLType(installType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ITEMS_TYPE: {
                ITEMSType itemsType = (ITEMSType)theEObject;
                Object result = caseITEMSType(itemsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.ITEM_TYPE: {
                ITEMType itemType = (ITEMType)theEObject;
                Object result = caseITEMType(itemType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.JAVACOMMAND_TYPE: {
                JAVACOMMANDType javacommandType = (JAVACOMMANDType)theEObject;
                Object result = caseJAVACOMMANDType(javacommandType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.LINKTO_TYPE: {
                LINKTOType linktoType = (LINKTOType)theEObject;
                Object result = caseLINKTOType(linktoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PARAMETERS_TYPE: {
                PARAMETERSType parametersType = (PARAMETERSType)theEObject;
                Object result = casePARAMETERSType(parametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PARAMETER_TYPE: {
                PARAMETERType parameterType = (PARAMETERType)theEObject;
                Object result = casePARAMETERType(parameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PLUGINDEPENDENCIES_TYPE: {
                PLUGINDEPENDENCIESType plugindependenciesType = (PLUGINDEPENDENCIESType)theEObject;
                Object result = casePLUGINDEPENDENCIESType(plugindependenciesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.PLUGINDEPENDENCY_TYPE: {
                PLUGINDEPENDENCYType plugindependencyType = (PLUGINDEPENDENCYType)theEObject;
                Object result = casePLUGINDEPENDENCYType(plugindependencyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.RETURNS_TYPE: {
                RETURNSType returnsType = (RETURNSType)theEObject;
                Object result = caseRETURNSType(returnsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.RETURN_TYPE: {
                RETURNType returnType = (RETURNType)theEObject;
                Object result = caseRETURNType(returnType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.SQLTEMPLATES_TYPE: {
                SQLTEMPLATESType sqltemplatesType = (SQLTEMPLATESType)theEObject;
                Object result = caseSQLTEMPLATESType(sqltemplatesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.SQLTEMPLATE_TYPE: {
                SQLTEMPLATEType sqltemplateType = (SQLTEMPLATEType)theEObject;
                Object result = caseSQLTEMPLATEType(sqltemplateType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.TABLE_TYPE: {
                TABLEType tableType = (TABLEType)theEObject;
                Object result = caseTABLEType(tableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.TEMPLATEPARAM_TYPE: {
                TEMPLATEPARAMType templateparamType = (TEMPLATEPARAMType)theEObject;
                Object result = caseTEMPLATEPARAMType(templateparamType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.TEMPLATES_TYPE: {
                TEMPLATESType templatesType = (TEMPLATESType)theEObject;
                Object result = caseTEMPLATESType(templatesType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ComponentPackage.TEMPLATE_TYPE: {
                TEMPLATEType templateType = (TEMPLATEType)theEObject;
                Object result = caseTEMPLATEType(templateType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ADVANCEDPARAMETERS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ADVANCEDPARAMETERS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseADVANCEDPARAMETERSType(ADVANCEDPARAMETERSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ARG Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ARG Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseARGType(ARGType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CODEGENERATION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CODEGENERATION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseCODEGENERATIONType(CODEGENERATIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>COLUMN Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>COLUMN Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseCOLUMNType(COLUMNType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>COMPONENT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>COMPONENT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseCOMPONENTType(COMPONENTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONNECTORS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONNECTORS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseCONNECTORSType(CONNECTORSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CONNECTOR Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CONNECTOR Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseCONNECTORType(CONNECTORType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DEFAULT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DEFAULT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDEFAULTType(DEFAULTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DOCUMENTATION Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DOCUMENTATION Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDOCUMENTATIONType(DOCUMENTATIONType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FAMILIES Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FAMILIES Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFAMILIESType(FAMILIESType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FORMAT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FORMAT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseFORMATType(FORMATType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HEADER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HEADER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseHEADERType(HEADERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IMPORTS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IMPORTS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseIMPORTSType(IMPORTSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IMPORT Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IMPORT Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseIMPORTType(IMPORTType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>INSTALL Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>INSTALL Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseINSTALLType(INSTALLType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ITEMS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ITEMS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseITEMSType(ITEMSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ITEM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ITEM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseITEMType(ITEMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>JAVACOMMAND Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JAVACOMMAND Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseJAVACOMMANDType(JAVACOMMANDType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LINKTO Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LINKTO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseLINKTOType(LINKTOType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PARAMETERS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PARAMETERS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object casePARAMETERSType(PARAMETERSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PARAMETER Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PARAMETER Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object casePARAMETERType(PARAMETERType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PLUGINDEPENDENCIES Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PLUGINDEPENDENCIES Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object casePLUGINDEPENDENCIESType(PLUGINDEPENDENCIESType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PLUGINDEPENDENCY Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PLUGINDEPENDENCY Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object casePLUGINDEPENDENCYType(PLUGINDEPENDENCYType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RETURNS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RETURNS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRETURNSType(RETURNSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RETURN Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RETURN Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRETURNType(RETURNType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SQLTEMPLATES Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SQLTEMPLATES Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSQLTEMPLATESType(SQLTEMPLATESType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SQLTEMPLATE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SQLTEMPLATE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSQLTEMPLATEType(SQLTEMPLATEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TABLE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TABLE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTABLEType(TABLEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEMPLATEPARAM Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEMPLATEPARAM Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTEMPLATEPARAMType(TEMPLATEPARAMType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEMPLATES Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEMPLATES Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTEMPLATESType(TEMPLATESType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TEMPLATE Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TEMPLATE Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseTEMPLATEType(TEMPLATEType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public Object defaultCase(EObject object) {
        return null;
    }

} //ComponentSwitch
