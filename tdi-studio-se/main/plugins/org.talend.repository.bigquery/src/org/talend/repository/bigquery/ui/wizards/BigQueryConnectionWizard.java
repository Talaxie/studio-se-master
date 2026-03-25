// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.bigquery.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.metadata.IMetadataContextModeManager;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.update.RepositoryUpdateManager;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.wizard.CheckLastVersionRepositoryWizard;
import org.talend.metadata.managment.ui.wizard.PropertiesWizardPage;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNodeUtilities;

public class BigQueryConnectionWizard extends CheckLastVersionRepositoryWizard implements INewWizard {

    private static Logger log = Logger.getLogger(BigQueryConnectionWizard.class);

    private PropertiesWizardPage propertiesWizardPage;

    private BigQueryConnectionWizardPage bigqueryWizardPage;

    private BigQueryConnection connection;

    private Property connectionProperty;

    private BigQueryConnectionItem bigqueryConnectionItem;

    private boolean isToolBar;

    private String originaleObjectLabel;

    private String originalVersion;

    private String originalPurpose;

    private String originalDescription;

    private String originalStatus;

    private IMetadataContextModeManager contextModeManager;

    /**
     * Getter for isToolBar.
     *
     * @return the isToolBar
     */
    public boolean isToolBar() {
        return this.isToolBar;
    }

    /**
     * Sets the isToolBar.
     *
     * @param isToolBar the isToolBar to set
     */
    public void setToolBar(boolean isToolBar) {
        this.isToolBar = isToolBar;
    }

