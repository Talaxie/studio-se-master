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
package org.talend.metadata.managment.ui;

import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.service.IMetadataManagmentUiService;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.dialog.OpenXSDFileDialog;
import org.talend.metadata.managment.ui.i18n.Messages;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.wizard.context.ContextWizard;
import org.talend.repository.model.RepositoryNode;

/**
 *
 * ggu class global comment. Detailled comment
 */
public class MetadataManagmentUiService implements IMetadataManagmentUiService {

    @Override
    public String getAndOpenXSDFileDialog(Path initPath) {
        OpenXSDFileDialog openXSDFileDialog = new OpenXSDFileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getShell());
        openXSDFileDialog.setTitle(Messages.getString("RepositoryToComponentProperty.xmlFileSelection")); //$NON-NLS-1$
        openXSDFileDialog.setPath(initPath);
        int dialogValue = openXSDFileDialog.open();
        if (dialogValue == Window.OK) {
            return openXSDFileDialog.getNewValue();
        }
        return null; // don't set
    }

    @Override
    public ContextType getContextTypeForContextMode(Connection connection) {
        return ConnectionContextHelper.getContextTypeForContextMode(connection);
    }

    public ContextType getContextTypeForContextMode(Connection connection, String selectedContext, boolean defaultContext) {
        return ConnectionContextHelper.getContextTypeForContextMode(null, connection, selectedContext, defaultContext);
    }

    @Override
    public String getOriginalValue(ContextType contextType, String value) {
        return ConnectionContextHelper.getOriginalValue(contextType, value);
    }

    @Override
    public void openRepositoryContextWizard(RepositoryNode repositoryNode) {
        ContextWizard contextWizard = new ContextWizard(PlatformUI.getWorkbench(), false, repositoryNode, false);
        WizardDialog dlg = new WizardDialog(Display.getCurrent().getActiveShell(), contextWizard);
        dlg.open();
    }

    @Override
    public boolean isContextMode(Connection connection, String value) {
        return ConnectionContextHelper.isContextMode(connection, value);
    }

    @Override
    public boolean promptConfirmLauch(Shell shell, Connection connection, ContextItem contextItem) {
        return ConnectionContextHelper.promptConfirmLauch(shell, connection, contextItem);
    }

    @Override
    public IContext promptConfirmLauch(Shell shell, List<IContext> contexts, IContext defaultContext) {
        return ConnectionContextHelper.promptConfirmLauch(shell, contexts, defaultContext);
    }

    @Override
    @Deprecated
    public boolean promptConfirmLauch(Shell shell, IContext context) {
        return ConnectionContextHelper.promptConfirmLauch(shell, context);
    }

    @Override
    public boolean isPromptNeeded(List<IContext> contexts) {
        return ConnectionContextHelper.isPromptNeeded(contexts);
    }

    @Override
    public boolean promptConfirmLauchIterateContexts(Shell shell, List<IContext> contexts, IContext context) {
        return ConnectionContextHelper.promptConfirmLauchIterateContexts(shell, contexts, context);
    }

}
