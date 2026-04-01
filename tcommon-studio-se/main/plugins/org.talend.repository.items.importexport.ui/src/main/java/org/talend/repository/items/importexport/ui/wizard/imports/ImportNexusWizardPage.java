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

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import javax.swing.*;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.wizards.datatransfer.TarException;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.model.emf.provider.EmfResourcesFactoryReader;
import org.talend.commons.runtime.model.emf.provider.ResourceOption;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.runtime.service.ITaCoKitService;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.PluginChecker;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryPrefConstants;
import org.talend.core.model.repository.RepositoryManager;
import org.talend.core.model.repository.RepositoryViewObject;
import org.talend.core.model.utils.TalendPropertiesUtil;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.service.IExchangeService;
import org.talend.core.service.IStudioLiteP2Service;
import org.talend.core.service.IStudioLiteP2Service.IInstallableUnitInfo;
import org.talend.core.ui.advanced.composite.FilteredCheckboxTree;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.core.ui.component.ComponentPaletteUtilities;
import org.talend.designer.core.IMultiPageTalendEditor;
import org.talend.designer.maven.tools.AggregatorPomsHelper;
import org.talend.designer.maven.tools.MavenPomSynchronizer;
import org.talend.migration.MigrationReportHelper;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.imports.IImportItemsHandler;
import org.talend.repository.items.importexport.handlers.imports.ImportBasicHandler;
import org.talend.repository.items.importexport.handlers.imports.ImportCacheHelper;
import org.talend.repository.items.importexport.handlers.imports.ImportDependencyRelationsHelper;
import org.talend.repository.items.importexport.handlers.model.EmptyFolderImportItem;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.repository.items.importexport.ui.dialog.ShowErrorsDuringImportItemsDialog;
import org.talend.repository.items.importexport.ui.i18n.Messages;
import org.talend.repository.items.importexport.ui.managers.FileResourcesUnityManager;
import org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerContentProvider;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerFilter;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerLabelProvider;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerSorter;
import org.talend.repository.items.importexport.wizard.models.FolderImportNode;
import org.talend.repository.items.importexport.wizard.models.ImportNode;
import org.talend.repository.items.importexport.wizard.models.ImportNodesBuilder;
import org.talend.repository.items.importexport.wizard.models.ItemImportNode;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNodeUtilities;
import org.talend.repository.ui.dialog.AProgressMonitorDialogWithCancel;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.talend.core.ui.webService.Webhook;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.repository.ProjectManager;
import org.talend.core.context.RepositoryContext;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.talend.core.model.properties.ProcessItem;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.seeker.RepositorySeekerManager;
import org.talend.core.model.utils.RepositoryManagerHelper;
import org.eclipse.jface.viewers.StructuredSelection;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.repository.ui.views.IRepositoryView;
import org.talend.core.model.process.IProcess2;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.model.update.RepositoryUpdateManager;
import org.eclipse.ui.IWorkbenchPage;
import org.talend.core.model.properties.Property;
import org.talend.core.ui.editor.JobEditorInput;

import org.osgi.framework.FrameworkUtil;
import javax.swing.*;

/*
import org.talend.designer.core.ui.AbstractMultiPageTalendEditor;
import org.talend.designer.core.ui.MultiPageTalendEditor;
*/

/**
 *
 * DOC ggu class global comment. Detailled comment
 */
public class ImportNexusWizardPage extends WizardPage {

    private static final Logger LOGGER = Logger.getLogger(ImportNexusWizardPage.class);

    private static final String TYPE_BEANS = "BEANS";
    private static final String TALEND_FILE_NAME = "talend.project";

    private IStructuredSelection selection;

    private final ImportExportHandlersManager importManager = new ImportExportHandlersManager();

    private Button regenIdBtn;

    private String projectLabel;

    private static ImportNodesBuilder nodesBuilder = new ImportNodesBuilder();
	
	private List<Job> jobs = null;
	private Table table = null;
	private Text searchText = null;

	class Job {
		public boolean checked;
		public String name;
		public List<Version> versions;
	    public Version version;

	    public Job(String name) {
	        this.name = name;
	    }
	}
	
	class Version {
		public String number;
	    public String date;
	    public int size;
	    public String downloadUrl;
	
	    public Version(String number) {
	        this.number = number;
	    }

