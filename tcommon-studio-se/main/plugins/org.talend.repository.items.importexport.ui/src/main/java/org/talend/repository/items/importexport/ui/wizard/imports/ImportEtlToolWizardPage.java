// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.items.importexport.ui.wizard.imports;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.FrameworkUtil;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.commons.runtime.model.emf.provider.EmfResourcesFactoryReader;
import org.talend.commons.runtime.model.emf.provider.ResourceOption;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.update.RepositoryUpdateManager;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.webService.Webhook;
import org.talend.repository.ProjectManager;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.repository.items.importexport.ui.i18n.Messages;
import org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory;
import org.talend.repository.items.importexport.wizard.models.ImportNodesBuilder;
import org.talend.repository.model.IProxyRepositoryFactory;

/*
 * import org.talend.designer.core.ui.AbstractMultiPageTalendEditor; import
 * org.talend.designer.core.ui.MultiPageTalendEditor;
 */

/**
 *
 * DOC ggu class global comment. Detailled comment
 */
public class ImportEtlToolWizardPage extends WizardPage {

    private static final Logger LOGGER = Logger.getLogger(ImportEtlToolWizardPage.class);

    private static final String TYPE_BEANS = "BEANS";

    private static final String TALEND_FILE_NAME = "talend.project";

    private IStructuredSelection selection;

    private final ImportExportHandlersManager importManager = new ImportExportHandlersManager();

    private Button regenIdBtn;

    private String projectLabel;

    private TreeViewer jobTreeViewer;

    private static ImportNodesBuilder nodesBuilder = new ImportNodesBuilder();

    private class JobImport {

        private String sequenceur;

        private String type;

        private boolean checked;

        public JobImport(String sequenceur, String type) {
            this.sequenceur = sequenceur;
            this.type = type;
        }

        public String getSequenceur() {
            return sequenceur;
        }

        public String getType() {
            return type;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }
    }

    private class MyLabelProvider extends LabelProvider {

        @Override
        public String getText(Object element) {
            if (element instanceof JobImport) {
                return ((JobImport) element).getSequenceur();
            }
            return super.getText(element);
        }
    }

    /**
     *
     * DOC ggu ImportEtlToolWizardPage constructor comment.
     *
     * @param pageName
     */
    public ImportEtlToolWizardPage(String pageName, IStructuredSelection s) {
        super(pageName);
        this.selection = s;
        setTitle("EtlTool"); //$NON-NLS-1$
        setDescription(Messages.getString("ImportEtlToolWizardPage_importDescription")); //$NON-NLS-1$
        setImageDescriptor(ImageProvider.getImageDesc(EImage.ETLTOOL_64));
        projectLabel = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
    }

    public IStructuredSelection getSelection() {
        return this.selection;
    }

    @Override
    public void createControl(Composite parent) {
        ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL);
        setControl(scrolledComposite);
        scrolledComposite.setLayout(new GridLayout());
        scrolledComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

