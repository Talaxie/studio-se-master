// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.preference;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.fieldassist.AutoCompleteField;
import org.eclipse.jface.fieldassist.ComboContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.PlatformUI;
import org.talend.analysistask.ItemAnalysisReportManager;
import org.talend.commons.report.ItemsReportUtil;
import org.talend.commons.report.ReportAccessDialog;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.exception.ExceptionMessageDialog;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.commons.ui.swt.formtools.LabelledCombo;
import org.talend.commons.ui.swt.formtools.LabelledText;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.database.EDatabase4DriverClassName;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;
import org.talend.core.model.general.Project;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.core.service.IAuditService;
import org.talend.core.service.IDetectCVEService;
import org.talend.core.service.IDetectCVEService.CVEData;
import org.talend.core.service.IDetectCVEService.PatchVersion;
import org.talend.core.ui.IInstalledPatchService;
import org.talend.repository.ProjectManager;
import org.talend.repository.RepositoryPlugin;
import org.talend.repository.i18n.Messages;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.preference.audit.AuditManager;
import org.talend.repository.preference.audit.SupportDBUrlStore;
import org.talend.repository.preference.audit.SupportDBUrlType;
import org.talend.repository.preference.audit.SupportDBVersions;
import org.talend.utils.security.StudioEncryption;
import org.talend.utils.sugars.TypedReturnCode;

/**
 * created by hcyi on May 9, 2018
 * Detailled comment
 *
 */
public class AuditProjectSettingPage extends ProjectSettingPage {

    private static final String LEARN_MORE_URL = Messages.getString("AuditProjectSettingPage.cveDetect.learnMoreLink");

    private Set<CVEData> cveDataSet;

    private Combo versionCombo;

    private Button generateButton;

    private Button savedInDBButton;

    private Group dbConfigGroup;

    private LabelledCombo dbTypeCombo;

    private LabelledCombo dbVersionCombo;

    private LabelledText driverText;

    private LabelledText urlText;

    private LabelledText usernameText;

    private LabelledText passwordText;

    private Button checkButton;

    private String generatePath;

    private ProjectPreferenceManager prefManager;

    private LabelledCombo historyCombo;

    private Button refreshButton;

    private Button historyGenerateButton;

    private Integer selectedAuditId;

    private Map<Integer, String> currentParameters = new HashMap<Integer, String>();