	    public int[] getVersionComponents() {
	        String[] parts = number.split("\\.");
	        int[] components = new int[parts.length];
	        for (int i = 0; i < parts.length; i++) {
	            components[i] = Integer.parseInt(parts[i]);
	        }
	        return components;
	    }
	}

    /**
     *
     * DOC ggu ImportNexusWizardPage constructor comment.
     *
     * @param pageName
     */
    public ImportNexusWizardPage(String pageName, IStructuredSelection s) {
        super(pageName);
        this.selection = s;
        setTitle("Nexus"); //$NON-NLS-1$
        setDescription(Messages.getString("ImportNexusWizardPage_importDescription")); //$NON-NLS-1$
        setImageDescriptor(ImageProvider.getImageDesc(EImage.NEXUS_64));
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
        scrolledComposite.setLayoutData( new GridData(GridData.FILL_BOTH));
        
        Composite composite = new Composite(scrolledComposite, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
        composite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
        scrolledComposite.setContent(composite);
        
        if (!CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_NEXUS_ENABLED)) {
            Label noWebhookLabel = new Label(composite, SWT.NONE);
            noWebhookLabel.setText("No webhook defined !");
        } else {
            searchText = new Text(composite, SWT.BORDER);
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

            // Créer la table
            table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.CHECK);
            table.setHeaderVisible(true);
            table.setLinesVisible(true);
            table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

            // Colonne de case à cocher
            TableColumn checkBoxColumn = new TableColumn(table, SWT.CENTER);
            checkBoxColumn.setText("Job");
            checkBoxColumn.setWidth(50);
            checkBoxColumn.setResizable(false);

            // Créer les colonnes
            TableColumn labelColumn = new TableColumn(table, SWT.NONE);
            labelColumn.setText("");

            TableColumn dateColumn = new TableColumn(table, SWT.NONE);
            dateColumn.setText("Date");
            dateColumn.setWidth(150);

            TableColumn tailleColumn = new TableColumn(table, SWT.NONE);
            tailleColumn.setText("Taille");
            tailleColumn.setWidth(200);

            TableColumn comboColumn = new TableColumn(table, SWT.NONE);
            comboColumn.setText("Version");

            // Ajouter des éléments à la table avec une combobox dans la deuxième colonne
            fillJobs();
            tableDisplay();

            // Redimensionner les colonnes pour s'ajuster au contenu
            labelColumn.pack();
            comboColumn.pack();

            table.addListener(SWT.Selection, event -> {
                if (event.detail == SWT.CHECK) {
                    TableItem item = (TableItem) event.item;
                    Job job = (Job)item.getData();
                    job.checked = !job.checked;
                }
            });

            table.addListener(SWT.Resize, new Listener() {
                @Override
                public void handleEvent(Event event) {
                    // Répartir l'espace disponible entre les colonnes
                    int tableWidth = table.getClientArea().width;
                    int comboColumnWidth = comboColumn.getWidth();
                    int labelColumnWidth = tableWidth - checkBoxColumn.getWidth() - dateColumn.getWidth() - tailleColumn.getWidth() - comboColumn.getWidth();
                    labelColumn.setWidth(labelColumnWidth);
                }
            });

            // Ajoutez un ModifyListener pour mettre à jour le filtre de la table
            searchText.addModifyListener(new ModifyListener() {
                @Override
                public void modifyText(ModifyEvent e) {
                    tableDisplay();
                }
            });
        }

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

            List<HashMap<String, String>> jobItems = Webhook.nexusGetItems();
            jobs = new ArrayList<>();
            for (HashMap<String, String> jobItem : jobItems) {
            	String name = jobItem.get("name");
            	Job job = null;
            	for (Job jobSearch : jobs) {
            		if (jobSearch.name.equals(name)) {
            			job = jobSearch;
            			break;
            		}
            	}
            	if (job == null) {
            		List<Version> versions = new ArrayList<>();
            		job = new Job(name);
            		job.checked = false;
            		job.versions = versions;
            		job.version = null;
                	jobs.add(job);
            	}
            	Version version = new Version(jobItem.get("version"));
            	version.date = jobItem.get("lastModified").split("T")[0];
            	version.size = Integer.valueOf(jobItem.get("fileSize"));
            	version.downloadUrl = jobItem.get("downloadUrl");
            	job.versions.add(version);
            	if (job.version == null) {
            		job.version = version;
            	}
            }
            
