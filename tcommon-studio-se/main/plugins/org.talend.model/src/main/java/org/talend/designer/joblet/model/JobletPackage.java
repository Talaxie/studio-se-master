/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.joblet.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.joblet.model.JobletFactory
 * @model kind="package"
 * @generated
 */
public interface JobletPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.com/joblet.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JobletPackage eINSTANCE = org.talend.designer.joblet.model.impl.JobletPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.joblet.model.impl.JobletProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.joblet.model.impl.JobletProcessImpl
     * @see org.talend.designer.joblet.model.impl.JobletPackageImpl#getJobletProcess()
     * @generated
     */
    int JOBLET_PROCESS = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__DESCRIPTION = TalendFilePackage.PROCESS_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Required</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__REQUIRED = TalendFilePackage.PROCESS_TYPE__REQUIRED;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__CONTEXT = TalendFilePackage.PROCESS_TYPE__CONTEXT;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__PARAMETERS = TalendFilePackage.PROCESS_TYPE__PARAMETERS;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__NODE = TalendFilePackage.PROCESS_TYPE__NODE;

    /**
     * The feature id for the '<em><b>Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__CONNECTION = TalendFilePackage.PROCESS_TYPE__CONNECTION;

    /**
     * The feature id for the '<em><b>Note</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__NOTE = TalendFilePackage.PROCESS_TYPE__NOTE;

    /**
     * The feature id for the '<em><b>Logs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__LOGS = TalendFilePackage.PROCESS_TYPE__LOGS;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__AUTHOR = TalendFilePackage.PROCESS_TYPE__AUTHOR;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__COMMENT = TalendFilePackage.PROCESS_TYPE__COMMENT;

    /**
     * The feature id for the '<em><b>Default Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__DEFAULT_CONTEXT = TalendFilePackage.PROCESS_TYPE__DEFAULT_CONTEXT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__NAME = TalendFilePackage.PROCESS_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Purpose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__PURPOSE = TalendFilePackage.PROCESS_TYPE__PURPOSE;

    /**
     * The feature id for the '<em><b>Repository Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__REPOSITORY_CONTEXT_ID = TalendFilePackage.PROCESS_TYPE__REPOSITORY_CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__STATUS = TalendFilePackage.PROCESS_TYPE__STATUS;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__VERSION = TalendFilePackage.PROCESS_TYPE__VERSION;

    /**
     * The feature id for the '<em><b>Subjob</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__SUBJOB = TalendFilePackage.PROCESS_TYPE__SUBJOB;

    /**
     * The feature id for the '<em><b>Joblet Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS__JOBLET_NODES = TalendFilePackage.PROCESS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_PROCESS_FEATURE_COUNT = TalendFilePackage.PROCESS_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.designer.joblet.model.impl.JobletNodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.joblet.model.impl.JobletNodeImpl
     * @see org.talend.designer.joblet.model.impl.JobletPackageImpl#getJobletNode()
     * @generated
     */
    int JOBLET_NODE = 1;

    /**
     * The feature id for the '<em><b>Element Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__ELEMENT_PARAMETER = TalendFilePackage.NODE_TYPE__ELEMENT_PARAMETER;

    /**
     * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__METADATA = TalendFilePackage.NODE_TYPE__METADATA;

    /**
     * The feature id for the '<em><b>Binary Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__BINARY_DATA = TalendFilePackage.NODE_TYPE__BINARY_DATA;

    /**
     * The feature id for the '<em><b>String Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__STRING_DATA = TalendFilePackage.NODE_TYPE__STRING_DATA;

    /**
     * The feature id for the '<em><b>Component Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__COMPONENT_NAME = TalendFilePackage.NODE_TYPE__COMPONENT_NAME;

    /**
     * The feature id for the '<em><b>Component Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__COMPONENT_VERSION = TalendFilePackage.NODE_TYPE__COMPONENT_VERSION;

    /**
     * The feature id for the '<em><b>Offset Label X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__OFFSET_LABEL_X = TalendFilePackage.NODE_TYPE__OFFSET_LABEL_X;

    /**
     * The feature id for the '<em><b>Offset Label Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__OFFSET_LABEL_Y = TalendFilePackage.NODE_TYPE__OFFSET_LABEL_Y;

    /**
     * The feature id for the '<em><b>Pos X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__POS_X = TalendFilePackage.NODE_TYPE__POS_X;

    /**
     * The feature id for the '<em><b>Pos Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__POS_Y = TalendFilePackage.NODE_TYPE__POS_Y;

    /**
     * The feature id for the '<em><b>Size X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__SIZE_X = TalendFilePackage.NODE_TYPE__SIZE_X;

    /**
     * The feature id for the '<em><b>Size Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__SIZE_Y = TalendFilePackage.NODE_TYPE__SIZE_Y;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__DESCRIPTION = TalendFilePackage.NODE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__INPUT = TalendFilePackage.NODE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE__TRIGGER = TalendFilePackage.NODE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOBLET_NODE_FEATURE_COUNT = TalendFilePackage.NODE_TYPE_FEATURE_COUNT + 3;

    /**
     * Returns the meta object for class '{@link org.talend.designer.joblet.model.JobletProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.talend.designer.joblet.model.JobletProcess
     * @generated
     */
    EClass getJobletProcess();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.joblet.model.JobletProcess#getJobletNodes <em>Joblet Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Joblet Nodes</em>'.
     * @see org.talend.designer.joblet.model.JobletProcess#getJobletNodes()
     * @see #getJobletProcess()
     * @generated
     */
    EReference getJobletProcess_JobletNodes();

    /**
     * Returns the meta object for class '{@link org.talend.designer.joblet.model.JobletNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see org.talend.designer.joblet.model.JobletNode
     * @generated
     */
    EClass getJobletNode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.joblet.model.JobletNode#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.talend.designer.joblet.model.JobletNode#getDescription()
     * @see #getJobletNode()
     * @generated
     */
    EAttribute getJobletNode_Description();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.joblet.model.JobletNode#isInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see org.talend.designer.joblet.model.JobletNode#isInput()
     * @see #getJobletNode()
     * @generated
     */
    EAttribute getJobletNode_Input();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.joblet.model.JobletNode#isTrigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trigger</em>'.
     * @see org.talend.designer.joblet.model.JobletNode#isTrigger()
     * @see #getJobletNode()
     * @generated
     */
    EAttribute getJobletNode_Trigger();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    JobletFactory getJobletFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.designer.joblet.model.impl.JobletProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.joblet.model.impl.JobletProcessImpl
         * @see org.talend.designer.joblet.model.impl.JobletPackageImpl#getJobletProcess()
         * @generated
         */
        EClass JOBLET_PROCESS = eINSTANCE.getJobletProcess();

        /**
         * The meta object literal for the '<em><b>Joblet Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOBLET_PROCESS__JOBLET_NODES = eINSTANCE.getJobletProcess_JobletNodes();

        /**
         * The meta object literal for the '{@link org.talend.designer.joblet.model.impl.JobletNodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.joblet.model.impl.JobletNodeImpl
         * @see org.talend.designer.joblet.model.impl.JobletPackageImpl#getJobletNode()
         * @generated
         */
        EClass JOBLET_NODE = eINSTANCE.getJobletNode();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOBLET_NODE__DESCRIPTION = eINSTANCE.getJobletNode_Description();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOBLET_NODE__INPUT = eINSTANCE.getJobletNode_Input();

        /**
         * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOBLET_NODE__TRIGGER = eINSTANCE.getJobletNode_Trigger();

    }

} //JobletPackage
