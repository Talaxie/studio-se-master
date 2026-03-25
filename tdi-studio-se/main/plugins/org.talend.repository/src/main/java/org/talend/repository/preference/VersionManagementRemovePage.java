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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.ide.IDEInternalPreferences;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.runtime.exception.MessageBoxExceptionHandler;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.swt.advanced.composite.TwoCompositesSashForm;
import org.talend.commons.utils.VersionUtils;
import org.talend.commons.utils.system.EnvironmentUtils;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryContentHandler;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.RepositoryContentManager;
import org.talend.core.model.repository.RepositoryManager;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.ui.ITestContainerProviderService;
import org.talend.repository.ProjectManager;
import org.talend.repository.RepositoryWorkUnit;
import org.talend.repository.i18n.Messages;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.nodes.IProjectRepositoryNode;
import org.talend.repository.viewer.ui.provider.RepoCommonViewerProvider;
import org.talend.repository.viewer.ui.viewer.CheckboxRepositoryTreeViewer;
import org.talend.repository.model.ItemVersionObject;
import org.talend.repository.model.RepositoryConstants;
import org.talend.repository.model.RepositoryNode;

public class VersionManagementRemovePage extends AbstractVersionManagementProjectSettingPage {
    
    private final Color COLOR_RED = Display.getDefault().getSystemColor(SWT.COLOR_RED);

    private final Color COLOR_WHITE = Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
    
    private Button removeLowerThanBtn;
    
    protected Button removeOldVersionsBtn;
    
    private Text versionText;
    
    private Button deleteBtn;
    
    protected CheckboxRepositoryTreeViewer treeViewer;
    
    private String reportPath;
    
    private int delNum = 0;
    
    private String lessThanVersion = null;
    
    List<IRepositoryViewObject> batchDeleteObjectList = new ArrayList<IRepositoryViewObject>();

    final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmssSSS"); 

    public VersionManagementRemovePage() {
        super();
        this.noDefaultAndApplyButton();
    }

    @Override
    protected boolean filterRepositoryNode(RepositoryNode node) {
        if (node == null) {
            return false;
        }
        if (node.isBin()) {
            return false;
        }
        if (node.getObject() != null) {
            ERepositoryStatus status = FACTORY.getStatus(node.getObject());
            if (status == ERepositoryStatus.LOCK_BY_OTHER
                    || (status == ERepositoryStatus.LOCK_BY_USER && RepositoryManager.isOpenedItemInEditor(node.getObject()))) {
                return false;
            }
            // table
            if (node.getObject() instanceof org.talend.core.model.metadata.MetadataTable) {
                return false;
            }
            
            //Not display test but delete test case which has parent version refers to the deleted version of jobs.
            if (node.getObject().getProperty() != null && node.getObject().getProperty().getItem() != null) {
                if (node.getObject().getProperty().getItem().getClass().getName().contains("TestContainerItem")) {
                    return false;
                }
            }
            
            // opened items
            ERepositoryObjectType objectType = node.getObjectType();
            if (objectType == ERepositoryObjectType.SQLPATTERNS || objectType == ERepositoryObjectType.ROUTINES) {
                RepositoryNode systemNode = node.getParent();
                if (systemNode != null) {
                    // for system folder
                    if (systemNode.getType() == ENodeType.STABLE_SYSTEM_FOLDER
                            && systemNode.getLabel().equalsIgnoreCase(RepositoryConstants.SYSTEM_DIRECTORY)) {
                        return false;
                    }
                }
            }

            if (node.getObject().isDeleted()) {
                return false;
            }
        }
        ERepositoryObjectType contentType = node.getContentType();
        if (contentType != null) {
            if (contentType == ERepositoryObjectType.REFERENCED_PROJECTS || contentType == ERepositoryObjectType.GENERATED) {
                return false;
            } else if (contentType == ERepositoryObjectType.SQLPATTERNS || contentType == ERepositoryObjectType.ROUTINES) {
                // for system folder
                if (node.getType() == ENodeType.STABLE_SYSTEM_FOLDER
                        && node.getLabel().equalsIgnoreCase(RepositoryConstants.SYSTEM_DIRECTORY)) {
                    return false;
                }
            }
            // filter tdm items
            else if (contentType == ERepositoryObjectType.valueOf(ERepositoryObjectType.class, "HIERARCHICAL_MAPPER")) {
                return false;
            }
        }

        // for sub folder in db connection
        if (node.getType() == ENodeType.STABLE_SYSTEM_FOLDER) {
            RepositoryNode parentNode = node.getParent();
            if (parentNode != null) {
                if (parentNode.getObjectType() == ERepositoryObjectType.METADATA_CONNECTIONS) {
                    return false;
                }
            }
        }
        return true;
    }

