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
package org.talend.repository.ui.wizards.metadata.connection.database;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.talend.metadata.managment.ui.wizard.CheckLastVersionRepositoryWizard;
import org.talend.repository.metadata.i18n.Messages;
import org.talend.repository.model.RepositoryNode;

public class NewDatabaseWizard extends CheckLastVersionRepositoryWizard implements INewWizard {

    private DatabaseSelectWizardPage databaseSelectWizardPage;

    private String selectedDBType;

    public NewDatabaseWizard(IWorkbench workbench, boolean creation, boolean isToolBar, RepositoryNode node) {
        super(workbench, creation);
        setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
        setWindowTitle(Messages.getString("DatabaseWizard.windowTitle")); //$NON-NLS-1$
        // setDefaultPageImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_CONNECTION_WIZ));
        databaseSelectWizardPage = new DatabaseSelectWizardPage();
        databaseSelectWizardPage.setTitle(Messages.getString("NewDatabaseWizardPage.titleCreate")); //$NON-NLS-1$
        // databaseSelectWizardPage.setDescription("Select a DB Type");
        databaseSelectWizardPage.setPageComplete(false);
        addPage(databaseSelectWizardPage);
    }

    @Override
    public boolean performFinish() {
        if (databaseSelectWizardPage.isPageComplete()) {
            selectedDBType = databaseSelectWizardPage.getDBType();
            return true;
        }
        return false;
        // move to CreateConnectionAction to close current wizard immediately.
        // release below if you want to keep current wizard after opening the new one.
        // if (!databaseSelectWizardPage.isPageComplete()) {
        // return false;
        // }
        // String selectedDBType = databaseSelectWizardPage.getDBType();
        // if (ITCKUIService.get() != null && ITCKUIService.get().getTCKJDBCType().getLabel().equals(selectedDBType)) {
        // int exit = ITCKUIService.get().openTCKWizard(selectedDBType, creation, node, existingNames);
        // if (exit == Window.OK) {
        // return true;
        // }
        // return false;
        // }
        // DatabaseWizard databaseWizard = new DatabaseWizard(getWorkbench(), creation, node, existingNames);
        // databaseWizard.setToolBar(isToolBar);
        // databaseWizard.setDbType(selectedDBType);
        // WizardDialog wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), databaseWizard);
        // wizardDialog.setPageSize(780, 540);
        // wizardDialog.create();
        // int exit = wizardDialog.open();
        // if (exit == Window.OK) {
        // return true;
        // }
        // return false;
    }

    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
        super.setWorkbench(workbench);
        this.selection = selection;
    }

    public String getSelectedDBType() {
        return selectedDBType;
    }

}
