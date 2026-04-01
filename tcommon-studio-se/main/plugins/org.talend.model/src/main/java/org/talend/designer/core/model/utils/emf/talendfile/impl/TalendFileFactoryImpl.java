/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TalendFileFactoryImpl extends EFactoryImpl implements TalendFileFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TalendFileFactory init() {
        try {
            TalendFileFactory theTalendFileFactory = (TalendFileFactory)EPackage.Registry.INSTANCE.getEFactory(TalendFilePackage.eNS_URI);
            if (theTalendFileFactory != null) {
                return theTalendFileFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TalendFileFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendFileFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TalendFilePackage.COLUMN_TYPE: return createColumnType();
            case TalendFilePackage.CONNECTION_TYPE: return createConnectionType();
            case TalendFilePackage.CONTEXT_PARAMETER_TYPE: return createContextParameterType();
            case TalendFilePackage.CONTEXT_TYPE: return createContextType();
            case TalendFilePackage.DOCUMENT_ROOT: return createDocumentRoot();
            case TalendFilePackage.ELEMENT_PARAMETER_TYPE: return createElementParameterType();
            case TalendFilePackage.ELEMENT_VALUE_TYPE: return createElementValueType();
            case TalendFilePackage.JOB_TYPE: return createJobType();
            case TalendFilePackage.LOGS_TYPE: return createLogsType();
            case TalendFilePackage.LOG_TO_DATABASE_TYPE: return createLogToDatabaseType();
            case TalendFilePackage.LOG_TO_FILE_TYPE: return createLogToFileType();
            case TalendFilePackage.LOG_TO_STD_OUT_TYPE: return createLogToStdOutType();
            case TalendFilePackage.METADATA_TYPE: return createMetadataType();
            case TalendFilePackage.NODE_TYPE: return createNodeType();
            case TalendFilePackage.NOTE_TYPE: return createNoteType();
            case TalendFilePackage.PARAMETERS_TYPE: return createParametersType();
            case TalendFilePackage.PROCESS_TYPE: return createProcessType();
            case TalendFilePackage.REQUIRED_TYPE: return createRequiredType();
            case TalendFilePackage.SUBJOB_TYPE: return createSubjobType();
            case TalendFilePackage.ITEM_INFOR_TYPE: return createItemInforType();
            case TalendFilePackage.ROUTINES_PARAMETER_TYPE: return createRoutinesParameterType();
            case TalendFilePackage.NODE_CONTAINER_TYPE: return createNodeContainerType();
            case TalendFilePackage.SCREENSHOTS_MAP: return (EObject)createScreenshotsMap();
            case TalendFilePackage.ADDITIONAL_FIELD_MAP: return (EObject)createAdditionalFieldMap();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnType createColumnType() {
        ColumnTypeImpl columnType = new ColumnTypeImpl();
        return columnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionType createConnectionType() {
        ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
        return connectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextParameterType createContextParameterType() {
        ContextParameterTypeImpl contextParameterType = new ContextParameterTypeImpl();
        return contextParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextType createContextType() {
        ContextTypeImpl contextType = new ContextTypeImpl();
        return contextType;
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
    public ElementParameterType createElementParameterType() {
        ElementParameterTypeImpl elementParameterType = new ElementParameterTypeImpl();
        return elementParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementValueType createElementValueType() {
        ElementValueTypeImpl elementValueType = new ElementValueTypeImpl();
        return elementValueType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JobType createJobType() {
        JobTypeImpl jobType = new JobTypeImpl();
        return jobType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogsType createLogsType() {
        LogsTypeImpl logsType = new LogsTypeImpl();
        return logsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToDatabaseType createLogToDatabaseType() {
        LogToDatabaseTypeImpl logToDatabaseType = new LogToDatabaseTypeImpl();
        return logToDatabaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToFileType createLogToFileType() {
        LogToFileTypeImpl logToFileType = new LogToFileTypeImpl();
        return logToFileType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToStdOutType createLogToStdOutType() {
        LogToStdOutTypeImpl logToStdOutType = new LogToStdOutTypeImpl();
        return logToStdOutType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetadataType createMetadataType() {
        MetadataTypeImpl metadataType = new MetadataTypeImpl();
        return metadataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeType createNodeType() {
        NodeTypeImpl nodeType = new NodeTypeImpl();
        return nodeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoteType createNoteType() {
        NoteTypeImpl noteType = new NoteTypeImpl();
        return noteType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParametersType createParametersType() {
        ParametersTypeImpl parametersType = new ParametersTypeImpl();
        return parametersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessType() {
        ProcessTypeImpl processType = new ProcessTypeImpl();
        return processType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RequiredType createRequiredType() {
        RequiredTypeImpl requiredType = new RequiredTypeImpl();
        return requiredType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjobType createSubjobType() {
        SubjobTypeImpl subjobType = new SubjobTypeImpl();
        return subjobType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemInforType createItemInforType() {
        ItemInforTypeImpl itemInforType = new ItemInforTypeImpl();
        return itemInforType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoutinesParameterType createRoutinesParameterType() {
        RoutinesParameterTypeImpl routinesParameterType = new RoutinesParameterTypeImpl();
        return routinesParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeContainerType createNodeContainerType() {
        NodeContainerTypeImpl nodeContainerType = new NodeContainerTypeImpl();
        return nodeContainerType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry createScreenshotsMap() {
        ScreenshotsMapImpl screenshotsMap = new ScreenshotsMapImpl();
        return screenshotsMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry createAdditionalFieldMap() {
        AdditionalFieldMapImpl additionalFieldMap = new AdditionalFieldMapImpl();
        return additionalFieldMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendFilePackage getTalendFilePackage() {
        return (TalendFilePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    public static TalendFilePackage getPackage() {
        return TalendFilePackage.eINSTANCE;
    }

} //TalendFileFactoryImpl
