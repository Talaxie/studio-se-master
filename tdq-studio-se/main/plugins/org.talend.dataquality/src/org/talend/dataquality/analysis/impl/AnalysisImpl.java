/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.analysis.AnalysisContext;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalysisParameters;
import org.talend.dataquality.analysis.AnalysisResult;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.impl.AnalysisImpl#getDefaultContext <em>Default Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisImpl extends ReportGroupImpl implements Analysis {
    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected AnalysisContext context;

    /**
     * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResults()
     * @generated
     * @ordered
     */
    protected AnalysisResult results;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected AnalysisParameters parameters;

    /**
     * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreationDate()
     * @generated
     * @ordered
     */
    protected static final Date CREATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreationDate()
     * @generated
     * @ordered
     */
    protected Date creationDate = CREATION_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextType()
     * @generated
     * @ordered
     */
    protected EList<ContextType> contextType;

    /**
     * The default value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultContext() <em>Default Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultContext()
     * @generated
     * @ordered
     */
    protected String defaultContext = DEFAULT_CONTEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalysisImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AnalysisPackage.Literals.ANALYSIS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisContext getContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContext(AnalysisContext newContext, NotificationChain msgs) {
        AnalysisContext oldContext = context;
        context = newContext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__CONTEXT, oldContext, newContext);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(AnalysisContext newContext) {
        if (newContext != context) {
            NotificationChain msgs = null;
            if (context != null)
                msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__CONTEXT, null, msgs);
            if (newContext != null)
                msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__CONTEXT, null, msgs);
            msgs = basicSetContext(newContext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__CONTEXT, newContext, newContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisResult getResults() {
        return results;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResults(AnalysisResult newResults, NotificationChain msgs) {
        AnalysisResult oldResults = results;
        results = newResults;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__RESULTS, oldResults, newResults);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResults(AnalysisResult newResults) {
        if (newResults != results) {
            NotificationChain msgs = null;
            if (results != null)
                msgs = ((InternalEObject)results).eInverseRemove(this, AnalysisPackage.ANALYSIS_RESULT__ANALYSIS, AnalysisResult.class, msgs);
            if (newResults != null)
                msgs = ((InternalEObject)newResults).eInverseAdd(this, AnalysisPackage.ANALYSIS_RESULT__ANALYSIS, AnalysisResult.class, msgs);
            msgs = basicSetResults(newResults, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__RESULTS, newResults, newResults));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisParameters getParameters() {
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(AnalysisParameters newParameters, NotificationChain msgs) {
        AnalysisParameters oldParameters = parameters;
        parameters = newParameters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__PARAMETERS, oldParameters, newParameters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(AnalysisParameters newParameters) {
        if (newParameters != parameters) {
            NotificationChain msgs = null;
            if (parameters != null)
                msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__PARAMETERS, null, msgs);
            if (newParameters != null)
                msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__PARAMETERS, null, msgs);
            msgs = basicSetParameters(newParameters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__PARAMETERS, newParameters, newParameters));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreationDate(Date newCreationDate) {
        Date oldCreationDate = creationDate;
        creationDate = newCreationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__CREATION_DATE, oldCreationDate, creationDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextType> getContextType() {
        if (contextType == null) {
            contextType = new EObjectContainmentEList<ContextType>(ContextType.class, this, AnalysisPackage.ANALYSIS__CONTEXT_TYPE);
        }
        return contextType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultContext() {
        return defaultContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultContext(String newDefaultContext) {
        String oldDefaultContext = defaultContext;
        defaultContext = newDefaultContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS__RESULTS:
                if (results != null)
                    msgs = ((InternalEObject)results).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS__RESULTS, null, msgs);
                return basicSetResults((AnalysisResult)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS__CONTEXT:
                return basicSetContext(null, msgs);
            case AnalysisPackage.ANALYSIS__RESULTS:
                return basicSetResults(null, msgs);
            case AnalysisPackage.ANALYSIS__PARAMETERS:
                return basicSetParameters(null, msgs);
            case AnalysisPackage.ANALYSIS__CONTEXT_TYPE:
                return ((InternalEList<?>)getContextType()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS__CONTEXT:
                return getContext();
            case AnalysisPackage.ANALYSIS__RESULTS:
                return getResults();
            case AnalysisPackage.ANALYSIS__PARAMETERS:
                return getParameters();
            case AnalysisPackage.ANALYSIS__CREATION_DATE:
                return getCreationDate();
            case AnalysisPackage.ANALYSIS__CONTEXT_TYPE:
                return getContextType();
            case AnalysisPackage.ANALYSIS__DEFAULT_CONTEXT:
                return getDefaultContext();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AnalysisPackage.ANALYSIS__CONTEXT:
                setContext((AnalysisContext)newValue);
                return;
            case AnalysisPackage.ANALYSIS__RESULTS:
                setResults((AnalysisResult)newValue);
                return;
            case AnalysisPackage.ANALYSIS__PARAMETERS:
                setParameters((AnalysisParameters)newValue);
                return;
            case AnalysisPackage.ANALYSIS__CREATION_DATE:
                setCreationDate((Date)newValue);
                return;
            case AnalysisPackage.ANALYSIS__CONTEXT_TYPE:
                getContextType().clear();
                getContextType().addAll((Collection<? extends ContextType>)newValue);
                return;
            case AnalysisPackage.ANALYSIS__DEFAULT_CONTEXT:
                setDefaultContext((String)newValue);
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
            case AnalysisPackage.ANALYSIS__CONTEXT:
                setContext((AnalysisContext)null);
                return;
            case AnalysisPackage.ANALYSIS__RESULTS:
                setResults((AnalysisResult)null);
                return;
            case AnalysisPackage.ANALYSIS__PARAMETERS:
                setParameters((AnalysisParameters)null);
                return;
            case AnalysisPackage.ANALYSIS__CREATION_DATE:
                setCreationDate(CREATION_DATE_EDEFAULT);
                return;
            case AnalysisPackage.ANALYSIS__CONTEXT_TYPE:
                getContextType().clear();
                return;
            case AnalysisPackage.ANALYSIS__DEFAULT_CONTEXT:
                setDefaultContext(DEFAULT_CONTEXT_EDEFAULT);
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
            case AnalysisPackage.ANALYSIS__CONTEXT:
                return context != null;
            case AnalysisPackage.ANALYSIS__RESULTS:
                return results != null;
            case AnalysisPackage.ANALYSIS__PARAMETERS:
                return parameters != null;
            case AnalysisPackage.ANALYSIS__CREATION_DATE:
                return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
            case AnalysisPackage.ANALYSIS__CONTEXT_TYPE:
                return contextType != null && !contextType.isEmpty();
            case AnalysisPackage.ANALYSIS__DEFAULT_CONTEXT:
                return DEFAULT_CONTEXT_EDEFAULT == null ? defaultContext != null : !DEFAULT_CONTEXT_EDEFAULT.equals(defaultContext);
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
        result.append(" (creationDate: ");
        result.append(creationDate);
        result.append(", defaultContext: ");
        result.append(defaultContext);
        result.append(')');
        return result.toString();
    }

} //AnalysisImpl