        Composite composite = new Composite(scrolledComposite, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
        composite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
        scrolledComposite.setContent(composite);

        if (!CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_ENABLED)) {
            Label noWebhookLabel = new Label(composite, SWT.NONE);
            noWebhookLabel.setText("No webhook defined !");
        } else {
            Text searchText = new Text(composite, SWT.BORDER);
            searchText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
            searchText.setText("");
            searchText.setMessage("Search...");

            Button searchButton = new Button(composite, SWT.NONE);
            searchButton.setImage(ImageProvider.getImage(EImage.REFRESH_ICON));
            searchButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false));
            searchButton.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    fillJobs();
                }
            });

            jobTreeViewer = new CheckboxTreeViewer(composite, SWT.BORDER);
            jobTreeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
            jobTreeViewer.setContentProvider(new ITreeContentProvider() {

                @Override
                public Object[] getElements(Object inputElement) {
                    if (inputElement instanceof List) {
                        return ((List<JobImport>) inputElement).toArray();
                    }
                    return null;
                }

                @Override
                public Object[] getChildren(Object parentElement) {
                    return null;
                }

                @Override
                public Object getParent(Object element) {
                    return null;
                }

                @Override
                public boolean hasChildren(Object element) {
                    return false;
                }
            });
            jobTreeViewer.setLabelProvider((IBaseLabelProvider) new MyLabelProvider());

            // Ajoutez une case à cocher à chaque élément du TreeViewer
            ((CheckboxTreeViewer) jobTreeViewer).setCheckStateProvider(new ICheckStateProvider() {

                @Override
                public boolean isChecked(Object element) {
                    if (element instanceof JobImport) {
                        return ((JobImport) element).isChecked();
                    }
                    return false;
                }

                @Override
                public boolean isGrayed(Object element) {
                    return false;
                }
            });

            // Ajoutez un ModifyListener pour mettre à jour le filtre de la table
            searchText.addModifyListener(new ModifyListener() {

                @Override
                public void modifyText(ModifyEvent e) {
                    String filter = searchText.getText();
                    if (filter.isEmpty()) {
                        jobTreeViewer.resetFilters();
                    } else {
                        jobTreeViewer.setFilters(new ViewerFilter[] { new ViewerFilter() {

                            @Override
                            public boolean select(Viewer jobTreeViewer, Object parentElement, Object element) {
                                if (element instanceof JobImport) {
                                    return ((JobImport) element).getSequenceur().toLowerCase().contains(filter.toLowerCase());
                                }
                                return true;
                            }
                        } });
                    }
                }
            });
        }
        fillJobs();

        scrolledComposite.setContent(composite);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);
        scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        Dialog.applyDialogFont(composite);
    }

    public void fillJobs() {
        try {
            // Open wait dialog
            Webhook webhook = new Webhook();
            webhook.loadingDialogOpen();

            List<HashMap<String, String>> jobItems = Webhook.projetTree("ref_DEV", projectLabel, "Talend");
            List<JobImport> jobs = new ArrayList<>();
            for (HashMap<String, String> jobItem : jobItems) {
                jobs.add(new JobImport(jobItem.get("Sequenceur"), jobItem.get("Type")));
            }
            jobTreeViewer.setInput(jobs);

            // Close wait dialog
            webhook.loadingDialogClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean importItems(String zipPath, IProgressMonitor monitor, final boolean overwrite, final boolean openThem,
            boolean needMigrationTask) throws IOException {
        ZipFile srcZipFile = new ZipFile(zipPath);
        final ResourcesManager resourcesManager = ResourcesManagerFactory.getInstance().createResourcesManager(srcZipFile);
        final ResourceOption importOption = ResourceOption.DEMO_IMPORTATION;
        try {
            EmfResourcesFactoryReader.INSTANCE.addOption(importOption);

            resourcesManager.collectPath2Object(srcZipFile);
            final ImportExportHandlersManager importManager = new ImportExportHandlersManager();
            final List<ImportItem> items = populateItems(importManager, resourcesManager, monitor, overwrite);
            final List<String> itemIds = new ArrayList<String>();

            for (ImportItem itemRecord : items) {
                Item item = itemRecord.getProperty().getItem();
                if (item instanceof ProcessItem) {
                    // only select jobs
                    itemIds.add(item.getProperty().getId());
                }
                IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                if (item.getState().isLocked()) {
                    factory.unlock(item);
                }
                ERepositoryStatus status = factory.getStatus(item);
                if (status != null && status == ERepositoryStatus.LOCK_BY_USER) {
                    factory.unlock(item);
                }
                if (!needMigrationTask) {
                    itemRecord.setMigrationTasksToApply(null);
                }
            }
            // importManager.importItemRecords(new NullProgressMonitor(), resourcesManager,
            // items, overwrite,
            // nodesBuilder.getAllImportItemRecords(), null);
            if (items != null && !items.isEmpty()) {
                importManager.importItemRecords(monitor, resourcesManager, items, overwrite,
                        nodesBuilder.getAllImportItemRecords(), null);
            }
        } catch (Exception e) {
            CommonExceptionHandler.process(e);
            return false;
        } finally {
            // clean
            if (resourcesManager != null) {
                resourcesManager.closeResource();
            }
            nodesBuilder.clear();

            EmfResourcesFactoryReader.INSTANCE.removOption(importOption);
        }
        return true;
    }

    private static List<ImportItem> populateItems(final ImportExportHandlersManager importManager,
            final ResourcesManager resourcesManager, IProgressMonitor monitor, final boolean overwrite) {
        List<ImportItem> selectedItemRecords = new ArrayList<ImportItem>();
        nodesBuilder.clear();
        if (resourcesManager != null) { // if resource is not init successfully.
            try {
                // List<ImportItem> items =
                // importManager.populateImportingItems(resourcesManager, overwrite,
                // new NullProgressMonitor(), true);
                List<ImportItem> items = importManager.populateImportingItems(resourcesManager, overwrite, monitor, true);
                nodesBuilder.addItems(items);
            } catch (Exception e) {
                CommonExceptionHandler.process(e);
            }
        }
        ImportItem[] allImportItemRecords = nodesBuilder.getAllImportItemRecords();
        selectedItemRecords.addAll(Arrays.asList(allImportItemRecords));
        Iterator<ImportItem> itemIterator = selectedItemRecords.iterator();
        while (itemIterator.hasNext()) {
            ImportItem item = itemIterator.next();
            if (!item.isValid()) {
                itemIterator.remove();
            }
        }
        return selectedItemRecords;
    }

    private static boolean isJobAlreadyOpened(String jobName) {
        List<IProcess2> openedProcessList = CoreRuntimePlugin.getInstance().getDesignerCoreService()
                .getOpenedProcess(RepositoryUpdateManager.getEditors());
        if (openedProcessList == null || openedProcessList.isEmpty()) {
            return false;
        }
        for (IProcess2 process : openedProcessList) {
            if (jobName.equals(process.getName())) {
                return true;
            }
        }
        return false;
    }

    /*
     * private static String getEditorId() { return MultiPageTalendEditor.ID; }
     */

    @Override
    public boolean isPageComplete() {
        return super.isPageComplete();
    }

    public boolean performCancel() {
        return true;
    }

    public boolean performFinish() {

        Webhook webhook = new Webhook();

        Object[] checkedElements = ((CheckboxTreeViewer) jobTreeViewer).getCheckedElements();

        ArrayList<String> listSequenceur = new ArrayList<String>();

        try {
            for (Object element : checkedElements) {

                listSequenceur.add(((JobImport) element).getSequenceur()); // "SYNCLI_000_Master";
            }

            Job job = new Job("In progress") {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    int i = 0;
                    monitor.beginTask("Execution of the treatment...", listSequenceur.size());

                    for (String sequenceur : listSequenceur) {
                        if (monitor.isCanceled()) {
                            return Status.CANCEL_STATUS;
                        }
                        monitor.subTask("Step " + (i + 1));
                        try {
                            executeTask(webhook, sequenceur, monitor);

                        } catch (Exception e) {
                            Throwable cause = e.getCause();
                            IStatus status = new Status(IStatus.ERROR, FrameworkUtil.getBundle(this.getClass()).getSymbolicName(),
                                    "An error has occurred", cause);
                            Display.getDefault().asyncExec(() -> {
                                ErrorDialog.openError(getShell(), "EtlTool Import Error",
                                        "Error during EtlTool import of the " + sequenceur + " item ", status);
                            });
                            return Status.CANCEL_STATUS;
                        }
                        monitor.worked(1);
                        i++;
                    }

                    monitor.done();
                    return Status.OK_STATUS;
                }
            };
            job.setUser(true); // Affiche une boîte de dialogue de progression
            job.schedule(); // Lance le job
        } catch (Exception e) {
            Throwable cause = e.getCause();
            IStatus status = new Status(IStatus.ERROR, FrameworkUtil.getBundle(this.getClass()).getSymbolicName(),
                    "An error has occurred", cause);
            ErrorDialog.openError(getShell(), "EtlTool Import Error", "Error during EtlTool import", status);

        }
        return true;

    }

    protected boolean executeTask(Webhook webhook, String sequenceur, IProgressMonitor monitor) throws Exception {
        IProgressMonitor pMonitor = new NullProgressMonitor();
        if (monitor != null) {
            pMonitor = monitor;
        }

        HashMap<String, String> job = Webhook.JobArchiveGet("ref_DEV", projectLabel, sequenceur, "Talend");
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("performFinish");
            LOGGER.info(job);
        }

        /*
         * String fileUrl = job.get("fileUrl"); String workspaceLocation =
         * ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString(); String jobZipPath = workspaceLocation +
         * File.separator + sequenceur + ".zip"; if (LOGGER.isInfoEnabled()) { LOGGER.info(fileUrl);
         * LOGGER.info(workspaceLocation); LOGGER.info(jobZipPath); } Webhook.downloadFile(fileUrl, jobZipPath);
         */
        String jobZipPath = job.get("jobZipPath");
        boolean importStatus = importItems(jobZipPath, pMonitor, true, true, false);
        File jobFile = new File(jobZipPath);
        jobFile.delete();

        return importStatus;

    }

}
