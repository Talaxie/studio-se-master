// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.login.connections.settings;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.exception.ExceptionMessageDialog;
import org.talend.commons.utils.system.EclipseCommandLine;
import org.talend.core.ui.workspace.ChooseWorkspaceData;
import org.talend.core.ui.workspace.ChooseWorkspaceDialog;
import org.talend.repository.i18n.Messages;
import org.talend.repository.ui.login.LoginDialogV2;
import org.talend.repository.ui.login.LoginHelper;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class WorkspacePreferencePage extends PreferencePage {

    private Button switchBtn;

    public WorkspacePreferencePage() {
        setTitle(Messages.getString("WorkspacePreferencePage.title"));
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.horizontalSpan = 2;
        composite.setLayoutData(data);

        composite.setLayout(new FormLayout());
        final int vPadding = 10;

        Label label = new Label(composite, SWT.NONE);
        label.setText(Messages.getString("WorkspacePreferencePage.current"));

        FormData fd = null;
        fd = new FormData();
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.top = new FormAttachment(0);
        label.setLayoutData(fd);

        Text wsTxt = new Text(composite, SWT.BORDER);
        Location loc = Platform.getInstanceLocation();
        try {
            wsTxt.setText(new File(loc.getURL().getFile()).getCanonicalPath());
        } catch (IOException e) {
            wsTxt.setText(loc.getURL().getFile());
        }
        wsTxt.setEditable(false);
        fd = new FormData();
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.top = new FormAttachment(label, vPadding, SWT.BOTTOM);
        wsTxt.setLayoutData(fd);

        switchBtn = new Button(composite, SWT.PUSH);
        switchBtn.setText(Messages.getString("WorkspacePreferencePage.switch"));
        fd = new FormData();
        fd.left = new FormAttachment(0);
        fd.top = new FormAttachment(wsTxt, vPadding, SWT.BOTTOM);
        fd.width = LoginDialogV2.getNewButtonSize(switchBtn, 15).x;
        switchBtn.setLayoutData(fd);
        addListners();

        return composite;
    }

    private void addListners() {
        switchBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                onSwitchBtnSelected(e);
            }

        });
    }

    private void onSwitchBtnSelected(SelectionEvent event) {
        /**
         * @see org.talend.rcp.intro.Application.promptForWorkspace(Shell, ChooseWorkspaceData, boolean)
         */
        Location instanceLoc = Platform.getInstanceLocation();
        ChooseWorkspaceData launchData = new ChooseWorkspaceData(Platform.getInstanceLocation().getDefault());
        ChooseWorkspaceDialog chooseWorkspaceDialog = new ChooseWorkspaceDialog(Display.getCurrent().getActiveShell(), launchData,
                false, false);
        chooseWorkspaceDialog.prompt(true);
        int returnCode = chooseWorkspaceDialog.getReturnCode();
        if (Window.CANCEL == returnCode) {
            return;
        }
        try {
            String instancePath = launchData.getSelection();
            File workspace = new File(instancePath);
            if (!workspace.exists()) {
                workspace.mkdir();
            }
            if (instancePath.length() <= 0) {
                throw new IllegalArgumentException(Messages.getString("WorkspacePreferencePage.ex.path.empty"));
            }
            launchData.writePersistedData();

            URI uri = workspace.toURI();
            String workspacePath = uri.toString();
            workspacePath = workspacePath.replaceAll("\\\\", "\\\\\\\\"); //$NON-NLS-1$//$NON-NLS-2$
            EclipseCommandLine.updateOrCreateExitDataPropertyWithCommand("-data", workspacePath, false); //$NON-NLS-1$

            if (PlatformUI.isWorkbenchRunning()) {
                PlatformUI.getWorkbench().restart();
            } else {
                LoginHelper.isRestart = true;
                restart();
            }
        } catch (Exception e) {
            ExceptionMessageDialog.openError(Display.getCurrent().getActiveShell(),
                    Messages.getString("WorkspacePreferencePage.ex.err"), e.getMessage(), e);
            ExceptionHandler.process(e);
        }
    }

    abstract public void restart() throws Exception;

    @Override
    public boolean isValid() {
        return true;
    }

}
