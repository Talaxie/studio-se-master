/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToFile <em>Log To File</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToDatabase <em>Log To Database</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToStdOut <em>Log To Std Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogsType()
 * @model extendedMetaData="name='Logs_._type' kind='elementOnly'"
 * @generated
 */
public interface LogsType extends EObject {
    /**
     * Returns the value of the '<em><b>Log To File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log To File</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log To File</em>' containment reference.
     * @see #setLogToFile(LogToFileType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogsType_LogToFile()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='LogToFile' namespace='##targetNamespace'"
     * @generated
     */
    LogToFileType getLogToFile();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToFile <em>Log To File</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log To File</em>' containment reference.
     * @see #getLogToFile()
     * @generated
     */
    void setLogToFile(LogToFileType value);

    /**
     * Returns the value of the '<em><b>Log To Database</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log To Database</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log To Database</em>' containment reference.
     * @see #setLogToDatabase(LogToDatabaseType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogsType_LogToDatabase()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='LogToDatabase' namespace='##targetNamespace'"
     * @generated
     */
    LogToDatabaseType getLogToDatabase();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToDatabase <em>Log To Database</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log To Database</em>' containment reference.
     * @see #getLogToDatabase()
     * @generated
     */
    void setLogToDatabase(LogToDatabaseType value);

    /**
     * Returns the value of the '<em><b>Log To Std Out</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log To Std Out</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log To Std Out</em>' containment reference.
     * @see #setLogToStdOut(LogToStdOutType)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogsType_LogToStdOut()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='LogToStdOut' namespace='##targetNamespace'"
     * @generated
     */
    LogToStdOutType getLogToStdOut();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogsType#getLogToStdOut <em>Log To Std Out</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Log To Std Out</em>' containment reference.
     * @see #getLogToStdOut()
     * @generated
     */
    void setLogToStdOut(LogToStdOutType value);

} // LogsType