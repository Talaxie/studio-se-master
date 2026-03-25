/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.reports.impl;

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
import org.talend.cwm.helper.ResourceHelper;
import org.talend.dataquality.analysis.Analysis;
import org.talend.dataquality.analysis.ExecutionInformations;
import org.talend.dataquality.helpers.BooleanExpressionHelper;
import org.talend.dataquality.helpers.ReportHelper;
import org.talend.dataquality.helpers.ReportHelper.ReportType;
import org.talend.dataquality.reports.AnalysisMap;
import org.talend.dataquality.reports.PresentationParameter;
import org.talend.dataquality.reports.ReportsFactory;
import org.talend.dataquality.reports.ReportsPackage;
import org.talend.dataquality.reports.TdReport;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import orgomg.cwmx.analysis.informationreporting.impl.ReportImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Td Report</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getPresentationParams <em>Presentation Params</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getAnalysisMap <em>Analysis Map</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getOutputReportFolder <em>Output Report Folder</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getExecInformations <em>Exec Informations</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getDateFrom <em>Date From</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getDateTo <em>Date To</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getInputJrxml <em>Input Jrxml</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getReportType <em>Report Type</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.dataquality.reports.impl.TdReportImpl#getDefaultContext <em>Default Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TdReportImpl extends ReportImpl implements TdReport {

    /**
     * The cached value of the '{@link #getPresentationParams() <em>Presentation Params</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPresentationParams()
     * @generated
     * @ordered
     */
    protected EList<PresentationParameter> presentationParams;

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
     * The cached value of the '{@link #getAnalysisMap() <em>Analysis Map</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAnalysisMap()
     * @generated
     * @ordered
     */
    protected EList<AnalysisMap> analysisMap;

    /**
     * The default value of the '{@link #getOutputReportFolder() <em>Output Report Folder</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOutputReportFolder()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_REPORT_FOLDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputReportFolder() <em>Output Report Folder</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOutputReportFolder()
     * @generated
     * @ordered
     */
    protected String outputReportFolder = OUTPUT_REPORT_FOLDER_EDEFAULT;

    /**
     * The cached value of the '{@link #getExecInformations() <em>Exec Informations</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getExecInformations()
     * @generated
     * @ordered
     */
    protected ExecutionInformations execInformations;

    /**
     * The default value of the '{@link #getDateFrom() <em>Date From</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDateFrom()
     * @generated
     * @ordered
     */
    protected static final String DATE_FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateFrom() <em>Date From</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDateFrom()
     * @generated
     * @ordered
     */
    protected String dateFrom = DATE_FROM_EDEFAULT;

    /**
     * The default value of the '{@link #getDateTo() <em>Date To</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDateTo()
     * @generated
     * @ordered
     */
    protected static final String DATE_TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTo() <em>Date To</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDateTo()
     * @generated
     * @ordered
     */
    protected String dateTo = DATE_TO_EDEFAULT;

    /**
     * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getLogo()
     * @generated
     * @ordered
     */
    protected static final String LOGO_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getLogo()
     * @generated
     * @ordered
     */
    protected String logo = LOGO_EDEFAULT;

    /**
     * The default value of the '{@link #getInputJrxml() <em>Input Jrxml</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getInputJrxml()
     * @generated
     * @ordered
     */
    protected static final String INPUT_JRXML_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputJrxml() <em>Input Jrxml</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getInputJrxml()
     * @generated
     * @ordered
     */
    protected String inputJrxml = INPUT_JRXML_EDEFAULT;

    /**
     * The default value of the '{@link #getReportType() <em>Report Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReportType()
     * @generated
     * @ordered
     */
    protected static final String REPORT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReportType() <em>Report Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getReportType()
     * @generated
     * @ordered
     */
    protected String reportType = REPORT_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected EList<ContextType> context;

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TdReportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReportsPackage.Literals.TD_REPORT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<PresentationParameter> getPresentationParams() {
        if (presentationParams == null) {
            presentationParams = new EObjectContainmentEList<PresentationParameter>(PresentationParameter.class, this, ReportsPackage.TD_REPORT__PRESENTATION_PARAMS);
        }
        return presentationParams;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreationDate(Date newCreationDate) {
        Date oldCreationDate = creationDate;
        creationDate = newCreationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__CREATION_DATE, oldCreationDate, creationDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AnalysisMap> getAnalysisMap() {
        if (analysisMap == null) {
            analysisMap = new EObjectContainmentEList<AnalysisMap>(AnalysisMap.class, this, ReportsPackage.TD_REPORT__ANALYSIS_MAP);
        }
        return analysisMap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutputReportFolder() {
        return outputReportFolder;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputReportFolder(String newOutputReportFolder) {
        String oldOutputReportFolder = outputReportFolder;
        outputReportFolder = newOutputReportFolder;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__OUTPUT_REPORT_FOLDER, oldOutputReportFolder, outputReportFolder));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExecutionInformations getExecInformations() {
        return execInformations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExecInformations(ExecutionInformations newExecInformations, NotificationChain msgs) {
        ExecutionInformations oldExecInformations = execInformations;
        execInformations = newExecInformations;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__EXEC_INFORMATIONS, oldExecInformations, newExecInformations);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExecInformations(ExecutionInformations newExecInformations) {
        if (newExecInformations != execInformations) {
            NotificationChain msgs = null;
            if (execInformations != null)
                msgs = ((InternalEObject)execInformations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportsPackage.TD_REPORT__EXEC_INFORMATIONS, null, msgs);
            if (newExecInformations != null)
                msgs = ((InternalEObject)newExecInformations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportsPackage.TD_REPORT__EXEC_INFORMATIONS, null, msgs);
            msgs = basicSetExecInformations(newExecInformations, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__EXEC_INFORMATIONS, newExecInformations, newExecInformations));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDateFrom(String newDateFrom) {
        String oldDateFrom = dateFrom;
        dateFrom = newDateFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__DATE_FROM, oldDateFrom, dateFrom));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDateTo() {
        return dateTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDateTo(String newDateTo) {
        String oldDateTo = dateTo;
        dateTo = newDateTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__DATE_TO, oldDateTo, dateTo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogo() {
        return logo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogo(String newLogo) {
        String oldLogo = logo;
        logo = newLogo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__LOGO, oldLogo, logo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInputJrxml() {
        return inputJrxml;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputJrxml(String newInputJrxml) {
        String oldInputJrxml = inputJrxml;
        inputJrxml = newInputJrxml;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__INPUT_JRXML, oldInputJrxml, inputJrxml));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReportType() {
        return reportType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReportType(String newReportType) {
        String oldReportType = reportType;
        reportType = newReportType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__REPORT_TYPE, oldReportType, reportType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextType> getContext() {
        if (context == null) {
            context = new EObjectContainmentEList<ContextType>(ContextType.class, this, ReportsPackage.TD_REPORT__CONTEXT);
        }
        return context;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReportsPackage.TD_REPORT__DEFAULT_CONTEXT, oldDefaultContext, defaultContext));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT addAnalysis(Analysis analysis)
     */
    @Override
    public boolean addAnalysis(Analysis analysis) {
        // MOD yyin 20120530 TDQ-5050
        // boolean added = this.getComponent().add(analysis);
        // if (added) {
        AnalysisMap createAnalysisMap = ReportsFactory.eINSTANCE.createAnalysisMap();
        createAnalysisMap.setAnalysis(analysis);
        createAnalysisMap.setMustRefresh(true); // refresh by default
        // MOD mzhao 2009-02-16 Basic type by default.
        ReportType reportType2 = ReportType.getReportType(analysis, ReportHelper.BASIC);
        if (reportType2 != null) {
            createAnalysisMap.setReportType(reportType2.getLabel());
        }
        this.getAnalysisMap().add(createAnalysisMap);
        // }
        return true;
    }

    /**
     * <!-- begin-user-doc --> Remove the analysis. Return true if the analysis is removed from the report and from its
     * internal map, false otherwise. <!-- end-user-doc -->
     * 
     * @generated NOT removeAnalysis(Analysis analysis)
     */
    @Override
    public boolean removeAnalysis(Analysis analysis) {
        EList<AnalysisMap> anMaps = this.getAnalysisMap();
        boolean removedFromMap = false;
        for (AnalysisMap anMap : anMaps) {
            if (ResourceHelper.areSame(analysis, anMap.getAnalysis())) {
                anMaps.remove(anMap);
                removedFromMap = true;
                break;
            }
        }
        // MOD yyin 20120530 TDQ-5050
        return removedFromMap;
    }

    /**
     * <!-- begin-user-doc --> Returns true is the boolean has been set correctly, false otherwise. False could mean
     * that the given analysis does not appear in this report. <!-- end-user-doc -->
     * 
     * @generated NOT boolean setMustRefresh(Analysis analysis, boolean mustRefresh)
     */
    @Override
    public boolean setMustRefresh(Analysis analysis, boolean mustRefresh) {
        boolean ok = false;
        EList<AnalysisMap> anMaps = this.getAnalysisMap();
        // MOD qiongli 2011-5-5 bug 20771.sometimes,the anMaps dosen't cotanin this analysis. .eg. when create a new
        // report and before saveing,the anMaps is empty.but the state of mustRefresh should take effect for the refresh
        // checkbox.
        for (AnalysisMap anMap : anMaps) {
            if (ResourceHelper.areSame(analysis, anMap.getAnalysis())) {
                ok = true;
                anMap.setMustRefresh(mustRefresh);
                break;
            }
        }
        if (!ok) {
            // MOD yyin 20120530 TDQ-5050
            AnalysisMap createAnalysisMap = ReportsFactory.eINSTANCE.createAnalysisMap();
            createAnalysisMap.setAnalysis(analysis);
            createAnalysisMap.setMustRefresh(mustRefresh);
            createAnalysisMap.setReportType(ReportType.getReportType(analysis, ReportHelper.BASIC).getLabel());
            this.getAnalysisMap().add(createAnalysisMap);
            ok = true;
        }
        return ok;
    }

    /**
     * <!-- begin-user-doc --> Add the analysis to this report and set its refresh status. <!-- end-user-doc -->
     * 
     * @generated NOT boolean addAnalysis(Analysis analysis, boolean mustRefresh)
     */
    @Override
    public boolean addAnalysis(Analysis analysis, boolean mustRefresh) {
        boolean added = this.addAnalysis(analysis);
        boolean statusSet = this.setMustRefresh(analysis, mustRefresh);
        return added && statusSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT mustRefresh(Analysis analysis)
     */
    @Override
    public boolean mustRefresh(Analysis analysis) {
        boolean yes = true;
        EList<AnalysisMap> anMaps = this.getAnalysisMap();
        for (AnalysisMap anMap : anMaps) {
            if (ResourceHelper.areSame(analysis, anMap.getAnalysis())) {
                yes = anMap.isMustRefresh();
                break;
            }
        }
        return yes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT setReportPresentationParam(String type, String formula)
     */
    @Override
    public PresentationParameter setReportPresentationParam(String type, String formula) {
        PresentationParameter param = null;
        for (PresentationParameter params : this.getPresentationParams()) {
            if (params.getType() != null && params.getType().equals(type)) {
                param = params;
                break;
            }
        }

        if (param == null) {
            // create a new one and add it the list
            param = ReportsFactory.eINSTANCE.createPresentationParameter();
            this.getPresentationParams().add(param);
        }
        param.setType(type);
        param.setFormula(BooleanExpressionHelper.createExpressionNode(null, formula));

        return param;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT Set report type and jrxml file path to analysis map.
     */
    @Override
    public void setReportType(String reportType, String jrxmlSource, Analysis analysis) {
        EList<AnalysisMap> anMaps = this.getAnalysisMap();
        for (AnalysisMap anMap : anMaps) {
            if (ResourceHelper.areSame(analysis, anMap.getAnalysis())) {
                anMap.setReportType(reportType);
                anMap.setJrxmlSource(jrxmlSource);
                break;
            }
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReportsPackage.TD_REPORT__PRESENTATION_PARAMS:
                return ((InternalEList<?>)getPresentationParams()).basicRemove(otherEnd, msgs);
            case ReportsPackage.TD_REPORT__ANALYSIS_MAP:
                return ((InternalEList<?>)getAnalysisMap()).basicRemove(otherEnd, msgs);
            case ReportsPackage.TD_REPORT__EXEC_INFORMATIONS:
                return basicSetExecInformations(null, msgs);
            case ReportsPackage.TD_REPORT__CONTEXT:
                return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReportsPackage.TD_REPORT__PRESENTATION_PARAMS:
                return getPresentationParams();
            case ReportsPackage.TD_REPORT__CREATION_DATE:
                return getCreationDate();
            case ReportsPackage.TD_REPORT__ANALYSIS_MAP:
                return getAnalysisMap();
            case ReportsPackage.TD_REPORT__OUTPUT_REPORT_FOLDER:
                return getOutputReportFolder();
            case ReportsPackage.TD_REPORT__EXEC_INFORMATIONS:
                return getExecInformations();
            case ReportsPackage.TD_REPORT__DATE_FROM:
                return getDateFrom();
            case ReportsPackage.TD_REPORT__DATE_TO:
                return getDateTo();
            case ReportsPackage.TD_REPORT__LOGO:
                return getLogo();
            case ReportsPackage.TD_REPORT__INPUT_JRXML:
                return getInputJrxml();
            case ReportsPackage.TD_REPORT__REPORT_TYPE:
                return getReportType();
            case ReportsPackage.TD_REPORT__CONTEXT:
                return getContext();
            case ReportsPackage.TD_REPORT__DEFAULT_CONTEXT:
                return getDefaultContext();
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
            case ReportsPackage.TD_REPORT__PRESENTATION_PARAMS:
                getPresentationParams().clear();
                getPresentationParams().addAll((Collection<? extends PresentationParameter>)newValue);
                return;
            case ReportsPackage.TD_REPORT__CREATION_DATE:
                setCreationDate((Date)newValue);
                return;
            case ReportsPackage.TD_REPORT__ANALYSIS_MAP:
                getAnalysisMap().clear();
                getAnalysisMap().addAll((Collection<? extends AnalysisMap>)newValue);
                return;
            case ReportsPackage.TD_REPORT__OUTPUT_REPORT_FOLDER:
                setOutputReportFolder((String)newValue);
                return;
            case ReportsPackage.TD_REPORT__EXEC_INFORMATIONS:
                setExecInformations((ExecutionInformations)newValue);
                return;
            case ReportsPackage.TD_REPORT__DATE_FROM:
                setDateFrom((String)newValue);
                return;
            case ReportsPackage.TD_REPORT__DATE_TO:
                setDateTo((String)newValue);
                return;
            case ReportsPackage.TD_REPORT__LOGO:
                setLogo((String)newValue);
                return;
            case ReportsPackage.TD_REPORT__INPUT_JRXML:
                setInputJrxml((String)newValue);
                return;
            case ReportsPackage.TD_REPORT__REPORT_TYPE:
                setReportType((String)newValue);
                return;
            case ReportsPackage.TD_REPORT__CONTEXT:
                getContext().clear();
                getContext().addAll((Collection<? extends ContextType>)newValue);
                return;
            case ReportsPackage.TD_REPORT__DEFAULT_CONTEXT:
                setDefaultContext((String)newValue);
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
            case ReportsPackage.TD_REPORT__PRESENTATION_PARAMS:
                getPresentationParams().clear();
                return;
            case ReportsPackage.TD_REPORT__CREATION_DATE:
                setCreationDate(CREATION_DATE_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__ANALYSIS_MAP:
                getAnalysisMap().clear();
                return;
            case ReportsPackage.TD_REPORT__OUTPUT_REPORT_FOLDER:
                setOutputReportFolder(OUTPUT_REPORT_FOLDER_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__EXEC_INFORMATIONS:
                setExecInformations((ExecutionInformations)null);
                return;
            case ReportsPackage.TD_REPORT__DATE_FROM:
                setDateFrom(DATE_FROM_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__DATE_TO:
                setDateTo(DATE_TO_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__LOGO:
                setLogo(LOGO_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__INPUT_JRXML:
                setInputJrxml(INPUT_JRXML_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__REPORT_TYPE:
                setReportType(REPORT_TYPE_EDEFAULT);
                return;
            case ReportsPackage.TD_REPORT__CONTEXT:
                getContext().clear();
                return;
            case ReportsPackage.TD_REPORT__DEFAULT_CONTEXT:
                setDefaultContext(DEFAULT_CONTEXT_EDEFAULT);
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
            case ReportsPackage.TD_REPORT__PRESENTATION_PARAMS:
                return presentationParams != null && !presentationParams.isEmpty();
            case ReportsPackage.TD_REPORT__CREATION_DATE:
                return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
            case ReportsPackage.TD_REPORT__ANALYSIS_MAP:
                return analysisMap != null && !analysisMap.isEmpty();
            case ReportsPackage.TD_REPORT__OUTPUT_REPORT_FOLDER:
                return OUTPUT_REPORT_FOLDER_EDEFAULT == null ? outputReportFolder != null : !OUTPUT_REPORT_FOLDER_EDEFAULT.equals(outputReportFolder);
            case ReportsPackage.TD_REPORT__EXEC_INFORMATIONS:
                return execInformations != null;
            case ReportsPackage.TD_REPORT__DATE_FROM:
                return DATE_FROM_EDEFAULT == null ? dateFrom != null : !DATE_FROM_EDEFAULT.equals(dateFrom);
            case ReportsPackage.TD_REPORT__DATE_TO:
                return DATE_TO_EDEFAULT == null ? dateTo != null : !DATE_TO_EDEFAULT.equals(dateTo);
            case ReportsPackage.TD_REPORT__LOGO:
                return LOGO_EDEFAULT == null ? logo != null : !LOGO_EDEFAULT.equals(logo);
            case ReportsPackage.TD_REPORT__INPUT_JRXML:
                return INPUT_JRXML_EDEFAULT == null ? inputJrxml != null : !INPUT_JRXML_EDEFAULT.equals(inputJrxml);
            case ReportsPackage.TD_REPORT__REPORT_TYPE:
                return REPORT_TYPE_EDEFAULT == null ? reportType != null : !REPORT_TYPE_EDEFAULT.equals(reportType);
            case ReportsPackage.TD_REPORT__CONTEXT:
                return context != null && !context.isEmpty();
            case ReportsPackage.TD_REPORT__DEFAULT_CONTEXT:
                return DEFAULT_CONTEXT_EDEFAULT == null ? defaultContext != null : !DEFAULT_CONTEXT_EDEFAULT.equals(defaultContext);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (creationDate: ");
        result.append(creationDate);
        result.append(", outputReportFolder: ");
        result.append(outputReportFolder);
        result.append(", dateFrom: ");
        result.append(dateFrom);
        result.append(", dateTo: ");
        result.append(dateTo);
        result.append(", logo: ");
        result.append(logo);
        result.append(", inputJrxml: ");
        result.append(inputJrxml);
        result.append(", reportType: ");
        result.append(reportType);
        result.append(", defaultContext: ");
        result.append(defaultContext);
        result.append(')');
        return result.toString();
    }

} // TdReportImpl
