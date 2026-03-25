/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Informations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionDuration <em>Execution Duration</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#getMessage <em>Message</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionNumber <em>Execution Number</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#isLastRunOk <em>Last Run Ok</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#getLastExecutionNumberOk <em>Last Execution Number Ok</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.ExecutionInformations#isOutThreshold <em>Out Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations()
 * @model
 * @generated
 */
public interface ExecutionInformations extends EObject {
    /**
     * Returns the value of the '<em><b>Execution Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Date</em>' attribute.
     * @see #setExecutionDate(Date)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_ExecutionDate()
     * @model
     * @generated
     */
    Date getExecutionDate();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionDate <em>Execution Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Date</em>' attribute.
     * @see #getExecutionDate()
     * @generated
     */
    void setExecutionDate(Date value);

    /**
     * Returns the value of the '<em><b>Execution Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execution Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Duration</em>' attribute.
     * @see #setExecutionDuration(int)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_ExecutionDuration()
     * @model
     * @generated
     */
    int getExecutionDuration();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionDuration <em>Execution Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Duration</em>' attribute.
     * @see #getExecutionDuration()
     * @generated
     */
    void setExecutionDuration(int value);

    /**
     * Returns the value of the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' attribute.
     * @see #setMessage(String)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_Message()
     * @model
     * @generated
     */
    String getMessage();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#getMessage <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' attribute.
     * @see #getMessage()
     * @generated
     */
    void setMessage(String value);

    /**
     * Returns the value of the '<em><b>Execution Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A number which is incremented each time the analysis is executed. 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Execution Number</em>' attribute.
     * @see #setExecutionNumber(int)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_ExecutionNumber()
     * @model
     * @generated
     */
    int getExecutionNumber();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#getExecutionNumber <em>Execution Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Number</em>' attribute.
     * @see #getExecutionNumber()
     * @generated
     */
    void setExecutionNumber(int value);

    /**
     * Returns the value of the '<em><b>Last Run Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tells whether the last run is ok.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Last Run Ok</em>' attribute.
     * @see #setLastRunOk(boolean)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_LastRunOk()
     * @model
     * @generated
     */
    boolean isLastRunOk();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#isLastRunOk <em>Last Run Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Run Ok</em>' attribute.
     * @see #isLastRunOk()
     * @generated
     */
    void setLastRunOk(boolean value);

    /**
     * Returns the value of the '<em><b>Last Execution Number Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stores the number of the last execution which has run correctly.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Last Execution Number Ok</em>' attribute.
     * @see #setLastExecutionNumberOk(int)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_LastExecutionNumberOk()
     * @model
     * @generated
     */
    int getLastExecutionNumberOk();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#getLastExecutionNumberOk <em>Last Execution Number Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Execution Number Ok</em>' attribute.
     * @see #getLastExecutionNumberOk()
     * @generated
     */
    void setLastExecutionNumberOk(int value);

    /**
     * Returns the value of the '<em><b>Out Threshold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Threshold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Threshold</em>' attribute.
     * @see #setOutThreshold(boolean)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getExecutionInformations_OutThreshold()
     * @model
     * @generated
     */
    boolean isOutThreshold();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.ExecutionInformations#isOutThreshold <em>Out Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Threshold</em>' attribute.
     * @see #isOutThreshold()
     * @generated
     */
    void setOutThreshold(boolean value);

} // ExecutionInformations