    private boolean isProjectAuditEnabled = false;

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout(1, false);
        composite.setLayout(layout);
        createDetectCVEArea(composite);
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IAuditService.class)) {
            IAuditService service = (IAuditService) GlobalServiceRegister.getDefault().getService(IAuditService.class);
            if (service != null) {
                // server enabled can create project audit area
                createProjectAuditArea(composite);
                isProjectAuditEnabled = true;
            }
        }
        createProjectAnalysisArea(composite);
        return composite;
    }

    private void createDetectCVEArea(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        Group detectCVEGroup = new Group(composite, SWT.NONE);
        detectCVEGroup.setText(Messages.getString("AuditProjectSettingPage.cveDetect.group"));
        GridDataFactory.fillDefaults().span(1, 1).align(SWT.FILL, SWT.BEGINNING).grab(true, false).applyTo(detectCVEGroup);
        detectCVEGroup.setLayout(new GridLayout(1, false));

        Composite noteComp = new Composite(detectCVEGroup, SWT.NONE);
        noteComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
        noteComp.setLayout(new FormLayout());
        Label noteLabel = new Label(noteComp, SWT.NONE);
        noteLabel.setText(Messages.getString("AuditProjectSettingPage.cveDetect.noteText"));
        FormData noteLabelFormData = new FormData();
        noteLabelFormData.top = new FormAttachment(0, 0);
        noteLabelFormData.left = new FormAttachment(0, 0);
        noteLabel.setLayoutData(noteLabelFormData);
        Link learnMoreLabel = new Link(noteComp, SWT.NONE);
        learnMoreLabel.setText("<a>" + Messages.getString("AuditProjectSettingPage.cveDetect.learnMore") + "</a>");
        FormData linkFormData = new FormData();
        linkFormData.top = new FormAttachment(0, 0);
        linkFormData.left = new FormAttachment(noteLabel, 5);
        learnMoreLabel.setLayoutData(linkFormData);
        learnMoreLabel.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                Program.launch(LEARN_MORE_URL);
            }

        });

        Composite comboComp = new Composite(detectCVEGroup, SWT.NONE);
        comboComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
        comboComp.setLayout(new FormLayout());
        Label versionLabel = new Label(comboComp, SWT.NONE);
        versionLabel.setText(Messages.getString("AuditProjectSettingPage.cveDetect.versionLabel"));
        FormData labelFormData = new FormData();
        labelFormData.bottom = new FormAttachment(100, 0);
        labelFormData.left = new FormAttachment(0, 0);
        versionLabel.setLayoutData(labelFormData);
        versionCombo = new Combo(comboComp, SWT.SINGLE | SWT.BORDER);
        FormData comboFormData = new FormData();
        comboFormData.top = new FormAttachment(0, 0);
        comboFormData.left = new FormAttachment(versionLabel, 5);
        comboFormData.width = 100;
        versionCombo.setLayoutData(comboFormData);
        String[] patchVersionList = getCVEVersionList();
        versionCombo.setItems(patchVersionList);
        versionCombo.setText(getDefaultCVEFromVersion(patchVersionList));
        AutoCompleteField comboField = new AutoCompleteField(versionCombo, new ComboContentAdapter(), new String[] {});
        comboField.setProposals(patchVersionList);

        Button generateButton = new Button(detectCVEGroup, SWT.NONE);
        generateButton.setText(Messages.getString("AuditProjectSettingPage.cveDetect.generateButton"));
        generateButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                generateCVEReport();
            }

        });
    }

    private Set<CVEData> getCVEData() {
        if (cveDataSet == null && IDetectCVEService.get() != null) {
            cveDataSet = IDetectCVEService.get().loadCVEData("");
        }
        return cveDataSet;
    }

    private String[] getCVEVersionList() {
        Set<CVEData> cveData = getCVEData();
        if (cveData == null || cveData.isEmpty()) {
            return new String[] {};
        }

        Set<PatchVersion> versionSet = cveData.stream().map(data -> data.getPatchVersion()).collect(Collectors.toSet());
        List<PatchVersion> versionList = new ArrayList<PatchVersion>(versionSet);
        Collections.sort(versionList, new Comparator<PatchVersion>() {

            @Override
            public int compare(PatchVersion o1, PatchVersion o2) {
                return o2.compareTo(o1);
            }
        });
        PatchVersion patchVersionStart = versionList.get(versionList.size() - 1);
        Date parseVersion = patchVersionStart.parseVersion();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parseVersion);
        calendar.add(Calendar.MONTH, -1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        String versionFrom = "R" + df.format(calendar.getTime());
        List<String> versionStrlist = versionList.stream().map(version -> version.getVersion()).collect(Collectors.toList());
        IInstalledPatchService installedPatchService = IInstalledPatchService.get();
        if (installedPatchService != null) {
            String currentVersion = installedPatchService.getLatestInstalledVersion(true);
            if (StringUtils.isNotBlank(currentVersion) && currentVersion.equals(versionStrlist.get(0))) {
                versionStrlist.remove(0);
            }
        }
        versionStrlist.add(versionFrom);
        return versionStrlist.toArray(new String[versionStrlist.size()]);
    }

    private String getDefaultCVEFromVersion(String[] versions) {
        if (versions == null || versions.length < 1) {
            return "";
        }
        return versions[0];
    }

    private void generateCVEReport() {
        String version = versionCombo.getText();
        Set<CVEData> cveData = getCVEData();
        if (cveData == null || cveData.isEmpty()) {
            MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    Messages.getString("AuditProjectSettingPage.cveDetect.infoDialogTitle"),
                    Messages.getString("AuditProjectSettingPage.cveDetect.infoDialogMessage"));
            return;
        }

        if (IDetectCVEService.get() != null) {
            Job job = new Job("Generating CVE report") {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    IDetectCVEService detectCVEService = IDetectCVEService.get();
                    detectCVEService.clearCache();
                    Set<CVEData> filterCVEData = detectCVEService.filterCVEData(cveData, version, null, false);
                    if (filterCVEData == null || filterCVEData.isEmpty()) {
                        Display.getDefault().syncExec(() -> {
                            MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                                    Messages.getString("AuditProjectSettingPage.cveDetect.infoDialogTitle"),
                                    Messages.getString("AuditProjectSettingPage.cveDetect.infoDialogMessage"));
                        });
                        return Status.OK_STATUS;
                    }
                    Project currentProject = ProjectManager.getInstance().getCurrentProject();
                    List<IDetectCVEService.ImpactedItem> result = detectCVEService.detect(currentProject, filterCVEData, false);

                    List<Project> allReferencedProjects = ProjectManager.getInstance().getAllReferencedProjects();
                    allReferencedProjects.forEach(project -> {
                        result.addAll(detectCVEService.detect(project, filterCVEData, false));
                    });

                    if (result == null || result.isEmpty()) {
                        Display.getDefault().syncExec(() -> {
                            MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                                    Messages.getString("AuditProjectSettingPage.cveDetect.infoDialogTitle"),
                                    Messages.getString("AuditProjectSettingPage.cveDetect.infoDialogMessage"));
                        });
                        return Status.OK_STATUS;
                    }
                    String currentTimeString = ItemsReportUtil.getCurrentTimeString();
                    String folderName = "CVEReport" + "_" + currentTimeString;
                    String fileName = currentTimeString + "_"
                            + ProjectManager.getInstance().getCurrentProject().getTechnicalLabel() + "_CVE_Report.csv";
                    String filePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/report/" + folderName
                            + "/" + fileName;

                    File reportFile = new File(filePath);
                    detectCVEService.writeReport(result, reportFile);
                    if (reportFile.exists()) {
                        Display.getDefault().asyncExec(() -> {
                            ReportAccessDialog accessDialog = new ReportAccessDialog(
                                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                                    Messages.getString("AuditProjectSettingPage.cveDetect.reportDialogTitle"),
                                    Messages.getString("AuditProjectSettingPage.cveDetect.reportDialogMessage"),
                                    reportFile.getAbsolutePath());
                            accessDialog.open();
                        });
                    }
                    return Status.OK_STATUS;
                }

            };
            job.setUser(false);
            job.setPriority(Job.INTERACTIVE);
            job.schedule();

        }

    }


    private void createProjectAuditArea(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        generateButton = new Button(composite, SWT.NONE);
        generateButton.setText(Messages.getString("AuditProjectSettingPage.generateButtonText")); //$NON-NLS-1$

        savedInDBButton = new Button(composite, SWT.CHECK);
        savedInDBButton.setText(Messages.getString("AuditProjectSettingPage.savedInDBButtonText")); //$NON-NLS-1$
        //
        createDbConfigGroup(composite);

        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        if (factory.isUserReadOnlyOnCurrentProject()) {
            composite.setEnabled(false);
        }
        prefManager = new ProjectPreferenceManager(AuditManager.AUDIT_RESOURCES, true);
        addListeners();
        init();
    }

    private void createProjectAnalysisArea(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        Group analysisGroup = new Group(composite, SWT.NONE);
        analysisGroup.setText(Messages.getString("AuditProjectSettingPage.analysis.groupTitle")); //$NON-NLS-1$
        GridDataFactory.fillDefaults().span(1, 1).align(SWT.FILL, SWT.BEGINNING).grab(true, false).applyTo(analysisGroup);
        analysisGroup.setLayout(new GridLayout(1, false));
        Label analysisLabel = new Label(analysisGroup, SWT.NONE);
        analysisLabel.setText(Messages.getString("AuditProjectSettingPage.analysis.infoText")); //$NON-NLS-1$
        Label listItemLabel = new Label(analysisGroup, SWT.NONE);
        listItemLabel.setText(Messages.getString("AuditProjectSettingPage.analysis.listItemText")); //$NON-NLS-1$
        Label noteLabel = new Label(analysisGroup, SWT.NONE);
        noteLabel.setText(Messages.getString("AuditProjectSettingPage.analysis.noteText")); //$NON-NLS-1$
        Button analysisButton = new Button(analysisGroup, SWT.NONE);
        analysisButton.setText(Messages.getString("AuditProjectSettingPage.analysis.buttonLabel")); //$NON-NLS-1$
        analysisButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                ItemAnalysisReportManager.getInstance()
                        .generateAnalysisReport(ProjectManager.getInstance().getCurrentProject().getTechnicalLabel());
            }

        });
    }

    protected Composite createDbConfigGroup(Composite parent) {
        GridLayout layout2 = (GridLayout) parent.getLayout();
        dbConfigGroup = new Group(parent, SWT.NONE);
        dbConfigGroup.setText(Messages.getString("AuditProjectSettingPage.DBConfig.title")); //$NON-NLS-1$
        GridDataFactory.fillDefaults().span(layout2.numColumns, 1).align(SWT.FILL, SWT.BEGINNING).grab(true, false)
                .applyTo(dbConfigGroup);
        dbConfigGroup.setLayout(new GridLayout(1, false));

        Composite dbConfigComposite = new Composite(dbConfigGroup, SWT.NULL);
        GridLayout dbConfigCompLayout = new GridLayout(3, false);
        dbConfigComposite.setLayout(dbConfigCompLayout);
        dbConfigComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        dbTypeCombo = new LabelledCombo(dbConfigComposite, Messages.getString("AuditProjectSettingPage.DBConfig.dbType"), //$NON-NLS-1$
                Messages.getString("AuditProjectSettingPage.DBConfig.dbTypeTip"), //$NON-NLS-1$
                SupportDBUrlStore.getInstance().getDBDisplayNames(), 2, true);
        dbVersionCombo = new LabelledCombo(dbConfigComposite, Messages.getString("AuditProjectSettingPage.DBConfig.dbVersion"), //$NON-NLS-1$
                Messages.getString("AuditProjectSettingPage.DBConfig.dbVersionTip"), //$NON-NLS-1$
                new String[0], 2, true);
        driverText = new LabelledText(dbConfigComposite, Messages.getString("AuditProjectSettingPage.DBConfig.Driver"), 2); //$NON-NLS-1$
        driverText.setReadOnly(true);
        urlText = new LabelledText(dbConfigComposite, Messages.getString("AuditProjectSettingPage.DBConfig.Url"), 2); //$NON-NLS-1$
        usernameText = new LabelledText(dbConfigComposite, Messages.getString("AuditProjectSettingPage.DBConfig.Username"), 2); //$NON-NLS-1$
        passwordText = new LabelledText(dbConfigComposite, Messages.getString("AuditProjectSettingPage.DBConfig.Password"), 2, //$NON-NLS-1$
                SWT.BORDER | SWT.SINGLE | SWT.PASSWORD);

        Composite checkComposite = new Composite(dbConfigGroup, SWT.NULL);
        GridLayout checkCompLayout = new GridLayout(1, false);
        checkCompLayout.marginHeight = 0;
        checkComposite.setLayout(checkCompLayout);
        checkComposite.setLayoutData(new GridData(SWT.RIGHT, SWT.RIGHT, true, true));
        checkButton = new Button(checkComposite, SWT.RIGHT_TO_LEFT);
        checkButton.setText(Messages.getString("AuditProjectSettingPage.DBConfig.CheckButtonText")); //$NON-NLS-1$

        Composite historyComposite = new Composite(dbConfigGroup, SWT.NULL);
        GridLayout historyCompLayout = new GridLayout(5, false);
        historyCompLayout.marginHeight = 0;
        historyComposite.setLayout(historyCompLayout);
        historyComposite.setLayoutData(new GridData(SWT.LEFT, SWT.RIGHT, true, true));
        historyCombo = new LabelledCombo(historyComposite, Messages.getString("AuditProjectSettingPage.history.label"), //$NON-NLS-1$
                Messages.getString("AuditProjectSettingPage.history.labelTip"), new String[0], 2, true); //$NON-NLS-1$
        ((GridData) historyCombo.getCombo().getLayoutData()).widthHint = 150;
        refreshButton = new Button(historyComposite, SWT.NULL);
        refreshButton.setImage(ImageProvider.getImage(EImage.REFRESH_ICON));
        refreshButton.setToolTipText(Messages.getString("AuditProjectSettingPage.history.refreshButton")); //$NON-NLS-1$
        historyGenerateButton = new Button(historyComposite, SWT.NULL);
        historyGenerateButton.setText(Messages.getString("AuditProjectSettingPage.history.historyGenerateButton")); //$NON-NLS-1$
        return dbConfigGroup;
    }

    private void addListeners() {
        generateButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                final Map<String, String> results = new HashMap<String, String>();
                final TypedReturnCode<java.sql.Connection> dbResults = new TypedReturnCode<java.sql.Connection>(Boolean.FALSE);
                boolean dbChecked = savedInDBButton.getSelection();
                if (dbChecked) {
                    TypedReturnCode<java.sql.Connection> rc = getConnectionReturnCode();
                    dbResults.setOk(rc.isOk());
                    dbResults.setObject(rc.getObject());
                    dbResults.setMessage(rc.getMessage());
                }
                String url = urlText.getText();
                String driver = driverText.getText();
                String username = usernameText.getText();
                String password = passwordText.getText();
                // select a foder as the generate path
                if (selectGeneratePath()) {
                    final Thread t[] = new Thread[1];
                    ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
                            PlatformUI.getWorkbench().getDisplay().getActiveShell()) {

                        @Override
                        protected void cancelPressed() {
                            if (t[0] != null) {
                                t[0].interrupt();
                            }
                        }
                    };
                    IRunnableWithProgress runnable = new IRunnableWithProgress() {

                        @Override
                        public void run(IProgressMonitor monitor) throws InterruptedException {
                            t[0] = Thread.currentThread();
                            monitor.beginTask(Messages.getString("AuditProjectSettingPage.generateAuditReportProgressBar"), //$NON-NLS-1$
                                    IProgressMonitor.UNKNOWN);
                            IAuditService service = getAuditService();
                            if (service != null) {
                                if (dbChecked) {
                                    if (dbResults.isOk()) {
                                        try {
                                            service.populateAudit(url, driver, username, password);
                                            Map<String, String> returnResult = service.generateAuditReport(generatePath);
                                            results.putAll(returnResult);
                                        } catch (Exception e) {
                                            results.put(AuditManager.AUDIT_GENERATE_REPORT_EXCEPTION,
                                                    ExceptionUtils.getFullStackTrace(e));
                                        }
                                    }
                                } else {
                                    String path = "";//$NON-NLS-1$
                                    File tempFolder = null;
                                    try {
                                        File createTempFile = File.createTempFile("AuditReport", ""); //$NON-NLS-1$ //$NON-NLS-2$
                                        path = createTempFile.getPath();
                                        createTempFile.delete();
                                        tempFolder = new File(path);
                                        tempFolder.mkdir();
                                        path = path.replace("\\", "/");//$NON-NLS-1$//$NON-NLS-2$

                                        // Just use the h2 as default if no check
                                        service.populateAudit(
                                                "jdbc:h2:" + path + "/database/audit;AUTO_SERVER=TRUE;lock_timeout=15000", //$NON-NLS-1$ //$NON-NLS-2$
                                                "org.h2.Driver", "tisadmin", "tisadmin"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                        Map<String, String> returnResult = service.generateAuditReport(generatePath);
                                        results.putAll(returnResult);
                                    } catch (IOException e) {
                                        ExceptionHandler.process(e);
                                    } catch (Exception e) {
                                        results.put(AuditManager.AUDIT_GENERATE_REPORT_EXCEPTION,
                                                ExceptionUtils.getFullStackTrace(e));
                                    } finally {
                                        FilesUtils.deleteFile(tempFolder, true);
                                    }
                                }
                            }
                            monitor.done();
                        }
                    };
                    try {
                        progressDialog.run(true, true, runnable);
                    } catch (InvocationTargetException e1) {
                        ExceptionHandler.process(e1);
                    } catch (InterruptedException e1) {
                        ExceptionHandler.process(e1);
                    }
                }
                // Show information
                showCheckConnectionInformation(false, dbResults);
                showGenerationInformation(results);
            }
        });

        savedInDBButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                reLoad();
            }

        });

        dbTypeCombo.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                String selectedItem = ((Combo) e.getSource()).getText();
                String dbType = SupportDBUrlStore.getInstance().getDBType(selectedItem);
                dbVersionCombo.getCombo().setItems(SupportDBVersions.getDisplayedVersions(dbType));
                String savedDbType = prefManager.getValue(AuditManager.AUDIT_DBTYPE);
                if (savedDbType != null && savedDbType.equals(dbType)) {
                    reLoad();
                } else {
                    if (dbVersionCombo.getCombo().getItemCount() > 0) {
                        dbVersionCombo.getCombo().select(0);
                    }
                    urlText.setText(SupportDBUrlStore.getInstance().getDefaultDBUrl(dbType));
                    String driverClassName = SupportDBUrlStore.getInstance().getDBUrlType(dbType).getDbDriver();
                    if (EDatabaseTypeName.MYSQL.getDisplayName().equalsIgnoreCase(dbType)) {
                        if (EDatabaseVersion4Drivers.MYSQL_8.getVersionValue().equals(getCurrentDBVersion())) {
                            driverClassName = EDatabase4DriverClassName.MYSQL8.getDriverClass();
                        }
                    }
                    driverText.setText(driverClassName);
                    //
                    usernameText.setText("");//$NON-NLS-1$
                    passwordText.setText("");//$NON-NLS-1$
                }
            }
        });

        dbVersionCombo.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                String selectedItem = dbTypeCombo.getCombo().getText();
                String dbType = SupportDBUrlStore.getInstance().getDBType(selectedItem);
                String driverClassName = SupportDBUrlStore.getInstance().getDBUrlType(dbType).getDbDriver();
                if (EDatabaseTypeName.MYSQL.getDisplayName().equalsIgnoreCase(dbType)) {
                    if (EDatabaseVersion4Drivers.MYSQL_8.getVersionValue().equals(getCurrentDBVersion())) {
                        driverClassName = EDatabase4DriverClassName.MYSQL8.getDriverClass();
                    }
                }
                driverText.setText(driverClassName);
            }
        });

        checkButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                TypedReturnCode<java.sql.Connection> dbResults = getConnectionReturnCode();
                showCheckConnectionInformation(true, dbResults);
            }

        });

        historyCombo.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                String selectedItem = ((Combo) e.getSource()).getText();
                if (StringUtils.isNotEmpty(selectedItem)) {
                    selectedAuditId = getKey(selectedItem);
                    if (selectedAuditId != -1) {
                        historyGenerateButton.setEnabled(true);
                    }
                }
            }
        });

        refreshButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                IAuditService service = getAuditService();
                if (service != null && savedInDBButton.getSelection()) {
                    try {
                        TypedReturnCode<java.sql.Connection> dbResults = getConnectionReturnCode();
                        showCheckConnectionInformation(false, dbResults);
                        if (dbResults.isOk()) {
                            currentParameters = service.listAllHistoryAudits(urlText.getText(), driverText.getText(),
                                    usernameText.getText(), passwordText.getText());
                            String[] items = initHistoryDisplayNames();
                            historyCombo.getCombo().setItems(items);
                            if (items.length > 0) {
                                historyCombo.getCombo().select(0);
                            } else {
                                historyGenerateButton.setEnabled(false);
                            }
                        }
                    } catch (Exception e1) {
                        ExceptionMessageDialog.openWarning(getShell(), "Error", e1);
                    }
                }
            }

        });

        historyGenerateButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                final Map<String, String> results = new HashMap<String, String>();
                final TypedReturnCode<java.sql.Connection> dbResults = new TypedReturnCode<java.sql.Connection>(Boolean.FALSE);
                boolean dbChecked = savedInDBButton.getSelection();
                if (dbChecked) {
                    TypedReturnCode<java.sql.Connection> rc = getConnectionReturnCode();
                    dbResults.setOk(rc.isOk());
                    dbResults.setObject(rc.getObject());
                    dbResults.setMessage(rc.getMessage());
                }
                String url = urlText.getText();
                String driver = driverText.getText();
                String username = usernameText.getText();
                String password = passwordText.getText();
                // select a foder as the generate path
                if (selectGeneratePath()) {
                    final Thread t[] = new Thread[1];
                    ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
                            PlatformUI.getWorkbench().getDisplay().getActiveShell()) {

                        @Override
                        protected void cancelPressed() {
                            if (t[0] != null) {
                                t[0].interrupt();
                            }
                        }
                    };
                    IRunnableWithProgress runnable = new IRunnableWithProgress() {

                        @Override
                        public void run(IProgressMonitor monitor) throws InterruptedException {
                            t[0] = Thread.currentThread();
                            monitor.beginTask(Messages.getString("AuditProjectSettingPage.generateAuditReportProgressBar"), //$NON-NLS-1$
                                    IProgressMonitor.UNKNOWN);
                            IAuditService service = getAuditService();
                            if (service != null && dbChecked) {
                                if (dbResults.isOk()) {
                                    try {
                                        service.populateHistoryAudit(selectedAuditId, url, driver, username, password);
                                        Map<String, String> returnResult = service.generateAuditReport(generatePath);
                                        results.putAll(returnResult);
                                    } catch (Exception e) {
                                        results.put(AuditManager.AUDIT_GENERATE_REPORT_EXCEPTION,
                                                ExceptionUtils.getFullStackTrace(e));
                                    }
                                }
                            }
                            monitor.done();
                        }
                    };
                    try {
                        progressDialog.run(true, true, runnable);
                    } catch (InvocationTargetException e1) {
                        ExceptionHandler.process(e1);
                    } catch (InterruptedException e1) {
                        ExceptionHandler.process(e1);
                    }
                }
                // Show information
                showCheckConnectionInformation(false, dbResults);
                showGenerationInformation(results);
            }

        });
    }

    private void init() {
        savedInDBButton.setSelection(prefManager.getBoolean(AuditManager.AUDIT_SAVEDINDB));
        reLoad();
    }

    private void reLoad() {
        if (savedInDBButton.getSelection()) {
            dbTypeCombo.setText(prefManager.getValue(AuditManager.AUDIT_DBTYPE));
            dbVersionCombo.setText(prefManager.getValue(AuditManager.AUDIT_DBVERSION));
            driverText.setText(prefManager.getValue(AuditManager.AUDIT_DRIVER));
            urlText.setText(prefManager.getValue(AuditManager.AUDIT_URL));
            usernameText.setText(prefManager.getValue(AuditManager.AUDIT_USERNAME));
            passwordText.setText(StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM)
                    .decrypt(prefManager.getValue(AuditManager.AUDIT_PASSWORD)));
        }
        hideControl(!savedInDBButton.getSelection());
    }

    private void hideControl(boolean hide) {
        dbTypeCombo.setReadOnly(hide);
        dbVersionCombo.setReadOnly(hide);
        urlText.setReadOnly(hide);
        usernameText.setReadOnly(hide);
        passwordText.setReadOnly(hide);
        checkButton.setEnabled(!hide);

        historyCombo.setEnabled(!hide);
        refreshButton.setEnabled(!hide);
        historyGenerateButton.setEnabled(!hide && historyCombo.getSelectionIndex() > -1);
    }

    private void save() {
        if (isProjectAuditEnabled && prefManager != null) {
            prefManager.setValue(AuditManager.AUDIT_DBTYPE, dbTypeCombo.getText());
            prefManager.setValue(AuditManager.AUDIT_DBVERSION, dbVersionCombo.getText());
            prefManager.setValue(AuditManager.AUDIT_DRIVER, driverText.getText());
            prefManager.setValue(AuditManager.AUDIT_URL, urlText.getText());
            prefManager.setValue(AuditManager.AUDIT_USERNAME, usernameText.getText());
            prefManager.setValue(AuditManager.AUDIT_PASSWORD, StudioEncryption
                    .getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).encrypt(passwordText.getText()));
            prefManager.setValue(AuditManager.AUDIT_SAVEDINDB, savedInDBButton.getSelection());
            prefManager.save();
        }
    }

    private void performDefaultStatus() {
        if (isProjectAuditEnabled) {
            savedInDBButton.setSelection(false);
            dbTypeCombo.deselectAll();
            dbVersionCombo.deselectAll();
            driverText.setText(""); //$NON-NLS-1$
            urlText.setText("");//$NON-NLS-1$
            usernameText.setText("");//$NON-NLS-1$
            passwordText.setText("");//$NON-NLS-1$
            hideControl(true);
        }
    }

    private boolean selectGeneratePath() {
        DirectoryDialog dial = new DirectoryDialog(getShell(), SWT.NONE);
        String directory = dial.open();
        if (StringUtils.isNotEmpty(directory)) {
            generatePath = Path.fromOSString(directory).toPortableString();
            if (!generatePath.endsWith("/")) { //$NON-NLS-1$
                generatePath += "/"; //$NON-NLS-1$
            }
            return true;
        } else {
            MessageDialog.openError(getShell(), "Error", //$NON-NLS-1$
                    Messages.getString("AuditProjectSettingPage.selectAuditReportFolder")); //$NON-NLS-1$
            return false;
        }
    }

    private String[] initHistoryDisplayNames() {
        String[] items = new String[currentParameters.size()];
        currentParameters.values().toArray(items);
        return items;
    }

    private Integer getKey(String selectedItem) {
        for (Integer key : currentParameters.keySet()) {
            String currentValue = currentParameters.get(key);
            if (selectedItem.equals(currentValue)) {
                return key;
            }
        }
        return -1;
    }

    private TypedReturnCode<java.sql.Connection> getConnectionReturnCode() {
        IAuditService service = getAuditService();
        if (service != null) {
            return service.checkConnection(getCurrentDBVersion(), urlText.getText(), driverText.getText(), usernameText.getText(),
                    passwordText.getText());
        }
        return new TypedReturnCode<java.sql.Connection>();
    }

    private IAuditService getAuditService() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IAuditService.class)) {
            return (IAuditService) GlobalServiceRegister.getDefault().getService(IAuditService.class);
        }
        return null;
    }

    private String getCurrentDBVersion() {
        String dbType = SupportDBUrlStore.getInstance().getDBType(dbTypeCombo.getText());
        SupportDBUrlType urlType = SupportDBUrlStore.getInstance().getDBUrlType(dbType);
        if (urlType != null) {
            return SupportDBVersions.getVersionValue(urlType, dbVersionCombo.getText());
        }
        return null;
    }

    private void showGenerationInformation(Map<String, String> result) {
        boolean status = Boolean.parseBoolean(result.get(AuditManager.AUDIT_GENERATE_REPORT_STATUS));
        if (status) {
            MessageDialog.openInformation(getShell(), Messages.getString("AuditProjectSettingPage.generate.title"), //$NON-NLS-1$
                    Messages.getString("AuditProjectSettingPage.generate.successful", //$NON-NLS-1$
                            result.get(AuditManager.AUDIT_GENERATE_REPORT_PATH)));
        } else {
            String mainMsg = Messages.getString("AuditProjectSettingPage.generate.failed.message"); //$NON-NLS-1$
            new ErrorDialogWidthDetailArea(getShell(), RepositoryPlugin.PLUGIN_ID, mainMsg,
                    result.get(AuditManager.AUDIT_GENERATE_REPORT_EXCEPTION));
        }
    }

    private void showCheckConnectionInformation(boolean show, TypedReturnCode<java.sql.Connection> result) {
        if (!result.isOk()) {
            String mainMsg = Messages.getString("AuditProjectSettingPage.DBConfig.CheckConnection.failed"); //$NON-NLS-1$
            new ErrorDialogWidthDetailArea(getShell(), RepositoryPlugin.PLUGIN_ID, mainMsg, result.getMessage());
        } else if (result.isOk() && show) {
            MessageDialog.openInformation(getShell(), Messages.getString("AuditProjectSettingPage.DBConfig.CheckButtonText"),result.getMessage()); //$NON-NLS-1$
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.preference.PreferencePage#performApply()
     */
    @Override
    protected void performApply() {
        save();
        super.performApply();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.preference.PreferencePage#performOk()
     */
    @Override
    public boolean performOk() {
        save();
        return super.performOk();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.preference.ProjectSettingPage#refresh()
     */
    @Override
    public void refresh() {
    }

    @Override
    protected void performDefaults() {
        performDefaultStatus();
        super.performDefaults();
    }
}