    public BigQueryConnectionWizard(IWorkbench workbench, boolean creation, RepositoryNode node, String[] existingNames) {
        super(workbench, creation);
        this.existingNames = existingNames;
        this.setHelpAvailable(true);
        setNeedsProgressMonitor(true);
        switch (node.getType()) {
        case SIMPLE_FOLDER:
        case REPOSITORY_ELEMENT:
            pathToSave = RepositoryNodeUtilities.getPath(node);
            break;
        case SYSTEM_FOLDER:
            pathToSave = new Path("");
            break;
        }

        switch (node.getType()) {
        case SIMPLE_FOLDER:
        case SYSTEM_FOLDER:
            connection = ConnectionFactory.eINSTANCE.createBigQueryConnection();
            connectionProperty = PropertiesFactory.eINSTANCE.createProperty();
            connectionProperty.setAuthor(
                    ((RepositoryContext) CorePlugin.getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY)).getUser());
            connectionProperty.setVersion(VersionUtils.DEFAULT_VERSION);
            connectionProperty.setStatusCode("");

            bigqueryConnectionItem = PropertiesFactory.eINSTANCE.createBigQueryConnectionItem();
            bigqueryConnectionItem.setProperty(connectionProperty);
            bigqueryConnectionItem.setConnection(connection);
            break;

        case REPOSITORY_ELEMENT:
            connection = (BigQueryConnection) ((BigQueryConnectionItem) node.getObject().getProperty().getItem()).getConnection();
            connectionProperty = node.getObject().getProperty();
            bigqueryConnectionItem = (BigQueryConnectionItem) node.getObject().getProperty().getItem();
            // set the repositoryObject, lock and set isRepositoryObjectEditable
            setRepositoryObject(node.getObject());
            isRepositoryObjectEditable();
            initLockStrategy();
            break;
        }
        connectionItem = bigqueryConnectionItem;
        if (!creation) {
            this.originaleObjectLabel = this.connectionItem.getProperty().getDisplayName();
            this.originalVersion = this.connectionItem.getProperty().getVersion();
            this.originalDescription = this.connectionItem.getProperty().getDescription();
            this.originalPurpose = this.connectionItem.getProperty().getPurpose();
            this.originalStatus = this.connectionItem.getProperty().getStatusCode();
        }
        // initialize the context mode
        ConnectionContextHelper.checkContextMode(bigqueryConnectionItem);
    }

    /**
     * Adding the page to the wizard and set Title, Description and PageComplete.
     */
    @Override
    public void addPages() {
        setWindowTitle(Messages.getString("BigQueryWizard.windowTitle"));
        setDefaultPageImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_CONNECTION_WIZ));
        if (isToolBar) {
            pathToSave = null;
        }
        propertiesWizardPage = new BigQueryConnectionPropertyPage(connectionProperty, pathToSave,
                ERepositoryObjectType.METADATA_CONNECTIONS, !isRepositoryObjectEditable(), creation);
        bigqueryWizardPage = new BigQueryConnectionWizardPage(bigqueryConnectionItem, isRepositoryObjectEditable(), existingNames,
                contextModeManager);

        if (creation) {
            propertiesWizardPage.setTitle(Messages.getString("BigQueryWizardPage.titleCreate.Step1"));
            propertiesWizardPage.setDescription(Messages.getString("BigQueryWizardPage.descriptionCreate.Step1"));
            propertiesWizardPage.setPageComplete(false);

            bigqueryWizardPage.setTitle(Messages.getString("BigQueryWizardPage.titleCreate.Step2"));
            bigqueryWizardPage.setDescription(Messages.getString("BigQueryWizardPage.descriptionCreate.Step2"));
            bigqueryWizardPage.setPageComplete(false);
        } else {
            propertiesWizardPage.setTitle(Messages.getString("BigQueryWizardPage.titleUpdate.Step1"));
            propertiesWizardPage.setDescription(Messages.getString("BigQueryWizardPage.descriptionUpdate.Step1"));
            propertiesWizardPage.setPageComplete(isRepositoryObjectEditable());

            bigqueryWizardPage.setTitle(Messages.getString("BigQueryWizardPage.titleUpdate.Step2"));
            bigqueryWizardPage.setDescription(Messages.getString("BigQueryWizardPage.descriptionUpdate.Step2"));
            bigqueryWizardPage.setPageComplete(isRepositoryObjectEditable());
        }
        addPage(propertiesWizardPage);
        addPage(bigqueryWizardPage);
    }

    @Override
    public boolean performFinish() {
        if (bigqueryWizardPage.isPageComplete()) {
            final IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
            try {
                if (creation) {
                    String nextId = factory.getNextId();
                    connectionProperty.setId(nextId);
                    factory.create(bigqueryConnectionItem, propertiesWizardPage.getDestinationPath());
                } else {
                    RepositoryUpdateManager.updateFileConnection(bigqueryConnectionItem);
                    refreshInFinish(propertiesWizardPage.isNameModifiedByUser());
                    IWorkspace workspace = ResourcesPlugin.getWorkspace();
                    IWorkspaceRunnable operation = new IWorkspaceRunnable() {

                        @Override
                        public void run(IProgressMonitor monitor) throws CoreException {
                            try {
                                factory.save(bigqueryConnectionItem);
                                closeLockStrategy();
                            } catch (PersistenceException e) {
                                throw new CoreException(new Status(IStatus.ERROR, "", "", e));
                            }
                        }
                    };
                    workspace.run(operation, null);
                }
            } catch (Exception e) {
                String detailError = e.toString();
                new ErrorDialogWidthDetailArea(getShell(), PID, Messages.getString("CommonWizard.persistenceException"),
                        detailError);
                log.error(Messages.getString("CommonWizard.persistenceException") + "\n" + detailError); //$NON-NLS-2$
                return false;
            }
            List<IRepositoryViewObject> list = new ArrayList<IRepositoryViewObject>();
            list.add(repositoryObject);
            // RepositoryPlugin.getDefault().getRepositoryService()
            // .notifySQLBuilder(list);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean performCancel() {
        if (!creation) {
            bigqueryConnectionItem.getProperty().setVersion(this.originalVersion);
            bigqueryConnectionItem.getProperty().setDisplayName(this.originaleObjectLabel);
            bigqueryConnectionItem.getProperty().setDescription(this.originalDescription);
            bigqueryConnectionItem.getProperty().setPurpose(this.originalPurpose);
            bigqueryConnectionItem.getProperty().setStatusCode(this.originalStatus);
        }
        return super.performCancel();
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        super.setWorkbench(workbench);
        this.selection = selection;
    }

    @Override
    public ConnectionItem getConnectionItem() {
        return this.bigqueryConnectionItem;
    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        super.dispose();
    }

}
