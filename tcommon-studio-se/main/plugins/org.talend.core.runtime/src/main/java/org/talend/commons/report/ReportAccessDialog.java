// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.report;

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
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.runtime.i18n.Messages;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ReportAccessDialog extends Dialog {

    private String shellTitle;

    private String message;

    private String reportGeneratedFile;

    public ReportAccessDialog(Shell parentShell, String shellTitle, String message, String reportGeneratedFile) {
        super(parentShell);
        this.shellTitle = shellTitle;
        this.message = message;
        this.reportGeneratedFile = reportGeneratedFile;
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(shellTitle);
    }

    @Override
    protected void initializeBounds() {
        getShell().setSize(700, 190);
        Point location = getInitialLocation(getShell().getSize());
        getShell().setLocation(location.x, location.y);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        GridLayout layout = new GridLayout();
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        Composite container = WidgetFactory.composite(SWT.NONE).layout(layout).layoutData(new GridData(GridData.FILL_BOTH))
                .create(parent);
        applyDialogFont(container);

        Composite composite = new Composite(container, SWT.NONE);
        GridLayout compositeLayout = new GridLayout();
        compositeLayout.numColumns = 1;
        compositeLayout.marginWidth = 0;
        compositeLayout.marginTop = 8;
        compositeLayout.marginLeft = 10;
        composite.setLayout(compositeLayout);
        Label successMsgLabel = new Label(composite, SWT.NONE);
        successMsgLabel.setText(message);
        GridData gridData = new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_VERTICAL);
        successMsgLabel.setLayoutData(gridData);

        Composite noteComp = new Composite(composite, SWT.NONE);
        noteComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
        noteComp.setLayout(new FormLayout());
        Label noteLabel = new Label(noteComp, SWT.NONE);
        noteLabel.setText(Messages.getString("AnalysisReportAccessDialog.completeReportAvailable"));
        FormData noteLabelFormData = new FormData();
        noteLabelFormData.bottom = new FormAttachment(100, -5);
        noteLabelFormData.left = new FormAttachment(0, 0);
        noteLabel.setLayoutData(noteLabelFormData);
        Button browseBtn = new Button(noteComp, SWT.NONE);
        browseBtn.setText(Messages.getString("AnalysisReportAccessDialog.accessBrowse"));
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
        return container;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    }

}
