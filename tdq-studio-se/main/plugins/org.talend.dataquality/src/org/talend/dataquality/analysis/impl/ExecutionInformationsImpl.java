/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.ExecutionInformations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Informations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#getExecutionDuration <em>Execution Duration</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#getExecutionNumber <em>Execution Number</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#isLastRunOk <em>Last Run Ok</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#getLastExecutionNumberOk <em>Last Execution Number Ok</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.ExecutionInformationsImpl#isOutThreshold <em>Out Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionInformationsImpl extends EObjectImpl implements ExecutionInformations {
    /**
     * The default value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionDate()
     * @generated
     * @ordered
     */
    protected static final Date EXECUTION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionDate()
     * @generated
     * @ordered
     */
    protected Date executionDate = EXECUTION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionDuration() <em>Execution Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionDuration()
     * @generated
     * @ordered
     */
    protected static final int EXECUTION_DURATION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExecutionDuration() <em>Execution Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionDuration()
     * @generated
     * @ordered
     */
    protected int executionDuration = EXECUTION_DURATION_EDEFAULT;

    /**
     * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected String message = MESSAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getExecutionNumber() <em>Execution Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionNumber()
     * @generated
     * @ordered
     */
    protected static final int EXECUTION_NUMBER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExecutionNumber() <em>Execution Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionNumber()
     * @generated
     * @ordered
     */
    protected int executionNumber = EXECUTION_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #isLastRunOk() <em>Last Run Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLastRunOk()
     * @generated
     * @ordered
     */
    protected static final boolean LAST_RUN_OK_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLastRunOk() <em>Last Run Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLastRunOk()
     * @generated
     * @ordered
     */
    protected boolean lastRunOk = LAST_RUN_OK_EDEFAULT;

    /**
     * The default value of the '{@link #getLastExecutionNumberOk() <em>Last Execution Number Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastExecutionNumberOk()
     * @generated
     * @ordered
     */
    protected static final int LAST_EXECUTION_NUMBER_OK_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLastExecutionNumberOk() <em>Last Execution Number Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastExecutionNumberOk()
     * @generated
     * @ordered
     */
    protected int lastExecutionNumberOk = LAST_EXECUTION_NUMBER_OK_EDEFAULT;

    /**
     * The default value of the '{@link #isOutThreshold() <em>Out Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOutThreshold()
     * @generated
     * @ordered
     */
    protected static final boolean OUT_THRESHOLD_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOutThreshold() <em>Out Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOutThreshold()
     * @generated
     * @ordered
     */
    protected boolean outThreshold = OUT_THRESHOLD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionInformationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnalysisPackage.Literals.EXECUTION_INFORMATIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getExecutionDate() {
        return executionDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionDate(Date newExecutionDate) {
        Date oldExecutionDate = executionDate;
        executionDate = newExecutionDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DATE, oldExecutionDate, executionDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getExecutionDuration() {
        return executionDuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionDuration(int newExecutionDuration) {
        int oldExecutionDuration = executionDuration;
        executionDuration = newExecutionDuration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DURATION, oldExecutionDuration, executionDuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMessage() {
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessage(String newMessage) {
        String oldMessage = message;
        message = newMessage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__MESSAGE, oldMessage, message));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getExecutionNumber() {
        return executionNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionNumber(int newExecutionNumber) {
        int oldExecutionNumber = executionNumber;
        executionNumber = newExecutionNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_NUMBER, oldExecutionNumber, executionNumber));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLastRunOk() {
        return lastRunOk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastRunOk(boolean newLastRunOk) {
        boolean oldLastRunOk = lastRunOk;
        lastRunOk = newLastRunOk;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__LAST_RUN_OK, oldLastRunOk, lastRunOk));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLastExecutionNumberOk() {
        return lastExecutionNumberOk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastExecutionNumberOk(int newLastExecutionNumberOk) {
        int oldLastExecutionNumberOk = lastExecutionNumberOk;
        lastExecutionNumberOk = newLastExecutionNumberOk;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK, oldLastExecutionNumberOk, lastExecutionNumberOk));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOutThreshold() {
        return outThreshold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutThreshold(boolean newOutThreshold) {
        boolean oldOutThreshold = outThreshold;
        outThreshold = newOutThreshold;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.EXECUTION_INFORMATIONS__OUT_THRESHOLD, oldOutThreshold, outThreshold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DATE:
                return getExecutionDate();
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DURATION:
                return getExecutionDuration();
            case AnalysisPackage.EXECUTION_INFORMATIONS__MESSAGE:
                return getMessage();
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_NUMBER:
                return getExecutionNumber();
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_RUN_OK:
                return isLastRunOk();
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK:
                return getLastExecutionNumberOk();
            case AnalysisPackage.EXECUTION_INFORMATIONS__OUT_THRESHOLD:
                return isOutThreshold();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DATE:
                setExecutionDate((Date)newValue);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DURATION:
                setExecutionDuration((Integer)newValue);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__MESSAGE:
                setMessage((String)newValue);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_NUMBER:
                setExecutionNumber((Integer)newValue);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_RUN_OK:
                setLastRunOk((Boolean)newValue);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK:
                setLastExecutionNumberOk((Integer)newValue);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__OUT_THRESHOLD:
                setOutThreshold((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DATE:
                setExecutionDate(EXECUTION_DATE_EDEFAULT);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DURATION:
                setExecutionDuration(EXECUTION_DURATION_EDEFAULT);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__MESSAGE:
                setMessage(MESSAGE_EDEFAULT);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_NUMBER:
                setExecutionNumber(EXECUTION_NUMBER_EDEFAULT);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_RUN_OK:
                setLastRunOk(LAST_RUN_OK_EDEFAULT);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK:
                setLastExecutionNumberOk(LAST_EXECUTION_NUMBER_OK_EDEFAULT);
                return;
            case AnalysisPackage.EXECUTION_INFORMATIONS__OUT_THRESHOLD:
                setOutThreshold(OUT_THRESHOLD_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DATE:
                return EXECUTION_DATE_EDEFAULT == null ? executionDate != null : !EXECUTION_DATE_EDEFAULT.equals(executionDate);
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_DURATION:
                return executionDuration != EXECUTION_DURATION_EDEFAULT;
            case AnalysisPackage.EXECUTION_INFORMATIONS__MESSAGE:
                return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
            case AnalysisPackage.EXECUTION_INFORMATIONS__EXECUTION_NUMBER:
                return executionNumber != EXECUTION_NUMBER_EDEFAULT;
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_RUN_OK:
                return lastRunOk != LAST_RUN_OK_EDEFAULT;
            case AnalysisPackage.EXECUTION_INFORMATIONS__LAST_EXECUTION_NUMBER_OK:
                return lastExecutionNumberOk != LAST_EXECUTION_NUMBER_OK_EDEFAULT;
            case AnalysisPackage.EXECUTION_INFORMATIONS__OUT_THRESHOLD:
                return outThreshold != OUT_THRESHOLD_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (executionDate: ");
        result.append(executionDate);
        result.append(", executionDuration: ");
        result.append(executionDuration);
        result.append(", message: ");
        result.append(message);
        result.append(", executionNumber: ");
        result.append(executionNumber);
        result.append(", lastRunOk: ");
        result.append(lastRunOk);
        result.append(", lastExecutionNumberOk: ");
        result.append(lastExecutionNumberOk);
        result.append(", outThreshold: ");
        result.append(outThreshold);
        result.append(')');
        return result.toString();
    }

} //ExecutionInformationsImpl
