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
package org.talend.migration;

import java.io.File;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.talend.analysistask.ItemAnalysisReportManager;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.runtime.i18n.Messages;
import org.talend.repository.ProjectManager;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class MigrationReportAccessDialog extends Dialog {

    private String reportGeneratedFile;

    private boolean onStartUp;

    private Button disableOptionBtn;

    protected MigrationReportAccessDialog(Shell parentShell, String reportGeneratedFile, boolean onStartUp) {
        super(parentShell);
        this.reportGeneratedFile = reportGeneratedFile;
        this.onStartUp = onStartUp;
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(Messages.getString("MigrationReportAccessDialog.title"));
    }

    @Override
    protected void initializeBounds() {
        getShell().setSize(890, 350);
        Point location = getInitialLocation(getShell().getSize());
        getShell().setLocation(location.x, location.y);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        GridLayout layout = new GridLayout();
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        layout.verticalSpacing = 8;
        Composite composite = WidgetFactory.composite(SWT.NONE).layout(layout)
                .layoutData(new GridData(GridData.FILL_BOTH))
                .create(parent);
        applyDialogFont(composite);

        Composite migrationInfoArea = new Composite(composite, SWT.NONE);
        GridLayout migrationInfoLayout = new GridLayout();
        migrationInfoLayout.numColumns = 1;
        migrationInfoLayout.marginWidth = 0;
        migrationInfoLayout.marginTop = 8;
        migrationInfoLayout.marginLeft = 10;
        migrationInfoArea.setLayout(migrationInfoLayout);
        createMessageLabel(migrationInfoArea, Messages.getString("MigrationReportAccessDialog.migrateSuccess"));

        Composite noteComp = new Composite(migrationInfoArea, SWT.NONE);
        noteComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
        noteComp.setLayout(new FormLayout());
        Label noteLabel = new Label(noteComp, SWT.NONE);
        noteLabel.setText(Messages.getString("MigrationReportAccessDialog.completeReportAvailable"));
        FormData noteLabelFormData = new FormData();
        noteLabelFormData.bottom = new FormAttachment(100, -5);
        noteLabelFormData.left = new FormAttachment(0, 0);
        noteLabel.setLayoutData(noteLabelFormData);
        Button browseBtn = new Button(noteComp, SWT.NONE);
        browseBtn.setText(Messages.getString("MigrationReportAccessDialog.accessBrowse"));
        FormData linkFormData = new FormData();
        linkFormData.top = new FormAttachment(0, 0);
        linkFormData.left = new FormAttachment(noteLabel, 5);
        browseBtn.setLayoutData(linkFormData);
        browseBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                File reportFile = new File(reportGeneratedFile);
                if (reportFile != null && reportFile.exists()) {
                    try {
                        FilesUtils.selectFileInSystemExplorer(reportFile);
                    } catch (Exception excep) {
                        ExceptionHandler.process(excep);
                    }
                }
            }

        });

        Composite infoArea = new Composite(composite, SWT.NONE);
        GridLayout infoAreaLayout = new GridLayout();
        migrationInfoLayout.numColumns = 1;
        infoAreaLayout.marginWidth = 0;
        infoAreaLayout.marginLeft = 10;
        infoArea.setLayout(infoAreaLayout);
        createMessageLabel(infoArea, Messages.getString("MigrationReportAccessDialog.provideAnalysisTool"));
        Composite infoItemArea = new Composite(infoArea, SWT.NONE);
        GridLayout infoItemLayout = new GridLayout();
        infoItemLayout.numColumns = 1;
        infoItemLayout.marginWidth = 0;
        infoItemLayout.marginHeight = 0;
        infoItemLayout.marginLeft = 15;
        infoItemArea.setLayout(infoItemLayout);
        createMessageLabel(infoItemArea, Messages.getString("MigrationReportAccessDialog.listOfProblems"));
        createMessageLabel(infoItemArea, Messages.getString("MigrationReportAccessDialog.listItems"));

        Composite analysisInfoArea = new Composite(composite, SWT.NONE);
        GridLayout analysisInfoLayout = new GridLayout();
        analysisInfoLayout.numColumns = 1;
        analysisInfoLayout.marginWidth = 0;
        analysisInfoLayout.marginLeft = 10;
        analysisInfoArea.setLayout(analysisInfoLayout);
        createMessageLabel(analysisInfoArea, Messages.getString("MigrationReportAccessDialog.analysisToolCanTrigger"));

        if (!onStartUp) {
            Composite disableDialogArea = new Composite(composite, SWT.NONE);
            GridLayout disableDialogLayout = new GridLayout();
            disableDialogLayout.numColumns = 1;
            disableDialogLayout.marginWidth = 0;
            disableDialogLayout.marginLeft = 10;
            disableDialogArea.setLayout(disableDialogLayout);
            disableOptionBtn = new Button(disableDialogArea, SWT.CHECK);
            disableOptionBtn.setText(Messages.getString("MigrationReportAccessDialog.doNotShowAnymore"));
            disableOptionBtn.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_VERTICAL));
            disableOptionBtn.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    MigrationReportHelper.storeDoNotShowAgainPref(disableOptionBtn.getSelection());
                }

            });
        }

        return composite;
    }

    private Label createMessageLabel(Composite parent, String message) {
        Label messageLabel = new Label(parent, SWT.NONE);
        messageLabel.setText(message);
        GridData gridData = new GridData(GridData.GRAB_HORIZONTAL);
        messageLabel.setLayoutData(gridData);
        return messageLabel;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.YES_ID, Messages.getString("MigrationReportAccessDialog.runAnalysisButton"), true);
        createButton(parent, IDialogConstants.NO_ID, Messages.getString("MigrationReportAccessDialog.notNowButton"), true);
    }

    @Override
    protected void buttonPressed(int buttonId) {
        setReturnCode(OK);
        if (IDialogConstants.YES_ID == buttonId) {
            ItemAnalysisReportManager.getInstance()
                    .generateAnalysisReport(ProjectManager.getInstance().getCurrentProject().getTechnicalLabel());
        }
        close();
    }

}
