/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.dataquality.analysis.AnalysisContext;
import org.talend.dataquality.analysis.AnalysisPackage;
import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisContextImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisContextImpl#getAnalysedElements <em>Analysed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisContextImpl extends ReportGroupImpl implements AnalysisContext {

    /**
     * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getConnection()
     * @generated
     * @ordered
     */
    protected DataManager connection;

    /**
     * The cached value of the '{@link #getAnalysedElements() <em>Analysed Elements</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAnalysedElements()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> analysedElements;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnalysisPackage.Literals.ANALYSIS_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataManager getConnection() {
        if (connection != null && connection.eIsProxy()) {
            InternalEObject oldConnection = (InternalEObject)connection;
            connection = (DataManager)eResolveProxy(oldConnection);
            if (connection != oldConnection) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.ANALYSIS_CONTEXT__CONNECTION, oldConnection, connection));
            }
        }
        return connection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataManager basicGetConnection() {
        return connection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setConnection(DataManager newConnection) {
        DataManager oldConnection = connection;
        connection = newConnection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_CONTEXT__CONNECTION, oldConnection, connection));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getAnalysedElements() {
        if (analysedElements == null) {
            analysedElements = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, AnalysisPackage.ANALYSIS_CONTEXT__ANALYSED_ELEMENTS);
        }
        return analysedElements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_CONTEXT__CONNECTION:
                if (resolve) return getConnection();
                return basicGetConnection();
            case AnalysisPackage.ANALYSIS_CONTEXT__ANALYSED_ELEMENTS:
                return getAnalysedElements();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_CONTEXT__CONNECTION:
                setConnection((DataManager)newValue);
                return;
            case AnalysisPackage.ANALYSIS_CONTEXT__ANALYSED_ELEMENTS:
                getAnalysedElements().clear();
                getAnalysedElements().addAll((Collection<? extends ModelElement>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_CONTEXT__CONNECTION:
                setConnection((DataManager)null);
                return;
            case AnalysisPackage.ANALYSIS_CONTEXT__ANALYSED_ELEMENTS:
                getAnalysedElements().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS_CONTEXT__CONNECTION:
                return connection != null;
            case AnalysisPackage.ANALYSIS_CONTEXT__ANALYSED_ELEMENTS:
                return analysedElements != null && !analysedElements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // AnalysisContextImpl
