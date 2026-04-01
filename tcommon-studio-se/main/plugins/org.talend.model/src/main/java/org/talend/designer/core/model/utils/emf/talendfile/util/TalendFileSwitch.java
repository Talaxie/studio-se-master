/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.util;

import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.talend.designer.core.model.utils.emf.talendfile.*;

import org.talend.designer.core.model.utils.emf.talendfile.ColumnType;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.DocumentRoot;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType;
import org.talend.designer.core.model.utils.emf.talendfile.LogToFileType;
import org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType;
import org.talend.designer.core.model.utils.emf.talendfile.LogsType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

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
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage
 * @generated
 */
public class TalendFileSwitch {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TalendFilePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendFileSwitch() {
        if (modelPackage == null) {
            modelPackage = TalendFilePackage.eINSTANCE;
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
            case TalendFilePackage.COLUMN_TYPE: {
                ColumnType columnType = (ColumnType)theEObject;
                Object result = caseColumnType(columnType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.CONNECTION_TYPE: {
                ConnectionType connectionType = (ConnectionType)theEObject;
                Object result = caseConnectionType(connectionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.CONTEXT_PARAMETER_TYPE: {
                ContextParameterType contextParameterType = (ContextParameterType)theEObject;
                Object result = caseContextParameterType(contextParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.CONTEXT_TYPE: {
                ContextType contextType = (ContextType)theEObject;
                Object result = caseContextType(contextType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                Object result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.ELEMENT_PARAMETER_TYPE: {
                ElementParameterType elementParameterType = (ElementParameterType)theEObject;
                Object result = caseElementParameterType(elementParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.ELEMENT_VALUE_TYPE: {
                ElementValueType elementValueType = (ElementValueType)theEObject;
                Object result = caseElementValueType(elementValueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.JOB_TYPE: {
                JobType jobType = (JobType)theEObject;
                Object result = caseJobType(jobType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.LOGS_TYPE: {
                LogsType logsType = (LogsType)theEObject;
                Object result = caseLogsType(logsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.LOG_TO_DATABASE_TYPE: {
                LogToDatabaseType logToDatabaseType = (LogToDatabaseType)theEObject;
                Object result = caseLogToDatabaseType(logToDatabaseType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.LOG_TO_FILE_TYPE: {
                LogToFileType logToFileType = (LogToFileType)theEObject;
                Object result = caseLogToFileType(logToFileType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.LOG_TO_STD_OUT_TYPE: {
                LogToStdOutType logToStdOutType = (LogToStdOutType)theEObject;
                Object result = caseLogToStdOutType(logToStdOutType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.METADATA_TYPE: {
                MetadataType metadataType = (MetadataType)theEObject;
                Object result = caseMetadataType(metadataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.NODE_TYPE: {
                NodeType nodeType = (NodeType)theEObject;
                Object result = caseNodeType(nodeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.NOTE_TYPE: {
                NoteType noteType = (NoteType)theEObject;
                Object result = caseNoteType(noteType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.PARAMETERS_TYPE: {
                ParametersType parametersType = (ParametersType)theEObject;
                Object result = caseParametersType(parametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.PROCESS_TYPE: {
                ProcessType processType = (ProcessType)theEObject;
                Object result = caseProcessType(processType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.REQUIRED_TYPE: {
                RequiredType requiredType = (RequiredType)theEObject;
                Object result = caseRequiredType(requiredType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.SUBJOB_TYPE: {
                SubjobType subjobType = (SubjobType)theEObject;
                Object result = caseSubjobType(subjobType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.ITEM_INFOR_TYPE: {
                ItemInforType itemInforType = (ItemInforType)theEObject;
                Object result = caseItemInforType(itemInforType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.ABSTRACT_EXTERNAL_DATA: {
                AbstractExternalData abstractExternalData = (AbstractExternalData)theEObject;
                Object result = caseAbstractExternalData(abstractExternalData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.ROUTINES_PARAMETER_TYPE: {
                RoutinesParameterType routinesParameterType = (RoutinesParameterType)theEObject;
                Object result = caseRoutinesParameterType(routinesParameterType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.NODE_CONTAINER_TYPE: {
                NodeContainerType nodeContainerType = (NodeContainerType)theEObject;
                Object result = caseNodeContainerType(nodeContainerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.SCREENSHOTS_MAP: {
                Map.Entry screenshotsMap = (Map.Entry)theEObject;
                Object result = caseScreenshotsMap(screenshotsMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TalendFilePackage.ADDITIONAL_FIELD_MAP: {
                Map.Entry additionalFieldMap = (Map.Entry)theEObject;
                Object result = caseAdditionalFieldMap(additionalFieldMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseColumnType(ColumnType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseConnectionType(ConnectionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseContextParameterType(ContextParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseContextType(ContextType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Element Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseElementParameterType(ElementParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element Value Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseElementValueType(ElementValueType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Job Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Job Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseJobType(JobType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logs Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logs Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseLogsType(LogsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log To Database Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log To Database Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseLogToDatabaseType(LogToDatabaseType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log To File Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log To File Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseLogToFileType(LogToFileType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log To Std Out Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log To Std Out Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseLogToStdOutType(LogToStdOutType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseMetadataType(MetadataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseNodeType(NodeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseNoteType(NoteType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseParametersType(ParametersType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseProcessType(ProcessType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Required Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Required Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRequiredType(RequiredType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subjob Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subjob Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseSubjobType(SubjobType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item Infor Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item Infor Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseItemInforType(ItemInforType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract External Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAbstractExternalData(AbstractExternalData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Routines Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Routines Parameter Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseRoutinesParameterType(RoutinesParameterType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Node Container Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node Container Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseNodeContainerType(NodeContainerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Screenshots Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Screenshots Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseScreenshotsMap(Map.Entry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Additional Field Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Additional Field Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public Object caseAdditionalFieldMap(Map.Entry object) {
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

} //TalendFileSwitch
