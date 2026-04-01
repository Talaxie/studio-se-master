/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.designer.core.model.utils.emf.talendfile.LogToDatabaseType;
import org.talend.designer.core.model.utils.emf.talendfile.LogToFileType;
import org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType;
import org.talend.designer.core.model.utils.emf.talendfile.LogsType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl#getLogToFile <em>Log To File</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl#getLogToDatabase <em>Log To Database</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.LogsTypeImpl#getLogToStdOut <em>Log To Std Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogsTypeImpl extends EObjectImpl implements LogsType {
    /**
     * The cached value of the '{@link #getLogToFile() <em>Log To File</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogToFile()
     * @generated
     * @ordered
     */
    protected LogToFileType logToFile;

    /**
     * The cached value of the '{@link #getLogToDatabase() <em>Log To Database</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogToDatabase()
     * @generated
     * @ordered
     */
    protected LogToDatabaseType logToDatabase;

    /**
     * The cached value of the '{@link #getLogToStdOut() <em>Log To Std Out</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogToStdOut()
     * @generated
     * @ordered
     */
    protected LogToStdOutType logToStdOut;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.LOGS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToFileType getLogToFile() {
        return logToFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLogToFile(LogToFileType newLogToFile, NotificationChain msgs) {
        LogToFileType oldLogToFile = logToFile;
        logToFile = newLogToFile;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.LOGS_TYPE__LOG_TO_FILE, oldLogToFile, newLogToFile);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogToFile(LogToFileType newLogToFile) {
        if (newLogToFile != logToFile) {
            NotificationChain msgs = null;
            if (logToFile != null)
                msgs = ((InternalEObject)logToFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.LOGS_TYPE__LOG_TO_FILE, null, msgs);
            if (newLogToFile != null)
                msgs = ((InternalEObject)newLogToFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.LOGS_TYPE__LOG_TO_FILE, null, msgs);
            msgs = basicSetLogToFile(newLogToFile, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.LOGS_TYPE__LOG_TO_FILE, newLogToFile, newLogToFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToDatabaseType getLogToDatabase() {
        return logToDatabase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLogToDatabase(LogToDatabaseType newLogToDatabase, NotificationChain msgs) {
        LogToDatabaseType oldLogToDatabase = logToDatabase;
        logToDatabase = newLogToDatabase;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE, oldLogToDatabase, newLogToDatabase);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogToDatabase(LogToDatabaseType newLogToDatabase) {
        if (newLogToDatabase != logToDatabase) {
            NotificationChain msgs = null;
            if (logToDatabase != null)
                msgs = ((InternalEObject)logToDatabase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE, null, msgs);
            if (newLogToDatabase != null)
                msgs = ((InternalEObject)newLogToDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE, null, msgs);
            msgs = basicSetLogToDatabase(newLogToDatabase, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE, newLogToDatabase, newLogToDatabase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogToStdOutType getLogToStdOut() {
        return logToStdOut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLogToStdOut(LogToStdOutType newLogToStdOut, NotificationChain msgs) {
        LogToStdOutType oldLogToStdOut = logToStdOut;
        logToStdOut = newLogToStdOut;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT, oldLogToStdOut, newLogToStdOut);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogToStdOut(LogToStdOutType newLogToStdOut) {
        if (newLogToStdOut != logToStdOut) {
            NotificationChain msgs = null;
            if (logToStdOut != null)
                msgs = ((InternalEObject)logToStdOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT, null, msgs);
            if (newLogToStdOut != null)
                msgs = ((InternalEObject)newLogToStdOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT, null, msgs);
            msgs = basicSetLogToStdOut(newLogToStdOut, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT, newLogToStdOut, newLogToStdOut));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.LOGS_TYPE__LOG_TO_FILE:
                return basicSetLogToFile(null, msgs);
            case TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE:
                return basicSetLogToDatabase(null, msgs);
            case TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT:
                return basicSetLogToStdOut(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TalendFilePackage.LOGS_TYPE__LOG_TO_FILE:
                return getLogToFile();
            case TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE:
                return getLogToDatabase();
            case TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT:
                return getLogToStdOut();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TalendFilePackage.LOGS_TYPE__LOG_TO_FILE:
                setLogToFile((LogToFileType)newValue);
                return;
            case TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE:
                setLogToDatabase((LogToDatabaseType)newValue);
                return;
            case TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT:
                setLogToStdOut((LogToStdOutType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case TalendFilePackage.LOGS_TYPE__LOG_TO_FILE:
                setLogToFile((LogToFileType)null);
                return;
            case TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE:
                setLogToDatabase((LogToDatabaseType)null);
                return;
            case TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT:
                setLogToStdOut((LogToStdOutType)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TalendFilePackage.LOGS_TYPE__LOG_TO_FILE:
                return logToFile != null;
            case TalendFilePackage.LOGS_TYPE__LOG_TO_DATABASE:
                return logToDatabase != null;
            case TalendFilePackage.LOGS_TYPE__LOG_TO_STD_OUT:
                return logToStdOut != null;
        }
        return super.eIsSet(featureID);
    }

} //LogsTypeImpl