    protected void addItemsOption(Composite parent) {
        Group option = new Group(parent, SWT.NONE);
        option.setText(Messages.getString("VersionManagementDialog.Options")); //$NON-NLS-1$
        GridLayout gridLayout = new GridLayout(3, false);
        gridLayout.horizontalSpacing = 0;
        gridLayout.verticalSpacing = 0;
        gridLayout.marginWidth = 0;
        option.setLayout(gridLayout);
        GridData gridData = new GridData();
        gridData.grabExcessHorizontalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        option.setLayoutData(gridData);
        
        Composite warningComp = new Composite(option,SWT.NONE);
        gridLayout = new GridLayout(2, false);
        gridLayout.verticalSpacing = 0;
        gridLayout.marginWidth = 0;
        gridData.grabExcessHorizontalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        warningComp.setLayout(gridLayout);
        gridData = new GridData();
        gridData.horizontalSpan = 3;
        warningComp.setLayoutData(gridData);
        
        CLabel warningImage = new CLabel(warningComp, SWT.BOLD);
        warningImage.setImage(ImageProvider.getImage(EImage.WARNING_ICON));
        gridData = new GridData();
        gridData.horizontalSpan = 1;
        warningImage.setLayoutData(gridData);
        
        CLabel warningLabel = new CLabel(warningComp, SWT.BOLD);
        warningLabel.setText(Messages.getString("VersionManagementDialog.removeWaring"));
        gridData = new GridData();
        gridData.horizontalSpan = 1;
        gridData.verticalSpan = 2;
        warningLabel.setLayoutData(gridData);
        
        removeOldVersionsBtn = new Button(option, SWT.RADIO);
        removeOldVersionsBtn.setText(Messages.getString("VersionManagementDialog.removeOldVersions"));
        GridData btnGridData = new GridData();
        btnGridData.horizontalSpan = 3;
        removeOldVersionsBtn.setLayoutData(btnGridData);
        removeOldVersionsBtn.setSelection(true);
        removeOldVersionsBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                versionText.setEnabled(false);
                checkDeleteBtnState();
            }
        });
        
        removeLowerThanBtn = new Button(option, SWT.RADIO);
        removeLowerThanBtn.setText(Messages.getString("VersionManagementDialog.removeLowerThan"));
        btnGridData = new GridData();
        btnGridData.horizontalSpan = 1;
        removeLowerThanBtn.setLayoutData(btnGridData);
        removeLowerThanBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                versionText.setEnabled(true);
                if ( isValidItemVersion(versionText.getText())) {
                    checkDeleteBtnState();
                } else {
                   deleteBtn.setEnabled(false);
                }
            }
        });
        
        versionText = new Text(option, SWT.BORDER);
        btnGridData = new GridData();
        btnGridData.horizontalSpan = 2;
        btnGridData.widthHint = 50;
        btnGridData.minimumWidth = 50;
        btnGridData.horizontalAlignment = SWT.LEFT;
        versionText.setLayoutData(btnGridData);
        versionText.setEnabled(false);
        versionText.setText("0.2");
        versionText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                String version = versionText.getText();
                if (isValidItemVersion(version)) {
                    checkDeleteBtnState();
                    versionText.setBackground(COLOR_WHITE);
                    versionText.setToolTipText(""); //$NON-NLS-1$
                } else {
                    deleteBtn.setEnabled(false);
                    versionText.setBackground(COLOR_RED);
                    versionText.setToolTipText(Messages.getString("VersionManagementDialog.valueWarning")); //$NON-NLS-1$
                }
            }
        });
        
        Label notelabel = new Label(option, SWT.NONE);
        notelabel.setText("      " + Messages.getString("VersionManagementDialog.removeLowerThanNote")); 
        GridData labelGridData = new GridData();
        labelGridData.horizontalSpan = 3;
        notelabel.setLayoutData(labelGridData);
        
        deleteBtn = new Button(option,SWT.NONE);
        deleteBtn.setText("Remove");
        deleteBtn.setEnabled(false);
        
        deleteBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if ( removeLowerThanBtn.getSelection()) {
                    lessThanVersion = versionText.getText();
                } else {
                    lessThanVersion = null;
                }
                removeOldVersions();
            }
        });
    }
    
    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, 0);
        TwoCompositesSashForm compositesSachForm = new TwoCompositesSashForm(composite, SWT.NONE);
        GridLayout gridLayout = new GridLayout(1, false);
        gridLayout.marginHeight = 0;
        gridLayout.marginWidth = 0;
        gridLayout.horizontalSpacing = 0;
        composite.setLayout(gridLayout);
        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.widthHint = 570;
        composite.setLayoutData(gridData);
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        if (factory.isUserReadOnlyOnCurrentProject()) {
            compositesSachForm.setEnabled(false);
        }

        addRepositoryTreeViewer(compositesSachForm.getLeftComposite());

        addItemTableViewer(compositesSachForm.getRightComposite());

        return composite;
    }
    

    @Override
    protected ItemVersionObject createItemVersionObject(RepositoryNode node, Property property) {
        ItemVersionObject object = new ItemVersionObject(property, node, property.getVersion());
        return object;
    }
    
    protected void removeOldVersions() {
        final IWorkspaceRunnable op = new IWorkspaceRunnable() {
            @Override
            public void run(final IProgressMonitor monitor) throws CoreException {
                monitor.beginTask("Remove old versions", checkedObjects.size());
                List<IRepositoryViewObject> versionsToDelete = null;
                PrintWriter pw = null;
                File reportFile = null;
                try {
                    IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                    RepoCommonViewerProvider provider = RepoCommonViewerProvider.CHECKBOX;
                    IProjectRepositoryNode projectRepositoryNode = provider.getProjectRepositoryNode();
                    Project project = projectRepositoryNode.getProject();
                    boolean isLocal = ProjectManager.getInstance().getCurrentProject().isLocal();
                    
                    if (factory.isUserReadOnlyOnCurrentProject() || factory.getRepositoryContext().isOffline()
                            || factory.getRepositoryContext().isEditableAsReadOnly()) {
                        return;
                    }
                    
                    //report file and the full path is Workspace/reports/cleanup_1234567899/projectname_cleanup_result.csv
                    String reportFolder = "cleanup_" + DATE_FORMAT.format(new Date());
                    String reportFileName = project.getLabel() + "_cleanup_result.csv";
                    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
                    File workspaceLoc = root.getLocation().makeAbsolute().toFile();
                    StringBuffer fullPath = new StringBuffer();
                    fullPath.append("reports");
                    fullPath.append(File.separator);
                    fullPath.append(reportFolder);
                    File locationDir = new File(workspaceLoc, fullPath.toString());
                    reportFile = detectReportFile(locationDir, reportFileName);
                    reportPath = reportFile.getAbsolutePath();
                    pw = new PrintWriter(reportFile);
                    pw.write("\"Type\",\"Path\"");
                    pw.write('\n');
                    
                    delNum = 0;
                    
                    ITestContainerProviderService testService = null;
                    if (GlobalServiceRegister.getDefault().isServiceRegistered(ITestContainerProviderService.class)) {
                        testService = (ITestContainerProviderService) GlobalServiceRegister.getDefault()
                                .getService(ITestContainerProviderService.class);
                    }
                    
                    for (ItemVersionObject object : checkedObjects) {
                        if ( object == null || object.getItem() == null || object.getItem().getProperty() == null ) continue;
                        
                        //if the item is a test case, not delete it.
                        if(testService != null && testService.isTestContainerItem(object.getItem())){
                            continue;
                        }
                        versionsToDelete = factory.getAllVersion(project, object.getItem().getProperty().getId(), false);
                        if ( versionsToDelete != null) {
                            for (IRepositoryViewObject versionToDelete : versionsToDelete) {
                                if (monitor.isCanceled()) {
                                    throw new InterruptedException();
                                }
                                if ( versionToDelete == null || versionToDelete.getProperty() == null ) continue;
                                //Keep the max version
                                String maxVersion = object.getItem().getProperty().getVersion();
                                if ( lessThanVersion != null && (VersionUtils.compareTo(lessThanVersion,maxVersion) < 0 )) maxVersion = lessThanVersion;
                                if ( VersionUtils.compareTo(versionToDelete.getProperty().getVersion(), maxVersion) < 0 ) {
                                    String versionedLabel = versionToDelete.getProperty().getLabel() + "_" + versionToDelete.getProperty().getVersion();
                                    if (!StringUtils.isEmpty(versionToDelete.getPath())) {
                                        versionedLabel = versionToDelete.getPath() + "/" + versionedLabel;
                                    }
                                    //physical delete
                                    if (isLocal) {
                                        monitor.setTaskName("Removing " + versionToDelete.getRepositoryObjectType() + ":"+  versionedLabel);
                                        factory.deleteOldVersionPhysical(project, versionToDelete, versionToDelete.getProperty().getVersion());
                                    } else {
                                        //batch delete for remote
                                        batchDeleteObjectList.add(versionToDelete);;
                                    }
                                    delNum++;
                                    pw.write("\""+ versionToDelete.getRepositoryObjectType() + "\"" + "," + "\"" + versionedLabel + "\"");
                                    pw.write('\n');
                                    
                                    //delete test case which has parent version refers to the deleted version of jobs.
                                    if (testService!=null && versionToDelete.getProperty().getItem() instanceof ProcessItem ) {
                                        List<ProcessItem> childTestItems = testService.getTestContainersByVersion((ProcessItem)versionToDelete.getProperty().getItem());
                                        for(ProcessItem childTest: childTestItems) {
                                            if (childTest != null && childTest.getProperty() != null ) {
                                                IRepositoryViewObject testObject = factory.getSpecificVersion(project, childTest.getProperty().getId(), childTest.getProperty().getVersion(), true);
                                                if (testObject != null) {
                                                    if ( isLocal ) {
                                                        factory.deleteOldVersionPhysical(project, testObject, childTest.getProperty().getVersion());
                                                    } else {
                                                        batchDeleteObjectList.add(testObject);
                                                    }
                                                    delNum++;
                                                    versionedLabel = versionedLabel + "/" + childTest.getProperty().getLabel() + "_" + childTest.getProperty().getVersion();
                                                    pw.write("\""+ testObject.getRepositoryObjectType() + "\"" + "," + "\"" + versionedLabel + "\"");
                                                    pw.write('\n');
                                                    // Refresh 
                                                    for (IRepositoryContentHandler handler : RepositoryContentManager.getHandlers()) {
                                                        handler.deleteNode(testObject);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (isLocal) monitor.worked(1);
                    }
                    //batch deletion for remote
                    if (!isLocal && batchDeleteObjectList.size() > 0) {
                        factory.batchDeleteOldVersionPhysical4Remote(project, batchDeleteObjectList, monitor);
                        monitor.setTaskName("Commit files...");
                        commiteProjectSettings();
                        batchDeleteObjectList = new ArrayList<IRepositoryViewObject>();
                    } else {
                        if (delNum > 0) factory.saveProject(ProjectManager.getInstance().getCurrentProject());
                    }
                    monitor.done();
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                } catch (FileNotFoundException fnfe) {
                    ExceptionHandler.process(fnfe);
                } catch (InterruptedException e) {
                } finally {
                    if (pw !=null) pw.close();
                    if (delNum == 0 && reportFile != null) reportFile.delete(); 
                }
            }
        };
        
        IRunnableWithProgress iRunnableWithProgress = new IRunnableWithProgress() {

            @Override
            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
                try {
                    ISchedulingRule schedulingRule = workspace.getRoot();
                    // the update the project files need to be done in the workspace runnable to avoid all
                    // notification
                    // of changes before the end of the modifications.
                    workspace.run(op, schedulingRule, IWorkspace.AVOID_UPDATE, monitor);
                } catch (CoreException e) {
                    throw new InvocationTargetException(e);
                }

            }
        };
        final ProgressMonitorDialog dialog = new ProgressMonitorDialog(getShell());
        try {
            dialog.run(true, true, iRunnableWithProgress);
        } catch (InvocationTargetException e) {
            ExceptionHandler.process(e);
        } catch (InterruptedException e) {
        }
        if (delNum > 0) {
           ReportDialog dlg = new ReportDialog(removeOldVersionsBtn.getShell(), reportPath, delNum);
           dlg.open();
        } else {
            MessageDialog.openInformation(getShell(), Messages.getString("VersionManagementDialog.removeReportTitle"), 
                    Messages.getString("VersionManagementDialog.removeNumberMessage1",0)); 
            return;
        }
    }
    
    @Override
    protected void addItemTableViewer(Composite rightComposite) {
        Composite composite = new Composite(rightComposite, SWT.NONE);
        GridLayout gdlComposite = new GridLayout();
        gdlComposite.marginHeight = 0;
        gdlComposite.marginWidth = 0;
        composite.setLayout(gdlComposite);

        GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);

        addItemsOption(composite);

    }
    
    @Override
    protected void refreshTableItems() {
        checkDeleteBtnState();
    }
    
    
    @Override
    protected void createItemTableColumns() {
    }
    
    @Override
    protected void removeItemElements(List<ItemVersionObject> objects) {
    }

    protected void researchMaxVersion() {
    }

    @Override
    protected void addItemElements(List<ItemVersionObject> elements) {
    }

    @Override
    protected String getNewVersionWithOption(ItemVersionObject object) {
        return "";
    }

    @Override
    protected void updateItemsVersion() {
    }
    
    @Override
    protected boolean okPressed() {
        return true;
    }
    
    @Override
    protected void checkButtonsState(boolean isEnable) {
    }
    
    private void checkDeleteBtnState() {
        if (checkedObjects != null && checkedObjects.size() > 0) {
            deleteBtn.setEnabled(true);
        } else {
            deleteBtn.setEnabled(false);
        }
    }
    
    private static File detectReportFile(File location, String reportFileName) {
        if (!location.exists()) {
            location.mkdirs();
        }
        File reportFile = null;
        try {
            reportFile = new File(location.getAbsolutePath() + File.separator + reportFileName);
            reportFile.createNewFile();
        } catch (IOException e) {
            CommonExceptionHandler.log(e.getMessage());
        }
        return reportFile;
    }
    
    private boolean isValidItemVersion(String version) {
        String regex="^\\d+\\.\\d+";
        if (version == null) return false;
        //00.1 is invalid
        String regex2="^0\\d+\\.\\d+";
        if (version.matches(regex2)) return false;
        return version.matches(regex);
    }
    
    private void commiteProjectSettings() {
        RepositoryWorkUnit repositoryWorkUnit = new RepositoryWorkUnit(ProjectManager.getInstance().getCurrentProject(), "") { //$NON-NLS-1$
            @Override
            public void run() throws PersistenceException {
            }
        };
        repositoryWorkUnit.setAvoidUnloadResources(true);
        repositoryWorkUnit.setForceTransaction(true);
        CorePlugin.getDefault().getRepositoryService().getProxyRepositoryFactory().executeRepositoryWorkUnit(repositoryWorkUnit);
    }
    
    private void openInSystemExplorer(String fileLocation) {
        String command = IDEWorkbenchPlugin.getDefault().getPreferenceStore().getString(IDEInternalPreferences.WORKBENCH_SYSTEM_EXPLORER);
        File dir = new File(fileLocation).getParentFile();
        Process p;
        try {
            if (EnvironmentUtils.isWindowsSystem()) {
                p = Runtime.getRuntime().exec("explorer.exe /select," + fileLocation);
            } else if (EnvironmentUtils.isMacOsSytem()) {
                p = Runtime.getRuntime().exec("open -R " + fileLocation);
            } else {
                p = Runtime.getRuntime().exec(new String[] {"/bin/sh", "-c", command},null, dir);
            }
        } catch (IOException e1) {
            MessageBoxExceptionHandler.process(e1);
        }
    }
    
    class ReportDialog extends Dialog {
        
        private Button okBtn;
        private String reportLoc;
        private int delNum = 0;
        
        public ReportDialog(Shell parentShel) {
            super(parentShel);
        }
        
        public ReportDialog(Shell parentShel, String loc, int cnt) {
            super(parentShel);
            this.reportLoc = loc;
            this.delNum = cnt;
        }
       
        protected void configureShell(Shell shell) {
            super.configureShell(shell);
            shell.setText(Messages.getString("VersionManagementDialog.removeReportTitle"));
        }
        
        
        protected void createButtonsForButtonBar(Composite parent) {
            okBtn = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        }
        
        protected Control createDialogArea(Composite parent) {
            Composite composite = new Composite(parent, SWT.NONE);
            GridLayout layout = new GridLayout();
            layout.numColumns = 2;
            composite.setLayout(layout);
            GridData layoutData = new GridData(GridData.FILL_BOTH);
            composite.setLayoutData(layoutData);
            
            Label numLabel = new Label(composite, SWT.WRAP);
            numLabel.setBackground(getShell().getBackground());
            if (delNum > 1) {
                numLabel.setText(Messages.getString("VersionManagementDialog.removeNumberMessage",delNum));
            } else {
                numLabel.setText(Messages.getString("VersionManagementDialog.removeNumberMessage1",delNum));
            }
            layoutData = new GridData(GridData.FILL_HORIZONTAL);
            layoutData.horizontalSpan = 2;
            numLabel.setLayoutData(layoutData);
            
            if ( delNum == 0) return composite;
            
            Label hereLabel = new Label(composite, SWT.WRAP);
            hereLabel.setText(Messages.getString("VersionManagementDialog.reportHereMessage"));
            hereLabel.setBackground(getShell().getBackground());
            layoutData = new GridData();
            layoutData.horizontalSpan = 1;
            hereLabel.setLayoutData(layoutData);
            
            Link accessLink = new Link(composite, SWT.WRAP);
            accessLink.setText("<a>" + Messages.getString("VersionManagementDialog.accessToReport") + "</a>");
            accessLink.setToolTipText(reportLoc);
            layoutData = new GridData();
            layoutData.horizontalSpan = 1;
            accessLink.setLayoutData(layoutData);  
            accessLink.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    openInSystemExplorer(reportLoc);
                }
            });
            return composite;
        }
    }
    
}