        	for (Job job : jobs) {
        		Collections.sort(job.versions, Comparator.comparingInt(v -> ((Version) v).getVersionComponents()[0]).thenComparingInt(v -> ((Version) v).getVersionComponents().length > 1 ? ((Version) v).getVersionComponents()[1] : 0));
        		Collections.reverse(job.versions);
        	}
            
            // Close wait dialog
            webhook.loadingDialogClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tableDisplay() {
    	table.removeAll();
        if (jobs == null) {
            return;
        }
        for (Job job : jobs) {
            String filter = searchText.getText();
            if (
                !filter.isEmpty() &&
                !job.name.toLowerCase().contains(filter.toLowerCase())
            ) {
                continue;
            }

            TableItem item = new TableItem(table, SWT.NONE);
            item.setChecked(false);
            item.setData(job);
            item.setText(1, job.name);
            item.setText(2, job.version.date);
            item.setText(3, formatFileSize(job.version.size));

            ComboViewer combo = new ComboViewer(table, SWT.READ_ONLY);
            combo.setContentProvider(ArrayContentProvider.getInstance());
            combo.setInput(job.versions);
            combo.setLabelProvider(new LabelProvider() {
    	        @Override
    	        public String getText(Object element) {
    	            return ((Version)element).number;
    	        }
    	    });
            combo.setSelection(new StructuredSelection(job.versions.get(0)));
            combo.addSelectionChangedListener(new ISelectionChangedListener() {
    	        @Override
    	        public void selectionChanged(SelectionChangedEvent event) {
    	            ISelection selection = event.getSelection();
    	            if (selection instanceof StructuredSelection) {
    	                if (!selection.isEmpty()) {
    	                    Object o = ((StructuredSelection) selection).getFirstElement();
    	                    job.version = (Version)o;
    	                    item.setText(2, job.version.date);
    	                    item.setText(3, formatFileSize(job.version.size));
    	                }
    	            }
    	        }
    	    });

            // Placer la Combo dans la deuxième colonne avec TableEditor
            TableEditor editor = new TableEditor(table);
            editor.grabHorizontal = true;
            editor.setEditor(combo.getControl(), item, 4);
        }
    }

    public String formatFileSize(int fileSize) {
	    if (fileSize <= 0) {
	        return "0 B";
	    }
	
	    final String[] units = new String[]{"B", "KB", "MB", "GB", "TB"};
	    int digitGroups = (int) (Math.log10(fileSize) / Math.log10(1024));
	
	    return String.format("%.1f %s", fileSize / Math.pow(1024, digitGroups), units[digitGroups]);
    }

    public static boolean importItems(String zipPath, IProgressMonitor monitor, final boolean overwrite, final boolean openThem, boolean needMigrationTask) throws IOException {
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
            // importManager.importItemRecords(new NullProgressMonitor(), resourcesManager, items, overwrite,
            // nodesBuilder.getAllImportItemRecords(), null);
            if (items != null && !items.isEmpty()) {
                importManager.importItemRecords(monitor, resourcesManager, items, overwrite, nodesBuilder.getAllImportItemRecords(), null);
            }
        } catch (Exception e) {
            CommonExceptionHandler.process(e);
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

    private static List<ImportItem> populateItems(final ImportExportHandlersManager importManager, final ResourcesManager resourcesManager, IProgressMonitor monitor, final boolean overwrite) {
        List<ImportItem> selectedItemRecords = new ArrayList<ImportItem>();
        nodesBuilder.clear();
        if (resourcesManager != null) { // if resource is not init successfully.
            try {
                // List<ImportItem> items = importManager.populateImportingItems(resourcesManager, overwrite,
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

    @Override
    public boolean isPageComplete() {
        return super.isPageComplete();
    }

    public boolean performCancel() {
        return true;
    }

    public boolean performFinish() {
        // Open wait dialog
        Webhook webhook = new Webhook();
        webhook.loadingDialogOpen();

        for (Job job : jobs) {
            if (!job.checked) {
                continue;
            }
            try {
                String jobZipPath = Webhook.nexusArchiveGet(job.version.downloadUrl, job.name);
                importItems(jobZipPath, new NullProgressMonitor(), true, true, false);
                File jobFile = new File(jobZipPath);
                jobFile.delete();
            } catch (Exception e) {
                e.printStackTrace();
                if (LOGGER.isInfoEnabled()) {
                    LOGGER.info("performFinish");
                    LOGGER.info(e);
                }
            }
        }

        // Close wait dialog
        webhook.loadingDialogClose();

        return true;
    }
}
