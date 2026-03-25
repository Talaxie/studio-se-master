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
package org.talend.repository.bigquery.ui.wizards.bigquerytable;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.update.RepositoryUpdateManager;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.metadata.managment.ui.wizard.CheckLastVersionRepositoryWizard;
import org.talend.repository.bigquery.BigQueryClientManager;
import org.talend.repository.bigquery.BigQueryPlugin;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.bigquery.ui.util.MetaTableHelper;
import org.talend.repository.model.IProxyRepositoryFactory;

import orgomg.cwm.objectmodel.core.Package;

public class BigQueryTableWizard extends CheckLastVersionRepositoryWizard implements INewWizard {

    private static Logger log = Logger.getLogger(BigQueryTableWizard.class);

    protected MetadataTable repTable;

    protected BigQueryTableSelectWizardPage tableSelectPage;

    protected BigQueryTableWizardPage tablePage;

    protected BigQueryConnection tempConnection;

    protected BigQueryClientManager clientManager;

    protected List<IMetadataTable> oldMetadataTables;

    protected Map<String, String> oldTableMap;

    public BigQueryTableWizard(IWorkbench workbench, IRepositoryViewObject object, final MetadataTable table, String[] existingNames,
            boolean forceReadOnly) {
        super(workbench, table == null, forceReadOnly);
        setRepositoryObject(object);
        this.connectionItem = (ConnectionItem) object.getProperty().getItem();
        this.repTable = table;
        this.existingNames = existingNames;
        clientManager = new BigQueryClientManager();
        if (connectionItem != null) {
            initOldTableMap();
            cloneConnection();
        }
        setNeedsProgressMonitor(true);

        initLockStrategy();
    }

    protected void initOldTableMap() {
        oldTableMap = RepositoryUpdateManager.getOldTableIdAndNameMap(connectionItem, repTable, creation);
        oldMetadataTables = RepositoryUpdateManager.getConversionMetadataTables(connectionItem.getConnection());
    }

    protected void cloneConnection() {
        tempConnection = (BigQueryConnection) EcoreUtil.copy(connectionItem.getConnection());
        tempConnection.setName(connectionItem.getProperty().getLabel());
        EList<Package> dataPackage = connectionItem.getConnection().getDataPackage();
        Collection<Package> newDataPackage = EcoreUtil.copyAll(dataPackage);
        ConnectionHelper.addPackages(newDataPackage, tempConnection);
        // get selected table from temp connection
        if (repTable != null) {
            for (MetadataTable table : MetaTableHelper.getTables(tempConnection)) {
                if (table.getLabel().equals(repTable.getLabel())) {
                    repTable = table;
                }
            }
        }
    }

    public BigQueryClientManager getClientManager() {
        return clientManager;
    }

    @Override
    public void addPages() {
        setWindowTitle(Messages.getString("BigQueryTableWizard.windowTitle"));
        setDefaultPageImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_TABLE_WIZ));
        tableSelectPage = new BigQueryTableSelectWizardPage(tempConnection, clientManager, isRepositoryObjectEditable());
        tableSelectPage.setPageComplete(false);
        tablePage = new BigQueryTableWizardPage(clientManager, tempConnection, repTable, isRepositoryObjectEditable());
        if (creation) {
            addPage(tableSelectPage);
            addPage(tablePage);
            tableSelectPage.setTitle(Messages.getString("BigQueryTableWizard.newTableTitle", connectionItem.getProperty()
                    .getLabel()));
            tablePage.setTitle(Messages.getString("BigQueryTableWizard.newTableTitle", connectionItem.getProperty().getLabel()));
        } else {
            tablePage.setPageComplete(false);
            addPage(tablePage);
            tablePage.setTitle(Messages.getString("BigQueryTableWizard.updateTableTitle", connectionItem.getProperty().getLabel()));
        }

    }

    @Override
    public BigQueryConnectionItem getConnectionItem() {
        return (BigQueryConnectionItem) this.connectionItem;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {

    }

    @Override
    public boolean performFinish() {
        // copy tables form temp connection to the real connection
        Collection<Package> copyDataPackage = EcoreUtil.copyAll(tempConnection.getDataPackage());
        ConnectionHelper.addPackages(copyDataPackage, connectionItem.getConnection());

        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        try {
            factory.save(connectionItem);
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }

        RepositoryUpdateManager.updateMultiSchema(connectionItem, oldMetadataTables, oldTableMap);
        closeLockStrategy();
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.wizards.CheckLastVersionRepositoryWizard#performCancel()
     */
    @Override
    public boolean performCancel() {
        if (creation) {
            tableSelectPage.performCancel();
        }
        closeLockStrategy();
        return super.performCancel();
    }

    protected void openErrorDialogWithDetail(Throwable e) {
        String msg = e.getMessage();

        final String msgDisplay = msg;

        Display.getDefault().asyncExec(new Runnable() {

            @Override
            public void run() {
                String mainMsg = Messages.getString("BigQueryForm.checkFailure") + " " // $NON-NLS-1$  //$NON-NLS-1$//$NON-NLS-2$
                        + Messages.getString("BigQueryForm.checkFailureTip"); //$NON-NLS-1$

                new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, mainMsg, msgDisplay);
            }
        });
    }
}
