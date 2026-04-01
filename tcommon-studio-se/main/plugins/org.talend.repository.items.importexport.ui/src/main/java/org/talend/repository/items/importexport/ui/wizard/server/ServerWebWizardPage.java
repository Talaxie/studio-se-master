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
package org.talend.repository.items.importexport.ui.wizard.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
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
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

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
import org.talend.repository.items.importexport.ui.wizard.server.ServerUtil;
import org.talend.repository.items.importexport.ui.wizard.server.ServerRest;

/**
 *
 * DOC ggu class global comment. Detailled comment
 */
public class ServerWebWizardPage extends WizardPage {

    private static final Logger LOGGER = Logger.getLogger(ServerWebWizardPage.class);

    private IStructuredSelection selection;

    private String projectLabel;

    private Text portTextField;
	private Button startButton;
	private Button stopButton;
    private CLabel serverLabel;

	private ServerRest serverRest;
    private String port = "8082";

    /**
     *
     * DOC ggu ServerWebWizardPage constructor comment.
     *
     * @param pageName
     */
    public ServerWebWizardPage(String pageName, IStructuredSelection s) {
        super(pageName);
        this.selection = s;
        setTitle("API web"); //$NON-NLS-1$
        setDescription(Messages.getString("ServerWebWizardPage_importDescription")); //$NON-NLS-1$
        setImageDescriptor(ImageProvider.getImageDesc(EImage.SERVERWEB_HEADER));
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
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
        scrolledComposite.setContent(composite);
        
	    // Create a new composite for the label, text field and buttons
	    Composite topComposite = new Composite(composite, SWT.NONE);
	    topComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    topComposite.setLayout(new GridLayout(4, false));

	    // Create the port label
	    CLabel portLabel = new CLabel(topComposite, SWT.NONE);
	    portLabel.setText("Port #2");

	    // Create the text field
	    portTextField = new Text(topComposite, SWT.BORDER);
	    portTextField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        portTextField.setText(port);

	    // Create the ON button
	    startButton = new Button(topComposite, SWT.PUSH);
	    startButton.setImage(ImageProvider.getImageDesc(EImage.PLAY_16).createImage());
	    startButton.setText("Start");
	    startButton.setLayoutData(new GridData(100, SWT.DEFAULT));
	    startButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent evt) {
            	startButton.setEnabled(false);
        	    stopButton.setEnabled(false);
                try {
                    serverLabel.setText("Server starting...");
                    port = portTextField.getText();
                    serverRest.startServer(port);
                    serverLabel.setText("Server started. Listening on port " + port);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info(e);
                    }
                }
            	startButton.setEnabled(false);
        	    stopButton.setEnabled(true);
            }
        });

	    // Create the OFF button
	    stopButton = new Button(topComposite, SWT.PUSH);
	    stopButton.setImage(ImageProvider.getImageDesc(EImage.STOP_16).createImage());
	    stopButton.setText("Stop");
	    stopButton.setLayoutData(new GridData(100, SWT.DEFAULT));
	    stopButton.setEnabled(false);
	    stopButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent evt) {
            	startButton.setEnabled(false);
        	    stopButton.setEnabled(false);
                try {
                    serverLabel.setText("Server ending...");
                    serverRest.stopServer();
                    serverLabel.setText("Server off");
                } catch (Exception e) {
                    e.printStackTrace();
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info(e);
                    }
                }
            	startButton.setEnabled(true);
        	    stopButton.setEnabled(false);
            }
        });

	    Composite compositeBody = new Composite(composite, SWT.NONE);
	    compositeBody.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compositeBody.setLayout(new GridLayout(1, false));

	    serverLabel = new CLabel(compositeBody, SWT.NONE);
	    serverLabel.setText("Server off");

	    Button testButton = new Button(compositeBody, SWT.PUSH);
	    testButton.setText("Test");
	    testButton.setLayoutData(new GridData(100, SWT.DEFAULT));
	    testButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent evt) {
                try {
                    String jobZipPath = "C:/Temp/ETL01_000_JobEtl_Master.zip";
                    String jobName = "ETL01_000_JobEtl_Master";
                    ServerUtil.jobImport(jobZipPath, jobName);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info(e);
                    }
                }
            }
        });

        // -----------------------------------

        scrolledComposite.setContent(composite);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);
        scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        Dialog.applyDialogFont(composite);
    }

    @Override
    public boolean isPageComplete() {
        return super.isPageComplete();
    }

    public boolean performCancel() {
        return true;
    }

    public boolean performFinish() {
        // TODO

        return true;
    }
}
